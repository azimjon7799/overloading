package oop_pracitce;

public class Diver {
    public double div(double a, double b) {
        return a / b;
    }

    public double div(float a, float b) {
        return a / b;
    }

    public double div(int a, int b) {
        return (double) a / b;
    }
    public double div(long a, long b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Diver diver = new Diver();
        System.out.println(diver.div(6, 3));
    }
}
