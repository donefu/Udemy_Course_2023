package Exercise_33;

public class Point {
    private int x;
    private int y;

    // CONSTRUCTORS
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // GETTER AND SETTER

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // METHOD

    public double distance() {
        return Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
    }

    public double distance(Point point) {
        return Math.sqrt((x - point.x) * (x - point.x) + (y - point.y) * (y - point.y));

    }

    public double distance(int x, int y) {
        int xDifference = this.x - x;
        int yDifference = this.y - y;
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
        // return Math.sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y -
        // y));
    }

}
