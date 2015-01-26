package com.zbar.lib;

/**
 *****************************************************
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2015-1-26 下午4:24:14</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>zbar调用类</dd>
 * @author aa1000777 - Email:aa1000777@qq.com
 *****************************************************
*/

public class ZbarManager {

	static {
		System.loadLibrary("zbar");
	}

	public native String decode(byte[] data, int width, int height, boolean isCrop, int x, int y, int cwidth, int cheight);
}
