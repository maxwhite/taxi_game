package org.robotdreams.game.project.state;

import java.util.Scanner;

public class ChooseDestinationState implements State {

    private TaxiSimulator taxiSimulator;

    public ChooseDestinationState(TaxiSimulator taxiSimulator) {
        this.taxiSimulator = taxiSimulator;
    }

    @Override
    public void handle() {
        while (true) {

            System.out.println("Please choose destination");
            System.out.println("1. Train station");
            System.out.println("2. City center");
            System.out.println("3. Airport");
            System.out.println("4. Quit game");

            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine();

            boolean exit = false;

            switch (line) {
                case "1":
                    taxiSimulator.setState(this.taxiSimulator.getChooseTaxiState());
                    exit = true;
                    break;
                case "2":
                    taxiSimulator.getChooseTaxiState().handle();
                    exit = true;
                    break;
                case "4":
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
