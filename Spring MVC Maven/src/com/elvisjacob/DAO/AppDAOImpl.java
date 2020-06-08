package com.elvisjacob.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.elvisjacob.model.User;

public class AppDAOImpl implements AppDAO {

	private DataSource dataSource;
	
	public AppDAOImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public List<User> listUsers() {
		
		String sqlCmd = "Select * from users";
		List<User> listUsers = new ArrayList<User>();
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlCmd);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				listUsers.add(new User(
						rs.getInt("user-id"),
						rs.getString("name"),
						rs.getString("email")
						));
			}
			rs.close();
			ps.close();
			return listUsers;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {e.printStackTrace();};
			}
		}
	}

	@Override
	public void addUser(User user) {
		String sqlCmd = "INSERT INTO users + (name, email) VALUES (?, ?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlCmd);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {e.printStackTrace();};
			}
		}
		
	}

}
