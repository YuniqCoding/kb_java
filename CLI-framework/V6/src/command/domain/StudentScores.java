package command.domain;

public class StudentScores {
    int studentNum = 0;
    int[] scores = null;

    public int getStudentNum() {
        return studentNum;
    }

    public int[] getScores() {
        return scores;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
        // 학생 수만큼 점수 배열의 크기를 초기화
        this.scores = new int[studentNum];
    }

    // Singleton 패턴
    // 생성자는 private으로 막아두고 getInstance()를 통해서만 객체를 반환한다
    // 따라서 밖에서는 객체 생성을 할수 없고 동일한 객체만 사용 가능하다.
    private StudentScores() {}

    private static StudentScores instance = new StudentScores();
    public static StudentScores getInstance() {
        return instance;
    }
}
