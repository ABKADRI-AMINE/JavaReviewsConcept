package House;
class House {
    private boolean doorsOpen;
    private boolean windowsOpen;
    private boolean lightsOn;

    public House() {
        doorsOpen = false;
        windowsOpen = false;
        lightsOn = false;
    }

    public void openDoors() {
        doorsOpen = true;
        System.out.println("Doors are now open.");
    }

    public void closeDoors() {
        doorsOpen = false;
        System.out.println("Doors are now closed.");
    }

    public void openWindows() {
        windowsOpen = true;
        System.out.println("Windows are now open.");
    }

    public void closeWindows() {
        windowsOpen = false;
        System.out.println("Windows are now closed.");
    }

    public void turnOnLights() {
        lightsOn = true;
        System.out.println("Lights are now on.");
    }

    public void turnOffLights() {
        lightsOn = false;
        System.out.println("Lights are now off.");
    }
}