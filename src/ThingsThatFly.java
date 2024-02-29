// Main class to run the program
public class ThingsThatFly {
    public static void main(String[] args) {
        // Create an array to store instances of Flight
        Flight[] flyingThings = new Flight[3];
        // Create instances of Airplane and Bird and store them in the array
        flyingThings[0] = new Airplane("Boeing 747", 2016);
        flyingThings[1] = new Bird("Eagle");
        flyingThings[2] = new Bird("Hummingbird");

        // Loop through the array and print information about each flying thing
        for (Flight flyingThing : flyingThings) {
            System.out.println(flyingThing.toString() + ": ");
            flyingThing.fly();
        }
    }
}