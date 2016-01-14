package de.egga.wecide.eggs.repository;

public class EggEntityFactory {

    public static EggEntity defaultEggEntity() {
        return new EggEntity("some name", "WB");
    }
}
