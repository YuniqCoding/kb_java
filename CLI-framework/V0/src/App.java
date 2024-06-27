import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
//        scores는 정수 배열
        int[] scores = null;

        Scanner scanner = new Scanner(System.in);

        // 무한루프
        while (run){
            System.out.println("-------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------------");
            System.out.print("선택> ");
//            사용자에게 입력받은 숫자값을 정수로 형변환
            int selectNo = Integer.parseInt(scanner.nextLine());
            if(selectNo == 1){
                // 1번 메뉴. 학생수
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine());
//                입력받은 학생 수 만큼 배열의 크기를 정해줌
                scores = new int[studentNum];
            }else if(selectNo == 2){
                // 2번 메뉴. 점수입력
                for(int i=0; i<scores.length; i++){
                    System.out.print("scores["+i+"]> ");
//                    비어있는 배열 요소에 사용자한테 입력받은 점수 할당
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            }else if(selectNo == 3){
                // 3번 메뉴. 점수리스트
                for(int i=0; i<scores.length; i++){
//                    scores 배열을 돌면서 아이템들을 하나씩 출력
                    System.out.println("scores["+i+"]: "+scores[i]);
                }
            }else if(selectNo == 4){
                // 4번 메뉴. 분석
                int max = 0;
                int sum = 0;
                double avg = 0;
                for(int i=0; i<scores.length; i++){
//                    max와 scores[i] 둘중 큰 수를 max에 할당
                    max = max<scores[i]?scores[i]:max;
//                    sum에 scores[i]를 더해서 다시 넣어준다
                    sum += scores[i];
                }
//                전체 합계를 학생수로 나눠서 평균값 구하기
                avg = (double) sum/studentNum;
                System.out.println("최고 점수: "+max);
                System.out.println("평균 점수: "+avg);
            } else if (selectNo==5) {
                // 5번 메뉴. 종료
//                while문을 false로 만들어주면서 무한루프가 종료된다
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
