package assignments;

public class Week1Day1 {
	public void convertNegativeNum(int a) {
		if(a<0) {
			a=a*(-1);
			System.out.println("The number -"+a+" is converted to "+a);
		}
		else {
			System.out.println("The given number is positive");
		}
	}
	public void checkIfPositiveOrNegative(int a) {
		if(a<0) {
			System.out.println("The given number is negative");
		}
		else if(a>0) {
			System.out.println("The given number is positive");
		}
		else {
			System.out.println("The given number is neither positive nor negative");
		}
	}
	public static void main(String[] args) {
		int x=-10;
		Week1Day1 obj = new Week1Day1();
		obj.checkIfPositiveOrNegative(x);
		obj.convertNegativeNum(x);
	}

}
