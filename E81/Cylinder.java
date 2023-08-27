public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
