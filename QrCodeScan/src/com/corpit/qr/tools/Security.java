package com.corpit.qr.tools;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2015-1-26 下午4:12:16</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>二维码加解密方法类</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public class Security {

	/**
	 * 
	 ***************************************************** 
	 * 方法简介:加密方法
	 * 
	 * @param string
	 * @param key
	 * @return
	 ***************************************************** 
	 */
	public static String encript(String string, int key) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			char tempChar = string.charAt(i);
			if ((int) tempChar + key > 126) {
				result += (char) ((((int) tempChar + key) - 127) + 32);
			} else {
				result += (char) ((int) tempChar + key);
			}
		}
		return result;
	}

	/**
	 * 
	 ***************************************************** 
	 * 方法简介: 解密方法
	 * 
	 * @param string
	 * @param key
	 * @return
	 ***************************************************** 
	 */
	public static String decrypt(String string, int key) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			char tempChar = string.charAt(i);
			if ((int) tempChar - key < 32) {
				result += (char) ((((int) tempChar - key) + 127) - 32);
			} else {
				result += (char) ((int) tempChar - key);
			}
		}
		return result;
	}
}
