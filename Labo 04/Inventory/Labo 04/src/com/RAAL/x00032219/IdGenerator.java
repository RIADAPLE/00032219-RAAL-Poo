package com.RAAL.x00032219;

public final class IdGenerator {
    private static int counter=0;

    private IdGenerator(){}

    public static int newIdGenerator() {
        counter++;
        return counter;
    }
}
