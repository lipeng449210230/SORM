package cn.lip.core;

import java.util.List;

/**
 * �����ѯ�������ṩ����ĺ�����
 * @author lip
 *
 */
@SuppressWarnings("all")
public interface Query {
	/**
	 * ִ��һ��DML���
	 * @param sql
	 * @param params
	 * @return ִ��sql���Ӱ���¼������
	 */
	public int executeDML(String sql,Object[] params);
	/**
	 * ��һ������洢�����ݿ���
	 * @param obj
	 */
	public void insert(Object obj);
	/**
	 * ��һ���������ɾ��
	 * ɾ��cla��ʾ���Ӧ�ı��еļ�¼(ָ������ֵδid�ļ�¼)
	 * @param cla
	 * @param id
	 */
	public void delete(Class cla,int id);
	/**
	 * ɾ��ָ���Ķ���
	 * @param obj
	 */
	public void delete(Object obj);
	/**
	 * ���¶����Ӧ�ļ�¼������ֻ����ָ�����ֶε�ֵ
	 * @param obj ��Ҫ���µĶ���
	 * @param fieldNames fieldNames���µ������б�
	 * @return ִ��sql���Ӱ���¼������
	 */
	public int update(Object obj,String[] fieldNames);
	/**
	 * ��ѯ���ض��м�¼������ÿ�м�¼��װ��claָ������Ķ�����
	 * @param sql ��ѯ���
	 * @param cla ��װ���ݵ�javaBean���Class����
	 * @param params sql�Ĳ���
	 * @return ��ѯ���Ľ��
	 */
	public List queryRows(String sql,Class cla,Object[] params);
	/**
	 * ��ѯsql����һ����װ��claָ������Ķ����еĶ���
	 * @param sql
	 * @param cla
	 * @param params
	 * @return
	 */
	public Object queryObject(String sql,Class cla,Object[] params);
	/**
	 * ��ѯ����һ��ֵ������ֵ����
	 * @param sql
	 * @param params
	 * @return ��ѯ���Ľ��
	 */
	public Object queryValue(String sql,Object[] params);
	/**
	 * ��ѯ����һ������
	 * @param sql
	 * @param params
	 * @return
	 */
	public Number queryNumber(String sql,Object[] params);
}
