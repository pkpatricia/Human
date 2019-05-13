class Car {


    Integer buildYear;
    String modelName;
    String buildName;
    String locationcityName;
    String locationstateName;

    public Integer getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(Integer buildYear) {
        this.buildYear = buildYear;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getLocationcityName() {
        return locationcityName;
    }

    public void setLocationcityName(String locationcityName) {
        this.locationcityName = locationcityName;
    }

    public String getLocationstateName() {
        return locationstateName;
    }

    public void setLocationstateName(String locationstateName) {
        this.locationstateName = locationstateName;
    }
// This is the constructor for the Cars...

    Car(int buildYear, String modelName, String buildName, String locationcityName, String locationstateName){
        this.buildYear = buildYear;
        this.modelName = modelName;
        this.buildName = buildName;
        this.locationcityName = locationcityName;
        this.locationstateName = locationstateName;
    }


    public Car changeBuildYear(int ageOne) {

        int newAge = ageOne + 7;

        System.out.println("The New Age is:  " + newAge);

        return this;
    }

    public Car changeLocationCityName(String cityNameTwo) {

        String newCityName = "HardKnockLife " + cityNameTwo;

        System.out.println("The New City is:  " + newCityName);

        return this;
    }

    public Car changeLocationStateName(String stateNameTwo) {

        String newStateName = "HardKnockLife " + stateNameTwo;

        System.out.println("The New State is:  " + newStateName);

        return this;
    }
}


class CarDemo {

    public static void main(String args[]){

        // Create Car Objects...
        Car carOne = new Car(1923, "ModelT", "Ford", "Austin", "Texas");
        Car carTwo = new Car( 1940, "TransAm", "Pontiac", "Southfield", "Michigan");

        int carOneBuild = carOne.buildYear;
        System.out.println("The Current car's build year is: " + carOneBuild);

        String carTwoLoc = carTwo.locationcityName;
        System.out.println("The Current car's location city is: " + carTwoLoc);

        String carmodelNameTwo = carTwo.locationstateName;
        System.out.println("The Current car's location state is: " + carmodelNameTwo);

        carOne.changeBuildYear(carOne.buildYear);

        // Chaining Java Methods...
        carTwo.changeLocationCityName(carTwo.locationcityName).changeLocationStateName(carTwo.locationstateName);
        //carTwo.changeLocationStateName(carTwo.locationstateName);
    }
}

