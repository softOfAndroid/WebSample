package com.zxy.sample.controller;

import com.zxy.sample.socket.MyWebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;

@Controller
public class IndexController {

    private MyWebSocketServer socketServer;

    @RequestMapping("index")
    public String indexView() {
        //test();
        return "redirect:wx";//"index/index";
    }

    private void test() {
        socketServer = new MyWebSocketServer(2018);
        socketServer.start();
    }

    @RequestMapping("index/send.action")
    public String sendMes() {
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            int port = socketServer.getPort();
            System.out.println(String.format("服务已启动: %s:%d", ip, port));
            socketServer.sendMessage("现在几点了？");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index/index";
    }
}
