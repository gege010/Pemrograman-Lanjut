// package sic.geometry.shapes.v2;

public class Circle extends Shape {
    private double radius;

    public Circle(String id, Point origin, double radius) {
        super(id, origin);
        this.radius = radius;
    }

    public Circle(String id, int length, int width, double radius) {
        super(id, length, width);
        this.radius = radius;
    }

    public String getId(){
        return super.getId();
    }

    public double getRadius(){
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    public String getDescription() {
        return "ID: " + getId() + "\nOrigin: (" + getX0() + ", " + getY0() + ")"+ "\nRadius: " + radius + "\nArea: " + getArea() + "\nCircumference: " + getCircumference();
    }
}