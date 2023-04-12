package com.xiwang.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiwang.project.system.mapper.ReFacilitiesMapper;
import com.xiwang.project.system.domain.ReFacilities;
import com.xiwang.project.system.service.IReFacilitiesService;

/**
 * 房屋设备Service业务层处理
 * 
 * @author xiwang
 * @date 2023-04-06
 */
@Service
public class ReFacilitiesServiceImpl implements IReFacilitiesService 
{
    @Autowired
    private ReFacilitiesMapper reFacilitiesMapper;

    /**
     * 查询房屋设备
     * 
     * @param id 房屋设备主键
     * @return 房屋设备
     */
    @Override
    public ReFacilities selectReFacilitiesById(Long id)
    {
        return reFacilitiesMapper.selectReFacilitiesById(id);
    }

    /**
     * 查询房屋设备列表
     * 
     * @param reFacilities 房屋设备
     * @return 房屋设备
     */
    @Override
    public List<ReFacilities> selectReFacilitiesList(ReFacilities reFacilities)
    {
        return reFacilitiesMapper.selectReFacilitiesList(reFacilities);
    }

    /**
     * 新增房屋设备
     * 
     * @param reFacilities 房屋设备
     * @return 结果
     */
    @Override
    public int insertReFacilities(ReFacilities reFacilities)
    {
        return reFacilitiesMapper.insertReFacilities(reFacilities);
    }

    /**
     * 修改房屋设备
     * 
     * @param reFacilities 房屋设备
     * @return 结果
     */
    @Override
    public int updateReFacilities(ReFacilities reFacilities)
    {
        return reFacilitiesMapper.updateReFacilities(reFacilities);
    }

    /**
     * 批量删除房屋设备
     * 
     * @param ids 需要删除的房屋设备主键
     * @return 结果
     */
    @Override
    public int deleteReFacilitiesByIds(Long[] ids)
    {
        return reFacilitiesMapper.deleteReFacilitiesByIds(ids);
    }

    /**
     * 删除房屋设备信息
     * 
     * @param id 房屋设备主键
     * @return 结果
     */
    @Override
    public int deleteReFacilitiesById(Long id)
    {
        return reFacilitiesMapper.deleteReFacilitiesById(id);
    }
}
