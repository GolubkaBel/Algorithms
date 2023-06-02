package BubbleSort;

import Helper.ArrayHelper;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayHelper h = new ArrayHelper();
        h.ArrayRecipient();
        int length = h.array.length;
        while (length>1) {
            for (int i=0; i<length-1; i++)
                if (h.array[i]>h.array[i+1]) h.ArrayShiftElements(i, i+1);
            length--;
        }
        h.ArraySender();
    }
}
