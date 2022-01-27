package exercises.technology;



public class Program {
    public static void main(String[] args) {
        Computer garfrakki = new Computer(500, 16, "XRS 5679", true);

//        System.out.println("The current storage is " + garfrakki.getStorage());
//        System.out.println("The current ram is " + garfrakki.getRam());
//
//        garfrakki.increaseStorage(400);
//        garfrakki.increaseRam(8);
//
//        System.out.println("The new storage is " + garfrakki.getStorage());
//        System.out.println("The new ram is " + garfrakki.getRam());

//        Laptop server = new Laptop(200, 12,"graphics card", true);
//        System.out.println("This laptop is clunky: " + server.isClunky());
//        System.out.println(server.getWeight());

        Smartphone samsung = new Smartphone(500,16,"N/A",false,13,200);
        System.out.println("Current photos taken: " + samsung.getNumOfPhotos());

        samsung.takePhoto(15);

        System.out.println("New photos taken: " + samsung.getNumOfPhotos());

        System.out.println(samsung.getStorage());

    }

}

