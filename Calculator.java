import java.util.ArrayList;
public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
    private ArrayList<Double> resultList = new ArrayList<Double>();

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
    /* Getter 메서드 구현 */
    public ArrayList<Double> getList(){
        return resultList;
    }
    /* Setter 메서드 구현 */
    public void setList(double result){
        this.resultList.add(result);
    }
    // 3. 에서 미리 해놔서 메서드 이름만 4. 문제에 맞게 변경
    public void removeResult(){
        this.resultList.remove(0);
    }
    // 연산 결과들 조회하는 메서드
    public void inquiryResults() {
        for(double listData: getList()){
            System.out.println(listData);
        }
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