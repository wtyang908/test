package com.xiwang.project.system.domain;

import com.xiwang.framework.aspectj.lang.annotation.Excel;
import com.xiwang.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

public class ReHouseReplyList  extends BaseEntity {
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

    /** 回复用户昵称 */
    @Excel(name = "回复用户昵称")
    private String userName;

    /** 被回复用户昵称 */
    @Excel(name = "被回复用户昵称")
    private String toUserName;

    /** 回复用户头像 */
    @Excel(name = "回复用户头像")
    private String avatar;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("userId", getUserId())
                .append("houseId", getHouseId())
                .append("commentId", getCommentId())
                .append("toUserId", getToUserId())
                .append("content", getContent())
                .append("createTime", getCreateTime())
                .append("userName", getUserName())
                .append("toUserName", getToUserName())
                .append("avatar", getAvatar())
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReHouseReplyList that = (ReHouseReplyList) o;
        return Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(houseId, that.houseId) && Objects.equals(commentId, that.commentId) && Objects.equals(toUserId, that.toUserId) && Objects.equals(content, that.content) && Objects.equals(userName, that.userName) && Objects.equals(toUserName, that.toUserName) && Objects.equals(avatar, that.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, houseId, commentId, toUserId, content, userName, toUserName, avatar);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public ReHouseReplyList() {
    }

    public ReHouseReplyList(Long id, Long userId, Long houseId, Long commentId, Long toUserId, String content, String userName, String toUserName, String avatar) {
        this.id = id;
        this.userId = userId;
        this.houseId = houseId;
        this.commentId = commentId;
        this.toUserId = toUserId;
        this.content = content;
        this.userName = userName;
        this.toUserName = toUserName;
        this.avatar = avatar;
    }
}
