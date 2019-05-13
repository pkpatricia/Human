class Dragon {

    Integer age;
    String firstName;
    String lastName;
    String cityName;
    String stateName;
    Integer evilnessScore;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Integer getEvilnessScore() {
        return evilnessScore;
    }

    public void setEvilnessScore(Integer evilnessScore) {
        this.evilnessScore = evilnessScore;
    }
// This is the constructor for the Dragons...


    Dragon(int age, String firstName, String lastName, String cityName, String stateName, int evilnessScore) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.evilnessScore = evilnessScore;
    }

    public Dragon changeAge(int dragonOneAge) {

        int newAge = dragonOneAge + 7;

        System.out.println("The New Age is:  " + newAge);

        return this;
    }

    public Dragon changeCityName(String dragonTwoCity) {

        String newCityName = "HardKnockLife " + dragonTwoCity;

        System.out.println("The New City is:  " + newCityName);

        return this;
    }


    public Dragon changeDragonEvilScore(int dragonTwoEvil) {

        int dragonEvilScore = dragonTwoEvil + 900;

        System.out.println("The New Dragon Evil Score is:  " + dragonEvilScore);

        return this;

    }
}

class DragonDemo {

    public static void main(String args[]){

        // Create Dragon Objects...
        Dragon dragonOneObj = new Dragon(23, "Janice", "Jackson", "Austin", "Texas", 9);
        Dragon dragonTwoObj = new Dragon( 40, "Susan", "Smith", "Southfield", "Michigan",1);
        Dragon dragonThreeObj = new Dragon(21, "JacksonEvan", "Ruben", "Birmingham", "Alabama", 37);

        int dragonOneAge = dragonOneObj.age;
        System.out.println("The Dragon's age is: " + dragonOneAge);

        String dragonTwoCity = dragonTwoObj.cityName;
        System.out.println("The Dragon's currently lives in " + dragonTwoCity);

        int dragonTwoEvil = dragonTwoObj.evilnessScore;
        System.out.println("The Dragon's current Evil Score " + dragonTwoEvil);

        int dragonThreeEvil = dragonThreeObj.evilnessScore;
        System.out.println("The Dragon's current Evil Score " + dragonThreeEvil);


        dragonOneObj.changeAge(dragonOneObj.age);
        dragonTwoObj.changeCityName(dragonTwoObj.cityName).changeDragonEvilScore(dragonTwoObj.evilnessScore);
        //dragonTwoObj.changeDragonEvilScore(dragonTwoObj.evilnessScore);
        dragonThreeObj.changeDragonEvilScore(dragonThreeObj.evilnessScore);
    }

}



