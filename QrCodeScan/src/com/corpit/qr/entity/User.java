package com.corpit.qr.entity;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2015-1-26 上午11:23:49</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>二维码信息实体类</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public class User {
	// 二维码中的字段
	public String Name;// 名字
	public String Email;// 邮箱
	public String Company;// 公司
	public String Country;// 国家
	public String Position;// 职位
	// 关联字段
	public int SessionId;// SessionId
	public String SessionName;// Session标题
	// 是否上传
	public String Sent;
	// 评论
	public String Remark;
}
