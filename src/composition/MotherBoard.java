package composition;

public class MotherBoard {
    private String model;
    private String manufaturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufaturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufaturer = manufaturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
