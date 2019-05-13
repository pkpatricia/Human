

class Human {

    Integer age;
    String firstName;
    String lastName;
    String cityName;
    String stateName;

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

    public Integer getAge() {
       return age;
    }

    public Human setAge(Integer age) {
        this.age = age;
        return this;
    }

    // This is the constructor for the Humans...

    Human(int age, String firstName, String lastName, String cityName, String stateName){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cityName = cityName;
        this.stateName = stateName;
    }

    public Human changeAge(int ageOne) {

        int newAge = ageOne + 7;

        System.out.println("The New Age is:  " + newAge);

        return this;
    }

    public Human changeCityName(String cityNameTwo) {

        String newCityName = "HardKnockLife " + cityNameTwo;

        System.out.println("The New City is:  " + newCityName);

        return this;
    }

    public Human changeStateName(String stateNameTwo) {

        String newStateName = "HardKnockLife " + stateNameTwo;

        System.out.println("The New State is:  " + newStateName);

        return this;
    }
}

class HumanDemo {

    public static void main(String args[]) {

        // Create Human Objects...
        Human humanOne = new Human(23, "Janice", "Jackson", "Austin", "Texas");
        Human humanTwo = new Human(40, "Susan", "Smith", "Southfield", "Michigan");

        int ageOne = humanOne.age;
        System.out.println(ageOne);

        String cityNameTwo = humanTwo.cityName;
        System.out.println(cityNameTwo);

        String stateNameTwo = humanTwo.stateName;
        System.out.println(stateNameTwo);

        humanOne.changeAge(humanOne.age);
        //humanTwo.changeCityName(humanTwo.cityName);
        //humanTwo.changeStateName(humanTwo.stateName);


        // Chaining Java Methods.....
        humanTwo.changeCityName(cityNameTwo).changeStateName(stateNameTwo);
    }

}








