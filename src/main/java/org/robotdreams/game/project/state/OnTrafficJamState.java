package org.robotdreams.game.project.state;

import java.util.Scanner;

public class OnTrafficJamState implements State {

    TaxiSimulator taxiSimulator;

    public OnTrafficJamState(TaxiSimulator taxiSimulator) {
        this.taxiSimulator = taxiSimulator;
    }

    @Override
    public void handle() {

        while (true) {

            System.out.println("We are on traffic jam...");
            System.out.println("1. Wait in the queue");
            System.out.println("2. Live and call another taxi");
            System.out.println("3. Quit game");

            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine();

            boolean exit = false;

            switch (line) {
                case "1":
                    System.out.println("After wasting some time in a queue we can carry on our trip");
                    taxiSimulator.setState(this.taxiSimulator.getOnAWayToDestinationState());
                    exit = true;
                    break;
                case "2":
                    taxiSimulator.setState(this.taxiSimulator.getChooseDestinationState());
                    exit = true;
                    break;
                case "3":
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
