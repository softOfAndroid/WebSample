package com.zxy.sample.socket;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.util.Collection;

public class MyWebSocketServer extends WebSocketServer {


    public MyWebSocketServer(int port) {
        super(new InetSocketAddress(port));
    }

    public MyWebSocketServer(InetSocketAddress address) {
        super(address);
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        String address = webSocket.getRemoteSocketAddress().getAddress().getHostAddress();
        String message = String.format("(%s) <进入房间！>", address);
        System.out.println("onOpen：" + message);
    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {
        String address = webSocket.getRemoteSocketAddress().getAddress().getHostAddress();
        String message = String.format("(%s) <退出房间！>", address);
        System.out.println("onClose：" + message);
    }

    @Override
    public void onMessage(WebSocket webSocket, String s) {
        String address = webSocket.getRemoteSocketAddress().getAddress().getHostAddress();
        String message = String.format("(%s) %s", address, s);
        System.out.println("接收到消息：" + message);
    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {
        if (webSocket != null) {
            webSocket.close();
        }
        e.printStackTrace();
    }

    @Override
    public void onStart() {

    }

    public void sendMessage(String mess) {
        // 获取所有连接的客户端
        Collection<WebSocket> collection = getConnections();
        //发送消息
        for (WebSocket clent : collection) {
            if (clent.isOpen())
                clent.send(mess);
        }
    }
}
