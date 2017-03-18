package cn.lip.test;

import java.sql.*;
import java.util.*;

import cn.lip.util.JdbcUtil;

public class testMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn=JdbcUtil.getMysqlConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		ResultSetMetaData rsmd=null;
		try {
			ps = conn.prepareStatement("select id,empname,salary,birthday,age,deptid from emp;");
			rs=ps.executeQuery();
//			System.out.println(rs.getMetaData().getColumnCount());
			rsmd=rs.getMetaData();
			while(rs.next()){
				Map<String,Object> m=new HashMap<String,Object>();
				
				for(int i=1;i<rsmd.getColumnCount()+1;i++){
					m.put(rsmd.getColumnName(i), rs.getObject(i));
				}
				list.add(m);
			}
			for(Map<String,Object> m:list){
				for(String key:m.keySet()){
					System.out.print(key+"    "+m.get(key)+"    ");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.close(rs,ps,conn);
		}
	}

}
