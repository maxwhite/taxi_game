package org.robotdreams.game.project.strategy;

public class AllowedNumberOfIssuesLuxStrategy implements Strategy{

    // we could vary this depending on destination e.t.c...
    // now it is simple
    @Override
    public int getCount() {
        return 4;
    }
}
