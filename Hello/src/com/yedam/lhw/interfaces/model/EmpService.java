package com.yedam.lhw.interfaces.model;

public interface EmpService { // 기능정의
	// 저장기능
	public void addEmp(Employee emp, Employee[] emps);

	// 조회기능
	public void searchEmp(int empNo, Employee[] emps);

	// 리스트
	public void empList(Employee[] emps);

	// 삭제
	public void delEmp(int empNo, Employee[] emps );

	//디비 연결 조회 기능
	public void searchEmployees();
	
	//디비입력기능  
	public void insertEmployees(Employees emp);
	
}
