package Visualisation;

import Engine.Engine;
import Engine.Trace;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Screen extends JFrame {

    private final Engine engine;

    private final int WIDTH = 1000;
    private final int HEIGHT = 800;

    private BufferedImage turtle;

    public Screen (Engine engine) {
        this.engine = engine;


        try {
            turtle = ImageIO.read(new File("data/images/turtle_skin.png"));
        } catch (IOException e){
            e.printStackTrace();
        }


        setSize(WIDTH, HEIGHT);
        setVisible(false);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics); //do not remove
        Graphics2D g = (Graphics2D )graphics;

        for (Trace trace : engine.getTraceList()){
            g.drawLine((int) Math.round(trace.getFromX()) + WIDTH / 2,
                       (int) Math.round(trace.getFromY()) + HEIGHT / 2,
                       (int) Math.round(trace.getToX()) + WIDTH / 2,
                       (int) Math.round(trace.getToY()) + HEIGHT / 2);
        }

        AffineTransform tx = AffineTransform.getRotateInstance(
                engine.getTurtle().getDirection() / 180 * Math.PI + Math.PI / 2,
                30, 30);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);


        g.drawImage(op.filter(turtle, null), (int) engine.getTurtle().getX() + WIDTH / 2 - 30,
                            (int) engine.getTurtle().getY() + HEIGHT / 2 - 30,
                            null, null);

        getGraphics().setColor(Color.BLACK);
    }
}