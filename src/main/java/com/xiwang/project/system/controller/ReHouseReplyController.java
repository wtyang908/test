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
import com.xiwang.project.system.domain.ReHouseReply;
import com.xiwang.project.system.service.IReHouseReplyService;
import com.xiwang.framework.web.controller.BaseController;
import com.xiwang.framework.web.domain.AjaxResult;
import com.xiwang.common.utils.poi.ExcelUtil;
import com.xiwang.framework.web.page.TableDataInfo;

/**
 * 评论回复Controller
 * 
 * @author xiwang
 * @date 2023-04-12
 */
@RestController
@RequestMapping("/system/reply")
public class ReHouseReplyController extends BaseController
{
    @Autowired
    private IReHouseReplyService reHouseReplyService;



    /**
     * 获取评论回复详细信息,增加了回复和被回复者昵称
     */
    @PreAuthorize("@ss.hasPermi('system:reply:query')")
    @GetMapping(value = "/list/{commentId}")
    public AjaxResult selectHouseReplyByCommentId(@PathVariable("commentId") Long commentId)
    {
        return success(reHouseReplyService.selectHouseReplyByCommentId(commentId));
    }


    /**
     * 查询评论回复列表
     */
    @PreAuthorize("@ss.hasPermi('system:reply:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReHouseReply reHouseReply)
    {
        startPage();
        List<ReHouseReply> list = reHouseReplyService.selectReHouseReplyList(reHouseReply);
        return getDataTable(list);
    }

    /**
     * 导出评论回复列表
     */
    @PreAuthorize("@ss.hasPermi('system:reply:export')")
    @Log(title = "评论回复", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReHouseReply reHouseReply)
    {
        List<ReHouseReply> list = reHouseReplyService.selectReHouseReplyList(reHouseReply);
        ExcelUtil<ReHouseReply> util = new ExcelUtil<ReHouseReply>(ReHouseReply.class);
        util.exportExcel(response, list, "评论回复数据");
    }

    /**
     * 获取评论回复详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:reply:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reHouseReplyService.selectReHouseReplyById(id));
    }

    /**
     * 新增评论回复
     */
    @PreAuthorize("@ss.hasPermi('system:reply:add')")
    @Log(title = "评论回复", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReHouseReply reHouseReply)
    {
        return toAjax(reHouseReplyService.insertReHouseReply(reHouseReply));
    }

    /**
     * 修改评论回复
     */
    @PreAuthorize("@ss.hasPermi('system:reply:edit')")
    @Log(title = "评论回复", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReHouseReply reHouseReply)
    {
        return toAjax(reHouseReplyService.updateReHouseReply(reHouseReply));
    }

    /**
     * 删除评论回复
     */
    @PreAuthorize("@ss.hasPermi('system:reply:remove')")
    @Log(title = "评论回复", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reHouseReplyService.deleteReHouseReplyByIds(ids));
    }
}
