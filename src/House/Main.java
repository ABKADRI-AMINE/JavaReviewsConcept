package House;

public class Main {
    public static void main(String[] args) {
        House myHouse = new House();

        // Testing the methods
        myHouse.openDoors();
        myHouse.openWindows();
        myHouse.turnOnLights();

        System.out.println(); // Adding a newline for better readability

        myHouse.closeDoors();
        myHouse.closeWindows();
        myHouse.turnOffLights();
    }
}