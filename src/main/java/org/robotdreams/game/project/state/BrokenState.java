package org.robotdreams.game.project.state;

import java.util.Scanner;

public class BrokenState implements State {

    TaxiSimulator taxiSimulator;

    public BrokenState(TaxiSimulator taxiSimulator) {
        this.taxiSimulator = taxiSimulator;
    }

    @Override
    public void handle() {
        while (true) {

            System.out.println("The car is broken");
            System.out.println("1. Call another taxi");
            System.out.println("2. Finish game");

            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine();

            boolean exit = false;

            switch (line) {
                case "1":
                    this.taxiSimulator.setState(this.taxiSimulator.getChooseDestinationState());
                    exit = true;
                    break;
                case "2":
                    this.taxiSimulator.setState(this.taxiSimulator.getFinishGameState());
                    exit = true;
                    break;
            }
            if(exit) {
                break;
            }

        }

    }
}
