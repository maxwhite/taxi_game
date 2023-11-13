package org.robotdreams.game.project.state;

import org.robotdreams.game.project.Taxi;

public class TaxiSimulator {
    private State currenState;

    public final int TIME_LIMIT = 45;

    // time to reach destination
    private int timeLeft = TIME_LIMIT;
    private Taxi taxi;

    public TaxiSimulator () {
        currenState = new ChooseDestinationState(this);
    }

    public void handle() {
        currenState.handle();
    }

    public void setState(State state) {
        this.currenState = state;
    }

    public State getChooseTaxiState() {
        return new ChooseTaxiState(this);
    }

    public State getChooseDestinationState() {
        return new ChooseDestinationState(this);
    }

    public State getOnAWayToDestinationState() {
        return new OnAWayToDestinationState(this);
    }

    public State getFinishGameState() {
        return new FinishGameState(this);
    }

    public State getBrokenState() {
        return new BrokenState(this);
    }

    public State getCurrentState() {
        return this.currenState;
    }

    public State getTerminateSimulatoState() {
        return new TerminateSimulatorState(this);
    }

    public State getOnTrafficJamState() {
        return new OnTrafficJamState(this);
    }

    public State getWinState() {
        return new WinState(this);
    }

    public State getLostState() {
        return new LostGameState(this);
    }
    
    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public Taxi getTaxi() {
        return this.taxi;
    }
}
