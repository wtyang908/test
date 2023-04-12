package com.xiwang.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xiwang.framework.aspectj.lang.annotation.Excel;
import com.xiwang.framework.web.domain.BaseEntity;

/**
 * 评论回复对象 re_house_reply
 * 
 * @author xiwang
 * @date 2023-04-12
 */
public class ReHouseReply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 回复id */
    private Long id;

    /** 回复用户id */
    @Excel(name = "回复用户id")
    private Long userId;

    /** 房屋id */
    @Excel(name = "房屋id")
    private Long houseId;

    /** 评论id */
    @Excel(name = "评论id")
    private Long commentId;

    /** 被回复用户id */
    @Excel(name = "被回复用户id")
    private Long toUserId;

    /** 回复内容 */
    @Excel(name = "回复内容")
    private String content;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setHouseId(Long houseId) 
    {
        this.houseId = houseId;
    }

    public Long getHouseId() 
    {
        return houseId;
    }
    public void setCommentId(Long commentId) 
    {
        this.commentId = commentId;
    }

    public Long getCommentId() 
    {
        return commentId;
    }
    public void setToUserId(Long toUserId) 
    {
        this.toUserId = toUserId;
    }

    public Long getToUserId() 
    {
        return toUserId;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("houseId", getHouseId())
            .append("commentId", getCommentId())
            .append("toUserId", getToUserId())
            .append("content", getContent())
            .append("createTime", getCreateTime())
            .toString();
    }
}
