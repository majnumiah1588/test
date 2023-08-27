public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());

        Sphere sphere = new Sphere(3);
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

        Cylinder cylinder = new Cylinder(2, 4);
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume());
        System.out.println("Cylinder Surface Area: " + cylinder.calculateSurfaceArea());

        Cone cone = new Cone(2, 5);
        System.out.println("Cone Volume: " + cone.calculateVolume());
        System.out.println("Cone Surface Area: " + cone.calculateSurfaceArea());
    }
}
