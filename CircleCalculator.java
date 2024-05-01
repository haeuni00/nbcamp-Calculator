public class CircleCalculator extends Calculator{
    @Override
    public double calculate(int num1, int num2, char operator) {
        return 0;
    }

    public double calculateCircleArea(int radius) {
        /* 원의 넓이 계산 구현 */
        double cResult = radius*radius*PI;
        return cResult;
    }
}
