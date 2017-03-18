package cn.lip.test;
import java.sql.*;

import cn.lip.util.*;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn=JdbcUtil.getMysqlConnection();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from user where id=1");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.print(rs.getObject(1));
				System.out.print("    "+rs.getObject(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
