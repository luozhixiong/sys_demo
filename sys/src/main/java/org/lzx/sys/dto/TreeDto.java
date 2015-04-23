package org.lzx.sys.dto;

public class TreeDto {
	private int id;
	private String name;
	private Integer pid;
	private String parentIds; // 所有父级编号
	private Integer sort;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
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
	public TreeDto() {
	}
	
	public TreeDto(int id, String name, Integer pid, String parentIds,
			Integer sort) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.parentIds = parentIds;
		this.sort = sort;
	}
	
	
	@Override
	public String toString() {
		return "TreeDto [id=" + id + ", name=" + name + ", pid=" + pid
				+ ", parentIds=" + parentIds + ", sort=" + sort + "]";
	}
	@Override
	public boolean equals(Object obj) {
		TreeDto td = (TreeDto)obj;
		return td.getId()==this.id;
	}
}
