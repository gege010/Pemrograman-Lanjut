// package sic.geometry.shapes.v2;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(String id, Point origin, double radius, double height) {
        super(id, origin, radius);
        this.height = height;
    }

    public Cylinder(String id, int length, int width, double radius, double height) {
        super(id, length, width, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return (super.getArea()*2) + (super.getCircumference() * height);
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String getDescription() {
        return "ID: " + super.getId() + "\nOrigin: (" + getX0() + ", " + getY0() + ")" + "\nRadius: " + getRadius()+ "\nHeight: "+ height + "\nArea: " + getArea() + "\nVolume: " + getVolume();
    }

    public String getDescription(double length, double width, double getArea, double getVolume) {
        return "ID: " + super.getId() + "\nOrigin: (" + getX0() + ", " + getY0() + ")" + "\nLength: " + length + "\nWidth: " + width + "\nHeight: "+ height + "\nArea: " + getArea + "\nVolume: " + getVolume;
    }
}