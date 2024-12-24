import java.util.Arrays;

public class ArrayMinMaxAvg {

    public static void main(String[] args) {

        int size = 10;

        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = Math.random() * 100;
        }

        System.out.println("Массив: " + Arrays.toString(array));

        double max = array[0];
        double min = array[0];
        double sum = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }

        double avg = sum / size;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avg);

    }
}