package cn.lip.bean;
import java.util.*;

public class Emp {
	private Integer id;
	private String empname;
	private Integer salary;
	private Date birthday;
	private Integer age;
	private Integer deptid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public Emp(String empname, Integer salary, Date birthday, Integer age,
			Integer deptid) {
		super();
		this.empname = empname;
		this.salary = salary;
		this.birthday = birthday;
		this.age = age;
		this.deptid = deptid;
	}
	public Emp(Integer id, String empname, Integer salary, Date birthday,
			Integer age, Integer deptid) {
		super();
		this.id = id;
		this.empname = empname;
		this.salary = salary;
		this.birthday = birthday;
		this.age = age;
		this.deptid = deptid;
	}
	public Emp() {
		super();
	}
	
}
