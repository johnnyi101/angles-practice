package Exercises;

public class Angle {
    private int degrees;

    public int getDegrees() {
        return degrees;
    }

    private void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public Angle(int degrees) {
        degrees = degrees % 360;
        if (degrees < 0)
            degrees += 360;
        setDegrees(degrees);
    }
}




