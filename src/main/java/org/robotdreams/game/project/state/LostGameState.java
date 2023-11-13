package org.robotdreams.game.project.state;

public class LostGameState implements State {

    TaxiSimulator taxiSimulator;

    public LostGameState(TaxiSimulator taxiSimulator) {
        this.taxiSimulator = taxiSimulator;
    }


    @Override
    public void handle() {
        System.out.println("Number of incidents is run out. You lost the game!");
        this.taxiSimulator.setState(this.taxiSimulator.getTerminateSimulatoState());
    }
}
