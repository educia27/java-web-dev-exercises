package exercises.technology;

public class Computer {
    private int storage;
    private int ram;
    private String graphicsCard;
    private boolean hasRGB;

    public Computer(int storage, int ram, String graphicsCard, boolean hasRGB) {
        this.storage = storage;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.hasRGB = hasRGB;
    }

    public void increaseRam(int ramNumber) {
        this.ram += ramNumber;
    }

    public void increaseStorage(int storageNumber) {
        this.storage += storageNumber;
    }
    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public boolean isHasRGB() {
        return hasRGB;
    }
}
