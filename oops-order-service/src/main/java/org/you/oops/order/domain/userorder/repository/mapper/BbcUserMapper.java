package org.you.oops.order.domain.userorder.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.you.oops.order.domain.userorder.repository.po.BbcUserPO;
import org.you.oops.order.domain.userorder.repository.po.BbcUserExample;

public interface BbcUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    long countByExample(BbcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int deleteByExample(BbcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Long fuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int insert(BbcUserPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int insertSelective(BbcUserPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    List<BbcUserPO> selectByExample(BbcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    BbcUserPO selectByPrimaryKey(Long fuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") BbcUserPO record, @Param("example") BbcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int updateByExample(@Param("record") BbcUserPO record, @Param("example") BbcUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(BbcUserPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int updateByPrimaryKey(BbcUserPO record);
}