package loopsAndCondition;

public class SwitchStatement {
	public static void main(String[] args) {
		printDay(5);
		printDay(10);
	}
	
	public static void printDay(int number) {
		switch(number) {
		case 1 : System.out.println("Monday");
		break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		case 7 : System.out.println("Sunday");
		break;
		default: System.out.println("This is incorrect number");
		break;
		}
		
	}
}

