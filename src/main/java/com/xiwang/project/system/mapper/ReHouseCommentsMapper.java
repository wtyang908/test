package com.xiwang.project.system.mapper;

import java.util.List;
import com.xiwang.project.system.domain.ReHouseComments;
import com.xiwang.project.system.domain.ReHouseCommentsList;

/**
 * 房屋评论Mapper接口
 * 
 * @author xiwang
 * @date 2023-04-12
 */
public interface ReHouseCommentsMapper 
{

    /**
     * 查询房屋评论
     *
     * @param houseId 房屋id
     * @return 房屋评论,增加了nickname和avatar
     */
    public List<ReHouseCommentsList> selectReHouseCommentsListByHouseId(Long houseId);




    /**
     * 查询房屋评论
     * 
     * @param id 房屋评论主键
     * @return 房屋评论
     */
    public ReHouseComments selectReHouseCommentsById(Long id);

    /**
     * 查询房屋评论列表
     * 
     * @param reHouseComments 房屋评论
     * @return 房屋评论集合
     */
    public List<ReHouseComments> selectReHouseCommentsList(ReHouseComments reHouseComments);

    /**
     * 新增房屋评论
     * 
     * @param reHouseComments 房屋评论
     * @return 结果
     */
    public int insertReHouseComments(ReHouseComments reHouseComments);

    /**
     * 修改房屋评论
     * 
     * @param reHouseComments 房屋评论
     * @return 结果
     */
    public int updateReHouseComments(ReHouseComments reHouseComments);

    /**
     * 删除房屋评论
     * 
     * @param id 房屋评论主键
     * @return 结果
     */
    public int deleteReHouseCommentsById(Long id);

    /**
     * 批量删除房屋评论
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteReHouseCommentsByIds(Long[] ids);
}
