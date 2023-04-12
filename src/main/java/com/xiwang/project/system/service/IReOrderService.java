package com.xiwang.project.system.service;

import java.util.List;
import com.xiwang.project.system.domain.ReOrder;

/**
 * 订单Service接口
 * 
 * @author xiwang
 * @date 2023-03-11
 */
public interface IReOrderService 
{
    /**
     * 查询订单
     * 
     * @param id 订单主键
     * @return 订单
     */
    public ReOrder selectReOrderById(Long id);

    /**
     * 查询订单
     *
     * @param tenantId 订单主键
     * @return 订单
     */

    public List<ReOrder> selectReOrderListByTenantId(long tenantId);

    /**
     * 查询订单列表
     * 
     * @param reOrder 订单
     * @return 订单集合
     */
    public List<ReOrder> selectReOrderList(ReOrder reOrder);

    /**
     * 新增订单
     * 
     * @param reOrder 订单
     * @return 结果
     */
    public int insertReOrder(ReOrder reOrder);

    /**
     * 修改订单
     * 
     * @param reOrder 订单
     * @return 结果
     */
    public int updateReOrder(ReOrder reOrder);

    /**
     * 批量删除订单
     * 
     * @param ids 需要删除的订单主键集合
     * @return 结果
     */
    public int deleteReOrderByIds(Long[] ids);

    /**
     * 删除订单信息
     * 
     * @param id 订单主键
     * @return 结果
     */
    public int deleteReOrderById(Long id);
}
