import java.util.Scanner;

public class ClockAngle {

    public static double calculateAngle(int hours, int minutes) {
        // Приводим часы к 12-часовому формату
        hours = hours % 12;


        // Вычисляем угол для часовой стрелки (360 градусов / 12 часов = 30 градусов/час + 0.5 градуса/минуту)
        double hourAngle = (hours * 30) + (minutes * 0.5);

        // Вычисляем угол для минутной стрелки (360 градусов / 60 минут = 6 градусов/минуту)
        double minuteAngle = minutes * 6;

        // Вычисляем разницу между углами
        double angle = Math.abs(hourAngle - minuteAngle);

        // Возвращаем меньший угол
        return Math.min(angle, 360 - angle);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Некорректный формат времени.");
            return;
        }

        double angle = calculateAngle(hours, minutes);
        System.out.println("Угол между стрелками: " + angle + " градусов");

        scanner.close();
    }
}
