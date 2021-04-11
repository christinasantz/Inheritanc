package gr.inheritance;

public class Main {
    public static void main(String[] args) {
        Shape2D circle = new Shape2D(314.16);
        System.out.println("Circle's area: "+ circle.getArea());
        circle.isConvex();

        Shape2D square = new Shape2D(100);
        System.out.println("Square's area: "+ square.getArea());
        square.isConvex();

        Shape3D sphere = new Shape3D(1256.64);
        System.out.println("Sphere's area: "+ sphere.getArea());
        sphere.isConvex();


        Shape3D cube =  new Shape3D(600);
        System.out.println("Cube's area: "+ cube.getArea());
        cube.isConvex();

    }
}
