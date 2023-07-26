package basic_p;

public class my3692 {

	public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            try {
                int num = i % 10;
                String output = (num % 3 == 0 && num != 0) ? "짝" : String.valueOf(i);
                System.out.println(output);

                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

	}

}
