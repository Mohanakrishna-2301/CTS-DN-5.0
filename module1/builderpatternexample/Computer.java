package module1.builderpatternexample;

public class Computer 
{
    private String cpu;
    private String ram;
    private String storage;
    private String operatingSystem;

    // Private constructor that takes Builder object
    private Computer(Builder builder) 
    {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.operatingSystem = builder.operatingSystem;
    }

    // Method to display computer details
    public void display() 
    {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println();
    }

    // Static nested Builder class
    public static class Builder 
    {
        private String cpu;
        private String ram;
        private String storage;
        private String operatingSystem;

        // Methods to set each attribute
        public Builder setCPU(String cpu) 
        {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) 
        {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) 
        {
            this.storage = storage;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) 
        {
            this.operatingSystem = operatingSystem;
            return this;
        }

        // build() method returns final Computer object
        public Computer build() 
        {
            return new Computer(this);
        }
    }
}
