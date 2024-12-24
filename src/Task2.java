import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = sc.nextLine();

        int[] charCounts = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts[c]++;
        }

        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > 1) {
                System.out.println((char) i + " повторяется " + charCounts[i] + " раз(а)");
            }
        }

        sc.close();
    }
}
