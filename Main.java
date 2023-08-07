import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание ноутбуков
        NoteBook notebook1 = new NoteBook("Model1", 8, 512, "Windows", "Black");
        NoteBook notebook2 = new NoteBook("Model2", 16, 1024, "MacOS", "Silver");
        NoteBook notebook3 = new NoteBook("Model3", 8, 256, "Linux", "Black");
        NoteBook notebook4 = new NoteBook("Model4", 12, 512, "Windows", "White");
        NoteBook notebook5 = new NoteBook("Model5", 16, 512, "MacOS", "Space Gray");

        // Создание списка ноутбуков
        List<NoteBook> notebooks = Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5);

        // Приветствие
        System.out.println("Добро пожаловать в магазин ноутбуков!");

        // Выбор критерия фильтрации
        System.out.println("Выберите критерий фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int filterChoice = scanner.nextInt();

        int minRam = 0;
        int minStorage = 0;
        String desiredOs = null;
        String desiredColor = null;

        // Выбор конкретных параметров фильтрации
        switch (filterChoice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ (в GB):");
                minRam = scanner.nextInt();
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД (в GB):");
                minStorage = scanner.nextInt();
                break;
            case 3:
                System.out.println("Введите желаемую операционную систему:");
                desiredOs = scanner.next();
                break;
            case 4:
                System.out.println("Введите желаемый цвет:");
                desiredColor = scanner.next();
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        // Фильтрация и вывод подходящих ноутбуков
        System.out.println("Подходящие ноутбуки:");
        for (NoteBook notebook : notebooks) {
            if (notebook.matchesFilter(minRam, minStorage, desiredOs, desiredColor)) {
                System.out.println(notebook);
            }
        }
    }
}
