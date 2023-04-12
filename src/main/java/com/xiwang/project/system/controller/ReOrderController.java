package com.xiwang.project.system.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.xiwang.common.utils.SecurityUtils;
import com.xiwang.project.system.domain.ReHouse;
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
import com.xiwang.project.system.domain.ReOrder;
import com.xiwang.project.system.service.IReOrderService;
import com.xiwang.framework.web.controller.BaseController;
import com.xiwang.framework.web.domain.AjaxResult;
import com.xiwang.common.utils.poi.ExcelUtil;
import com.xiwang.framework.web.page.TableDataInfo;

/**
 * 订单Controller
 * 
 * @author xiwang
 * @date 2023-03-11
 */
@RestController
@RequestMapping("/system/order")
public class ReOrderController extends BaseController
{
    @Autowired
    private IReOrderService reOrderService;


    /**
     * 获取输入的审核员id，name和时间
     */
    @GetMapping("/getCheck")
    public AjaxResult getCheck()
    {
        ReOrder reOrder=new ReOrder();
        long id1 =0;
        Long id = SecurityUtils.getUserId();
        String name=SecurityUtils.getUsername();
        Date date=new Date();
        reOrder.setCheckerId(id);
        reOrder.setCheckerName(name);
        reOrder.setCheckOpion("是");
        reOrder.setCheckDate(date);
        //避免传输错误
        reOrder.setId(id1);
        reOrder.setRoomId(id1);
        reOrder.setTenantId(id1);
        reOrder.setPrice(id1);
        return AjaxResult.success(reOrder);
    }

    /**
     * 查询订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReOrder reOrder)
    {
        startPage();
        List<ReOrder> list = reOrderService.selectReOrderList(reOrder);
        return getDataTable(list);
    }

    /**
     * 返回用户id
     */

    @GetMapping( "/returnTenantId")
    public AjaxResult returnTenantId()
    {
        Long tenantId = SecurityUtils.getUserId();
        return success(tenantId);
    }



    /**
     * 根据用户id订单列表
     */
    @GetMapping( "/tenantId")
    public AjaxResult getInfoByTenantId()
    {
        Long tenantId = SecurityUtils.getUserId();
        return success(reOrderService.selectReOrderListByTenantId(tenantId));
    }


    /**
     * 导出订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:export')")
    @Log(title = "订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReOrder reOrder)
    {
        List<ReOrder> list = reOrderService.selectReOrderList(reOrder);
        ExcelUtil<ReOrder> util = new ExcelUtil<ReOrder>(ReOrder.class);
        util.exportExcel(response, list, "订单数据");
    }

    /**
     * 获取订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:order:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reOrderService.selectReOrderById(id));
    }

    /**
     * 新增订单
     */
    @PreAuthorize("@ss.hasPermi('system:order:add')")
    @Log(title = "订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReOrder reOrder)
    {
        return toAjax(reOrderService.insertReOrder(reOrder));
    }

    /**
     * 修改订单
     */
    @PreAuthorize("@ss.hasPermi('system:order:edit')")
    @Log(title = "订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReOrder reOrder)
    {
        return toAjax(reOrderService.updateReOrder(reOrder));
    }

    /**
     * 删除订单
     */
    @PreAuthorize("@ss.hasPermi('system:order:remove')")
    @Log(title = "订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reOrderService.deleteReOrderByIds(ids));
    }
}
