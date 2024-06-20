package add.abs;

public class ComExample {
    public static void main(String[] args) {
        Computer com = new DeskTop();
        com.show();
        com.turnOff();

        Notebook mac = new MacNotebook();
        mac.input();
    }
}
