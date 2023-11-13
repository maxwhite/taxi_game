package org.robotdreams.game.project;

/**
 * could be the destination class but not finished
 */
public class Destination {

    private String name;

    private int time;

    private int cost;

    public Destination(String name, int time, int cost) {
        this.name = name;
        this.time = time;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
}
