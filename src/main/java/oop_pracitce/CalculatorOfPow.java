package oop_pracitce;

public class CalculatorOfPow {
    public double pow(int a){
        return a * a;
    }

    public double pow(float a){
        return a * a;
    }
    public double pow(double a){
        return a * a;
    }
    public double pow(long a){
        return a * a;
    }

    public static void main(String[] args) {
        CalculatorOfPow calculator = new CalculatorOfPow();
        System.out.println(calculator.pow(5L));
    }
}
