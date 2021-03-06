package org.you.oops.order.domain.userorder.repository.po;

import java.util.Date;

public class BbcOrderPO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.forder_id
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private String forderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.forder_payment_id
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private String forderPaymentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.forder_type
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Integer forderType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.forder_status
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Integer forderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fcancel_type
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Integer fcancelType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fcancel_reason
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private String fcancelReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fsku_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long fskuAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.forder_discount_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long forderDiscountAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.ftax_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long ftaxAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.ffreight_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long ffreightAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fbuy_agent_income
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long fbuyAgentIncome;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.ftax_difference
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long ftaxDifference;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.forder_real_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long forderRealAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.forder_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long forderAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fconfirm_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Date fconfirmTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.faffirm_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Date faffirmTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fpush_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Date fpushTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fcreate_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Date fcreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fmodify_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Date fmodifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.ffreight_tax_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long ffreightTaxAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fpurchase_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Long fpurchaseAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.fbonded_order_type
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private Integer fbondedOrderType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bbc_order.forder_remark
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    private String forderRemark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.forder_id
     *
     * @return the value of t_bbc_order.forder_id
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public String getForderId() {
        return forderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.forder_id
     *
     * @param forderId the value for t_bbc_order.forder_id
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setForderId(String forderId) {
        this.forderId = forderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.forder_payment_id
     *
     * @return the value of t_bbc_order.forder_payment_id
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public String getForderPaymentId() {
        return forderPaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.forder_payment_id
     *
     * @param forderPaymentId the value for t_bbc_order.forder_payment_id
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setForderPaymentId(String forderPaymentId) {
        this.forderPaymentId = forderPaymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.forder_type
     *
     * @return the value of t_bbc_order.forder_type
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Integer getForderType() {
        return forderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.forder_type
     *
     * @param forderType the value for t_bbc_order.forder_type
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setForderType(Integer forderType) {
        this.forderType = forderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.forder_status
     *
     * @return the value of t_bbc_order.forder_status
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Integer getForderStatus() {
        return forderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.forder_status
     *
     * @param forderStatus the value for t_bbc_order.forder_status
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setForderStatus(Integer forderStatus) {
        this.forderStatus = forderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fcancel_type
     *
     * @return the value of t_bbc_order.fcancel_type
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Integer getFcancelType() {
        return fcancelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fcancel_type
     *
     * @param fcancelType the value for t_bbc_order.fcancel_type
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFcancelType(Integer fcancelType) {
        this.fcancelType = fcancelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fcancel_reason
     *
     * @return the value of t_bbc_order.fcancel_reason
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public String getFcancelReason() {
        return fcancelReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fcancel_reason
     *
     * @param fcancelReason the value for t_bbc_order.fcancel_reason
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFcancelReason(String fcancelReason) {
        this.fcancelReason = fcancelReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fsku_amount
     *
     * @return the value of t_bbc_order.fsku_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getFskuAmount() {
        return fskuAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fsku_amount
     *
     * @param fskuAmount the value for t_bbc_order.fsku_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFskuAmount(Long fskuAmount) {
        this.fskuAmount = fskuAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.forder_discount_amount
     *
     * @return the value of t_bbc_order.forder_discount_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getForderDiscountAmount() {
        return forderDiscountAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.forder_discount_amount
     *
     * @param forderDiscountAmount the value for t_bbc_order.forder_discount_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setForderDiscountAmount(Long forderDiscountAmount) {
        this.forderDiscountAmount = forderDiscountAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.ftax_amount
     *
     * @return the value of t_bbc_order.ftax_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getFtaxAmount() {
        return ftaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.ftax_amount
     *
     * @param ftaxAmount the value for t_bbc_order.ftax_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFtaxAmount(Long ftaxAmount) {
        this.ftaxAmount = ftaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.ffreight_amount
     *
     * @return the value of t_bbc_order.ffreight_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getFfreightAmount() {
        return ffreightAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.ffreight_amount
     *
     * @param ffreightAmount the value for t_bbc_order.ffreight_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFfreightAmount(Long ffreightAmount) {
        this.ffreightAmount = ffreightAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fbuy_agent_income
     *
     * @return the value of t_bbc_order.fbuy_agent_income
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getFbuyAgentIncome() {
        return fbuyAgentIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fbuy_agent_income
     *
     * @param fbuyAgentIncome the value for t_bbc_order.fbuy_agent_income
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFbuyAgentIncome(Long fbuyAgentIncome) {
        this.fbuyAgentIncome = fbuyAgentIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.ftax_difference
     *
     * @return the value of t_bbc_order.ftax_difference
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getFtaxDifference() {
        return ftaxDifference;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.ftax_difference
     *
     * @param ftaxDifference the value for t_bbc_order.ftax_difference
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFtaxDifference(Long ftaxDifference) {
        this.ftaxDifference = ftaxDifference;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.forder_real_amount
     *
     * @return the value of t_bbc_order.forder_real_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getForderRealAmount() {
        return forderRealAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.forder_real_amount
     *
     * @param forderRealAmount the value for t_bbc_order.forder_real_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setForderRealAmount(Long forderRealAmount) {
        this.forderRealAmount = forderRealAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.forder_amount
     *
     * @return the value of t_bbc_order.forder_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getForderAmount() {
        return forderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.forder_amount
     *
     * @param forderAmount the value for t_bbc_order.forder_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setForderAmount(Long forderAmount) {
        this.forderAmount = forderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fconfirm_time
     *
     * @return the value of t_bbc_order.fconfirm_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Date getFconfirmTime() {
        return fconfirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fconfirm_time
     *
     * @param fconfirmTime the value for t_bbc_order.fconfirm_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFconfirmTime(Date fconfirmTime) {
        this.fconfirmTime = fconfirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.faffirm_time
     *
     * @return the value of t_bbc_order.faffirm_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Date getFaffirmTime() {
        return faffirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.faffirm_time
     *
     * @param faffirmTime the value for t_bbc_order.faffirm_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFaffirmTime(Date faffirmTime) {
        this.faffirmTime = faffirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fpush_time
     *
     * @return the value of t_bbc_order.fpush_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Date getFpushTime() {
        return fpushTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fpush_time
     *
     * @param fpushTime the value for t_bbc_order.fpush_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFpushTime(Date fpushTime) {
        this.fpushTime = fpushTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fcreate_time
     *
     * @return the value of t_bbc_order.fcreate_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Date getFcreateTime() {
        return fcreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fcreate_time
     *
     * @param fcreateTime the value for t_bbc_order.fcreate_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFcreateTime(Date fcreateTime) {
        this.fcreateTime = fcreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fmodify_time
     *
     * @return the value of t_bbc_order.fmodify_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Date getFmodifyTime() {
        return fmodifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fmodify_time
     *
     * @param fmodifyTime the value for t_bbc_order.fmodify_time
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFmodifyTime(Date fmodifyTime) {
        this.fmodifyTime = fmodifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.ffreight_tax_amount
     *
     * @return the value of t_bbc_order.ffreight_tax_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getFfreightTaxAmount() {
        return ffreightTaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.ffreight_tax_amount
     *
     * @param ffreightTaxAmount the value for t_bbc_order.ffreight_tax_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFfreightTaxAmount(Long ffreightTaxAmount) {
        this.ffreightTaxAmount = ffreightTaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fpurchase_amount
     *
     * @return the value of t_bbc_order.fpurchase_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Long getFpurchaseAmount() {
        return fpurchaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fpurchase_amount
     *
     * @param fpurchaseAmount the value for t_bbc_order.fpurchase_amount
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFpurchaseAmount(Long fpurchaseAmount) {
        this.fpurchaseAmount = fpurchaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.fbonded_order_type
     *
     * @return the value of t_bbc_order.fbonded_order_type
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public Integer getFbondedOrderType() {
        return fbondedOrderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.fbonded_order_type
     *
     * @param fbondedOrderType the value for t_bbc_order.fbonded_order_type
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setFbondedOrderType(Integer fbondedOrderType) {
        this.fbondedOrderType = fbondedOrderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bbc_order.forder_remark
     *
     * @return the value of t_bbc_order.forder_remark
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public String getForderRemark() {
        return forderRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bbc_order.forder_remark
     *
     * @param forderRemark the value for t_bbc_order.forder_remark
     *
     *   Tue Jan 26 17:05:50 GMT+08:00 2021
     */
    public void setForderRemark(String forderRemark) {
        this.forderRemark = forderRemark;
    }
}