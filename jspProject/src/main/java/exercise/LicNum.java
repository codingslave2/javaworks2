package jspProject.src.main.java.exercise;

import java.util.Scanner;

public class LicNum {

	private String lNum;
	
	public LicNum(String lNum){
		this.lNum = lNum;
	}
	
	public char getGender() {
		char gender = lNum.charAt(6);
		return (gender == '1' || gender == '2') ? '남' : '여';
	}
	
    public int getAge() {
        int birthYear = Integer.parseInt(lNum.substring(0, 2));
        int currentYear = 2023;  // 현재 연도로 가정
        int age;

        if (lNum.charAt(7) == '1' || lNum.charAt(7) == '2') {
            age = currentYear - (1900 + birthYear) + 1;
        }else if(lNum.charAt(7) == '3' || lNum.charAt(7) == '4'){
            age = currentYear - (2000 + birthYear) + 1;
        }else if(lNum.charAt(7) == '5' || lNum.charAt(7) == '6'){
            age = currentYear - (1900 + birthYear) + 1;
        }else if(lNum.charAt(7) == '7' || lNum.charAt(7) == '8'){
            age = currentYear - (2000 + birthYear) + 1;
        }else {
        	age = 0;
        }

        return age;
    }

 
    }




