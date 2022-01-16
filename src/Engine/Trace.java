package Engine;

public class Trace {
    private final double fromX;
    private final double fromY;

    private final double toX;
    private final double toY;

    public Trace(double fromX, double fromY, double toX, double toY) {
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
    }

    public double getFromX() {
        return fromX;
    }

    public double getFromY() {
        return fromY;
    }

    public double getToX() {
        return toX;
    }

    public double getToY() {
        return toY;
    }
}
