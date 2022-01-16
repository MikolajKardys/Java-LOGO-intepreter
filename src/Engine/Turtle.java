package Engine;

public class Turtle {
    private double X = 0;
    private double Y = 0;
    private double direction = 270;

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double getDirection() {
        return direction;
    }

    public void resetTurtle(){
        X = 0;
        Y = 0;
        direction = 270;
    }

    public void move(double distance){
        double angle = direction / 180 * Math.PI;

        X += distance * Math.cos(angle);
        Y += distance * Math.sin(angle);
    }

    public void spin(double degrees){
        direction = (direction + degrees) % 360;
    }
}
