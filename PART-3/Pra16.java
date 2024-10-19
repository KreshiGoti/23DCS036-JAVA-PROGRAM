import java.util.Scanner;

class Complex {
    private double rl;
    private double img;

    public Complex(double rl, double img) {
        this.rl = rl;
        this.img = img;
    }

    public double getRl() {
        return rl;
    }

    public double getImg() {
        return img;
    }

    public void setRl(double rl) {
        this.rl = rl;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public Complex add(Complex second) {
        double newRl = this.rl + second.rl;
        double newImg = this.img + second.img;
        return new Complex(newRl, newImg);
    }

    public Complex diff(Complex second) {
        double newRl = this.rl - second.rl;
        double newImg = this.img - second.img;
        return new Complex(newRl, newImg);
    }

    public Complex mul(Complex second) {
        double newRl = (this.rl * second.rl) - (this.img * second.img);
        double newImg = (this.rl * second.img) + (this.img * second.rl);
        return new Complex(newRl, newImg);
    }

    public String toString() {
        return rl + " + " + img + "i";
    }

    public static Complex inputComplex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real part: ");
        double rl = scanner.nextDouble();
        System.out.println("Enter the imaginary part: ");
        double img = scanner.nextDouble();
        return new Complex(rl, img);
    }
}

class Pra16
{
    public static void main(String[] args) {
        System.out.println("Enter the first complex number:");
        Complex first = Complex.inputComplex();

        System.out.println("Enter the second complex number:");
        Complex second = Complex.inputComplex();

        Complex sum = first.add(second);
        Complex difference = first.diff(second);
        Complex product = first.mul(second);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}
