package org.robotdreams.game.project.state;

import java.util.Random;

public class OnAWayToDestinationState implements State {

    TaxiSimulator taxiSimulator;

    public OnAWayToDestinationState(TaxiSimulator taxiSimulator) {
        this.taxiSimulator = taxiSimulator;
    }


    @Override
    public void handle() {

        while (true) {
            int numberOfAllowedIncidents = this.taxiSimulator.getTaxi().getNumberOfAllowedIncidents();
            System.out.println("You are on the way to your destination");
            System.out.println("Number of allowed incidents is : " + numberOfAllowedIncidents);

            boolean exit = false;
            Random rand = new Random();
            int counter = rand.nextInt(10) + 1;

            for(int i = 0; i < counter; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (Exception exception) {

                }
            }
            System.out.println("");
            String option = String.valueOf(rand.nextInt(3) + 1);

            switch (option) {
                case "1":
                    if(numberOfAllowedIncidents == 0) {
                        this.taxiSimulator.setState(this.taxiSimulator.getLostState());
                    } else {
                        this.taxiSimulator.setState(this.taxiSimulator.getBrokenState());
                        this.taxiSimulator.getTaxi().setNumberOfAllowedIncidents(numberOfAllowedIncidents - 1);
                    }
                    exit = true;
                break;
                case "2":
                    if(numberOfAllowedIncidents == 0) {
                        this.taxiSimulator.setState(this.taxiSimulator.getLostState());
                    }else {
                        this.taxiSimulator.setState(this.taxiSimulator.getOnTrafficJamState());
                        this.taxiSimulator.getTaxi().setNumberOfAllowedIncidents(numberOfAllowedIncidents - 1);
                    }
                    exit = true;
                break;
                // if this case we won the game
                case "3":
                    this.taxiSimulator.setState(this.taxiSimulator.getWinState());
                    exit = true;
                break;
            }

            if(exit) {
                break;
            }

        }

    }
}
