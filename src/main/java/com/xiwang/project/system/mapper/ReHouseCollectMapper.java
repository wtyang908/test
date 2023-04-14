package com.xiwang.project.system.mapper;

import java.util.List;
import com.xiwang.project.system.domain.ReHouseCollect;

/**
 * 我的收藏Mapper接口
 * 
 * @author xiwang
 * @date 2023-04-14
 */
public interface ReHouseCollectMapper 
{
    /**
     * 查询我的收藏
     * 
     * @param id 我的收藏主键
     * @return 我的收藏
     */
    public ReHouseCollect selectReHouseCollectById(Long id);

    /**
     * 查询我的收藏列表
     * 
     * @param reHouseCollect 我的收藏
     * @return 我的收藏集合
     */
    public List<ReHouseCollect> selectReHouseCollectList(ReHouseCollect reHouseCollect);

    /**
     * 新增我的收藏
     * 
     * @param reHouseCollect 我的收藏
     * @return 结果
     */
    public int insertReHouseCollect(ReHouseCollect reHouseCollect);

    /**
     * 修改我的收藏
     * 
     * @param reHouseCollect 我的收藏
     * @return 结果
     */
    public int updateReHouseCollect(ReHouseCollect reHouseCollect);

    /**
     * 删除我的收藏
     * 
     * @param id 我的收藏主键
     * @return 结果
     */
    public int deleteReHouseCollectById(Long id);

    /**
     * 批量删除我的收藏
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteReHouseCollectByIds(Long[] ids);
}
