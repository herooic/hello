package com.yedam.lhw.interFace.model;

public interface EmpService { // 기능정의
	// 저장기능
	public void addEmp(Employee emp, Employee[] emps);

	// 조회기능
	public void searchEmp(int empNo, Employee[] emps);

	// 리스트
	public void empList(Employee[] emps);

	// 삭제
	public void delEmp(int empNo, Employee[] emps );

}
