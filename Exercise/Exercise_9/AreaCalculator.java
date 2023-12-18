package Exercise_9;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1.0, 4.0));
    }

    // METHOD
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double areaCircle = Math.PI * Math.pow(radius, 2);
        return areaCircle;
    }

    // METHOD
    public static double area(double length, double height) {
        if (length < 0 || height < 0) {
            return -1.0;
        }
        double areaRectangle = length * height;
        return areaRectangle;
    }
}
