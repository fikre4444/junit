public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }

        double guess = a / 2.0;
        double acceptableDifference = 1e-10;
        double difference = guess * guess - a;

        while (Math.abs(difference) > acceptableDifference) {
            guess = (guess + a / guess) / 2.0;
            difference = guess * guess - a;
        }

        return guess;
    }


        


}
