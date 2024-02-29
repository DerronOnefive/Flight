// Define the Flight interface with a fly() method
interface Flight {
    void fly();
}

// Implement the Flight interface with the Airplane class
class Airplane implements Flight {
    // Attributes of the Airplane class
    private String model;
    private int yearBuilt;

    // Constructor for the Airplane class
    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    // Getter and setter methods for model attribute
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter methods for yearBuilt attribute
    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // Implementation of the fly() method for Airplane
    @Override
    public void fly() {
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }

    // Override the toString() method to provide a string representation of the Airplane object
    @Override
    public String toString() {
        return "Airplane [model=" + model + ", year=" + yearBuilt + "]";
    }
}

// Implement the Flight interface with the Bird class
class Bird implements Flight {
    // Attribute of the Bird class
    private String type;

    // Constructor for the Bird class
    public Bird(String type) {
        this.type = type;
    }

    // Getter and setter methods for type attribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Implementation of the fly() method for Bird
    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps my wings to fly.");
    }

    // Override the toString() method to provide a string representation of the Bird object
    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }
}
