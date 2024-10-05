package loopsAndCondition;

public class ForLoop {
	public static void main(String[] args) {
//		for(initialization; condition; increment/decrement){    
			//statement or code to be executed    
//		}
		
//		simple lop
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(i);
		}
		
//		nested loop
		for(int i = 0 ; i < 3 ; i++) {
			System.out.println("INSIDE I "+i);
			for(int j = 0 ; j < 2 ; j++) {
				System.out.println("\t INSIDE J >"+j);
			}
		}
		
//		pyramid example
		for(int i = 0 ; i <= 5 ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		for each loop
//		for(data_type variable : array_name){    
//			//code to be executed    
//		}
		int arr[]= {12,23,44,56,78};
		for(int i : arr)
			System.out.println(i);
	}
}
