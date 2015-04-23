package org.lzx.sys.model;

/**
 * 区域类
 * @author Administrator
 *
 */
public class Area {
	
	private int id;
	
	/**
	 * 区域名称,如中国,湖南
	 */
	private String name;
	 
	/**
	 * 区域类型(1.国家,2.省份,3.地市,4.区县)
	 */
	private String type;
	
	/**
	 * 区域编号
	 */
	private String code;
	
	/**
	 * 父级编号
	 */
	private Area parent;
	
	/**
	 * 所有父级编号
	 */
	private String parentIds;
	
	/**
	 * 排序
	 */
	private Integer sort;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Area getParent() {
		return parent;
	}

	public void setParent(Area parent) {
		this.parent = parent;
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	
	
}
