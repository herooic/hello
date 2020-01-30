package classes;

public class MethodExample {
	public static void main(String[] args) {
		Method m = new Method();
		m.setLeftField(30);
		m.setRightField(4);
		int result = m.thisSum() + m.thisMinus(); // (30 +4) + (30-4)
		int result2 = m.sum(20, 10) * m.minus(30, 25);
		m.setLeftField(100);
		m.setLeftField(50);
		System.out.println("1필드의 계산 결과 : " + result);
		System.out.println("1두매개값의 계산결과 :" + result2);
		result = m.thisSum() + m.thisMinus();
		result2 = m.sum(20,10) * m.minus(30, 25);
	
	System.out.println("2필드의 계산결과 :" + result);

		m = null;
		System.out.println(m.getLeftField());

	}
}
