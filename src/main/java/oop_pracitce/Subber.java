package oop_pracitce;

public class Subber {
    public double sub(int a, int b) {
        return a - b;
    }

    public double sub(float a, float b) {
        return a - b;
    }

    public double sub(double a, double b) {
       return a - b;
    }

    public double sub(long a, double b) {
        return a - b;
    }

    public double sub(double a, long b) {
       return a - b;
    }

    public double sub(char a, char b) {
        return a - b;
    }

    public static void main(String[] args) {
        Subber sub  = new Subber();
        double result = sub.sub(1, 2);
        System.out.println(result);

        System.out.println(sub.sub(12f, 13.0d));
    }
}
