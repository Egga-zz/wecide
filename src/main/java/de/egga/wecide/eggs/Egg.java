package de.egga.wecide.eggs;

public class Egg {

    private final String name;
    private final String state;

    public Egg(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }
}
