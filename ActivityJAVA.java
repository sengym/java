package demo;

public class ActivityJAVA {

// Results
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
// 
//		int phy=100; 
//		int chem=50;
//		int bio=80; 
//		total(phy, chem, bio);
//		percentage(phy+chem+bio);
//	}
//
//	private static void total (int x, int y, int z) {
//		// TODO Auto-generated method stub
//		
//
//		System.out.println(y);
//		System.out.println(x+y+z);
//	}
//	
//	private static void percentage (float a) {
//		
//		System.out.println(a/3);
//		
//	}
//}


// Calculator + Calculator Revisited 
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//	calcmult(5,3);
//	calcdiv (5,3);
//	calcsub(5,3);
//	calcadd(5,3);
//	calcdivrev(1,3);
//
//	}
//
//	private static void calcadd(int num1, int num2) {
//	// TODO Auto-generated method stub
//
//	System.out.println("Sum = "+(num1+num2));
//}
//	
//	private static void calcmult(int num1, int num2) {
//	// TODO Auto-generated method stub
//
//	System.out.println("Mult ="+(num1*num2));
//}
//
//	private static void calcdivrev(float num1, float num2) {
//	// TODO Auto-generated method stub
//
//	if(num1 < num2 ) {
//
//	System.out.println("Divrev (1/3) ="+(num1/num2));
//
//	} else {
//	System.out.println("Division cannot be performed!");
//	}
//	}
//
//	private static void calcsub(int num1, int num2) {
//	// TODO Auto-generated method stub
//
//	System.out.println("Sub = "+(num1-num2));
//
//	}
//	private static void calcdiv(float num1, float num2) {
//	// TODO Auto-generated method stub
//
//	System.out.println("Div ="+(num1/num2));
//	}
//	}

//Flow Chart
//public static void main(String[] args) {
//	flowchart(23,4, true);
//	
//}
//	private static void flowchart(int num1, int num2, boolean abc) {
//		// TODO Auto-generated method stub
//
//	if (abc) {
//		int result = num1 + num2
//		System.out.println(result);
//	} else {
//		System.out.println(num1*num2);
//	}
//}
//}
	
//public static void main(String[] args) {
//	flowchart(7000);
//	
//}
//
//private static void flowchart(int A) {
//	// TODO Auto-generated method stub
//	
//	if (A > 2000) {
////		System.out.println("A");
//		if (A > 6000) {
//			System.out.println("C");
//		} else {
//			System.out.println("B");
//		}
//	} else {
////		System.out.println("1");
//		
//		if (A > 100) {
//			System.out.println("2"); 
//
//		} else {
//			System.out.println("3");
//		
//	}
//	}
//}
//}
	
	
//// BlackJack
//public static void main(String[] args) {
//	blackjack(31, 22);
//}
//private static void blackjack(int A, int B) {
//	// TODO Auto-generated method stub
//	if (((A > B) && A <= 21) || B < 21) {
//		System.out.println("Winner is A "+ A);
//	} else if ((A < B) && B <=21 || A < 21) {
//		System.out.println("Winner is B "+ B);
//	} else if ((A > 21) && (B > 21)) {
//		System.out.println("Everyone lose");
//	}
//	}
//		
//}
	
	
// Unique Sum 
public static void main(String[] args) {
	uniquesum(1, 1, 1);
}

private static void uniquesum(int a, int b, int c) {
	// TODO Auto-generated method stub
	if ((a != b) && (b != c) && (a != c)) {
		System.out.println(a+b+c);
	} else if ((a == b) && (b != c)) {
		System.out.println(b+c);
	} else if ((b == c) && (a !=c)) {
		System.out.println(a +c); 
	} else if ((a == b) && (b == c)) {
		System.out.println("0");
	}
		
	}

}
