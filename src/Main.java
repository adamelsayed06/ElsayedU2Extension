import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        if (expression.contains("*")){
            int indexOfStar = expression.indexOf("*");
            String num1AsAString = expression.substring(0, indexOfStar - 1);
            String num2AsAString = expression.substring(indexOfStar + 2);
            double num1 = Double.parseDouble(num1AsAString);
            double num2 = Double.parseDouble(num2AsAString);
            calc.calc(num1, num2);
            System.out.print(calc.multiply());
        }

        if (expression.contains("/")){
            int indexOfDivide = expression.indexOf("/");
            String num1AsAString = expression.substring(0, indexOfDivide - 1);
            String num2AsAString = expression.substring(indexOfDivide + 2);
            double num1 = Double.parseDouble(num1AsAString);
            double num2 = Double.parseDouble(num2AsAString);
            calc.calc(num1, num2);
            System.out.print(calc.divide());
        }

        if (expression.contains("+")){
            int indexOfPlus = expression.indexOf("+");
            String num1AsAString = expression.substring(0, indexOfPlus - 1);
            String num2AsAString = expression.substring(indexOfPlus + 2);
            double num1 = Double.parseDouble(num1AsAString);
            double num2 = Double.parseDouble(num2AsAString);
            calc.calc(num1, num2);
            System.out.print(calc.add());
        }

        if (expression.contains("-")){
            int indexOfSubtract = expression.indexOf("-");
            String num1AsAString = expression.substring(0, indexOfSubtract - 1);
            String num2AsAString = expression.substring(indexOfSubtract + 2);
            double num1 = Double.parseDouble(num1AsAString);
            double num2 = Double.parseDouble(num2AsAString);
            calc.calc(num1, num2);
            System.out.print(calc.subtract());
        }

        if (expression.contains("%")){
            int indexOfMod = expression.indexOf("%");
            String num1AsAString = expression.substring(0, indexOfMod - 1);
            String num2AsAString = expression.substring(indexOfMod + 2);
            double num1 = Double.parseDouble(num1AsAString);
            double num2 = Double.parseDouble(num2AsAString);
            calc.calc(num1, num2);
            System.out.print(calc.mod());
        }

        if (expression.contains("^")){
            int indexOfExponent = expression.indexOf("^");
            String num1AsAString = expression.substring(0, indexOfExponent - 1);
            String num2AsAString = expression.substring(indexOfExponent + 2);
            double num1 = Double.parseDouble(num1AsAString);
            double num2 = Double.parseDouble(num2AsAString);
            calc.calc(num1, num2);
            System.out.print(calc.exponentiation());
        }

    }
}