package com.xiwang.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiwang.project.system.mapper.SysClubMapper;
import com.xiwang.project.system.domain.SysClub;
import com.xiwang.project.system.service.ISysClubService;

/**
 * 社团Service业务层处理
 * 
 * @author xiwang
 * @date 2023-03-07
 */
@Service
public class SysClubServiceImpl implements ISysClubService 
{
    @Autowired
    private SysClubMapper sysClubMapper;

    /**
     * 查询社团
     * 
     * @param id 社团主键
     * @return 社团
     */
    @Override
    public SysClub selectSysClubById(Long id)
    {
        return sysClubMapper.selectSysClubById(id);
    }

    /**
     * 查询社团列表
     * 
     * @param sysClub 社团
     * @return 社团
     */
    @Override
    public List<SysClub> selectSysClubList(SysClub sysClub)
    {
        return sysClubMapper.selectSysClubList(sysClub);
    }

    /**
     * 新增社团
     * 
     * @param sysClub 社团
     * @return 结果
     */
    @Override
    public int insertSysClub(SysClub sysClub)
    {
        return sysClubMapper.insertSysClub(sysClub);
    }

    /**
     * 修改社团
     * 
     * @param sysClub 社团
     * @return 结果
     */
    @Override
    public int updateSysClub(SysClub sysClub)
    {
        return sysClubMapper.updateSysClub(sysClub);
    }

    /**
     * 批量删除社团
     * 
     * @param ids 需要删除的社团主键
     * @return 结果
     */
    @Override
    public int deleteSysClubByIds(Long[] ids)
    {
        return sysClubMapper.deleteSysClubByIds(ids);
    }

    /**
     * 删除社团信息
     * 
     * @param id 社团主键
     * @return 结果
     */
    @Override
    public int deleteSysClubById(Long id)
    {
        return sysClubMapper.deleteSysClubById(id);
    }
}
