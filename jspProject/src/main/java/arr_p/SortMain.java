package jspProject.src.main.java.arr_p;

import java.util.Arrays;

public class SortMain {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a + ", " + b);

        int buf = b;
        b = a;
        a = buf;

        System.out.println(a + ", " + b);

        int[] arr = {77, 65, 98, 46, 82};
        System.out.println("정렬 전: " + Arrays.toString(arr));

        for (int me = 0; me < arr.length; me++) {
            System.out.println(arr[me]);

            for (int you = 0; you < arr.length; you++) {

                if (arr[me] > arr[you]) {
                    buf = arr[you];
                    arr[you] = arr[me];
                    arr[me] = buf;
                }

            }
        }

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}
