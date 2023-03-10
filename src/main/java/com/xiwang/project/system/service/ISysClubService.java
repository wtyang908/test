package com.xiwang.project.system.service;

import java.util.List;
import com.xiwang.project.system.domain.SysClub;

/**
 * 社团Service接口
 * 
 * @author xiwang
 * @date 2023-03-07
 */
public interface ISysClubService 
{
    /**
     * 查询社团
     * 
     * @param id 社团主键
     * @return 社团
     */
    public SysClub selectSysClubById(Long id);

    /**
     * 查询社团列表
     * 
     * @param sysClub 社团
     * @return 社团集合
     */
    public List<SysClub> selectSysClubList(SysClub sysClub);

    /**
     * 新增社团
     * 
     * @param sysClub 社团
     * @return 结果
     */
    public int insertSysClub(SysClub sysClub);

    /**
     * 修改社团
     * 
     * @param sysClub 社团
     * @return 结果
     */
    public int updateSysClub(SysClub sysClub);

    /**
     * 批量删除社团
     * 
     * @param ids 需要删除的社团主键集合
     * @return 结果
     */
    public int deleteSysClubByIds(Long[] ids);

    /**
     * 删除社团信息
     * 
     * @param id 社团主键
     * @return 结果
     */
    public int deleteSysClubById(Long id);
}
