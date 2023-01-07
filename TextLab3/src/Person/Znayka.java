package Person;

import Abstract.Base;

import Interface.Effect;
import Interface.Felling;

import Interface.See;
import enums.Location;


public class Znayka extends Base implements See, Effect, Felling {
    public void setName(String name) {
        super.setName(name);
    }



    @Override
    public void see() {
        System.out.println("The fact that this time "+ Name +
                "\n did not see a rocket through the "+ Location.WINDOW);
    }

    @Override
    public void effect() {
        System.out.println("It had some strange effect on him ");
    }

    @Override
    public void felling() {
        System.out.println(Name+" had a feeling that everything that had happened before");
    }
}
