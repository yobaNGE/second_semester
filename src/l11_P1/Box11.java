package l11_P1;

public class Box11 {
    private double length;
    private double width;
    private double height;

    public Box11(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
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

    public void calculateAll() {
        if (this.isValid())
            System.out.printf("Surface Area – %f%nLateral Surface Area – %f%nVolume – %s",this.calculateSurfaceArea(), this.calculateLateralSurfaceArea(), this.calculateVolume());
    }

    private boolean isValid() {
        if (this.length <= 0 || this.width <= 0 || this.height <= 0) {
            System.out.printf("%s%s%scannot be zero or negative", this.length <= 0 ? "length " : "", this.width <= 0 ? "width " : "", this.height <= 0 ? "height " : "");
            return false;
        }
        return true;
    }
}

