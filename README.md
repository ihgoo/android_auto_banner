android_auto_banner
===================

自动滚动的轮播图

![轮播图](http://ihgoo.qiniudn.com/auto_viewpager.GIF)

* 介绍

  ````
  基于android.support.v4.view.ViewPager类拓展的自动滚动的轮播图
  
  可自动滚动的viewpager，触摸到图片时，自动滚动属性取消，离开图片时，又开始自动滚动
  ````
  
* 使用说明


  ````
  在xml里定义
      <com.example.bannersipmle.AutoBannerViewPager
        android:id="@+id/abv"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
  ````
  
	* startScroll(); //开始滚动
	* setSpeed(500); //设置滚动速度，单位毫秒
	* setSmoothScroll(false); //设置平滑滚动
	* setMethod(AutoBannerViewPager.METHOD_RIGHT); //设置滚动方向
	* setStopScrollWhenTouch //当触摸到AutoBanner的时候停止自动轮播
	
	

  