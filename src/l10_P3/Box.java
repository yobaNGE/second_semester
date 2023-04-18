package l10_P3;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        if (length > 0 && width > 0 && height > 0) {
            this.length = length;
            this.width = width;
            this.height = height;
        }else {
            System.out.println("Incorrect numbers.");
            System.exit(0);
        }
    }

    public double calculateSurfaceArea() {
        return 2.0 * length * width + 2 * length * height + 2 * width * height;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}

