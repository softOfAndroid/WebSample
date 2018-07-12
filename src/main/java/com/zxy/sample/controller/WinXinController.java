package com.zxy.sample.controller;

import com.zxy.sample.bean.WxMessage;
import com.zxy.sample.util.WxCheckUtil;
import com.zxy.sample.util.WxMessageUtil;
import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

@Controller
public class WinXinController {

    @RequestMapping("wx")
    public String indexView() {
        //test();
        return "wx/wx";
    }

    @ResponseBody
    @RequestMapping(value = "wx.do", method = RequestMethod.GET)
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        PrintWriter out = response.getWriter();
        if (WxCheckUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
        out.close();
    }

    @ResponseBody
    @RequestMapping(value = "wx.do", method = RequestMethod.POST)
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Map<String, String> map = WxMessageUtil.xmlToMap(request);
        PrintWriter writer = response.getWriter();
        //开发者微信号
        String toUserName = map.get("ToUserName");
        //发送方帐号（一个OpenID
        String fromUserName = map.get("FromUserName");
        //消息创建时间 （整型）
        String createTime = map.get("CreateTime");
        //text
        String msgType = map.get("MsgType");
        //文本消息内容
        String content = map.get("Content");
        //消息id，64位整型
        String msgId = map.get("MsgId");

        String mess = null;
        if (WxMessageUtil.MESSAGE_TEXT.equals(msgType)) {
            mess = WxMessageUtil.replayMess(fromUserName,toUserName,content);
        } else if (WxMessageUtil.MESSAGE_EVENT.equals(msgType)) {
            String eventType = map.get("Event");
            //关注
            if (WxMessageUtil.MESSAGE_SUBSCRIBE.equals(eventType)) {
                mess = WxMessageUtil.replayMess(fromUserName,toUserName,"欢迎关注");
            }
        }
        writer.print(mess);
        writer.close();
    }
}
