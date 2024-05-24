package oop_pracitce;

public class AbsoluteValue {
    public double abs(double x) {
        if (x < 0) {
            return -1 * x;
        }
        return x;
    }

    public double abs(int x) {
        if (x < 0) {
            return -1 * x;
        }
        return x;
    }

    public double abs(long x) {
        if (x < 0) {
            return -1 * x;
        }
        return x;
    }
    public double abs(float x) {
        if (x < 0) {
            return -1 * x;
        }
        return x;
    }

    public static void main(String[] args) {
        AbsoluteValue abs = new AbsoluteValue();
        System.out.println(abs.abs(10f));
    }
}
