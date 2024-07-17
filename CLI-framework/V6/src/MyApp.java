import command.*;
import ui.Menu;
import ui.MenuItem;

//커스터마이징하는 부분만 App 클래스에서 추출하여 자식 클래스 생성
public class MyApp extends App{
    @Override
    public void createMenu(Menu menu) {
//        App의 createMenu 호출
        super.createMenu(menu);

//        ArrayList의 경우 인덱스 제외한 아이템만 추가해주면 된다
        menu.add(new MenuItem("학생수",new InitScoresCommand()));
        menu.add(new MenuItem("점수입력",new GetScoresCommand()));
        menu.add(new MenuItem("점수리스트",new PrintScoreCommand()));
        menu.add(new MenuItem("분석",new AnalizeCommand()));
        menu.add(new MenuItem("종료",new ExitCommand()));
    }

    public static void main(String[] args) {
        App app = new MyApp();
        app.run();
    }
}
