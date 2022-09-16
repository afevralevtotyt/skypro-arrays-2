import com.sun.tools.jconsole.JConsoleContext;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Задание 2
        System.out.println("Задание 2");
        List<Integer> ints = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Минимальная сумма трат за день составила " + Collections.min(ints) + " рублей ");
        System.out.println("Максимальная сумма трат за день составила " + Collections.max(ints) + " рублей ");

        //Задание 3
        System.out.println("Задание 3");
        double average = sum / 30 * 1.0;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
        System.out.println();
        //Задание 5. Повышенная сложность

        System.out.println("Задание 5");
        int matrix[][] = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Задание 6. Повышенная сложность

        System.out.println("Задание 6");
        int array[] = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        int newArray[] = new int[5];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[count] = array[i];
            count++;
        }
        array = newArray;
        System.out.println(Arrays.toString(array));

        //Задание 7. Повышенная сложность
        System.out.println("Задание 7");

        int newArr[] = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(newArr));
        for (int i = 0; i < newArr.length / 2; i++) {
            int tmp = newArr[i];
            newArr[i] = newArr[newArr.length - i - 1];
            newArr[newArr.length - i - 1] = tmp;

        }
        System.out.println(Arrays.toString(newArr));

        //Задание 8. Повышенная сложность
        System.out.println("Задание 8");
        int thirdArray[] = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        boolean isTrue = false;
        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = i + 1; j < thirdArray.length; j++) {
                if (thirdArray[i] + thirdArray[j] == -2) {
                    System.out.println("число " + thirdArray[i] + " число " + thirdArray[j]);
                    isTrue = true;
                }
            }
            if (isTrue) {
                break;
            }
        }
        //Задание 9. Повышенная сложность
        System.out.println("Задание 9");
        for (int i = 0; i < thirdArray.length; i++) {
            for (int j = i + 1; j < thirdArray.length; j++) {
                if (thirdArray[i] + thirdArray[j] == -2) {
                    System.out.println("число " + thirdArray[i] + " число " + thirdArray[j]);
                }
            }


        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}