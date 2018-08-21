package com.soecode.music_collector.util;

import com.soecode.music_collector.constants.MenuKey;
import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxConsts;
import com.soecode.wxtools.api.WxService;
import com.soecode.wxtools.bean.WxMenu;
import com.soecode.wxtools.exception.WxErrorException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WxUtil {
    public static void main(String[] args) {
        createMemu();
    }
  static   IService iService = new WxService();
    public static  void createMemu(){


        WxMenu menu = new WxMenu();
        List<WxMenu.WxMenuButton> btnList = new ArrayList<>();
        //飙升功能
        WxMenu.WxMenuButton btn1 = new WxMenu.WxMenuButton();
        btn1.setName("A");
        btn1.setUrl("www.baidu.com");
        btn1.setKey("a");
        btn1.setType(WxConsts.MENU_BUTTON_CLICK);

        WxMenu.WxMenuButton btn2 = new WxMenu.WxMenuButton();
        btn2.setType(WxConsts.MENU_BUTTON_CLICK);
        btn2.setKey(MenuKey.CHANGE_NEWS);
        btn2.setName("B");
        WxMenu.WxMenuButton btn3 = new WxMenu.WxMenuButton();
        btn3.setType(WxConsts.MENU_BUTTON_CLICK);
        btn3.setKey(MenuKey.HELP);
        btn3.setName("C");
        //将三个按钮设置进btnList
        btnList.add(btn1);
        btnList.add(btn2);
        btnList.add(btn3);
        //设置进菜单类
        menu.setButton(btnList);
        //调用API即可
        try {
            //参数1--menu  ，参数2--是否是个性化定制。如果是个性化菜单栏，需要设置MenuRule
            iService.createMenu(menu, false);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }

    }
}
