package com.entity.vo;

import com.entity.ShouruxiangqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 收入详情
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shouruxiangqing")
public class ShouruxiangqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
