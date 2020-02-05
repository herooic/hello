package com.yedam.lhw.interfaces.impl;

import com.yedam.lhw.interfaces.model.EmpService;
import com.yedam.lhw.interfaces.model.Employee;

public class EmpServiceImpl2 implements EmpService {

	@Override
	public void addEmp(Employee emp, Employee[] emps) {
		// TODO Auto-generated method stub
		System.out.println(" 더 좋은 추가기능 ");
	}

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
		// TODO Auto-generated method stub
		System.out.println(" 더 좋은 조회기능 ");
	}

	@Override
	public void empList(Employee[] emps) {
		// TODO Auto-generated method stub
		System.out.println(" 더 좋은 리스트 기능 ");
	}

	@Override
	public void delEmp(int empNo, Employee[] emps) {
		// TODO Auto-generated method stub
		System.out.println(" 더 좋은 삭제기능 ");
	}
	

}
