package classes;

public class StudentExample {
	public static void main(String[] args) {
		//
		Student sn = new Student("choi", 20, 180, 70);
		System.out.println(sn.name);
		System.out.println(sn.age);
		System.out.println(sn.height);
		System.out.println(sn.weight);

		Student stnt = new Student();
		// 스튜던트 의 타입 = 새로운 스투던트를 담았다
		// 즉 하나의 인스턴트를 만들었다
		// new라는 키워드을 stnt 라는 변수에 담았다. * 같은타입에 담음
		stnt.name = "hong";
		stnt.age = 20;
		stnt.height = 170;
		stnt.weight = 65;
		// stnt
		System.out.println(stnt.name);
		System.out.println(stnt.age);
		System.out.println(stnt.height);
		System.out.println(stnt.weight);
		stnt.study();
		stnt.eat();
		stnt.getAge();
		System.out.println(stnt.getAge());

		Student snt = new Student();
		snt.name = "lee hyun woo";
		snt.age = 31;
		snt.height = 175;
		snt.weight = 66;
		System.out.println(snt.name);
		System.out.println(snt.age);
		System.out.println(snt.height);
		System.out.println(snt.weight);
		snt.study();
		System.out.println(snt.getAge());
	}
}
