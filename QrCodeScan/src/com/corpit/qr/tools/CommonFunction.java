package com.corpit.qr.tools;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2015-1-26 上午11:31:16</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>公共方法</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public class CommonFunction {
	public static final float WIDTH = 540;// with指定的宽
	public static final float HEIGHT = 960;// height指定的高

	/**
	 * 
	 ***************************************************** 
	 * 方法简介: 取得实际屏幕的x坐标点
	 * 
	 * @param xWidth
	 *            屏幕的Width
	 * @param x
	 *            x在屏幕上的位置
	 * @return
	 ***************************************************** 
	 */
	public static int getX(float xWidth, int x) {
		float scale = xWidth / Global.point.x;// 求出比例
		float X = x / scale;
		return (int) X;
	}

	/**
	 * 
	 ***************************************************** 
	 * 方法简介: 取得屏幕的Y坐标点
	 * 
	 * @param yHeight
	 *            屏幕的Height
	 * @param y
	 *            y在屏幕上的位置
	 * @return
	 ***************************************************** 
	 */
	public static int getY(float yHeight, int y) {
		float scale = yHeight / Global.point.y;// 求出比例
		float Y = y / scale;
		return (int) Y;
	}

	/**
	 * 
	 ***************************************************** 
	 * 方法简介: 取得屏幕实际的Width
	 * 
	 * @param width
	 * @return
	 ***************************************************** 
	 */
	public static int getImageWidth(int width) {
		float scale = WIDTH / Global.point.x;// 求出比例
		float imageWidth = width / scale;
		return (int) imageWidth;
	}

	/**
	 * 
	 ***************************************************** 
	 * 方法简介: 取得屏幕的Height
	 * 
	 * @param height
	 * @return
	 ***************************************************** 
	 */
	public static int getImageHeight(int height) {
		float scale = HEIGHT / Global.point.y;// 求出比例
		float imageHeight = height / scale;
		return (int) imageHeight;
	}

	/**
	 ***************************************************** 
	 * 方法简介: 获取屏幕大小，单位px
	 * 
	 * @param activity
	 * @return Point 屏幕大小对象
	 ***************************************************** 
	 */
	@SuppressWarnings("deprecation")
	public static Point getScreenSize(Activity activity) {
		Display display = activity.getWindowManager().getDefaultDisplay();
		Point size = new Point();
		size.set(display.getWidth(), display.getHeight());
		return size;
	}
}
