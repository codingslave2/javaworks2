package jspProject.src.main.java.arr_p;

public class ArrayMain {

    public static void main(String[] args) {
        int a = 10;
        int[] arr1 = {1, 2, 3}; // 배열 생성 및 초기화 후 주소 대입

        System.out.println("a:" + a);
        System.out.println("arry1:" + arr1); // [I@515f550a

        // [ : 배열 차원
        // I : int
        // @ : 구분
        // 515f550a : hash 코드 16진수로 표현

        a = 23;
        // arry1 = {55, 66, 77}; // new int []는 최초 배열 변수 선언시에만 가능

        arr1 = new int[]{5, 6, 7, 8, 9};

        System.out.println("a:" + a);
        System.out.println("arry1:" + arr1 + "=>" + arr1.length);

        int[] arr2 = new int[4];
        System.out.println("arr2:" + arr2 + "=>" + arr2.length);

        int[] arr3 = arr1;
        int [] arr4 = new int[arr1.length];
            for(int i=0; i<arr1.length; i++){
                arr4[i] = arr1[i];
            }

        System.out.println("arr3:" + arr3 + "=>" + arr3.length);

        System.out.println("arr4:" + arr4 + "=>" + arr4.length);

        int[] arr5 = new int[3];
        int[] arr6 = arr1;
        int[] arr7 = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr7[i] = arr1[i];
        }

        int [] arr8 = new int[arr1.length]; // deep copy

        int b = a;
        System.out.println("a:" + a + ", b:" + b);

        a = 33;
        arr1[1] = 6543;


        System.out.println("a:" + a + ", b:" + b);
        System.out.println("arr1:" + arr1 + "=>" + arr1.length);
        System.out.println("arr2:" + arr2 + "=>" + arr2.length);
        System.out.println("arr3:" + arr3 + "=>" + arr3.length);
        System.out.println("arr4:" + arr4 + "=>" + arr4.length);
    }
}
