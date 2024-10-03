package hotelgreenest.typer;


//Enum. Här skapas olika typer av planttype
public enum PlantType {
    PALMTREE("Palm"),
    CACTUS("Kaktus"),
    CARNIVOROUS_PLANT("Köttätande växt");

    //Inkapsling
    private final String plantType;

    PlantType(String plantType) {
        this.plantType = plantType;
    }

    public String getPlantType() {
        return plantType;
    }
}