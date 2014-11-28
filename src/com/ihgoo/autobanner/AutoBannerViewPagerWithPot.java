package com.ihgoo.autobanner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AutoBannerViewPagerWithPot extends AutoBannerViewPager {

	public AutoBannerViewPagerWithPot(Context context) {
		super(context);
		initPot();
	}

	public AutoBannerViewPagerWithPot(Context context, AttributeSet attrs) {
		super(context, attrs);
		initPot();
	}

	/**
	 * 初始化点
	 */
	private void initPot() {
		ImageView imageView = new ImageView(getContext());
//		LayoutParams lp = new LayoutParams(-2, -2);

	}

}
