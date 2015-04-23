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
	
}
