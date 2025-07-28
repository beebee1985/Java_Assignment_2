package animal;

public class Cow extends Animal {
    private int milkPerDay;

    public Cow(String name, int milkPerDay) {
        super("Cow", name);
        this.milkPerDay = milkPerDay;
    }

    public int getMilkPerDay() {
        return milkPerDay;
    }

    public void setMilkPerDay(int milkPerDay) {
        this.milkPerDay = milkPerDay;
    }
}
