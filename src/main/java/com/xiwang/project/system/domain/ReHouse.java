package com.xiwang.project.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xiwang.framework.aspectj.lang.annotation.Excel;
import com.xiwang.framework.web.domain.BaseEntity;

/**
 * 房屋管理对象 re_house
 * 
 * @author xiwang
 * @date 2023-03-10
 */
public class ReHouse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 房屋id */
    private Long id;

    /** 房屋省级地址 */
    @Excel(name = "房屋省级地址")
    private String houseProvinceAddress;

    /** 房屋市级地址 */
    @Excel(name = "房屋市级地址")
    private String houseCityAddress;

    /** 房屋具体地址 */
    @Excel(name = "房屋具体地址")
    private String houseAddress;

    /** 房屋名称 */
    @Excel(name = "房屋名称")
    private String houseName;

    /** 房屋描述 */
    @Excel(name = "房屋描述")
    private String houseDesc;

    /** 房屋照片 */
    @Excel(name = "房屋照片")
    private String houseImage;

    /** 房东ID */
    @Excel(name = "房东ID")
    private Long houseOwnerId;

    /** 房东姓名 */
    @Excel(name = "房东姓名")
    private String houseOwnerName;

    /** 房屋价格 */
    @Excel(name = "房屋价格")
    private Long housePrice;

    /** 是否出租 */
    @Excel(name = "是否出租")
    private String checkRent;

    /** 房屋审核 */
    @Excel(name = "房屋审核")
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

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHouseProvinceAddress(String houseProvinceAddress) 
    {
        this.houseProvinceAddress = houseProvinceAddress;
    }

    public String getHouseProvinceAddress() 
    {
        return houseProvinceAddress;
    }
    public void setHouseCityAddress(String houseCityAddress) 
    {
        this.houseCityAddress = houseCityAddress;
    }

    public String getHouseCityAddress() 
    {
        return houseCityAddress;
    }
    public void setHouseAddress(String houseAddress) 
    {
        this.houseAddress = houseAddress;
    }

    public String getHouseAddress() 
    {
        return houseAddress;
    }
    public void setHouseName(String houseName) 
    {
        this.houseName = houseName;
    }

    public String getHouseName() 
    {
        return houseName;
    }
    public void setHouseDesc(String houseDesc) 
    {
        this.houseDesc = houseDesc;
    }

    public String getHouseDesc() 
    {
        return houseDesc;
    }
    public void setHouseImage(String houseImage) 
    {
        this.houseImage = houseImage;
    }

    public String getHouseImage() 
    {
        return houseImage;
    }
    public void setHouseOwnerId(Long houseOwnerId) 
    {
        this.houseOwnerId = houseOwnerId;
    }

    public Long getHouseOwnerId() 
    {
        return houseOwnerId;
    }
    public void setHouseOwnerName(String houseOwnerName) 
    {
        this.houseOwnerName = houseOwnerName;
    }

    public String getHouseOwnerName() 
    {
        return houseOwnerName;
    }
    public void setHousePrice(Long housePrice) 
    {
        this.housePrice = housePrice;
    }

    public Long getHousePrice() 
    {
        return housePrice;
    }
    public void setCheckRent(String checkRent) 
    {
        this.checkRent = checkRent;
    }

    public String getCheckRent() 
    {
        return checkRent;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("houseProvinceAddress", getHouseProvinceAddress())
            .append("houseCityAddress", getHouseCityAddress())
            .append("houseAddress", getHouseAddress())
            .append("houseName", getHouseName())
            .append("houseDesc", getHouseDesc())
            .append("houseImage", getHouseImage())
            .append("houseOwnerId", getHouseOwnerId())
            .append("houseOwnerName", getHouseOwnerName())
            .append("housePrice", getHousePrice())
            .append("checkRent", getCheckRent())
            .append("checkOpion", getCheckOpion())
            .append("checkerId", getCheckerId())
            .append("checkerName", getCheckerName())
            .append("checkDate", getCheckDate())
            .toString();
    }
}
