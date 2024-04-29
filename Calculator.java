import java.util.ArrayList;
public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    ArrayList<Double> resultList = new ArrayList<Double>();

    public double calculate(int num1, int num2, String operator) throws Exception {
        double result=0;
            if(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                throw new InputException();
            }
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                        if (num2 == 0) {
                            throw new InputException();
                        }
                    result = num1 / num2;
                    break;
            }
        return result;
    }
}

class InputException extends Exception{
    public InputException(){
        super("예외 발생");
    }
}
