package hotelgreenest.plants;

import hotelgreenest.typer.*;

public class PalmTree extends Plants {

    //Ärver från superklassen
    public PalmTree(String plantName, PlantType PLANT_TYPE, double plantLengthMeter) {
        super(plantName, PlantType.PALMTREE, plantLengthMeter);
    }

    //Polymorfism, en form av en metoden som räknar ut näringsvätskan
    @Override
    public double calculateNutrientFluid() {
        double tapWater = 0.5 * getPlantLengthMeter();
        return tapWater;

    }

    //Polymorfism, en form av en metoden toString
    //Skapar en sträng av olika objekt
    @Override
    public String toString() {
        return String.format("%s %s: %.1f liter kranvatten per dag",
                getPLANT_TYPE().getPlantType(),
                getPlantName(),
                calculateNutrientFluid());
    }

}