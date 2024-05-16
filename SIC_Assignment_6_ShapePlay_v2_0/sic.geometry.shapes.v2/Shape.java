// package sic.geometry.shapes.v2;

public abstract class Shape {
    private String id;
    private Point origin;

    public Shape(String id, Point origin) {
        this.id = id;
        this.origin = origin;
    }

    public String getId(){
        return id;
    }

    public Shape(String id, int xO, int yO){
        this.id = id;
        origin = new Point(xO, yO);
    }

    public int getX0() {
        return origin.getX();
    }

    public int getY0() {
        return origin.getY();
    }


    public abstract String getDescription();
}