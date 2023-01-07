package Person;

import Abstract.Base;
import Interface.*;
import enums.Adjectives;
import enums.Location;

public class Expert extends Base implements Allow, Realize, Jump, Run, Felling {
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void felling() {
        System.out.println("this feeling occurred to the "+ Name + " only for a moment, ");
    }

    @Override
    public void allow() {
        System.out.println(" since "+ Name + " did not allow the thought that the dream could be so "+
                "\n"+ Adjectives.LONG +" and "+ Adjectives.BRIGHT);
    }

    @Override
    public void realize() {
        System.out.println("After making sure that his eyes had not deceived him," + Name +" realized " +
                "\n that the rocket could simply have fallen to " +
                "\n the " + Location.GROUND+ " from the "+ Adjectives.WIND+ " or from some kind of "+ Location.GROUND+" vibration.");

    }

    @Override
    public void jump() {
        System.out.println(Name + " Jumping out of the " + Location.ROOM);
    }

    @Override
    public void run() {
        System.out.println(Name +" ran down the " +Location.STAIRS + Name +" in an instant and rushed to the " + Location.GATE);
    }
}
