package hotelgreenest.main;

import hotelgreenest.plants.*;
import hotelgreenest.typer.PlantType;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProgramManager {

        public ProgramManager() {
            List<Plants> plants = plantList();
            findRightPlant(plants);
        }

        // Metod för att skapa en lista med växter
        public List<Plants> plantList() {
            List<Plants> plants = new ArrayList<>();
            Plants plant1 = new PalmTree("Laura", PlantType.PALMTREE, 5.0);
            Plants plant2 = new PalmTree("Olof", PlantType.PALMTREE, 1.0);
            Plants plant3 = new Cactus("Igge", PlantType.CACTUS, 0.2);
            Plants plant4 = new CarnivorousPlant("Meatloaf", PlantType.CARNIVOROUS_PLANT, 0.7);

            plants.add(plant1);
            plants.add(plant2);
            plants.add(plant3);
            plants.add(plant4);

            return plants;
        }

        //Metod för att ta användarinput och ge tillbaka rätt info
        public void findRightPlant(List<Plants> plants) {
            boolean plantFound = false;

            //Tar input från användaren och hanterar scenarion där användaren avslutar programmet
            while (!plantFound) {
                String input = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
                if (input == null || input.equalsIgnoreCase("avbryt")) {
                    JOptionPane.showMessageDialog(null, "Programmet avslutas.");
                    return;
                }

                //Letar efter rätt växt i listan och ger tillbaka rätt info
                for (Plants plant : plants) {
                    if (plant.getPlantName().equalsIgnoreCase(input.trim())) {
                        String output = plant.toString();
                        JOptionPane.showMessageDialog(null, output);
                        plantFound = true;
                        break;
                    }
                }
                //Om felaktig växt skrivs in returneras ett felmeddelande
                if (!plantFound) {
                    JOptionPane.showMessageDialog(null, "Växt med namnet " + input + " hittades inte. Försök igen.");
                }
            }
        }

    }


