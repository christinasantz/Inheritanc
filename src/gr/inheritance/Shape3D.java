package gr.inheritance;

public class Shape3D extends Shape {
    public Shape3D(double area) {
        super(area);
    }

    @Override
    void isConvex() {
        System.out.println("This Shape is not convex");
    }
}
