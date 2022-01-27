package exercises.technology;

public class Smartphone extends Computer{
    private int numOfApps;
    private int numOfPhotos;

    public Smartphone(int storage, int ram, String graphicsCard, boolean hasRGB, int numOfApps, int numOfPhotos) {
        super(storage, ram, graphicsCard, hasRGB);
        this.numOfApps = numOfApps;
        this.numOfPhotos = numOfPhotos;
    }

    public void takePhoto(int photosTaken){
        this.numOfPhotos += photosTaken;
    }

    public int getNumOfApps() {
        return numOfApps;
    }

    public int getNumOfPhotos() {
        return numOfPhotos;
    }
}
