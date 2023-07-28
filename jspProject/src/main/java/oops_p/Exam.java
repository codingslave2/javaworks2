package oops_p;

import java.util.Arrays;

public class Exam {

    String name;
    int[] jum;
    int tot, avg, rank;
    String grade; // grade 변수 추가

    public Exam(String name, String... jum) {
        super();
        this.name = name;
        this.jum = new int[jum.length];

        for (int i = 0; i < jum.length; i++) {
            this.jum[i] = Integer.parseInt(jum[i].trim());
        }
        
        calc();
        calcGrade();
        rankCalc(new Exam[0]);
        
    }
    
    void calc() {
            tot = 0;
            for (int i = 0; i < jum.length; i++) {
                tot += jum[i]; // 괄호 수정
            }
            avg = tot / jum.length; // 평균
            
    }
    
    void calcGrade(){
            grade = "가가가가양미우우수수".charAt(avg / 10) + "";
        }

     void rankCalc(Exam [] exArr){
            rank = 0;
        for(Exam you :exArr){
            if(avg < you.avg){
                rank++;
            }


        }


        }

		@Override
		public String toString() {
			return "Exam [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", rank="
					+ rank + ", grade=" + grade + "]";
		}
        
        
}
