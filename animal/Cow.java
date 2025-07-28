package animal;

/**
 * Cow class that extends Animal with milk production capability
 */
public class Cow extends Animal {
    private int milkPerDay;

    /**
     * Constructor for Cow that calls the parent constructor
     * 
     * @param name       The name of the cow
     * @param milkPerDay The amount of milk the cow produces per day
     */
    public Cow(String name, int milkPerDay) {
        super("Cow", name);
        this.milkPerDay = milkPerDay;
    }

    /**
     * Getter method for milk per day
     * 
     * @return The amount of milk produced per day
     */
    public int getMilkPerDay() {
        return milkPerDay;
    }

    /**
     * Setter method for milk per day
     * 
     * @param milkPerDay The amount of milk to set per day
     */
    public void setMilkPerDay(int milkPerDay) {
        this.milkPerDay = milkPerDay;
    }
}
