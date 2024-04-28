package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * DB 連線設定
 */
public class DbConnection {

	public static void main(String[] args) {
		System.out.println(DbConnection.getDb());

	}

	/**
	 * 取得DB連線
	 * 
	 * @return
	 */
	public static Connection getDb() {

		String url = "jdbc:mysql://localhost:3306/gjun";
		String user = "root";
		String password = "1234";
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}