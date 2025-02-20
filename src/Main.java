//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Zivotinje {
    void glasanje();
}

class Pas implements Zivotinje {
    public void glasanje()  {
        System.out.println("Wuff Wuff");
    }
}

public class Main {
    public static void main(String[] args) {

        Pas pas = new Pas();
        pas.glasanje();
    }
}