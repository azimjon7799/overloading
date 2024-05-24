package oop_pracitce;

public class Adder {
    public double add(int a, int b) {
            return a + b;
    }

    public double add(double a, double b) {
           return a + b;
    }

    public double add(float a, float b) {
           return a + b;
    }

    public double add(char a, char b) {
            return a + b;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();
        double result;

        int a = 10;
        int b = 20;
        result = adder.add(a, b);
        System.out.println(result);

        int c = 10;
        long d = 10;
        result = adder.add(c, d);
        System.out.println(result);

        double e = 10;
        result = adder.add(e, e);
        System.out.println(result);
    }
}
