package com.corpit.qr.tools;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.corpit.qr.activity.ActivityTabBar;

/**
 ***************************************************** 
 * <hr>
 * <dt><span class="strong">类功能简介:</span></dt>
 * <dd>Coffee</dd>
 * <dt><span class="strong">创建时间:</span></dt>
 * <dd>2015-1-26 上午11:29:42</dd>
 * <dt><span class="strong">公司:</span></dt>
 * <dd>Fragment基础类</dd>
 * 
 * @author aa1000777 - Email:aa1000777@qq.com
 ***************************************************** 
 */

public class BaseFragment extends Fragment {
	public FragmentManager fragmentManager;
	public Context context;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		context = this.getActivity();
		fragmentManager = this.getFragmentManager();
	}

	protected final void gotoNextFragment(BaseFragment fragment, Bundle args, int animType) {
		if (args != null)
			fragment.setArguments(args);
		fragment.setTargetFragment(this, 0);
		ActivityTabBar.getInstance().addFragment(fragment, animType);
	}

	public void saveState() {

	}

	public void refresh() {

	}
}
