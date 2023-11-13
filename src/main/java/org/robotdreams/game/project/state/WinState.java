package org.robotdreams.game.project.state;

public class WinState implements State {

    TaxiSimulator taxiSimulator;

    public WinState(TaxiSimulator taxiSimulator) {
        this.taxiSimulator = taxiSimulator;
    }

    @Override
    public void handle() {
        System.out.println("Congratulations! You won the game and reached your destination!");
        this.taxiSimulator.setState(this.taxiSimulator.getTerminateSimulatoState());
    }
}
