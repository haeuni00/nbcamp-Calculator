import java.util.ArrayList;

public class CircleCalculator extends Calculator{

    public CircleCalculator(ArrayList<Double> resultList){
        super(resultList);
    }

    public double calculateCircleArea(int radius) {
        /* 원의 넓이 계산 구현 */
        double cResult = radius*radius*PI;
        return cResult;
    }
}
