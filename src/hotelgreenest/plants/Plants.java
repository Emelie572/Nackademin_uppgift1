package hotelgreenest.plants;

import hotelgreenest.fluids.*;
import hotelgreenest.typer.*;

public abstract class Plants implements NutrientFluid {

    //Inkapsling med private
    private final PlantType PLANT_TYPE;
    private String plantName;
    private double plantLengthMeter;


    public Plants(String plantName, PlantType PLANT_TYPE, double plantLengthMeter) {
        this.plantName = plantName;
        this.PLANT_TYPE = PLANT_TYPE;
        this.plantLengthMeter = plantLengthMeter;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public PlantType getPLANT_TYPE() {
        return PLANT_TYPE;
    }

    public double getPlantLengthMeter() {
        return plantLengthMeter;
    }

    public void setPlantLengthMeter(double plantLengthMeter) {
        this.plantLengthMeter = plantLengthMeter;
    }

    @Override
    public abstract double calculateNutrientFluid();


    @Override
    public String toString() {
        return String.format("%s %s: %.1f",
                getPLANT_TYPE().getPlantType(),
                getPlantName(),
                calculateNutrientFluid());
    }
}