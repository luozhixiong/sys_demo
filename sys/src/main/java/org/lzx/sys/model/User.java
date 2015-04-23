package org.lzx.sys.model;


/**
 * 用户
 * @author Administrator
 *
 */
public class User {
	
	private int id;
	
	/**
	 * 登录名
	 */
	private String loginName;
	
	/**
	 * 姓名
	 */
	private String name;
	
	private String password;
	
	/**
	 * 用户类型
	 */
	private String userType;
	
	/**
	 * 是否允许登录,1:允许,2:禁止
	 */
	private int loginFlag;
	
	/**
	 * 所属公司
	 */
	private Office company;
	
	/**
	 * 所属部门
	 */
	private Office office;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(int loginFlag) {
		this.loginFlag = loginFlag;
	}

	public Office getCompany() {
		return company;
	}

	public void setCompany(Office company) {
		this.company = company;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

}
