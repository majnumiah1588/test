public class Cone {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calculateVolume() {
        return 1.0 / 3.0 * Math.PI * Math.pow(radius, 2) * height;
    }

    public double calculateSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }
}
