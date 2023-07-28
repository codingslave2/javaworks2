package oops_p;

import java.util.Arrays;

class AAA{
	
	int a = setA();
	int b = setB();
	int sa = 1111;
	
	public AAA() {
		
		System.out.println("AAA");
	}

	@Override
	public String toString() {
		return "AAA [a=" + a + ", b=" + b + ", sa=" + sa + "]";
	}

	int setA() {
		System.out.println("setA is Running");
		return b;
	
	}

	int setB() {
		System.out.println("setB is Running");
		return a;
	
	}

	static int setSa() {
		System.out.println("setSa is Running");
		return 5555;
	
	}

	class BBB{

		void meth_1(int a){
			System.out.println("meth_1 is Running" + a);
			}
		void meth_2(int[] a){
	System.out.println("meth_2 is Running" + a + ", " + b);
		}
		void meth_3(int [] a){
		System.out.print("meth_3 is Running" + Arrays.toString(a));
		}
		void meth_4(int ...a){
		System.out.print("meth_4 is Running" + Arrays.toString(a) + " , " + b);
	}
		void meth_33(int ...a){
		System.out.print("meth_33 is Running" + Arrays.toString(a) + " , " + b);
	}
		void meth_5(int ...a){
		System.out.print("meth_5 is Running" + Arrays.toString(a) + " , " + b);
	}
	
	



public class InstanceMain {

	public static void main(String[] args) {
		

		new AAA();
		System.out.println("--------------------");
		AAA a1;
		System.out.println("--------------------");
		a1 = new AAA();
		System.out.println("--------------------------");
		AAA a2 = new AAA();
		System.out.println("--------------------------");
		
		System.out.println(a1);

		
		System.out.println("B--------------------------");
		
		BBB bb = new BBB();
		int [] arr = {1,2,3,4,5};
		bb.meth_1(1);
		bb.meth_2(arr);
		// bb.meth_3(arr);

	}

	}

	}
}
