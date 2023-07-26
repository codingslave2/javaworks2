package basic_p;

public class my369 {
    public static void main(String[] args) {
    	System.out.println("1>20==============================");
        for (int i = 1; i <= 20; i++) {
        	int one = i % 10;
        	if(one % 3 == 0 && one != 0) {
        		System.out.println("짝");
        	}else {
        	System.out.println(i + ", "+one);
        	}
        }int no = 1245;
        System.out.println("1>100===============================");
        for(int i = 1; i <= no; i++) {
        	int one = i % 10;
        	int ten = i/10;
        	
        	String ttt = "";
        	if(ten % 3 == 0 && ten != 0) {
        		ttt += "짝";
        	}
        	if(one % 3 == 0 && one != 0) {
        		ttt += "짝";
        	}
        	if(ttt.equals("")) {
        		ttt += i;
        	}
        	System.out.println(ttt);
        }
       
        try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
        
    }
    
}
