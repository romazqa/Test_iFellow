import java.util.Scanner;

public class BaseConverter {

    public double convert(double celsius, String targetUnit) {
        switch (targetUnit.toLowerCase()) {
            case "кельвины":
            case "кельвин":
            case "k":
                return celsius + 273.15;
            case "фаренгейты":
            case "фаренгейт":
            case "f":
                return celsius * 9 / 5 + 32;

            default:
                System.out.println("Неподдерживаемая единица измерения. Возвращаем значение в Цельсиях.");
                return celsius;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseConverter converter = new BaseConverter();

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        System.out.print("Введите единицу измерения для конвертации (Кельвины/Фаренгейты): ");
        scanner.nextLine();
        String targetUnit = scanner.nextLine();

        double convertedValue = converter.convert(celsius, targetUnit);
        System.out.println("Результат: " + convertedValue + " " + targetUnit);

        scanner.close();
    }
}
