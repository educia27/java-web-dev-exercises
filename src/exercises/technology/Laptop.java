package exercises.technology;

public class Laptop extends Computer {
    private double weight;


    public Laptop(int storage, int ram, String graphicsCard, boolean hasRGB) {
        super(storage, ram, graphicsCard, hasRGB);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isClunky() {
        if (this.weight > 10) {
            return true;
        } else {
            return false;
        }
    }
}
