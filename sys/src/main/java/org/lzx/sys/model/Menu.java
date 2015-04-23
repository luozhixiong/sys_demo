package org.lzx.sys.model;

/**
 * 权限菜单表
 * @author Administrator
 *
 */
public class Menu {

	private int id;
	
	private String name;
	
	private Menu parent;
	
	private Menu parentIds;
	
	/**
	 * 链接
	 */
	private String href;
	
	private String sort;
	
	/**
	 * 权限标识，user:view,
	 */
	private String permission;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	public Menu getParentIds() {
		return parentIds;
	}

	public void setParentIds(Menu parentIds) {
		this.parentIds = parentIds;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	
	
	
}
