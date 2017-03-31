package cn.lip.core;

import java.util.List;

/**
 * 负责查询，对外提供服务的核心类
 * @author lip
 *
 */
@SuppressWarnings("all")
public interface Query {
	/**
	 * 执行一个DML语句
	 * @param sql
	 * @param params
	 * @return 执行sql语句影响记录的行数
	 */
	public int executeDML(String sql,Object[] params);
	/**
	 * 将一个对象存储到数据库中
	 * @param obj
	 */
	public void insert(Object obj);
	/**
	 * 将一个对象进行删除
	 * 删除cla表示类对应的表中的记录(指定主键值未id的记录)
	 * @param cla
	 * @param id
	 */
	public void delete(Class cla,int id);
	/**
	 * 删除指定的对象
	 * @param obj
	 */
	public void delete(Object obj);
	/**
	 * 更新对象对应的记录，并且只更新指定的字段的值
	 * @param obj 所要更新的对象
	 * @param fieldNames fieldNames更新的属性列表
	 * @return 执行sql语句影响记录的行数
	 */
	public int update(Object obj,String[] fieldNames);
	/**
	 * 查询返回多行记录，并将每行记录封装到cla指定的类的对象中
	 * @param sql 查询语句
	 * @param cla 封装数据的javaBean类的Class对象
	 * @param params sql的参数
	 * @return 查询到的结果
	 */
	public List queryRows(String sql,Class cla,Object[] params);
	/**
	 * 查询sql返回一个封装到cla指定的类的对象中的对象
	 * @param sql
	 * @param cla
	 * @param params
	 * @return
	 */
	public Object queryObject(String sql,Class cla,Object[] params);
	/**
	 * 查询返回一个值，并将值返回
	 * @param sql
	 * @param params
	 * @return 查询到的结果
	 */
	public Object queryValue(String sql,Object[] params);
	/**
	 * 查询返回一个数字
	 * @param sql
	 * @param params
	 * @return
	 */
	public Number queryNumber(String sql,Object[] params);
}
