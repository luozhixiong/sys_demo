package org.lzx.sys.dao;

import java.util.List;

import org.lzx.sys.annotation.MyBatisDao;
import org.lzx.sys.dto.TreeDto;
import org.lzx.sys.model.Area;

/**
 * 区域DAO接口
 * @author Administrator
 *
 */
@MyBatisDao
public interface AreaDao {

	/**
	 * 找到所有子节点
	 * @param entity
	 * @return
	 */
	public List<TreeDto> findByParentIdsLike(Area entity);

	/**
	 * 更新所有父节点字段
	 * @param entity
	 * @return
	 */
	public int updateParentIds(Area entity);
}
