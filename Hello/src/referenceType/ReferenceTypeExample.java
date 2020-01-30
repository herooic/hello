package referenceType;


class Strong { // str 의 저장 되어있는 주소 ( 즉 저장되어있는 값을 보여줌)
	int f1; //f1 을 지정 
	String str;
	
	void print () {
		System.out.println(f1 + "/" + str);
	
	}
}
public class ReferenceTypeExample {
	
	public static void main(String[] args) {
		int num1 = 10;
		byte by1 = 10;
		by1 = (byte) num1 ;
		
		String str1 = new String ("hello"); 
		String str2 = new String ("hello");		
		str1 = null;
		
				
		System.out.println(str1 );
		System.out.println();
		//System.out.println(str1.equals(str2));
//		
//		Strong str = new Strong();
//		str.f1 = 10;
//		str.str = "first" ;
//		
//		Strong str2 = new Strong();
//		str.f1 = 10; // f1을 10 으로 지정
//		str.str = "second" ;
//		System.out.println(str.f1); //str의 저장되어있는 값 10을 보여줌
//		// str 참조형 데이타타입 
		
		
		
	}
}
