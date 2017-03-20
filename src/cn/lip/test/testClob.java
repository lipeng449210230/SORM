package cn.lip.test;
import java.sql.*;
import java.io.*;

import cn.lip.util.JdbcUtil;
public class testClob {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Reader reader=null;
		try {
			conn=JdbcUtil.getMysqlConnection();
			String sql="insert into testClob(resume) VALUES(?);";
			ps=conn.prepareStatement(sql);
			String path=testClob.class.getClassLoader().getResource("data.txt").getPath();
			System.out.println(path);
			path=path.replaceAll("%20", " ");
			File file=new File(path);
			reader=new InputStreamReader(new FileInputStream(file), "UTF-8");
			ps.setCharacterStream(1, reader, (int)file.length());
			int result=ps.executeUpdate();
			if(result>0){
				System.out.println("≤Â»Î≥…π¶");
			}
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("aaaaaaaaa");
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs, ps, conn);
		}
	}

}
