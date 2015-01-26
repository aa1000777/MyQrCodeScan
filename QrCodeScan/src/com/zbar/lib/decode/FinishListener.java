package com.zbar.lib.decode;

import android.app.Activity;
import android.content.DialogInterface;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2015-1-26 下午4:26:15</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>CorpIt</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public final class FinishListener implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, Runnable {

	private final Activity activityToFinish;

	public FinishListener(Activity activityToFinish) {
		this.activityToFinish = activityToFinish;
	}

	public void onCancel(DialogInterface dialogInterface) {
		run();
	}

	public void onClick(DialogInterface dialogInterface, int i) {
		run();
	}

	public void run() {
		activityToFinish.finish();
	}

}
