package com.xiwang.project.system.service.impl;

import java.util.List;
import com.xiwang.common.utils.DateUtils;
import com.xiwang.project.system.domain.ReHouseCommentsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiwang.project.system.mapper.ReHouseCommentsMapper;
import com.xiwang.project.system.domain.ReHouseComments;
import com.xiwang.project.system.service.IReHouseCommentsService;

/**
 * 房屋评论Service业务层处理
 * 
 * @author xiwang
 * @date 2023-04-12
 */
@Service
public class ReHouseCommentsServiceImpl implements IReHouseCommentsService 
{
    @Autowired
    private ReHouseCommentsMapper reHouseCommentsMapper;





    /**
     * 查询房屋评论
     *
     * @param houseId 房屋id
     * @return 房屋评论,增加了nickname和avatar
     */
    @Override
    public List<ReHouseCommentsList> selectReHouseCommentsListByHouseId(Long houseId){
        return reHouseCommentsMapper.selectReHouseCommentsListByHouseId(houseId);
    }




    /**
     * 查询房屋评论
     * 
     * @param id 房屋评论主键
     * @return 房屋评论
     */
    @Override
    public ReHouseComments selectReHouseCommentsById(Long id)
    {
        return reHouseCommentsMapper.selectReHouseCommentsById(id);
    }

    /**
     * 查询房屋评论列表
     * 
     * @param reHouseComments 房屋评论
     * @return 房屋评论
     */
    @Override
    public List<ReHouseComments> selectReHouseCommentsList(ReHouseComments reHouseComments)
    {
        return reHouseCommentsMapper.selectReHouseCommentsList(reHouseComments);
    }

    /**
     * 新增房屋评论
     * 
     * @param reHouseComments 房屋评论
     * @return 结果
     */
    @Override
    public int insertReHouseComments(ReHouseComments reHouseComments)
    {
        reHouseComments.setCreateTime(DateUtils.getNowDate());
        return reHouseCommentsMapper.insertReHouseComments(reHouseComments);
    }

    /**
     * 修改房屋评论
     * 
     * @param reHouseComments 房屋评论
     * @return 结果
     */
    @Override
    public int updateReHouseComments(ReHouseComments reHouseComments)
    {
        return reHouseCommentsMapper.updateReHouseComments(reHouseComments);
    }

    /**
     * 批量删除房屋评论
     * 
     * @param ids 需要删除的房屋评论主键
     * @return 结果
     */
    @Override
    public int deleteReHouseCommentsByIds(Long[] ids)
    {
        return reHouseCommentsMapper.deleteReHouseCommentsByIds(ids);
    }

    /**
     * 删除房屋评论信息
     * 
     * @param id 房屋评论主键
     * @return 结果
     */
    @Override
    public int deleteReHouseCommentsById(Long id)
    {
        return reHouseCommentsMapper.deleteReHouseCommentsById(id);
    }
}
