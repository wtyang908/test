package com.xiwang.project.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xiwang.framework.aspectj.lang.annotation.Excel;
import com.xiwang.framework.web.domain.BaseEntity;

/**
 * 我的收藏对象 re_house_collect
 * 
 * @author xiwang
 * @date 2023-04-14
 */
public class ReHouseCollect extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 收藏id */
    private Long id;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 房屋id */
    @Excel(name = "房屋id")
    private Long houseId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdDate;

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
    public void setCreatedDate(Date createdDate) 
    {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() 
    {
        return createdDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("houseId", getHouseId())
            .append("createdDate", getCreatedDate())
            .toString();
    }
}
