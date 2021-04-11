package gr.inheritance;

public class Shape2D extends Shape {
    public boolean label = true;

    public Shape2D(double area) {
        super(area);
    }

    @Override
    public void isConvex() {
        System.out.println("This shape is Convex: " + label);
    }

}


