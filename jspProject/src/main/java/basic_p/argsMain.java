package basic_p;

import java.util.Arrays;

public class argsMain {

	public static void main(String[] args) {
		
		System.out.println("argsMain Start : " + args.length);
		
		System.out.println(Arrays.toString(args));
		
		// length = 11, 22, 33, 44, 55
		
		int sum = 0;
		int avg = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(String str : args) {		
			
			try {
				
				int intValue = Integer.parseInt(str);
				
				if(intValue % 2== 0){
					
					sum += intValue;
					count ++; // 짝수 카운트
					
					
				}
				
				if(intValue > max ) {
					max = intValue; // 최대값
				}
				
				if(intValue < min) {
					min = intValue; // 최소값
				}
				
				
				else {
					System.out.println("");
				}
				
				System.out.println(args);
				
				} catch (Exception e) {
					
					
				}
				
				System.out.println(args);
				
			}
			
			if(count > 0){
				
				avg = sum / count;
				
			}
			

			
		
		System.out.println("짝수 합 : " + sum);
		System.out.println("짝수 평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("argsMain End");
		
	}

}
