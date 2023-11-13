package org.robotdreams.game.project.state;

import org.robotdreams.game.project.Taxi;
import org.robotdreams.game.project.TaxiType;

import java.util.Scanner;

public class ChooseTaxiState implements State {

    TaxiSimulator simulator;

    public ChooseTaxiState(TaxiSimulator simulator) {
        this.simulator = simulator;
    }

    @Override
    public void handle() {

      while (true) {
          System.out.println("Please choose taxi...");
          System.out.println("1. Standard");
          System.out.println("2. Comfort");
          System.out.println("3. Lux");
          System.out.println("4. Quit game");

          Scanner scanner = new Scanner(System.in);
          String line = scanner.nextLine();

          boolean exit = false;
          switch (line) {
              case "1":
                  this.simulator.setTaxi(new Taxi(TaxiType.STANDART));
                  this.simulator.setState(this.simulator.getOnAWayToDestinationState());
                  exit = true;
               break;

              case "2":
                  this.simulator.setTaxi(new Taxi(TaxiType.COMFORT));
                  this.simulator.setState(this.simulator.getOnAWayToDestinationState());
                  exit = true;
              break;

              case "3":
                  this.simulator.setTaxi(new Taxi(TaxiType.LUX));
                  this.simulator.setState(this.simulator.getOnAWayToDestinationState());
                  exit = true;
               break;

              case "4":
                  this.simulator.setState(this.simulator.getFinishGameState());
                  exit = true;
              break;
          }

          this.simulator.getTaxi().setNumberOfAllowedIncidents(this.simulator.getTaxi().getNumberOfAllowedIncidents());

          if(exit) {
              break;
          }

      }

    }
}
