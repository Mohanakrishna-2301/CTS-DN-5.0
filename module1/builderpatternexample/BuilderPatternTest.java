package module1.builderpatternexample;

public class BuilderPatternTest 
{
    public static void main(String[] args) 
    {
        // Create first computer configuration
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setOperatingSystem("Windows 11")
                .build();

        // Create second computer configuration
        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 10")
                .build();

        // Display details
        gamingPC.display();
        officePC.display();
    }
}
