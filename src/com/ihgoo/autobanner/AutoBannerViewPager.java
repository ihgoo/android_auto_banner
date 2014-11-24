package com.ihgoo.autobanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 
 * @author <a href="http://www.xunhou.me" target="_blank">Kelvin</a>
 *
 */
public class AutoBannerViewPager extends ViewPager{

	private final int BANNER_WHAT = 0;
	
	private Handler handler;
	
	private boolean isRunning = false;
	
	public AutoBannerViewPager(Context context) {
		super(context);
		init();
	}
	
	public AutoBannerViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}
	
	private void init(){
		handler = new Handler();
	}
	
	
	public void startScroll(){
		
	}
	
	public void stopScroll(){
		
	}
	
	private class MyHandler extends Handler{

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
		
		
		
		
		
		return super.dispatchTouchEvent(ev);
	}
	
	
	

	
	
}
