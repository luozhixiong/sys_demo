package org.lzx.sys.dao;

import java.util.List;

import org.lzx.sys.annotation.MyBatisDao;
import org.lzx.sys.model.Menu;

/**
 * 菜单,权限DAO接口
 */
@MyBatisDao
public interface MenuDao extends BaseDao<Menu>{
	
	public List<Menu> findByParentIdsLike(Menu menu);

	public List<Menu> findByUserId(Menu menu);
	
	public int updateParentIds(Menu menu);
	
	public int updateSort(Menu menu);
}
