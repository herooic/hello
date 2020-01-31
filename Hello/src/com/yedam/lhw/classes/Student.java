package com.yedam.lhw.classes;

public class Student {
	// student 란 class를 만듬
	// 클래스는 메소드, 생성자,  필드 
	//필드
	
	
	private String name;
	private int age;
	private int height;
	private int weight;
	static String major;
	//private 를 사용하면 set은 값을 세팅 해줄때 get 저장된 값을 불러 올때 사용  
	// 생성자 
	// ( 인스턴스 를 만들면서 필드값을 초기화 )
			// 생성자를 만드는 규칙 클래스 이름
	public Student() {

	}

	public Student(String name) {
		this.name = name; // this 는 필드를 의미
	}

	Student(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	
	// 메소드는 항상 반환값을 지정 해야한다
	public void study() {
		System.out.println("공부한다 ");
	}

	public void eat() {
		System.out.println("밥을 먹는다 ");
	}

	public void sleep() {
		System.out.println("잠을 잔다");
	}
	
	public void setAge(int age) {
		if(age>=0)
			
		this.age = age;
		else 
			this.age= age;
		
	}
	
	int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// 기능들을 나타내는 것을 메소드라고 지칭
	// 객체 라는것은 자바에서 표현하는 모든 것들 ex 자동차 학생 등등
	// 클래스 는 그것들은 표현한는 것들 문법 그 틀
	// 필드는 그 속성들은 표현하는것
	// ex 붕어빵 인스턴스 붕어빵틀은 클래스

} //end of class
