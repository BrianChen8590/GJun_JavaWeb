package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.PorderDao;
import model.Porder;

/**
 * 訂單管理 Impl
 */
public class PorderDaoImpl implements PorderDao {

	private static final Connection conn = DbConnection.getDb();

	public static void main(String[] args) {
		Porder p = new Porder("2", "2", 3, 3, 0);
		new PorderDaoImpl().add(p);
		// new PorderDaoImpl().deleteById(3);

	}

	@Override
	public void add(Porder p) {
		String SQL = "insert into porder(memberno,porderno,A,B,C) " + "values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, p.getMemberno());
			ps.setString(2, p.getPorderno());
			ps.setInt(3, p.getA());
			ps.setInt(4, p.getB());
			ps.setInt(5, p.getC());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Porder> selectAll() {
		String SQL = "select * from porder";
		List<Porder> l = new ArrayList();
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Porder p = new Porder();
				p.setId(rs.getInt("id"));
				p.setMemberno(rs.getString("memberno"));
				p.setPorderno(rs.getString("porderno"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));

				l.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return l;
	}

	@Override
	public Porder selectById(int id) {
		String SQL = "select * from porder where id=?";
		Porder p = null;
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				p = new Porder();
				p.setId(rs.getInt("id"));
				p.setMemberno(rs.getString("memberno"));
				p.setPorderno(rs.getString("porderno"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public void update(Porder p) {
		String SQL = "update porder set A=?,B=?,C=? where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);

			ps.setInt(1, p.getA());
			ps.setInt(2, p.getB());
			ps.setInt(3, p.getC());
			ps.setInt(4, p.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(int id) {
		String SQL = "delete  from porder where id=?";
		try {
			PreparedStatement ps = conn.prepareStatement(SQL);

			ps.setInt(1, id);

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}