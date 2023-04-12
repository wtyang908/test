package com.xiwang.project.system.domain;

import com.xiwang.framework.aspectj.lang.annotation.Excel;
import com.xiwang.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Objects;

public class ReHouseCommentsList extends BaseEntity {

    private static final long serialVersionUID = 1L;


    /** 评论id */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 房屋id */
    @Excel(name = "房屋id")
    private Long houseId;

    /** 评论内容 */
    @Excel(name = "评论内容")
    private String content;
    /** 用户昵称 */
    @Excel(name = "用户昵称")
    private String nickName;

    /** 用户头像 */
    @Excel(name = "用户头像")
    private String avatar;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReHouseCommentsList that = (ReHouseCommentsList) o;
        return Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(houseId, that.houseId) && Objects.equals(content, that.content) && Objects.equals(nickName, that.nickName) && Objects.equals(avatar, that.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, houseId, content, nickName, avatar);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("userId", getUserId())
                .append("houseId", getHouseId())
                .append("content", getContent())
                .append("createTime", getCreateTime())
                .append("nickName", getNickName())
                .append("avatar", getAvatar())
                .toString();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public ReHouseCommentsList() {
    }

    public ReHouseCommentsList(Long id, Long userId, Long houseId, String content, String nickName, String avatar) {
        this.id = id;
        this.userId = userId;
        this.houseId = houseId;
        this.content = content;
        this.nickName = nickName;
        this.avatar = avatar;
    }
}
