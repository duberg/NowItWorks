package common;

public class Calculator {
    private double currentTime;
    private double currentLength;

    public void setTrackSeconds(double time) {
        currentTime = time;
    }

    public void setCurrentLength(double length) {
        currentLength = length;
    }

    public int getTrackResults() {

        double a = 25.4347;
        int b = 18;
        double c = 1.81;

        int result = (int) (a * Math.pow((b - currentTime), c));
        return result;

    }

    public int getLengthResults() {
        double a = 25.4347;
        int b = 18;
        double c = 1.81;

        int result1 = (int) (a * Math.pow((currentLength - b), c));

        return result1;
    }
}
