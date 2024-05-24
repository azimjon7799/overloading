package oop_pracitce;

public class Multiplier {
    public double multiply(int a, int b) {
        return a * b;
    }

    public double multiply(float a, float b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
    public double multiply(char a, char b) {
        return a * b;
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        System.out.println(multiplier.multiply(2f, 3d));
    }
}
