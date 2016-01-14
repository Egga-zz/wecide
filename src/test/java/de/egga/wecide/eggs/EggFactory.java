package de.egga.wecide.eggs;

public class EggFactory {

    public static Egg defaultEgg () {
        return new Egg("some name", "WB");
    }
}
