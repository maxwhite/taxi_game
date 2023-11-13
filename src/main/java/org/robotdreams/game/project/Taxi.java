package org.robotdreams.game.project;

import org.robotdreams.game.project.strategy.AllowedNumberOfIssuesComfortStrategy;
import org.robotdreams.game.project.strategy.AllowedNumberOfIssuesLuxStrategy;
import org.robotdreams.game.project.strategy.AllowedNumberOfIssuesStandardStrategy;
import org.robotdreams.game.project.strategy.Strategy;

public class Taxi {

    private TaxiType type;

    private int numberOfAllowedIncidents;

    public Taxi(TaxiType type) {
        this.type = type;
        this.numberOfAllowedIncidents = findStrategy().getCount();
    }

    public int getNumberOfAllowedIncidents() {
        return numberOfAllowedIncidents;
    }

    private Strategy findStrategy() {

        switch (type) {
            case STANDART -> {
                return new AllowedNumberOfIssuesStandardStrategy();
            }
            case COMFORT -> {
                return new AllowedNumberOfIssuesComfortStrategy();
            }
            case LUX -> {
                return new AllowedNumberOfIssuesLuxStrategy();
            }
        }
        return new AllowedNumberOfIssuesStandardStrategy();
    }

    public void setNumberOfAllowedIncidents(int i) {
        this.numberOfAllowedIncidents = i;
    }
}
