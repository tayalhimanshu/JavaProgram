package loopsAndCondition;

public class IfElse {
	public static void main(String[] args) {
		ifExample();
		ternaryOperator(12);
		ternaryOperator(13);
	}
	
	public static void ifExample() {
		int age = 20;
		if(age>18)
			System.out.println("Inside If");
		else
			System.out.println("Inside Else");
	}
	
	public static void ternaryOperator(int number) {
		String output = (number%2==0)?"Even":"Odd";
		System.out.println(number+" is an "+output+" number");
	}
}

