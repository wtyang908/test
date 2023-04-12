package com.xiwang.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xiwang.framework.aspectj.lang.annotation.Excel;
import com.xiwang.framework.web.domain.BaseEntity;

/**
 * 房屋设备对象 re_facilities
 * 
 * @author xiwang
 * @date 2023-04-06
 */
public class ReFacilities extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 房屋设备id */
    private Long id;

    /** 房屋id */
    @Excel(name = "房屋id")
    private Long houseId;

    /** 床 */
    @Excel(name = "床")
    private Long bed;

    /** 无线网络 */
    @Excel(name = "无线网络")
    private Long internet;

    /** 电视 */
    @Excel(name = "电视")
    private Long tv;

    /** 冰箱 */
    @Excel(name = "冰箱")
    private Long fridge;

    /** 洗衣机 */
    @Excel(name = "洗衣机")
    private Long washingMachine;

    /** 空调 */
    @Excel(name = "空调")
    private Long airConditioner;

    /** 热水器 */
    @Excel(name = "热水器")
    private Long waterHeater;

    /** 厨房 */
    @Excel(name = "厨房")
    private Long cooking;

    /** 沙发 */
    @Excel(name = "沙发")
    private Long sofa;

    /** 橱柜 */
    @Excel(name = "橱柜")
    private Long wardrobe;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHouseId(Long houseId) 
    {
        this.houseId = houseId;
    }

    public Long getHouseId() 
    {
        return houseId;
    }
    public void setBed(Long bed) 
    {
        this.bed = bed;
    }

    public Long getBed() 
    {
        return bed;
    }
    public void setInternet(Long internet) 
    {
        this.internet = internet;
    }

    public Long getInternet() 
    {
        return internet;
    }
    public void setTv(Long tv) 
    {
        this.tv = tv;
    }

    public Long getTv() 
    {
        return tv;
    }
    public void setFridge(Long fridge) 
    {
        this.fridge = fridge;
    }

    public Long getFridge() 
    {
        return fridge;
    }
    public void setWashingMachine(Long washingMachine) 
    {
        this.washingMachine = washingMachine;
    }

    public Long getWashingMachine() 
    {
        return washingMachine;
    }
    public void setAirConditioner(Long airConditioner) 
    {
        this.airConditioner = airConditioner;
    }

    public Long getAirConditioner() 
    {
        return airConditioner;
    }
    public void setWaterHeater(Long waterHeater) 
    {
        this.waterHeater = waterHeater;
    }

    public Long getWaterHeater() 
    {
        return waterHeater;
    }
    public void setCooking(Long cooking) 
    {
        this.cooking = cooking;
    }

    public Long getCooking() 
    {
        return cooking;
    }
    public void setSofa(Long sofa) 
    {
        this.sofa = sofa;
    }

    public Long getSofa() 
    {
        return sofa;
    }
    public void setWardrobe(Long wardrobe) 
    {
        this.wardrobe = wardrobe;
    }

    public Long getWardrobe() 
    {
        return wardrobe;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("houseId", getHouseId())
            .append("bed", getBed())
            .append("internet", getInternet())
            .append("tv", getTv())
            .append("fridge", getFridge())
            .append("washingMachine", getWashingMachine())
            .append("airConditioner", getAirConditioner())
            .append("waterHeater", getWaterHeater())
            .append("cooking", getCooking())
            .append("sofa", getSofa())
            .append("wardrobe", getWardrobe())
            .toString();
    }
}
