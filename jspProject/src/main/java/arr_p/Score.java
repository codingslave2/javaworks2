package jspProject.src.main.java.arr_p;

public class Score {

    public static void main(String[] args) {
        int[] score = {87, 65, 82, 46, 98, 65, 72, 34, 91, 79, 45, 67};
        String grade = "수우미양가";

        int[] gradeCount = new int[grade.length()];

        for (int j : score) {
            if (j >= 90) {
                gradeCount[0]++; // '수' 등급
            } else if (j >= 80) {
                gradeCount[1]++; // '우' 등급
            } else if (j >= 70) {
                gradeCount[2]++; // '미' 등급
            } else if (j >= 60) {
                gradeCount[3]++; // '양' 등급
            } else {
                gradeCount[4]++; // '가' 등급
            }
        }



        }


        System.out.println("등급 수: " + gradeCount[0]);
        System.out.println("등급 우: " + gradeCount[1]);
        System.out.println("등급 미: " + gradeCount[2]);
        System.out.println("등급 양: " + gradeCount[3]);
        System.out.println("등급 가: " + gradeCount[4]);

    }


}
