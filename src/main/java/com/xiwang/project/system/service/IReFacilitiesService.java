package com.xiwang.project.system.service;

import java.util.List;
import com.xiwang.project.system.domain.ReFacilities;

/**
 * 房屋设备Service接口
 * 
 * @author xiwang
 * @date 2023-04-06
 */
public interface IReFacilitiesService 
{
    /**
     * 查询房屋设备
     * 
     * @param id 房屋设备主键
     * @return 房屋设备
     */
    public ReFacilities selectReFacilitiesById(Long id);

    /**
     * 查询房屋设备列表
     * 
     * @param reFacilities 房屋设备
     * @return 房屋设备集合
     */
    public List<ReFacilities> selectReFacilitiesList(ReFacilities reFacilities);

    /**
     * 新增房屋设备
     * 
     * @param reFacilities 房屋设备
     * @return 结果
     */
    public int insertReFacilities(ReFacilities reFacilities);

    /**
     * 修改房屋设备
     * 
     * @param reFacilities 房屋设备
     * @return 结果
     */
    public int updateReFacilities(ReFacilities reFacilities);

    /**
     * 批量删除房屋设备
     * 
     * @param ids 需要删除的房屋设备主键集合
     * @return 结果
     */
    public int deleteReFacilitiesByIds(Long[] ids);

    /**
     * 删除房屋设备信息
     * 
     * @param id 房屋设备主键
     * @return 结果
     */
    public int deleteReFacilitiesById(Long id);
}
