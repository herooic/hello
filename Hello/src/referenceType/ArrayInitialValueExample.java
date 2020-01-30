package referenceType;

public class ArrayInitialValueExample {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		double[] doubleAry = new double[3];
		String[] strAry = new String[4];

		intAry[2] = 10;
		doubleAry[1] = 20.5;
		strAry[3] = "hello";

		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		for (int i = 0; i < doubleAry.length; i++) {
			System.out.println(doubleAry[i]);
		}
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
	}// main
// class

	
		
		
		
}

