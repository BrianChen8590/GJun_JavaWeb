package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DbConnection;
import dao.MemberDao;
import model.Member;

/**
 * 會員管理 Impl
 */
public class MemberDaoImpl implements MemberDao {

	public static void main(String[] args) {
		System.out.println(new MemberDaoImpl().selectByUsername("ttt"));
	}

	private static final Connection conn = DbConnection.getDb();

	@Override
	public void add(Member m) {
		String SQL = "insert into member(memberno,name,username,password,address,phone) " + "values(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, m.getMemberno());
			ps.setString(2, m.getName());
			ps.setString(3, m.getUsername());
			ps.setString(4, m.getPassword());
			ps.setString(5, m.getAddress());
			ps.setString(6, m.getPhone());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Member selectMember(String username, String password) {
		String SQL = "select * from member where username=? and password=?";
		Member m = null;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				m = new Member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return m;
	}

	@Override
	public boolean selectByUsername(String username) {
		String SQL = "select * from member where username=? ";
		boolean show = false;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				show = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return show;
	}

}
