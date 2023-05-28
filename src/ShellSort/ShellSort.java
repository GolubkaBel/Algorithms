package ShellSort;

import Helper.Helper;

public class ShellSort {
    public static void main(String[] args)  {
        Helper h = new Helper();
        h.ArrayRecipient();
        int length = h.array.length;
        int step = h.array.length/2;
        int j;
        while (step>0) {
            for (int i=step; i<length; i++) {
                int mem = h.array[i];
                for (j = i; j>=step && mem<h.array[j-step]; j-=step)
                    h.array[j] = h.array[j-step];
                h.array[j] = mem;
            }
            step/=2;
        }
        h.ArraySender();
    }
}