import java.util.ArrayList;
public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/
    /* 연산 결과를 저장하는 컬렉션 타입 필드가 생성자를 통해 초기화 되도록 변경 */
    private ArrayList<Double> resultList = new ArrayList<Double>();
    //원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성
    private ArrayList<Double> circleList = new ArrayList<>();
    // 원의 넓이를 구할때 파이는 변하지 않기 때문에 상수로 선언
    static final double PI =3.14;

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

    /* 원의 넓이를 구하는 메서드 선언*/
    public double calculateCircleArea(int radius) {
        /* 원의 넓이 계산 구현 */
        double cResult = radius*radius*PI;
        return cResult;
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */
    public ArrayList<Double> getCircleList(){
        return circleList;
    }
    // 원 넓이 리스트에 저장
    public void setCircleList(double cResult){
        circleList.add(cResult);
    }
    // 처음에 들어온 원넓이값 삭제
    public void removeCResult(){
        circleList.remove(0);
    }
    // 저장된 원 넓이들 조회
    public void inquiryCResults() {
        for(double listData: getCircleList()){
            System.out.println(listData);
        }
    }


    /* 사칙연산 결과 저장 필드 */
    /* Getter 메서드 구현 */
    public ArrayList<Double> getList(){
        return resultList;
    }
    /* Setter 메서드 구현 */
    public void setList(double result){
        this.resultList.add(result);
    }
    // 사칙연산 중 가장 처음에 연산된 결과 삭제
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