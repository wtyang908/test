package com.xiwang.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiwang.project.system.mapper.ReHouseCollectMapper;
import com.xiwang.project.system.domain.ReHouseCollect;
import com.xiwang.project.system.service.IReHouseCollectService;

/**
 * 我的收藏Service业务层处理
 * 
 * @author xiwang
 * @date 2023-04-14
 */
@Service
public class ReHouseCollectServiceImpl implements IReHouseCollectService 
{
    @Autowired
    private ReHouseCollectMapper reHouseCollectMapper;

    /**
     * 查询我的收藏
     * 
     * @param id 我的收藏主键
     * @return 我的收藏
     */
    @Override
    public ReHouseCollect selectReHouseCollectById(Long id)
    {
        return reHouseCollectMapper.selectReHouseCollectById(id);
    }

    /**
     * 查询我的收藏列表
     * 
     * @param reHouseCollect 我的收藏
     * @return 我的收藏
     */
    @Override
    public List<ReHouseCollect> selectReHouseCollectList(ReHouseCollect reHouseCollect)
    {
        return reHouseCollectMapper.selectReHouseCollectList(reHouseCollect);
    }

    /**
     * 新增我的收藏
     * 
     * @param reHouseCollect 我的收藏
     * @return 结果
     */
    @Override
    public int insertReHouseCollect(ReHouseCollect reHouseCollect)
    {
        return reHouseCollectMapper.insertReHouseCollect(reHouseCollect);
    }

    /**
     * 修改我的收藏
     * 
     * @param reHouseCollect 我的收藏
     * @return 结果
     */
    @Override
    public int updateReHouseCollect(ReHouseCollect reHouseCollect)
    {
        return reHouseCollectMapper.updateReHouseCollect(reHouseCollect);
    }

    /**
     * 批量删除我的收藏
     * 
     * @param ids 需要删除的我的收藏主键
     * @return 结果
     */
    @Override
    public int deleteReHouseCollectByIds(Long[] ids)
    {
        return reHouseCollectMapper.deleteReHouseCollectByIds(ids);
    }

    /**
     * 删除我的收藏信息
     * 
     * @param id 我的收藏主键
     * @return 结果
     */
    @Override
    public int deleteReHouseCollectById(Long id)
    {
        return reHouseCollectMapper.deleteReHouseCollectById(id);
    }
}
