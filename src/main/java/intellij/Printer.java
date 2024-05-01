package intellij;

import java.io.Serializable;

public class Printer <T extends Animal & Serializable>{ // T -> type parameter
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}
