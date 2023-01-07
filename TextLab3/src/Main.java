import Person.Expert;
import Person.Znayka;

public class Main {
    public static void main(String[]arg){
        Znayka he = new Znayka();
        he.setName("Znayka");
        he.see();
        he.effect();
        he.felling();

        Expert ex = new Expert();
        ex.setName("Expert");
        ex.felling();
        ex.allow();
        ex.realize();
        ex.jump();
        ex.run();

    }
}
