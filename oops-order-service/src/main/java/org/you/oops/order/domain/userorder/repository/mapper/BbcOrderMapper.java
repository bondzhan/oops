package org.you.oops.order.domain.userorder.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.you.oops.order.domain.userorder.repository.po.BbcOrderPO;
import org.you.oops.order.domain.userorder.repository.po.BbcOrderExample;

public interface BbcOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    long countByExample(BbcOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    int deleteByExample(BbcOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    int deleteByPrimaryKey(String forderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    int insert(BbcOrderPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    int insertSelective(BbcOrderPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    List<BbcOrderPO> selectByExample(BbcOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    BbcOrderPO selectByPrimaryKey(String forderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") BbcOrderPO record, @Param("example") BbcOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    int updateByExample(@Param("record") BbcOrderPO record, @Param("example") BbcOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(BbcOrderPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_order
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    int updateByPrimaryKey(BbcOrderPO record);
}