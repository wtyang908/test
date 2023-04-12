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
import com.xiwang.project.system.domain.ReFacilities;
import com.xiwang.project.system.service.IReFacilitiesService;
import com.xiwang.framework.web.controller.BaseController;
import com.xiwang.framework.web.domain.AjaxResult;
import com.xiwang.common.utils.poi.ExcelUtil;
import com.xiwang.framework.web.page.TableDataInfo;

/**
 * 房屋设备Controller
 * 
 * @author xiwang
 * @date 2023-04-06
 */
@RestController
@RequestMapping("/system/facilities")
public class ReFacilitiesController extends BaseController
{
    @Autowired
    private IReFacilitiesService reFacilitiesService;

    /**
     * 查询房屋设备列表
     */
    @PreAuthorize("@ss.hasPermi('system:facilities:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReFacilities reFacilities)
    {
        startPage();
        List<ReFacilities> list = reFacilitiesService.selectReFacilitiesList(reFacilities);
        return getDataTable(list);
    }

    /**
     * 导出房屋设备列表
     */
    @PreAuthorize("@ss.hasPermi('system:facilities:export')")
    @Log(title = "房屋设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReFacilities reFacilities)
    {
        List<ReFacilities> list = reFacilitiesService.selectReFacilitiesList(reFacilities);
        ExcelUtil<ReFacilities> util = new ExcelUtil<ReFacilities>(ReFacilities.class);
        util.exportExcel(response, list, "房屋设备数据");
    }

    /**
     * 获取房屋设备详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:facilities:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reFacilitiesService.selectReFacilitiesById(id));
    }

    /**
     * 新增房屋设备
     */
    @PreAuthorize("@ss.hasPermi('system:facilities:add')")
    @Log(title = "房屋设备", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReFacilities reFacilities)
    {
        return toAjax(reFacilitiesService.insertReFacilities(reFacilities));
    }

    /**
     * 修改房屋设备
     */
    @PreAuthorize("@ss.hasPermi('system:facilities:edit')")
    @Log(title = "房屋设备", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReFacilities reFacilities)
    {
        return toAjax(reFacilitiesService.updateReFacilities(reFacilities));
    }

    /**
     * 删除房屋设备
     */
    @PreAuthorize("@ss.hasPermi('system:facilities:remove')")
    @Log(title = "房屋设备", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reFacilitiesService.deleteReFacilitiesByIds(ids));
    }
}
