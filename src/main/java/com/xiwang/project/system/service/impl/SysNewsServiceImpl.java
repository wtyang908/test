package com.xiwang.project.system.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiwang.project.system.mapper.SysNewsMapper;
import com.xiwang.project.system.domain.SysNews;
import com.xiwang.project.system.service.ISysNewsService;

/**
 * 新闻Service业务层处理
 * 
 * @author xiwang
 * @date 2023-03-07
 */
@Service
public class SysNewsServiceImpl implements ISysNewsService 
{
    @Autowired
    private SysNewsMapper sysNewsMapper;

    /**
     * 查询新闻
     * 
     * @param id 新闻主键
     * @return 新闻
     */
    @Override
    public SysNews selectSysNewsById(Long id)
    {
        return sysNewsMapper.selectSysNewsById(id);
    }

    /**
     * 查询新闻列表
     * 
     * @param sysNews 新闻
     * @return 新闻
     */
    @Override
    public List<SysNews> selectSysNewsList(SysNews sysNews)
    {
        return sysNewsMapper.selectSysNewsList(sysNews);
    }

    /**
     * 新增新闻
     * 
     * @param sysNews 新闻
     * @return 结果
     */
    @Override
    public int insertSysNews(SysNews sysNews)
    {
        String content = sysNews.getContent();
        String summary = content.substring(0, 100) + "......";
        sysNews.setSummary(summary);
        sysNews.setTime(LocalDateTime.now());
        return sysNewsMapper.insertSysNews(sysNews);
    }

    /**
     * 修改新闻
     * 
     * @param sysNews 新闻
     * @return 结果
     */
    @Override
    public int updateSysNews(SysNews sysNews)
    {
        String content = sysNews.getContent();
        String summary = content.substring(0, 100) + "......";
        sysNews.setSummary(summary);
        sysNews.setTime(LocalDateTime.now());
        return sysNewsMapper.updateSysNews(sysNews);
    }

    /**
     * 批量删除新闻
     * 
     * @param ids 需要删除的新闻主键
     * @return 结果
     */
    @Override
    public int deleteSysNewsByIds(Long[] ids)
    {
        return sysNewsMapper.deleteSysNewsByIds(ids);
    }

    /**
     * 删除新闻信息
     * 
     * @param id 新闻主键
     * @return 结果
     */
    @Override
    public int deleteSysNewsById(Long id)
    {
        return sysNewsMapper.deleteSysNewsById(id);
    }
}
