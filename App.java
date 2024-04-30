import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Calculator 인스턴스 생성 */
        Calculator  cal = new Calculator();

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
        while (true) {
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
            if(remove.equals("remove")){
                //cal.resultList.remove(0);
                cal.removeResult();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();

            if(inquiry.equals("inquiry")){
                // 저장된 연산 결과 조회
               cal.inquiryResults();
                // 향상된 for문으로 연산결과 전부 출력
//                for(double listData: cal.getList()){
//                    System.out.println(listData);
//                }
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
