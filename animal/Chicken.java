package animal;

/**
 * Chicken class that extends Animal with egg color property
 */
public class Chicken extends Animal {
    private String eggColor;

    /**
     * Constructor for Chicken that calls the parent constructor
     * 
     * @param name     The name of the chicken
     * @param eggColor The color of eggs the chicken lays
     */
    public Chicken(String name, String eggColor) {
        super("Chicken", name);
        this.eggColor = eggColor;
    }

    /**
     * Getter method for egg color
     * 
     * @return The color of eggs laid by the chicken
     */
    public String getEggColor() {
        return eggColor;
    }

    /**
     * Setter method for egg color
     * 
     * @param eggColor The egg color to set
     */
    public void setEggColor(String eggColor) {
        this.eggColor = eggColor;
    }
}
