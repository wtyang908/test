package com.xiwang.project.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiwang.project.system.mapper.ReOrderMapper;
import com.xiwang.project.system.domain.ReOrder;
import com.xiwang.project.system.service.IReOrderService;

/**
 * 订单Service业务层处理
 * 
 * @author xiwang
 * @date 2023-03-11
 */
@Service
public class ReOrderServiceImpl implements IReOrderService 
{
    @Autowired
    private ReOrderMapper reOrderMapper;

    /**
     * 查询订单
     * 
     * @param id 订单主键
     * @return 订单
     */
    @Override
    public ReOrder selectReOrderById(Long id)
    {
        return reOrderMapper.selectReOrderById(id);
    }


    /**
     * 查询订单
     *
     * @param tenantId 订单主键
     * @return 订单
     */
    @Override
    public List<ReOrder> selectReOrderListByTenantId(long tenantId)
    {
        return reOrderMapper.selectReOrderListByTenantId(tenantId);
    }

    /**
     * 查询订单列表
     * 
     * @param reOrder 订单
     * @return 订单
     */
    @Override
    public List<ReOrder> selectReOrderList(ReOrder reOrder)
    {
        return reOrderMapper.selectReOrderList(reOrder);
    }

    /**
     * 新增订单
     * 
     * @param reOrder 订单
     * @return 结果
     */
    @Override
    public int insertReOrder(ReOrder reOrder)
    {
        return reOrderMapper.insertReOrder(reOrder);
    }

    /**
     * 修改订单
     * 
     * @param reOrder 订单
     * @return 结果
     */
    @Override
    public int updateReOrder(ReOrder reOrder)
    {
        return reOrderMapper.updateReOrder(reOrder);
    }

    /**
     * 批量删除订单
     * 
     * @param ids 需要删除的订单主键
     * @return 结果
     */
    @Override
    public int deleteReOrderByIds(Long[] ids)
    {
        return reOrderMapper.deleteReOrderByIds(ids);
    }

    /**
     * 删除订单信息
     * 
     * @param id 订单主键
     * @return 结果
     */
    @Override
    public int deleteReOrderById(Long id)
    {
        return reOrderMapper.deleteReOrderById(id);
    }
}
