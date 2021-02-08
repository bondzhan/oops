package org.you.oops.order.domain.userorder.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.you.oops.order.domain.userorder.repository.po.BbcUserAccountPO;
import org.you.oops.order.domain.userorder.repository.po.BbcUserAccountExample;

public interface BbcUserAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    long countByExample(BbcUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int deleteByExample(BbcUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Long fuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int insert(BbcUserAccountPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int insertSelective(BbcUserAccountPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    List<BbcUserAccountPO> selectByExample(BbcUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    BbcUserAccountPO selectByPrimaryKey(Long fuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int updateByExampleSelective(@Param("record") BbcUserAccountPO record, @Param("example") BbcUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int updateByExample(@Param("record") BbcUserAccountPO record, @Param("example") BbcUserAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(BbcUserAccountPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bbc_user_account
     *
     *   Tue Jan 26 17:05:51 GMT+08:00 2021
     */
    int updateByPrimaryKey(BbcUserAccountPO record);
}