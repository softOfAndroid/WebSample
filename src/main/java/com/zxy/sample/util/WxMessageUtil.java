package com.zxy.sample.util;

import com.thoughtworks.xstream.XStream;
import com.zxy.sample.bean.WxMessage;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.SAXParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WxMessageUtil {

    public static final String MESSAGE_TEXT = "text";
    public static final String MESSAGE_IMAGE = "image";
    public static final String MESSAGE_VOICE = "voice";
    public static final String MESSAGE_VIDEO = "video";
    public static final String MESSAGE_LINK = "link";
    public static final String MESSAGE_LOCATION = "location";
    public static final String MESSAGE_EVENT = "event";
    public static final String MESSAGE_SUBSCRIBE = "subscribe";
    public static final String MESSAGE_CLICK = "CLICK";
    public static final String MESSAGE_VIEW = "VIEW";

    /**
     * xml 转 map集合
     *
     * @param request
     * @return
     * @throws Exception
     */
    public static Map<String, String> xmlToMap(HttpServletRequest request) throws Exception {
        Map<String, String> map = new HashMap<>();
        SAXReader reader = new SAXReader();
        InputStream in = request.getInputStream();
        Document document = reader.read(in);
        Element root = document.getRootElement();
        List<Element> list = root.elements();
        for (Element e : list) {
            map.put(e.getName(), e.getText());
        }
        in.close();
        return map;
    }

    /**
     * 将文本消息转化为XML
     *
     * @param textMessage
     * @return
     */
    public static String wxMessageToXml(WxMessage textMessage) {
        XStream stream = new XStream();
        //将根元素替换成xml
        stream.alias("xml", textMessage.getClass());
        return stream.toXML(textMessage);
    }

    /**
     * @param fromUserName
     * @param toUserName
     * @param content
     * @return
     */
    public static String replayMess(String fromUserName, String toUserName, String content) {
        WxMessage wxMessage = new WxMessage();
        wxMessage.setToUserName(fromUserName);
        wxMessage.setFromUserName(toUserName);
        wxMessage.setCreateTime(new Date().getTime());
        wxMessage.setMsgType(MESSAGE_TEXT);
        wxMessage.setContent(content);
        return wxMessageToXml(wxMessage);
    }
}
