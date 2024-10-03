package hotelgreenest.plants;

import hotelgreenest.typer.*;

public class Cactus extends Plants {

    //Ärver från superklassen
    public Cactus(String plantName, PlantType PLANT_TYPE, double plantLengthMeter) {
        super(plantName, PlantType.CACTUS, plantLengthMeter);
    }

    //Polymorfism, en form av en metoden
    @Override
    public double calculateNutrientFluid() {
        double mineralWater = 2.0;
        return mineralWater;

    }

    //Polymorfism, en form av en metoden
    //Skapar en sträng av olika objekt
    @Override
    public String toString() {
        return String.format("%s %s: %.1f cl mineralvatten per dag",
                getPLANT_TYPE().getPlantType(),
                getPlantName(),
                calculateNutrientFluid());
    }

}