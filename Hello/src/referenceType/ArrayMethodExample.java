package referenceType;

public class ArrayMethodExample {
	public static void main(String[] args) {
		int[] intAry = { 3, 7, 5, 8, 4 , 7};
		System.out.println("배열의 길이 " + intAry.length);
		int sum = 0;
		sum = sumArrayMethod(intAry);
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];

		}
		System.out.println(" 합은 " + sum);

		int[] intAry2 = { 1, 2, 3, 4, 5,7 };
		int sum2 = sumArrayMethod(intAry2);
		for (int i = 0; i < 5; i++) {
			sum2 += intAry2[i];
		}
		System.out.println(" 합은 " + sum2);

		int[] intAry3 = { 2, 3, 4, 5, 6, 8 };
		int sum3 = 0;
		for (int i = 0; i < 5; i++) {
			sum3 += intAry3[i];
		}
		System.out.println(" 합은 " + sum3);
	}

	public static int sumArrayMethod(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}

		return 0;
	}

}


