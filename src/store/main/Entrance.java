package store.main;

import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import store.module.view.LoginJFrame;

public class Entrance {
	

	public static void main(String[] args) {
		try {
			

			System.setProperty("sun.java2d.noddraw", "true");
			// 设置窗口边框样式
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.put("RootPane.setupButtonVisible", false);
		} catch (Exception e) {

		}
		// 初始化登陆窗口
		new LoginJFrame();

	}
}
