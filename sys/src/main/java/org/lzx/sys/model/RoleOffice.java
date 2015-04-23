package org.lzx.sys.model;

/**
 * 角色机构关联表
 * @author Administrator
 *
 */
public class RoleOffice {

	private int id ;
	
	/**
	 * 角色ID
	 */
	private int role_id;
	
	/**
	 * 机构部门ＩＤ
	 */
	private int office_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getOffice_id() {
		return office_id;
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}
	
	
}
