package com.xiwang.project.system.service;

import java.util.List;
import com.xiwang.project.system.domain.ReHouse;

/**
 * 房屋管理Service接口
 * 
 * @author xiwang
 * @date 2023-03-10
 */
public interface IReHouseService 
{
    /**
     * 查询房屋管理
     * 
     * @param id 房屋管理主键
     * @return 房屋管理
     */
    public ReHouse selectReHouseById(Long id);

    /**
     * 查询房屋管理列表
     * 
     * @param reHouse 房屋管理
     * @return 房屋管理集合
     */
    public List<ReHouse> selectReHouseList(ReHouse reHouse);

    /**
     * 新增房屋管理
     * 
     * @param reHouse 房屋管理
     * @return 结果
     */
    public int insertReHouse(ReHouse reHouse);

    /**
     * 修改房屋管理
     * 
     * @param reHouse 房屋管理
     * @return 结果
     */
    public int updateReHouse(ReHouse reHouse);

    /**
     * 批量删除房屋管理
     * 
     * @param ids 需要删除的房屋管理主键集合
     * @return 结果
     */
    public int deleteReHouseByIds(Long[] ids);

    /**
     * 删除房屋管理信息
     * 
     * @param id 房屋管理主键
     * @return 结果
     */
    public int deleteReHouseById(Long id);
}
