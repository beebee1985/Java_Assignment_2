package animal;

public class Chicken extends Animal {
    private String eggColor;

    public Chicken(String name, String eggColor) {
        super("Chicken", name);
        this.eggColor = eggColor;
    }

    public String getEggColor() {
        return eggColor;
    }

    public void setEggColor(String eggColor) {
        this.eggColor = eggColor;
    }
}
