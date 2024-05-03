import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Calculator 인스턴스 생성 */
       // Calculator cal = new Calculator(new ArrayList<>(), new ArrayList<>());

        ArithmeticCalculator cal = new ArithmeticCalculator(new ArrayList<>());
        CircleCalculator cal2 = new CircleCalculator(new ArrayList<>());


        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
        while (true) {
            System.out.println("사칙연산을 원하면 cal 입력, 원의 넓이를 원하면 circle 입력");
            String choice = sc.next();

            if(choice.equals("cal")) {
                System.out.print("첫 번째 숫자를 입력하세요:");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요:");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);
                double result = cal.calculate(num1, num2, operator);

                System.out.println("결과: " + result);
                //cal.resultList.add(result);
                cal.setList(result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next();
                if (remove.equals("remove")) {
                    //cal.resultList.remove(0);
                    cal.removeResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();

                if (inquiry.equals("inquiry")) {
                    // 저장된 연산 결과 조회
                    cal.inquiryResults();
                    // 향상된 for문으로 연산결과 전부 출력
//                for(double listData: cal.getList()){
//                    System.out.println(listData);
//                }
                }
            }
            if(choice.equals("circle")){
                System.out.println("원의 반지름을 입력하세요.");
                int radius = sc.nextInt();
                double cresult = cal2.calculateCircleArea(radius);

                System.out.println("결과: " + cresult);
                cal2.setList(cresult);

                System.out.println("가장 먼저 저장된 원의 넓이를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next();
                if (remove.equals("remove")) {
                    cal2.removeResult();
                }

                System.out.println("저장된 원의넓이를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();

                if (inquiry.equals("inquiry")) {
                    // 저장된 원의 넓이 모두 조회
                    cal2.inquiryResults();
                }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if(exit.equals("exit")){
                break;
            }
            /* 반복문 종료 */
        }
    }
}
