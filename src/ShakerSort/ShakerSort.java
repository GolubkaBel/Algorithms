package ShakerSort;

import Helper.Helper;

public class ShakerSort {
    public static void main(String[] args) {
        Helper h = new Helper();
        h.ArrayRecipient();
        int left = 0; int right = h.array.length-1;
        while (left<right) {
            for (int i=left; i<right; i++) {
                if (h.array[i] > h.array[i+1]) h.ArrayShiftElements(i, i+1);
            } right--;
            for (int i=right; i>left; i--) {
                if (h.array[i] < h.array[i-1]) h.ArrayShiftElements(i, i-1);
            } left++;
        }
        h.ArraySender();
    }
}
