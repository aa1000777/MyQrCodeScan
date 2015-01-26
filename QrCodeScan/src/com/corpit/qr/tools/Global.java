package com.corpit.qr.tools;

import android.graphics.Point;

import com.corpit.qr.views.ReclickableTabHost;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2015-1-26 上午11:59:27</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>公共变量类</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public class Global {
	public static ReclickableTabHost mTabHost;
	public static Point point;// 取得当前屏幕的宽高
	public static String title;
	public static String time;
	public static int id;// login 用于扫描sessionId
	public static int SessionCont;

	public static String sessionId = null;// 用于查询的sessionId
}
