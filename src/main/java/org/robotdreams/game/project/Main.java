package org.robotdreams.game.project;

import org.robotdreams.game.project.state.TaxiSimulator;
import org.robotdreams.game.project.state.TerminateSimulatorState;

public class Main {
    public static void main(String[] args) {

        TaxiSimulator taxiSimulator = new TaxiSimulator();

        while (true) {
            taxiSimulator.handle();
            if(taxiSimulator.getCurrentState() instanceof TerminateSimulatorState) {
                 break;
              }
            }
       }
}