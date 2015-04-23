package org.lzx.sys.model;

/**
 * 机构,部门,比如 总公司,分公司,技术部,综合部
 * @author Administrator
 *
 */
public class Office {

	private int id;
	
	private Office parent;
	
	private Office parentIds;
	
	private String name;
	
	private String sort;
	
	/**
	 * 所属区域
	 */
	private Area area;
	
	/**
	 * 机构编号
	 */
	private String code;
	
	/**
	 *机构类型,（1：公司；2：部门；3：小组）
	 */
	private String office_type;
	
	/**
	 * 级别,（1：一级；2：二级；3：三级；4：四级）
	 */
	private String grade;
	
	/**
	 * 是否可用
	 */
	private String useable;
	
	/**
	 * 负责人
	 */
	private User primaryPerson;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Office getParent() {
		return parent;
	}

	public void setParent(Office parent) {
		this.parent = parent;
	}

	public Office getParentIds() {
		return parentIds;
	}

	public void setParentIds(Office parentIds) {
		this.parentIds = parentIds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOffice_type() {
		return office_type;
	}

	public void setOffice_type(String office_type) {
		this.office_type = office_type;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getUseable() {
		return useable;
	}

	public void setUseable(String useable) {
		this.useable = useable;
	}

	public User getPrimaryPerson() {
		return primaryPerson;
	}

	public void setPrimaryPerson(User primaryPerson) {
		this.primaryPerson = primaryPerson;
	}
	
	
	
}
