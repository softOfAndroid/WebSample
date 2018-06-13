package com.zxy.sample.socket;

import org.java_websocket.WebSocket;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WebSocketMap {
    public static ConcurrentHashMap<String, WebSocket> webSocketMap=new ConcurrentHashMap<String, WebSocket>();

    public static final void add(String clientId,WebSocket webSocket){
        if(!webSocketMap.containsKey(clientId)){
            webSocketMap.put(clientId, webSocket);
        }
        System.out.println("链接个数："+webSocketMap.size());
    }

    public static WebSocket get(String userId){
        return webSocketMap.get(userId);
    }

    public static boolean isExist(WebSocket ws){
        return webSocketMap.containsValue(ws);
    }

    public static void remove(WebSocket webSocket){
        for (Map.Entry entry:webSocketMap.entrySet()){
            if (entry.getValue()==webSocket){
                webSocketMap.remove(entry.getKey());
            }
        }
    }

}
