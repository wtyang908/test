package com.xiwang.project.system.service;

import java.util.List;
import com.xiwang.project.system.domain.ReHouseReply;
import com.xiwang.project.system.domain.ReHouseReplyList;

/**
 * 评论回复Service接口
 * 
 * @author xiwang
 * @date 2023-04-12
 */
public interface IReHouseReplyService 
{

    /**
     * 查询评论回复
     *
     * @param commentId 评论回复主键
     * @return 评论回复，增加了回复和被回复者昵称
     */
    public List<ReHouseReplyList> selectHouseReplyByCommentId(Long commentId);

    /**
     * 查询评论回复
     * 
     * @param id 评论回复主键
     * @return 评论回复
     */
    public ReHouseReply selectReHouseReplyById(Long id);

    /**
     * 查询评论回复列表
     * 
     * @param reHouseReply 评论回复
     * @return 评论回复集合
     */
    public List<ReHouseReply> selectReHouseReplyList(ReHouseReply reHouseReply);

    /**
     * 新增评论回复
     * 
     * @param reHouseReply 评论回复
     * @return 结果
     */
    public int insertReHouseReply(ReHouseReply reHouseReply);

    /**
     * 修改评论回复
     * 
     * @param reHouseReply 评论回复
     * @return 结果
     */
    public int updateReHouseReply(ReHouseReply reHouseReply);

    /**
     * 批量删除评论回复
     * 
     * @param ids 需要删除的评论回复主键集合
     * @return 结果
     */
    public int deleteReHouseReplyByIds(Long[] ids);

    /**
     * 删除评论回复信息
     * 
     * @param id 评论回复主键
     * @return 结果
     */
    public int deleteReHouseReplyById(Long id);
}
