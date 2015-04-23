package org.lzx.sys.model;

/**
 * 用户角色关联表
 * @author Administrator
 *
 */
public class UserRole {
	
	private int id;
	
	/**
	 * 用户ID
	 */
	private int user_id;
	
	/**
	 * 角色ID
	 */
	private int role_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	
}
