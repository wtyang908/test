package com.xiwang.project.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xiwang.framework.aspectj.lang.annotation.Excel;
import com.xiwang.framework.web.domain.BaseEntity;

/**
 * 订单对象 re_order
 * 
 * @author xiwang
 * @date 2023-03-11
 */
public class ReOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单id */
    private Long id;

    /** 房间ID */
    @Excel(name = "房间ID")
    private Long roomId;

    /** 租客ID */
    @Excel(name = "租客ID")
    private Long tenantId;

    /** 租客名 */
    @Excel(name = "租客名")
    private String tenantName;

    /** 起始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "起始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String checkOpion;

    /** 审核者ID */
    @Excel(name = "审核者ID")
    private Long checkerId;

    /** 审核者姓名 */
    @Excel(name = "审核者姓名")
    private String checkerName;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkDate;

    /** yes：已退租，no：没退租 */
    @Excel(name = "yes：已退租，no：没退租")
    private String isHistory;

    /** 价格 */
    @Excel(name = "价格")
    private Long price;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRoomId(Long roomId) 
    {
        this.roomId = roomId;
    }

    public Long getRoomId() 
    {
        return roomId;
    }
    public void setTenantId(Long tenantId) 
    {
        this.tenantId = tenantId;
    }

    public Long getTenantId() 
    {
        return tenantId;
    }
    public void setTenantName(String tenantName) 
    {
        this.tenantName = tenantName;
    }

    public String getTenantName() 
    {
        return tenantName;
    }
    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }
    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }
    public void setCheckOpion(String checkOpion) 
    {
        this.checkOpion = checkOpion;
    }

    public String getCheckOpion() 
    {
        return checkOpion;
    }
    public void setCheckerId(Long checkerId) 
    {
        this.checkerId = checkerId;
    }

    public Long getCheckerId() 
    {
        return checkerId;
    }
    public void setCheckerName(String checkerName) 
    {
        this.checkerName = checkerName;
    }

    public String getCheckerName() 
    {
        return checkerName;
    }
    public void setCheckDate(Date checkDate) 
    {
        this.checkDate = checkDate;
    }

    public Date getCheckDate() 
    {
        return checkDate;
    }
    public void setIsHistory(String isHistory) 
    {
        this.isHistory = isHistory;
    }

    public String getIsHistory() 
    {
        return isHistory;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roomId", getRoomId())
            .append("tenantId", getTenantId())
            .append("tenantName", getTenantName())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("checkOpion", getCheckOpion())
            .append("checkerId", getCheckerId())
            .append("checkerName", getCheckerName())
            .append("checkDate", getCheckDate())
            .append("isHistory", getIsHistory())
            .append("price", getPrice())
            .toString();
    }
}
