package com.soecode.music_collector;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxService;
import com.soecode.wxtools.bean.WxMenu;
import com.soecode.wxtools.bean.result.WxMenuResult;
import com.soecode.wxtools.exception.WxErrorException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    static IService iService = new WxService();

    public static void main(String[] args) throws WxErrorException {
         createMenu();
        //queryMenu();
    }


    public static void queryMenu() throws WxErrorException {
        WxMenuResult a = iService.getMenu();
        System.out.println(a);
    }

    public static void createMenu() throws WxErrorException {
        WxMenu menu = new WxMenu();
        List<WxMenu.WxMenuButton> btnList = new ArrayList<>();

        //新增按钮
        WxMenu.WxMenuButton btn1 = new WxMenu.WxMenuButton();
        btn1.setName("公司产品");
        List<WxMenu.WxMenuButton> subList = new ArrayList<>();
        WxMenu.WxMenuButton btn1_1 = new WxMenu.WxMenuButton();
              btn1_1.setType("view");
        btn1_1.setName("花财有道");
        btn1_1.setUrl(iService.oauth2buildAuthorizationUrl("https://m.hnrfqj.com/api/wx/auth2", "snsapi_base", "007"));
        WxMenu.WxMenuButton btn1_2 = new WxMenu.WxMenuButton();
        btn1_2.setType("view");
        btn1_2.setName("花财易商");
        btn1_2.setUrl("https://yishang.hnrfqj.com");
        WxMenu.WxMenuButton btn1_3 = new WxMenu.WxMenuButton();
        btn1_3.setType("view");
        btn1_3.setName("花财聚保");
        btn1_3.setUrl("https://grsb.hnrfqj.com/index");

        //新增按钮

        WxMenu.WxMenuButton btn2 = new WxMenu.WxMenuButton();
        btn2.setName("财税知识");
        List<WxMenu.WxMenuButton> subList2 = new ArrayList<>();
        WxMenu.WxMenuButton btn2_1 = new WxMenu.WxMenuButton();
        btn2_1.setType("view");
        btn2_1.setName("财税学堂");
        btn2_1.setUrl("https://m.hnrfqj.com/caishui");
        WxMenu.WxMenuButton btn2_2 = new WxMenu.WxMenuButton();
        btn2_2.setType("view");
        btn2_2.setName("知识问答");
        btn2_2.setUrl("https://www.wenjuan.in/s/E3ERZfk/");



        //新增按钮
        WxMenu.WxMenuButton btn3 = new WxMenu.WxMenuButton();
        btn3.setType("view");
        btn3.setUrl("https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzU1NzM5Njk4Mw==&scene=126#wechat_redirect");
        btn3.setName("公司动态");


        subList.addAll(Arrays.asList(btn1_1, btn1_2, btn1_3));
        btn1.setSub_button(subList);

        subList2.addAll(Arrays.asList(btn2_1, btn2_2));
        btn2.setSub_button(subList2);
        //将三个按钮设置进btnList
        btnList.add(btn3);
        btnList.add(btn2);
        btnList.add(btn1);


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
