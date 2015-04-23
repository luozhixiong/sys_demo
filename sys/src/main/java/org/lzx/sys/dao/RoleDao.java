package org.lzx.sys.dao;

import org.lzx.sys.annotation.MyBatisDao;
import org.lzx.sys.model.Role;

/**
 * 角色DAO接口
 */
@MyBatisDao
public interface RoleDao extends BaseDao<Role> {
	
	public Role getByName(Role role);
	
	public Role getByEnname(Role role);

	/**
	 * 维护角色与菜单权限关系
	 * @param role
	 * @return
	 */
	public int deleteRoleMenu(Role role);

	public int insertRoleMenu(Role role);
	
	/**
	 * 维护角色与公司部门关系
	 * @param role
	 * @return
	 */
	public int deleteRoleOffice(Role role);

	public int insertRoleOffice(Role role);
}
