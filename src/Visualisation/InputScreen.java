package Visualisation;

import Antlr.LogoLexer;
import Antlr.LogoParser;
import Engine.Engine;
import Interpreter.MyLogoErrorListener;
import Interpreter.MyLogoVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class InputScreen extends JFrame {
    private final static int WIDTH = 400;
    private final static int HEIGHT = 500;

    public InputScreen () {
        JPanel mainPanel = new JPanel();
        mainPanel.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JTextPane inputText = new JTextPane();
        inputText.getDocument().putProperty(PlainDocument.tabSizeAttribute, 2);
        inputText.setFont(new Font("TimesRoman", Font.PLAIN, 16));
        JScrollPane inputTextScroll = new JScrollPane(inputText);
        inputTextScroll.setMaximumSize(new Dimension(WIDTH - 20, 400));
        mainPanel.add(inputTextScroll);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton run = new JButton("Run command");
        run.setAlignmentX(Component.CENTER_ALIGNMENT);
        run.setMaximumSize(new Dimension(200, 45));
        run.addActionListener(e -> {
            String text = inputText.getText();

            if (!text.isEmpty()){
                MyLogoErrorListener errorListener = new MyLogoErrorListener();

                Engine engine = new Engine();

                try {
                    LogoLexer lexer = new LogoLexer(CharStreams.fromString(text));
                    lexer.removeErrorListeners();
                    lexer.addErrorListener(errorListener);

                    CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

                    LogoParser parser = new LogoParser(commonTokenStream);
                    parser.removeErrorListeners();
                    parser.addErrorListener(errorListener);
                    LogoParser.InputContext context = parser.input();

                    MyLogoVisitor visitor = new MyLogoVisitor(engine, errorListener);
                    visitor.visit(context);
                }
                catch (RuntimeException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                engine.runCommands();

                if (!engine.getTraceList().isEmpty()){
                    Screen turtleWindow = new Screen(engine);
                    turtleWindow.repaint();
                    turtleWindow.setVisible(true);
                }

                if (!engine.getLogs().isEmpty()){
                    JFrame logWindow = new JFrame("Print output");

                    JPanel panel = new JPanel();
                    panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

                    panel.add(Box.createRigidArea(new Dimension(0, 10)));

                    JTextPane textPane = new JTextPane();
                    textPane.setBackground(new JLabel().getBackground());
                    textPane.setEditable(false);

                    StringBuilder printOutput = new StringBuilder();
                    for (String log : engine.getLogs()){
                        printOutput.append(">>> ").append(log).append("\n");
                    }
                    textPane.setText(printOutput.toString());

                    panel.add(new JScrollPane(textPane));

                    panel.add(Box.createRigidArea(new Dimension(0, 10)));

                    logWindow.add(panel);

                    logWindow.setResizable(false);
                    logWindow.setSize(new Dimension(300, 400));
                    logWindow.setVisible(true);
                    logWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });

        mainPanel.add(run);

        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel fileButtonPanel = new JPanel();
        fileButtonPanel.setMaximumSize(new Dimension(WIDTH, 50));

        fileButtonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton loadFileButton = new JButton("Load from file...");
        loadFileButton.addActionListener(e -> {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
                fileChooser.setAcceptAllFileFilterUsed(false);
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Logo files", "logo"));
                int returnValue = fileChooser.showOpenDialog(this);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    String inputString = null;
                    try {
                        inputString = Files.readString(selectedFile.toPath());
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                    inputText.setText(inputString);
                }
        });

        JButton saveFileButton = new JButton("Save file as...");
        saveFileButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to save");
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Logo files", "logo"));
            int returnValue = fileChooser.showSaveDialog(this);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                try {
                    Files.writeString(fileToSave.toPath(), inputText.getText());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        fileButtonPanel.add(loadFileButton, BorderLayout.WEST);

        fileButtonPanel.add(Box.createRigidArea(new Dimension(70, 0)));

        fileButtonPanel.add(saveFileButton, BorderLayout.EAST);

        mainPanel.add(fileButtonPanel);

        this.setTitle("Input window");
        this.setResizable(false);
        this.add(mainPanel);
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
