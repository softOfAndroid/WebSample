package com.zxy.sample.common;

import java.util.concurrent.ConcurrentLinkedQueue;

public class MessageQueue {

    private ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

    public synchronized void pushMes(String mes) {
        queue.add(mes);
    }
}
