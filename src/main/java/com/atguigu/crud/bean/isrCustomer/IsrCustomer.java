package com.atguigu.crud.bean.isrCustomer;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 客户信息
 * </p>
 *
 * @author lilong
 * @since 2018-08-21
 */
@TableName("isr_customer")
public class IsrCustomer extends Model<IsrCustomer> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 客户名称
     */
    private String name;
    /**
     * 注册时间
     */
    @TableField("reg_time")
    private Date regTime;
    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 销售员
     */
    @TableField("sale_man")
    private String saleMan;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 客服ID
     */
    @TableField("service_man_id")
    private Long serviceManId;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 联系统地址
     */
    private String address;
    /**
     * 服务商ID
     */
    @TableField("sp_id")
    private Long spId;
    /**
     * 签约企业数
     */
    @TableField("enterprise_num")
    private Integer enterpriseNum;
    /**
     * 创建者
     */
    @TableField("create_by")
    private String createBy;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 更新者
     */
    @TableField("update_by")
    private String updateBy;
    /**
     * 更新时间
     */
    @TableField("update_date")
    private Date updateDate;
    /**
     * 备注信息
     */
    private String remarks;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSaleMan() {
        return saleMan;
    }

    public void setSaleMan(String saleMan) {
        this.saleMan = saleMan;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getServiceManId() {
        return serviceManId;
    }

    public void setServiceManId(Long serviceManId) {
        this.serviceManId = serviceManId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getSpId() {
        return spId;
    }

    public void setSpId(Long spId) {
        this.spId = spId;
    }

    public Integer getEnterpriseNum() {
        return enterpriseNum;
    }

    public void setEnterpriseNum(Integer enterpriseNum) {
        this.enterpriseNum = enterpriseNum;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "IsrCustomer{" +
        "id=" + id +
        ", name=" + name +
        ", regTime=" + regTime +
        ", userId=" + userId +
        ", saleMan=" + saleMan +
        ", mobile=" + mobile +
        ", serviceManId=" + serviceManId +
        ", email=" + email +
        ", address=" + address +
        ", spId=" + spId +
        ", enterpriseNum=" + enterpriseNum +
        ", createBy=" + createBy +
        ", createDate=" + createDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", remarks=" + remarks +
        "}";
    }
}
