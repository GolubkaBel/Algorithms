package Helper;

import java.util.Scanner;

public class Helper {
    public int[] array;
    public void ArrayRecipient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        array = new int[n];
        System.out.print("Введите элементы массива: ");
        for (int i=0; i<n; i++) array[i]= sc.nextInt();
    }
    public void ArraySender() {
        System.out.print("Отсортированный массив: ");
        for (int a : array) System.out.print(a + "; ");
    }
}
