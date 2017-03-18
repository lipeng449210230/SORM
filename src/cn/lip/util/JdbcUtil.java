package cn.lip.util;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
public class JdbcUtil {
	private static String driver=null;
	private static String url=null;
	private static String username=null;
	private static String password=null;
	static{
		try {
			
			System.out.println(JdbcUtil.class.getClassLoader().getResource(""));
			//InputStream in=JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
			InputStream in=Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
			Properties prop=new Properties();
			prop.load(in);
			driver=prop.getProperty("driver");
			url=prop.getProperty("url");
			username=prop.getProperty("username");
			password=prop.getProperty("password");
			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getMysqlConnection(){
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void close(ResultSet rs,Statement stmt,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs=null;
		}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt=null;
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn=null;
		}
	}
}
