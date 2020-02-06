package com.yedam.lhw.interfaces.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

	public static void main(String[] args) {
		getConnect();
	}

	public static Connection getConnect() {
		Connection conn = null;
		String user = "hr";
		String passwd = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println(" 연결성공");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		return conn;
		// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
		// C:\Program Files\Java\jre1.8.0_241\lib
	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

}
