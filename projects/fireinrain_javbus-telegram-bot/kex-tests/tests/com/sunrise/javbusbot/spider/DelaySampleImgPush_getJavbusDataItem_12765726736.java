package com.sunrise.javbusbot.spider;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.sunrise.javbusbot.spider.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class DelaySampleImgPush_getJavbusDataItem_12765726736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26465;

    public DelaySampleImgPush_getJavbusDataItem_12765726736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26531 = new ArrayList();
        ArrayList term26560 = new ArrayList();
        ((ArrayList) term26560).add("");
        ((ArrayList) term26560).add("");
        ((ArrayList) term26560).add("");
        ((ArrayList) term26560).add("");
        ((ArrayList) term26560).add("");
        ((ArrayList) term26560).add("");
        Object term26572 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term26572, term26572.getClass(), "title", null);
        setField(term26572, term26572.getClass(), "resolution", null);
        setField(term26572, term26572.getClass(), "subTitle", null);
        setField(term26572, term26572.getClass(), "fileSize", null);
        setField(term26572, term26572.getClass(), "shareDate", null);
        setField(term26572, term26572.getClass(), "magnentStr", null);
        Object term26573 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term26573, term26573.getClass(), "title", null);
        setField(term26573, term26573.getClass(), "resolution", null);
        setField(term26573, term26573.getClass(), "subTitle", null);
        setField(term26573, term26573.getClass(), "fileSize", null);
        setField(term26573, term26573.getClass(), "shareDate", null);
        setField(term26573, term26573.getClass(), "magnentStr", null);
        ArrayList term26570 = new ArrayList();
        ((ArrayList) term26570).add(term26572);
        ((ArrayList) term26570).add(term26573);
        term26465 = newInstance(Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush"));
        Object term26478 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term26535 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term26465, term26465.getClass(), "code", "VOBEeWmzSF");
        setField(term26478, term26478.getClass(), "videoPreviewUrl", "cVeaNxcyvs");
        setField(term26478, term26478.getClass(), "messageChatId", "fIMpTnCtOM");
        setField(term26478, term26478.getClass(), "allFilmCount", "");
        setField(term26478, term26478.getClass(), "haveMagnentCount", "");
        setField(term26478, term26478.getClass(), "visitUrl", "");
        setField(term26478, term26478.getClass(), "bigImgUrl", "");
        setField(term26478, term26478.getClass(), "titleStr", "");
        setField(term26478, term26478.getClass(), "code", "");
        setField(term26478, term26478.getClass(), "publishDate", "");
        setField(term26478, term26478.getClass(), "totalTime", "");
        setField(term26478, term26478.getClass(), "director", "");
        setField(term26478, term26478.getClass(), "produceCompany", "");
        setField(term26478, term26478.getClass(), "publishCompany", "");
        setField(term26478, term26478.getClass(), "series", "");
        setField(term26478, term26478.getClass(), "types", "");
        setField(term26478, term26478.getClass(), "stars", "");
        setField(term26478, term26478.getClass(), "starsPageUrls", term26531);
        setField(term26535, term26535.getClass(), "starName", "zsVQmqfyvx");
        setField(term26535, term26535.getClass(), "startPageUrl", "DKFEMZUVhd");
        setField(term26478, term26478.getClass(), "mainStarPageUrl", term26535);
        setField(term26478, term26478.getClass(), "sampleImgs", term26560);
        setField(term26478, term26478.getClass(), "magnents", term26570);
        setIntField(term26478, term26478.getClass(), "fetchRetry", -1222006000);
        setField(term26465, term26465.getClass(), "javbusDataItem", term26478);
        setLongField(term26465, term26465.getClass(), "excuteTime", 6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJavbusDataItem", argTypes, term26465, args);
    }

};


