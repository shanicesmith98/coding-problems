public class AnimalShelter {
    // create global variables for object animalshelter
    double age; // age of dog in years
    String breed; // breed of dog
    String activityLevel; // dog's activity level

    // constructor with parameters for the blueprint of the object
    public AnimalShelter(double age, String breed, String activityLevel) {
        // this. is used for local variables within the scope (since no variable change)
        this.age = age;
        this.breed = breed;
        this.activityLevel = activityLevel;
    }
    
    // method to determine your true match based on activity level
    // uses void since it isn't returning a value
    public void trueMatch() {
        switch(activityLevel) {
            case "High":
                System.out.println("It's time to get active. This dog has a high activity level and requires plenty of outdoor time 🏃‍♀️");
                break;
            case "Moderate":
                System.out.println("Hello, outdoors! This dog equally enjoys a nice, long game of fetch and napping in the shade 🌞");
                break;
            case "Low":
                System.out.println("Say hello to your new cuddle buddy! This dog loves spending time relaxing at home 😴");
                break;
            default:
                System.out.println("Unknown activity level");
        }
    }

    public static void main(String[] args) {
        // creating new instances of the animalshelter object
        AnimalShelter Georgie = new AnimalShelter(4, "Beagle", "Moderate");
        AnimalShelter Rex = new AnimalShelter(2, "German Shepherd", "High");
        AnimalShelter Callie = new AnimalShelter(11, "Yorkie", "Low");
        AnimalShelter Luna = new AnimalShelter(0.5, "Border Collie", "Hyper");

        // calling variables located within the local scope of the instances (age, breed, activity level)
        System.out.println(Callie.activityLevel + " " + Rex.age + " " + Georgie.breed);
        
        // using true match method to detect their activity/energy by accessing their activity level value
        Georgie.trueMatch();
        Rex.trueMatch();
        Callie.trueMatch();
        Luna.trueMatch();
    }
}
