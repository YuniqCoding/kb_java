import command.*;
import ui.Menu;
import ui.MenuItem;

public abstract class App {
    Menu menu;
    Command[] commands;
    
    public App() {

    }

    public void init(int menuSize){
        menu=new Menu(menuSize);
        createMenu(menu);
    }

    public void createMenu(Menu menu){

    }

    public void run(){

        while (true){
            menu.printMenu();
//            사용자가 입력한 번호에 해당하는 command 리턴
            Command command = menu.getSelect();
            command.execute();
        }
    }

}
