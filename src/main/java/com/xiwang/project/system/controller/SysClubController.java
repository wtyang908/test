package com.xiwang.project.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xiwang.framework.aspectj.lang.annotation.Log;
import com.xiwang.framework.aspectj.lang.enums.BusinessType;
import com.xiwang.project.system.domain.SysClub;
import com.xiwang.project.system.service.ISysClubService;
import com.xiwang.framework.web.controller.BaseController;
import com.xiwang.framework.web.domain.AjaxResult;
import com.xiwang.common.utils.poi.ExcelUtil;
import com.xiwang.framework.web.page.TableDataInfo;

/**
 * 社团Controller
 * 
 * @author xiwang
 * @date 2023-03-07
 */
@RestController
@RequestMapping("/system/club")
public class SysClubController extends BaseController
{
    @Autowired
    private ISysClubService sysClubService;

    /**
     * 查询社团列表
     */
    @PreAuthorize("@ss.hasPermi('system:club:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysClub sysClub)
    {
        startPage();
        List<SysClub> list = sysClubService.selectSysClubList(sysClub);
        return getDataTable(list);
    }

    /**
     * 导出社团列表
     */
    @PreAuthorize("@ss.hasPermi('system:club:export')")
    @Log(title = "社团", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysClub sysClub)
    {
        List<SysClub> list = sysClubService.selectSysClubList(sysClub);
        ExcelUtil<SysClub> util = new ExcelUtil<SysClub>(SysClub.class);
        util.exportExcel(response, list, "社团数据");
    }

    /**
     * 获取社团详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:club:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysClubService.selectSysClubById(id));
    }

    /**
     * 新增社团
     */
    @PreAuthorize("@ss.hasPermi('system:club:add')")
    @Log(title = "社团", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysClub sysClub)
    {
        return toAjax(sysClubService.insertSysClub(sysClub));
    }

    /**
     * 修改社团
     */
    @PreAuthorize("@ss.hasPermi('system:club:edit')")
    @Log(title = "社团", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysClub sysClub)
    {
        return toAjax(sysClubService.updateSysClub(sysClub));
    }

    /**
     * 删除社团
     */
    @PreAuthorize("@ss.hasPermi('system:club:remove')")
    @Log(title = "社团", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysClubService.deleteSysClubByIds(ids));
    }
}
