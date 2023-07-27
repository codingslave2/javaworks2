package basic_p;

import java.util.ArrayList;

public class Calc {

	public static void main(String[] args) {
		// 빈칸, 문자는 덧셈 X 정수만 덧셈
		
		ArrayList<Object> List = new ArrayList<>();
		
		// 정수
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		
		// 빈칸
		List.add(null);
		
		// 문자
		List.add("Sun");
		List.add("Mon");
		List.add("Tue");
		List.add("Wen");
		List.add("Fri");
		


	}

}
