import command.*;
import ui.Menu;
import ui.MenuItem;

//커스터마이징하는 부분만 App 클래스에서 추출하여 자식 클래스 생성
public class MyApp extends App{
    @Override
    public void createMenu(Menu menu) {
//        App의 createMenu 호출
        super.createMenu(menu);

        menu.add(0,new MenuItem("학생수",new InitScoresCommand()));
        menu.add(1,new MenuItem("점수입력",new GetScoresCommand()));
        menu.add(2,new MenuItem("점수리스트",new PrintScoreCommand()));
        menu.add(3,new MenuItem("분석",new AnalizeCommand()));
        menu.add(4,new MenuItem("종료",new ExitCommand()));
    }

    public static void main(String[] args) {
//        App은 추상클래스기 때문에 구현 클래스인 MyApp으로 객체를 생성해줘야 한다
        App app = new MyApp();
//        템플릿으로 정해져있는 메소드는 부모클래스에서 구현한다 => 템플릿 패턴
        app.init(5);
        app.run();
    }
}
