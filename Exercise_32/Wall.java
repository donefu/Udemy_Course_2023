package Exercise_32;

public class Wall {
    private double width;
    private double height;

    // CONSTRUCTORS
    public Wall() {

    }

    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // GETTER AND SETTER

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        }
        this.height = height;

    }

    // METHOD

    public double getArea() {
        return (height * width);
    }
}
