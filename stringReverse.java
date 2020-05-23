package Java_Program;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "kjihgfedcba";
//		String invert = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			invert = invert + str.charAt(i);
//		}
//		System.out.println(invert);
		
		String newStr = "";
		
		for(int i= str.length()-1;i>=0;i--){
			
			newStr = newStr+str.charAt(i);
		}
		System.out.println(newStr);
		
		
		
	}
}
