package com.yedam.lhw.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.lhw.interfaces.common.DAO;
import com.yedam.lhw.interfaces.model.Employees;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 1.디비 전체 조회
	public List<Employees> getEmpList() {
		conn = DAO.getConnect();
		String sql = "select * from emp_temp";
		List<Employees> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}

		return list;
	}

	// 2. 디비 한건 조회
	public Employees getEmployees(int emps) {
		conn = DAO.getConnect();
		String sql = " Select * from emp_temp " + " where employee_id = ?";
		Employees emp = new Employees();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emps);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return emp;

	}
	// 3. 디비입력

	// 4.디비수정
	public void updateEmployees(Employees emp) {
		conn = DAO.getConnect();
		String sql = "update emp_temp  set salary =?, email= ? where employee_id =?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getSalary());
			System.out.println(" 급여");
			
			
			pstmt.setString(2, emp.getEmail());
			
			
			
			pstmt.setInt(3, emp.getEmployeeId());
			

			int r = pstmt.executeUpdate();

			System.out.println(r + "건이 변경되어있습니다");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}

	public void insertEmployees(Employees emp) {
		conn = DAO.getConnect();
		String sql = "insert into emp_temp (employee_id, last_name, email, hire_date, job_id)\r\n"
				+ "values(employees_seq.nextval, ?, ?, sysdate, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getLastName());
			pstmt.setString(2, emp.getEmail());
			pstmt.setString(3, emp.getJobId());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건 입력");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}
	public void deleteEmployees(Employees emp) {
			conn = DAO.getConnect();
			String sql = "Delete from emp_temp where employee_id =? " ;
			
			try {
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1 , emp.getEmployeeId());
			
				int r = pstmt.executeUpdate();

				System.out.println(r + "건이 삭제 되어있습니다");
				
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} finally  {
				 DAO.close(conn);
				}		
						
			}

	public Employees[] getEmployees() {
		conn = DAO.getConnect();
		String sql = "select * from employees ";
		Employees[] emps = new Employees[100];
		int cnt = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));

				emps[cnt++] = emp;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // end ot try ~ catch
		return emps;
	}// end of Getemployee
}// end of class
