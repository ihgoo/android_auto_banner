package com.ihgoo.autobanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 
 * @author <a href="http://www.xunhou.me" target="_blank">Kelvin</a>
 *
 */
public class AutoBannerViewPager extends ViewPager {

	private final int BANNER_WHAT = 0;

	private Handler handler;

	private boolean isRunning = false;

	private boolean stopScrollWhenTouch = false;

	private boolean isStoped;

	private final int LEFT = 0;
	
	private final int RIGHT = 1;
	
	private final int START_WHAT = 0;
	
	private final int STOP_WHAT = 1;
	
	private int DEFAULT_ROLL = 1500;

	private int method = LEFT;

	public AutoBannerViewPager(Context context) {
		super(context);
		init();
	}

	public AutoBannerViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	private void init() {
		handler = new Handler();
	}

	public void startScroll() {
		handler.removeCallbacksAndMessages(null);
		handler.sendEmptyMessageAtTime(START_WHAT, DEFAULT_ROLL);
	}

	public void stopScroll() {

	}
	
	/**
	 * 设置滚动方向
	 * @param method
	 */
	public void setMethod(int method){
		this.method = method;
	}

	public void scroll() {
		PagerAdapter adapter = getAdapter();
		int currentItem = getCurrentItem();
		int totalItem;
		if (adapter == null || (totalItem = adapter.getCount()) <= 1) {
			return;
		}

		int nextItemPostion = (method == LEFT) ? --currentItem : ++currentItem;
		if (nextItemPostion < 0) {
			setCurrentItem(currentItem - 1, true);
		} else if (currentItem == totalItem) {
			setCurrentItem(0, true);
		} else {
			setCurrentItem(nextItemPostion);
		}
	}

	private class MyHandler extends Handler {

		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
			case BANNER_WHAT:

				break;
			default:
				break;
			}
		}
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {

		int action = ev.getAction();

		if (stopScrollWhenTouch) {
			if (isRunning && MotionEvent.ACTION_DOWN == action) {
				isStoped = true;
				stopScroll();
			} else if (isRunning && MotionEvent.ACTION_UP == action) {
				isStoped = false;
				startScroll();
			}
		}

		return super.dispatchTouchEvent(ev);
	}

}
