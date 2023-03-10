package com.xiwang.project.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.xiwang.framework.aspectj.lang.annotation.Excel;
import com.xiwang.framework.web.domain.BaseEntity;

/**
 * 社团对象 sys_club
 * 
 * @author xiwang
 * @date 2023-03-07
 */
public class SysClub extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 社团名称 */
    @Excel(name = "社团名称")
    private String name;

    /** 社团简介 */
    @Excel(name = "社团简介")
    private String content;

    /** 社长 */
    @Excel(name = "社长")
    private String clubAdmin;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setClubAdmin(String clubAdmin) 
    {
        this.clubAdmin = clubAdmin;
    }

    public String getClubAdmin() 
    {
        return clubAdmin;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("content", getContent())
            .append("clubAdmin", getClubAdmin())
            .toString();
    }
}
