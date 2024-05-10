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
@TableName("xiaofeixiangqing")
public class XiaofeixiangqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiaofeixiangqingEntity() {

	}

	public XiaofeixiangqingEntity(T t) {
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
    @TableField(value = "xiaofeixiangqing_name")

    private String xiaofeixiangqingName;


    /**
     * 封面
     */
    @TableField(value = "xiaofeixiangqing_photo")

    private String xiaofeixiangqingPhoto;


    /**
     * 消费金额
     */
    @TableField(value = "xiaofeixiangqing_money")

    private Integer xiaofeixiangqingMoney;


    /**
     * 消费类型
     */
    @TableField(value = "xiaofeixiangqing_types")

    private Integer xiaofeixiangqingTypes;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 备注
     */
    @TableField(value = "xiaofeixiangqing_content")

    private String xiaofeixiangqingContent;


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
    public String getXiaofeixiangqingName() {
        return xiaofeixiangqingName;
    }
    /**
	 * 获取：标题
	 */

    public void setXiaofeixiangqingName(String xiaofeixiangqingName) {
        this.xiaofeixiangqingName = xiaofeixiangqingName;
    }
    /**
	 * 设置：封面
	 */
    public String getXiaofeixiangqingPhoto() {
        return xiaofeixiangqingPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setXiaofeixiangqingPhoto(String xiaofeixiangqingPhoto) {
        this.xiaofeixiangqingPhoto = xiaofeixiangqingPhoto;
    }
    /**
	 * 设置：消费金额
	 */
    public Integer getXiaofeixiangqingMoney() {
        return xiaofeixiangqingMoney;
    }
    /**
	 * 获取：消费金额
	 */

    public void setXiaofeixiangqingMoney(Integer xiaofeixiangqingMoney) {
        this.xiaofeixiangqingMoney = xiaofeixiangqingMoney;
    }
    /**
	 * 设置：消费类型
	 */
    public Integer getXiaofeixiangqingTypes() {
        return xiaofeixiangqingTypes;
    }
    /**
	 * 获取：消费类型
	 */

    public void setXiaofeixiangqingTypes(Integer xiaofeixiangqingTypes) {
        this.xiaofeixiangqingTypes = xiaofeixiangqingTypes;
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
    public String getXiaofeixiangqingContent() {
        return xiaofeixiangqingContent;
    }
    /**
	 * 获取：备注
	 */

    public void setXiaofeixiangqingContent(String xiaofeixiangqingContent) {
        this.xiaofeixiangqingContent = xiaofeixiangqingContent;
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
        return "Xiaofeixiangqing{" +
            "id=" + id +
            ", xiaofeixiangqingName=" + xiaofeixiangqingName +
            ", xiaofeixiangqingPhoto=" + xiaofeixiangqingPhoto +
            ", xiaofeixiangqingMoney=" + xiaofeixiangqingMoney +
            ", xiaofeixiangqingTypes=" + xiaofeixiangqingTypes +
            ", yonghuId=" + yonghuId +
            ", xiaofeixiangqingContent=" + xiaofeixiangqingContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
