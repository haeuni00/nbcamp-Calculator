import java.util.ArrayList;
public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    ArrayList<Double> resultList = new ArrayList<Double>();

    public double calculate(int num1, int num2, char operator) throws Exception {
        double result=0;
            if(operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                throw new OpInputException();
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
        super("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
    }
}
class OpInputException extends Exception{
    public OpInputException(){
        super("+, -, *, / 중에 입력해야합니다.");
    }
}