public class Calculator {

    private double number1;
    private double number2;

    public void calc(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double multiply() {
        double product = number1 * number2;
        return product;
    }

    public double divide(){
        double quotient = number1 / number2;
        return quotient;
    }

    public double add(){
        double sum = number1 + number2;
        return sum;
    }

    public double subtract(){
        double difference = number1 - number2;
        return difference;
    }

    public double mod(){
        double modResult = number1 % number2;
        return modResult;
    }

    public double exponentiation(){
        double exponentResult = Math.pow(number1, number2);
        return exponentResult;
    }
}

