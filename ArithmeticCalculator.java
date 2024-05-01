public class ArithmeticCalculator extends Calculator{
    AddOperator addOperator = new AddOperator();
    SubtractOperator subtractOperator = new SubtractOperator();
    MultiplyOperator multiplyOperator = new MultiplyOperator();
    DivideOperator divideOperator = new DivideOperator();
    public double calculate(int num1, int num2, char operator) {
        double result=0;
        switch (operator) {
            case '+':
                //result = num1 + num2;
                result = addOperator.operate(num1, num2);
                break;
            case '-':
                //result = num1 - num2;
                result = subtractOperator.operate(num1, num2);
                break;
            case '*':
                //result = num1 * num2;
                result = multiplyOperator.operate(num1, num2);
                break;
            case '/':
                //result = num1 / num2;
                result = divideOperator.operate(num1, num2);
                break;
        }
        return result;
    }

    @Override
    public double calculateCircleArea(int radius) {
        return 0;
    }
}