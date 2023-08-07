public class NoteBook {
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;

    // Конструктор класса
    public NoteBook(String model, int ram, int storage, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    // Геттеры для полей

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    // Метод для проверки соответствия фильтру
    public boolean matchesFilter(int minRam, int minStorage, String desiredOs, String desiredColor) {
        return ram >= minRam && storage >= minStorage &&
               (desiredOs == null || os.equalsIgnoreCase(desiredOs)) &&
               (desiredColor == null || color.equalsIgnoreCase(desiredColor));
    }

    @Override
    public String toString() {
        return "Model: " + model + ", RAM: " + ram + "GB, Storage: " + storage + "GB, OS: " + os + ", Color: " + color;
    }
}
