package Interpreter;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class MyLogoErrorListener extends BaseErrorListener {
    private int line;
    private int charPositionInLine;

    public int getLine() {
        return line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        this.line = line;
        this.charPositionInLine = charPositionInLine;

        String position = "line " + line + ":" + charPositionInLine + " ";
        throw new RuntimeException(position + msg);
    }
}
