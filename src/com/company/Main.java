package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] iArray = {1, 2, 3, 4, 5};
        reverseArray(iArray);
        System.out.println(Arrays.toString(iArray));
    }

    public static void reverseArray(int[] anArray) {
        int maxIndex = anArray.length - 1;
        int halfIndex = anArray.length / 2;

        for (int i = 0; i < halfIndex; i++)
        {
            int temp = anArray[i];
            anArray[i]=anArray[maxIndex - i];
            anArray[maxIndex - i] = temp;
        }
    }
}
