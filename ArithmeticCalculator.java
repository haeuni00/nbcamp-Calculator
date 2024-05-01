public class ArithmeticCalculator extends Calculator{
    public double calculate(int num1, int num2, char operator) {
        double result=0;
        if(operator != '+' && operator != '-' && operator != '*' && operator != '/') {
        }
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                }
                result = num1 / num2;
                break;
        }
        return result;
    }

    @Override
    public double calculateCircleArea(int radius) {
        return 0;
    }
}
