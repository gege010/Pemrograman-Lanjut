// package sic.geometry.shapes.v2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String id, Point origin, double length, double width) {
        super(id, origin);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getCircumference() {
        return 2 * (length + width);
    }

    public String getDescription() {
        return "ID: " + getId() + "\nOrigin: (" + getX0() + ", " + getY0() + ")" + "\nLength: " + length + "\nWidth: " + width + "\nArea: " + getArea() + "\nCircumference: " + getCircumference();
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}