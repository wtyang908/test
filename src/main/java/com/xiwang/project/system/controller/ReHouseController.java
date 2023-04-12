package com.xiwang.project.system.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.xiwang.common.utils.SecurityUtils;
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
import com.xiwang.project.system.domain.ReHouse;
import com.xiwang.project.system.service.IReHouseService;
import com.xiwang.framework.web.controller.BaseController;
import com.xiwang.framework.web.domain.AjaxResult;
import com.xiwang.common.utils.poi.ExcelUtil;
import com.xiwang.framework.web.page.TableDataInfo;

/**
 * 房屋管理Controller
 * 
 * @author xiwang
 * @date 2023-03-10
 */
@RestController
@RequestMapping("/system/house")
public class ReHouseController extends BaseController
{
    @Autowired
    private IReHouseService reHouseService;

    /**
     * 查询房屋管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:house:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReHouse reHouse)
    {
        startPage();
        List<ReHouse> list = reHouseService.selectReHouseList(reHouse);
        return getDataTable(list);
    }



    /**
     * 获取输入的审核员id，name和时间
     */
    @GetMapping("/getCheck")
    public AjaxResult getCheck()
    {
        ReHouse reHouse = new ReHouse();
        long id1 =0;
        Long id = SecurityUtils.getUserId();
        String name=SecurityUtils.getUsername();
        Date date=new Date();
        reHouse.setCheckerId(id);
        reHouse.setCheckerName(name);
        reHouse.setCheckOpion("是");
        reHouse.setCheckDate(date);
        reHouse.setId(id1);
        reHouse.setHouseOwnerId(id1);
        reHouse.setHousePrice(id1);
        return success(reHouse);
    }




    /**
     * 导出房屋管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:house:export')")
    @Log(title = "房屋管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReHouse reHouse)
    {
        List<ReHouse> list = reHouseService.selectReHouseList(reHouse);
        ExcelUtil<ReHouse> util = new ExcelUtil<ReHouse>(ReHouse.class);
        util.exportExcel(response, list, "房屋管理数据");
    }

    /**
     * 获取房屋管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:house:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reHouseService.selectReHouseById(id));
    }

    /**
     * 新增房屋管理
     */
    @PreAuthorize("@ss.hasPermi('system:house:add')")
    @Log(title = "房屋管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReHouse reHouse)
    {
        return toAjax(reHouseService.insertReHouse(reHouse));
    }

    /**
     * 修改房屋管理
     */
    @PreAuthorize("@ss.hasPermi('system:house:edit')")
    @Log(title = "房屋管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReHouse reHouse)
    {
        return toAjax(reHouseService.updateReHouse(reHouse));
    }

    /**
     * 删除房屋管理
     */
    @PreAuthorize("@ss.hasPermi('system:house:remove')")
    @Log(title = "房屋管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reHouseService.deleteReHouseByIds(ids));
    }
}
