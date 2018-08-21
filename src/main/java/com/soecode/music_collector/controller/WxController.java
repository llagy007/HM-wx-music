package com.soecode.music_collector.controller;

import com.soecode.wxtools.api.IService;
import com.soecode.wxtools.api.WxService;
import com.soecode.wxtools.bean.result.WxOAuth2AccessTokenResult;
import com.soecode.wxtools.exception.WxErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.io.IOException;

@Controller
@RequestMapping("/wx")
public class WxController {

    private IService iService = new WxService();
    private final static Logger logger = LoggerFactory.getLogger(WxController.class);

    @GetMapping
    public @ResponseBody
    String check(HttpServletResponse response, String signature, String timestamp, String nonce, String echostr) {
        logger.info(signature);
        logger.info(timestamp);
        logger.info(nonce);
        logger.info(echostr);
        if (iService.checkSignature(signature, timestamp, nonce, echostr)) {
            logger.info(echostr);
            logger.info("wx signature 校验成功！ signature:" + signature);


            return echostr;
        }
        logger.info("wx signature 校验失败！");
        return null;
    }

    @GetMapping("/auth2")
    public String auth2(HttpServletRequest request, String code, HttpServletResponse response) {
        try {
            code = request.getParameter("code");
            WxOAuth2AccessTokenResult obj = iService.oauth2ToGetAccessToken(code);
            //  String url = iService.oauth2buildAuthorizationUrl("https://ee007599.ngrok.io/wx/test", "snsapi_base", "007");
            System.out.println(obj);
            System.out.println(obj.getOpenid());
            return "/index.html?openId=" + obj.getOpenid();
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
        return null;

    }

    @PostMapping("/user/update")
    public @ResponseBody
    String update() {
        return "update";
    }

    @GetMapping("/user/{userId}")
    public @ResponseBody
    String query(@PathParam("userId") Integer userId) {
        logger.info("userId:"+userId);
        return "query";
    }

    @PostMapping
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {


    }

}
