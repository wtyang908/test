package com.xiwang.project.system.service.impl;

import java.util.List;
import com.xiwang.common.utils.DateUtils;
import com.xiwang.project.system.domain.ReHouseReplyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiwang.project.system.mapper.ReHouseReplyMapper;
import com.xiwang.project.system.domain.ReHouseReply;
import com.xiwang.project.system.service.IReHouseReplyService;

/**
 * 评论回复Service业务层处理
 * 
 * @author xiwang
 * @date 2023-04-12
 */
@Service
public class ReHouseReplyServiceImpl implements IReHouseReplyService 
{
    @Autowired
    private ReHouseReplyMapper reHouseReplyMapper;



    /**
     * 查询评论回复
     *
     * @param commentId 评论回复主键
     * @return 评论回复，增加了回复和被回复者昵称
     */
    public List<ReHouseReplyList> selectHouseReplyByCommentId(Long commentId){
        return reHouseReplyMapper.selectHouseReplyByCommentId(commentId);
    }


    /**
     * 查询评论回复
     * 
     * @param id 评论回复主键
     * @return 评论回复
     */
    @Override
    public ReHouseReply selectReHouseReplyById(Long id)
    {
        return reHouseReplyMapper.selectReHouseReplyById(id);
    }

    /**
     * 查询评论回复列表
     * 
     * @param reHouseReply 评论回复
     * @return 评论回复
     */
    @Override
    public List<ReHouseReply> selectReHouseReplyList(ReHouseReply reHouseReply)
    {
        return reHouseReplyMapper.selectReHouseReplyList(reHouseReply);
    }

    /**
     * 新增评论回复
     * 
     * @param reHouseReply 评论回复
     * @return 结果
     */
    @Override
    public int insertReHouseReply(ReHouseReply reHouseReply)
    {
        reHouseReply.setCreateTime(DateUtils.getNowDate());
        return reHouseReplyMapper.insertReHouseReply(reHouseReply);
    }

    /**
     * 修改评论回复
     * 
     * @param reHouseReply 评论回复
     * @return 结果
     */
    @Override
    public int updateReHouseReply(ReHouseReply reHouseReply)
    {
        return reHouseReplyMapper.updateReHouseReply(reHouseReply);
    }

    /**
     * 批量删除评论回复
     * 
     * @param ids 需要删除的评论回复主键
     * @return 结果
     */
    @Override
    public int deleteReHouseReplyByIds(Long[] ids)
    {
        return reHouseReplyMapper.deleteReHouseReplyByIds(ids);
    }

    /**
     * 删除评论回复信息
     * 
     * @param id 评论回复主键
     * @return 结果
     */
    @Override
    public int deleteReHouseReplyById(Long id)
    {
        return reHouseReplyMapper.deleteReHouseReplyById(id);
    }
}
