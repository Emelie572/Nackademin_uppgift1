package hotelgreenest.plants;

import hotelgreenest.typer.*;

public class CarnivorousPlant extends Plants {

    //Ärver från superklassen
    public CarnivorousPlant(String plantName, PlantType PLANT_TYPE, double plantLengthMeter) {
        super(plantName, PlantType.CARNIVOROUS_PLANT, plantLengthMeter);
    }

    //Polymorfism, en form av en metoden
    @Override
    public double calculateNutrientFluid() {
        double proteinDrink = 0.1 + (0.2 * getPlantLengthMeter());
        return proteinDrink;

    }

    //Polymorfism, en form av en metoden
    //Skapar en sträng av olika objekt
    @Override
    public String toString() {
        return String.format("%s %s: %.1f liter proteindryck per dag",
                getPLANT_TYPE().getPlantType(),
                getPlantName(),
                calculateNutrientFluid());
    }

}