package org.robotdreams.game.project.state;

import java.util.Scanner;

public class RunOutOfFuelState implements State {

    private TaxiSimulator taxiSimulator;

    public RunOutOfFuelState(TaxiSimulator taxiSimulator) {
        this.taxiSimulator = taxiSimulator;
    }

    @Override
    public void handle() {
        while (true) {

            System.out.println("Fuel is run out");
            System.out.println("1. Go to gas station and continue trip");
            System.out.println("2. Call another taxi");

            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine();

            boolean exit = false;

            switch (line) {
                case "1":
                    this.taxiSimulator.setState(this.taxiSimulator.getOnAWayToDestinationState());
                    exit = true;
                    break;
                case "2":
                    this.taxiSimulator.setState(this.taxiSimulator.getChooseTaxiState());
                    exit = true;
                    break;
            }
            if(exit) {
                break;
            }

        }

    }
}
