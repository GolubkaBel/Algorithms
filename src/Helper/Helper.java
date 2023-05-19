package Helper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {
    public int[] array;
    private long startSortTime;
    public void ArrayRecipient() throws InputMismatchException, NegativeArraySizeException {
        try {
            System.out.print("Введите количество элементов: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            array = new int[n];
            System.out.print("Введите элементы массива: ");
            for (int i=0; i<n; i++) array[i]= sc.nextInt();
            startSortTime = System.nanoTime();
        } catch(Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.print("На ввод ожидаются целочисленные значения!");
                System.exit(0);
            } else if (e instanceof NegativeArraySizeException) {
                System.out.print("Длинна массива не может быть отрицательной!");
                System.exit(0);
            } else {
                System.out.print(e.getMessage());
                System.exit(0);
            }
        }
    }
    public void ArraySender() {
        long sortTime = System.nanoTime()-startSortTime;
        System.out.print("Отсортированный массив: ");
        for (int a : array) System.out.print(a + "; ");
        System.out.print("\nВремя сортировки: " + sortTime);
    }
    public void ArrayShiftElements(int address1, int address2) {
        int a = array[address1];
        array[address1] = array[address2];
        array[address2] = a;
    }
}
