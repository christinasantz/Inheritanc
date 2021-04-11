package gr.inheritance;

public abstract class Shape {
    private double area;


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Shape(double area) {
        this.area = area;
    }

    abstract void isConvex();
}




