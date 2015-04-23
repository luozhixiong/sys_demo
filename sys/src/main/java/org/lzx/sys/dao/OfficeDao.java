package org.lzx.sys.dao;

import java.util.List;

import org.lzx.sys.annotation.MyBatisDao;
import org.lzx.sys.dto.TreeDto;
import org.lzx.sys.model.Office;

/**
 * 机构DAO接口
 */
@MyBatisDao
public interface OfficeDao {
	
	/**
	 * 找到所有子节点
	 * @param entity
	 * @return
	 */
	public List<TreeDto> findByParentIdsLike(Office entity);

	/**
	 * 更新所有父节点字段
	 * @param entity
	 * @return
	 */
	public int updateParentIds(Office entity);
}
