package l11_P2;

public class Triangle {
    private double sideA, sideB, sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isValid() {
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (isTriangle())
                return true;
            else
                return false;
        }
        System.out.printf("%s%s%scannot be zero or negative", this.sideA <= 0 ? "A " : "", this.sideB <= 0 ? "B " : "", this.sideC <= 0 ? "C " : "");
        return false;
    }

    private boolean isTriangle(){
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("Triangle can`t have sum of two sides less than third side");
            return false;
        }
        return true;
    }
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
    public void calculateAll(){
        if (isValid()){
            System.out.printf("Perimeter – %s%nArea – %s", calculatePerimeter(), calculateArea());
        }
    }
}
