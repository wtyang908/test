package com.xiwang.project.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.xiwang.project.system.domain.ReHouseCommentsList;
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
import com.xiwang.project.system.domain.ReHouseComments;
import com.xiwang.project.system.service.IReHouseCommentsService;
import com.xiwang.framework.web.controller.BaseController;
import com.xiwang.framework.web.domain.AjaxResult;
import com.xiwang.common.utils.poi.ExcelUtil;
import com.xiwang.framework.web.page.TableDataInfo;

/**
 * 房屋评论Controller
 * 
 * @author xiwang
 * @date 2023-04-12
 */
@RestController
@RequestMapping("/system/comments")
public class ReHouseCommentsController extends BaseController
{
    @Autowired
    private IReHouseCommentsService reHouseCommentsService;


    /**
     * 查询房屋评论
     *
     * @param houseId 房屋id
     * @return 房屋评论,增加了nickname和avatar
     */
    @PreAuthorize("@ss.hasPermi('system:comments:list')")
    @GetMapping("/getByHouseId/{houseId}")
    public AjaxResult selectReHouseCommentsListByHouseId(@PathVariable("houseId")Long houseId) {
        List<ReHouseCommentsList> reHouseCommentsList = reHouseCommentsService.selectReHouseCommentsListByHouseId(houseId);
        return success(reHouseCommentsService.selectReHouseCommentsListByHouseId(houseId));
    }



    /**
     * 查询房屋评论列表
     */
    @PreAuthorize("@ss.hasPermi('system:comments:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReHouseComments reHouseComments)
    {
        startPage();
        List<ReHouseComments> list = reHouseCommentsService.selectReHouseCommentsList(reHouseComments);
        return getDataTable(list);
    }

    /**
     * 导出房屋评论列表
     */
    @PreAuthorize("@ss.hasPermi('system:comments:export')")
    @Log(title = "房屋评论", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReHouseComments reHouseComments)
    {
        List<ReHouseComments> list = reHouseCommentsService.selectReHouseCommentsList(reHouseComments);
        ExcelUtil<ReHouseComments> util = new ExcelUtil<ReHouseComments>(ReHouseComments.class);
        util.exportExcel(response, list, "房屋评论数据");
    }

    /**
     * 获取房屋评论详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:comments:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reHouseCommentsService.selectReHouseCommentsById(id));
    }

    /**
     * 新增房屋评论
     */
    @PreAuthorize("@ss.hasPermi('system:comments:add')")
    @Log(title = "房屋评论", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReHouseComments reHouseComments)
    {
        return toAjax(reHouseCommentsService.insertReHouseComments(reHouseComments));
    }

    /**
     * 修改房屋评论
     */
    @PreAuthorize("@ss.hasPermi('system:comments:edit')")
    @Log(title = "房屋评论", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReHouseComments reHouseComments)
    {
        return toAjax(reHouseCommentsService.updateReHouseComments(reHouseComments));
    }

    /**
     * 删除房屋评论
     */
    @PreAuthorize("@ss.hasPermi('system:comments:remove')")
    @Log(title = "房屋评论", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reHouseCommentsService.deleteReHouseCommentsByIds(ids));
    }
}
