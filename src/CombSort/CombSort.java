package CombSort;

import Helper.ArrayHelper;

public class CombSort {
    public static void main(String[] args) {
        ArrayHelper h = new ArrayHelper();
        h.ArrayRecipient();
        int length = h.array.length;
        int step = h.array.length-1;
        double coefficient = 1.247330950103979;
        while (step>=1) {
            for (int i = 0; i<length-step; i++)
                if (h.array[i]>h.array[i+step])
                    h.ArrayShiftElements(i, i+step);
            step /= coefficient;
        }
        h.ArraySender();
    }
}
