package SelectionSort;

import Helper.ArrayHelper;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayHelper h = new ArrayHelper();
        h.ArrayRecipient();
        int length = h.array.length;
        int addressOfStart = 0;
        int min, addressOfMin;
        while (length-1 != addressOfStart) {
            min = h.array[addressOfStart];
            addressOfMin = addressOfStart;
            for (int i = addressOfStart+1; i < length; i++)
                if (h.array[i] < min) {
                    min = h.array[i];
                    addressOfMin = i;
                }
            if (addressOfMin != addressOfStart) h.ArrayShiftElements(addressOfMin, addressOfStart);
            addressOfStart++;
        }
        h.ArraySender();
    }
}
