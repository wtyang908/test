package com.xiwang.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiwang.project.system.mapper.ReHouseMapper;
import com.xiwang.project.system.domain.ReHouse;
import com.xiwang.project.system.service.IReHouseService;

/**
 * 房屋管理Service业务层处理
 * 
 * @author xiwang
 * @date 2023-03-10
 */
@Service
public class ReHouseServiceImpl implements IReHouseService 
{
    @Autowired
    private ReHouseMapper reHouseMapper;

    /**
     * 查询房屋管理
     * 
     * @param id 房屋管理主键
     * @return 房屋管理
     */
    @Override
    public ReHouse selectReHouseById(Long id)
    {
        return reHouseMapper.selectReHouseById(id);
    }

    /**
     * 查询房屋管理列表
     * 
     * @param reHouse 房屋管理
     * @return 房屋管理
     */
    @Override
    public List<ReHouse> selectReHouseList(ReHouse reHouse)
    {
        return reHouseMapper.selectReHouseList(reHouse);
    }

    /**
     * 新增房屋管理
     * 
     * @param reHouse 房屋管理
     * @return 结果
     */
    @Override
    public int insertReHouse(ReHouse reHouse)
    {
        return reHouseMapper.insertReHouse(reHouse);
    }

    /**
     * 修改房屋管理
     * 
     * @param reHouse 房屋管理
     * @return 结果
     */
    @Override
    public int updateReHouse(ReHouse reHouse)
    {
        return reHouseMapper.updateReHouse(reHouse);
    }

    /**
     * 批量删除房屋管理
     * 
     * @param ids 需要删除的房屋管理主键
     * @return 结果
     */
    @Override
    public int deleteReHouseByIds(Long[] ids)
    {
        return reHouseMapper.deleteReHouseByIds(ids);
    }

    /**
     * 删除房屋管理信息
     * 
     * @param id 房屋管理主键
     * @return 结果
     */
    @Override
    public int deleteReHouseById(Long id)
    {
        return reHouseMapper.deleteReHouseById(id);
    }
}
