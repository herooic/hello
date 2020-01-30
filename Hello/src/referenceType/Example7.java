package referenceType;

public class Example7 {
	public static void main(String[] args) {
	int[] intAry = {1,5,3,8,2};
	int max = 0;
	for (int x = 0; x<intAry.length; x++ )  {
			if (max < intAry[x]) {
		
		max = intAry[x];
		}
	}
	System.out.println("최대값은" + max);
	}
}




