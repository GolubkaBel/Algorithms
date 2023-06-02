package InsertionSort;

import Helper.ArrayHelper;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayHelper h = new ArrayHelper();
        h.ArrayRecipient();
        int length = h.array.length;
        int j;
        for (int i = 1; i<length; i++) {
            int memA = h.array[i];
            for (j=i; j>0 && memA < h.array[j - 1]; j--)
                h.array[j] = h.array[j-1];
            h.array[j] = memA;
        }
        h.ArraySender();
    }
}
