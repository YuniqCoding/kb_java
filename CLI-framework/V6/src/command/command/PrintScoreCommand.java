package command.command;

import command.domain.StudentScores;

// 3번 메뉴인 점수 출력 기능 처리하는 클래스
public class PrintScoreCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
        // 기존에 저장되어있는 학생들의 점수 리스트를 가져옴
        int[] scores = studentScores.getScores();

        // 점수 리스트를 돌면서 각각의 점수들을 출력해줌
        for(int i=0; i<scores.length; i++){
            System.out.println("scores["+i+"]: "+scores[i]);
        }
    }
}
