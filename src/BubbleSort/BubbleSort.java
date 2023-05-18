package BubbleSort;

import Helper.Helper;

public class BubbleSort {
    public static void main(String[] args) {
        Helper h = new Helper();
        h.ArrayRecipient();
        int length = h.array.length;
        while (length>1) {
            for (int i=0; i<length-1; i++) {
                int hi = h.array[i];
                if (hi>h.array[i+1]) {
                    h.array[i]=h.array[i+1];
                    h.array[i+1]=hi;
                }
            }
            length--;
        }
        h.ArraySender();
    }
}
