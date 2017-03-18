package cn.lip.test;
import java.sql.*;
import java.util.*;

import cn.lip.util.*;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn=JdbcUtil.getMysqlConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Object[]> list=new ArrayList<Object[]>();
		try {
			ps = conn.prepareStatement("select username,pwd,regTime from user where id>9900");
			rs=ps.executeQuery();
//			System.out.println(rs.getMetaData().getColumnCount());

			while(rs.next()){
				Object[] objs=new Object[rs.getMetaData().getColumnCount()];
				objs[0]=rs.getObject(1);
				objs[1]=rs.getObject(2);
				objs[2]=rs.getObject(3);
				list.add(objs);
			}
			for(Object[] obj:list){
				System.out.println(obj[0]+"----"+obj[1]+"----"+obj[2]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs,ps,conn);
		}
		
	}

}
