import java.util.Scanner;

public class Geometry {
    public static double cubeVolume(double h) {
        return Math.pow(h, 3);
    }

    public static double cubeSurface(double h) {
        return 6 * Math.pow(h, 2);
    }

    public static double sphereVolume(double r) {
        return 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
    }

    public static double sphereSurface(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double cylinderSurface(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }

    public static double coneVolume(double r, double h) {
        return 1.0 / 3.0 * Math.PI * Math.pow(r, 2) * h;
    }

    public static double coneSurface(double r, double h) {
        double slantHeight = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        return Math.PI * r * (r + slantHeight);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius (r): ");
        double radius = scanner.nextDouble();

        System.out.println("Enter the height (h): ");
        double height = scanner.nextDouble();

        System.out.println("Cube Volume: " + cubeVolume(height));
        System.out.println("Cube Surface Area: " + cubeSurface(height));
        System.out.println("Sphere Volume: " + sphereVolume(radius));
        System.out.println("Sphere Surface Area: " + sphereSurface(radius));
        System.out.println("Cylinder Volume: " + cylinderVolume(radius, height));
        System.out.println("Cylinder Surface Area: " + cylinderSurface(radius, height));
        System.out.println("Cone Volume: " + coneVolume(radius, height));
        System.out.println("Cone Surface Area: " + coneSurface(radius, height));

        scanner.close();
    }
}
