package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 收入详情
 *
 * @author 
 * @email
 */
@TableName("shouruxiangqing")
public class ShouruxiangqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShouruxiangqingEntity() {

	}

	public ShouruxiangqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 标题
     */
    @TableField(value = "shouruxiangqing_name")

    private String shouruxiangqingName;


    /**
     * 封面
     */
    @TableField(value = "shouruxiangqing_photo")

    private String shouruxiangqingPhoto;


    /**
     * 收入金额
     */
    @TableField(value = "shouruxiangqing_money")

    private Integer shouruxiangqingMoney;


    /**
     * 收入类型
     */
    @TableField(value = "shouruxiangqing_types")

    private Integer shouruxiangqingTypes;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 备注
     */
    @TableField(value = "shouruxiangqing_content")

    private String shouruxiangqingContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getShouruxiangqingName() {
        return shouruxiangqingName;
    }
    /**
	 * 获取：标题
	 */

    public void setShouruxiangqingName(String shouruxiangqingName) {
        this.shouruxiangqingName = shouruxiangqingName;
    }
    /**
	 * 设置：封面
	 */
    public String getShouruxiangqingPhoto() {
        return shouruxiangqingPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setShouruxiangqingPhoto(String shouruxiangqingPhoto) {
        this.shouruxiangqingPhoto = shouruxiangqingPhoto;
    }
    /**
	 * 设置：收入金额
	 */
    public Integer getShouruxiangqingMoney() {
        return shouruxiangqingMoney;
    }
    /**
	 * 获取：收入金额
	 */

    public void setShouruxiangqingMoney(Integer shouruxiangqingMoney) {
        this.shouruxiangqingMoney = shouruxiangqingMoney;
    }
    /**
	 * 设置：收入类型
	 */
    public Integer getShouruxiangqingTypes() {
        return shouruxiangqingTypes;
    }
    /**
	 * 获取：收入类型
	 */

    public void setShouruxiangqingTypes(Integer shouruxiangqingTypes) {
        this.shouruxiangqingTypes = shouruxiangqingTypes;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：备注
	 */
    public String getShouruxiangqingContent() {
        return shouruxiangqingContent;
    }
    /**
	 * 获取：备注
	 */

    public void setShouruxiangqingContent(String shouruxiangqingContent) {
        this.shouruxiangqingContent = shouruxiangqingContent;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：记录时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shouruxiangqing{" +
            "id=" + id +
            ", shouruxiangqingName=" + shouruxiangqingName +
            ", shouruxiangqingPhoto=" + shouruxiangqingPhoto +
            ", shouruxiangqingMoney=" + shouruxiangqingMoney +
            ", shouruxiangqingTypes=" + shouruxiangqingTypes +
            ", yonghuId=" + yonghuId +
            ", shouruxiangqingContent=" + shouruxiangqingContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
