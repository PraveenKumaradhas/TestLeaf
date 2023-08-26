package assignments;

public class TwoWheeler {
	int noOfWheels;
	short noOfMirrors;
	long chassisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM;
	
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		obj.bikeName = "Apache";
		obj.chassisNumber = 9790857837l;
		obj.isPunctured = false;
		obj.noOfMirrors = 1;
		obj.noOfWheels = 2;
		obj.runningKM = 98572.30;
		
		System.out.println("Bike Name : "+obj.bikeName);
		System.out.println("Chasis Number : "+obj.chassisNumber);
		System.out.println("Is Punctured? : "+obj.isPunctured);
		System.out.println("No. of Mirrors : "+obj.noOfMirrors);
		System.out.println("No. of Wheels : "+obj.noOfWheels);
		System.out.println("Running KMs : "+obj.runningKM);
	}
}

