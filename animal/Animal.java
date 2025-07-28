package animal;

/**
 * Abstract Animal class that serves as the base class for all animals in the
 * barn
 */
public abstract class Animal {
    private String type;
    private String name;

    /**
     * Constructor to set the animal type and name
     * 
     * @param type The type of animal (e.g., "Cow", "Chicken")
     * @param name The name of the animal
     */
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    /**
     * Getter method for the animal type
     * 
     * @return The type of the animal
     */
    public String getType() {
        return type;
    }

    /**
     * Setter method for the animal type
     * 
     * @param type The type to set for the animal
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter method for the animal name
     * 
     * @return The name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for the animal name
     * 
     * @param name The name to set for the animal
     */
    public void setName(String name) {
        this.name = name;
    }
}
