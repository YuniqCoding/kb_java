package command.command;

import command.domain.StudentScores;

//4번 메뉴인 분석 기능 처리하는 클래스
public class AnalizeCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        // 기존에 저장되어있는 학생들의 점수 리스트를 가져옴
        int[] scores = studentScores.getScores();
        int max = 0;
        int sum = 0;
        double avg = 0;

        for(int i=0; i<scores.length; i++){
            max = max<scores[i]?scores[i]:max;
            sum += scores[i];
        }

        // 학생 관련 정보를 studentScores에서 싱글톤으로 관리하고있으므로 해당 방법으로 접근해야함
        avg = (double) sum/studentScores.getStudentNum();
        System.out.println("최고 점수: "+max);
        System.out.println("평균 점수: "+avg);
    }
}
