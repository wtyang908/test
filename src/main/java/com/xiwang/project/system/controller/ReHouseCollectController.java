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
import com.xiwang.project.system.domain.ReHouseCollect;
import com.xiwang.project.system.service.IReHouseCollectService;
import com.xiwang.framework.web.controller.BaseController;
import com.xiwang.framework.web.domain.AjaxResult;
import com.xiwang.common.utils.poi.ExcelUtil;
import com.xiwang.framework.web.page.TableDataInfo;

/**
 * 我的收藏Controller
 * 
 * @author xiwang
 * @date 2023-04-14
 */
@RestController
@RequestMapping("/system/collect")
public class ReHouseCollectController extends BaseController
{
    @Autowired
    private IReHouseCollectService reHouseCollectService;

    /**
     * 查询我的收藏列表
     */
    @PreAuthorize("@ss.hasPermi('system:collect:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReHouseCollect reHouseCollect)
    {
        startPage();
        List<ReHouseCollect> list = reHouseCollectService.selectReHouseCollectList(reHouseCollect);
        return getDataTable(list);
    }

    /**
     * 导出我的收藏列表
     */
    @PreAuthorize("@ss.hasPermi('system:collect:export')")
    @Log(title = "我的收藏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReHouseCollect reHouseCollect)
    {
        List<ReHouseCollect> list = reHouseCollectService.selectReHouseCollectList(reHouseCollect);
        ExcelUtil<ReHouseCollect> util = new ExcelUtil<ReHouseCollect>(ReHouseCollect.class);
        util.exportExcel(response, list, "我的收藏数据");
    }

    /**
     * 获取我的收藏详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:collect:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reHouseCollectService.selectReHouseCollectById(id));
    }

    /**
     * 新增我的收藏
     */
    @PreAuthorize("@ss.hasPermi('system:collect:add')")
    @Log(title = "我的收藏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReHouseCollect reHouseCollect)
    {
        return toAjax(reHouseCollectService.insertReHouseCollect(reHouseCollect));
    }

    /**
     * 修改我的收藏
     */
    @PreAuthorize("@ss.hasPermi('system:collect:edit')")
    @Log(title = "我的收藏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReHouseCollect reHouseCollect)
    {
        return toAjax(reHouseCollectService.updateReHouseCollect(reHouseCollect));
    }

    /**
     * 删除我的收藏
     */
    @PreAuthorize("@ss.hasPermi('system:collect:remove')")
    @Log(title = "我的收藏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reHouseCollectService.deleteReHouseCollectByIds(ids));
    }
}
