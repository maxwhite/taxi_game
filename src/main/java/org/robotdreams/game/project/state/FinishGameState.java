package org.robotdreams.game.project.state;

public class FinishGameState implements State {

    TaxiSimulator taxiSimulator;

    public FinishGameState(TaxiSimulator taxiSimulator) {
        this.taxiSimulator = taxiSimulator;
    }

    @Override
    public void handle() {
        System.out.println("You lost! Game is over bye!");
        this.taxiSimulator.setState(this.taxiSimulator.getTerminateSimulatoState());
    }
}
