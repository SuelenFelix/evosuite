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
import java.util.ArrayList;
import java.lang.Object;

public class JavbusDataItem_getProduceCompany_56434051223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7849;

    public JavbusDataItem_getProduceCompany_56434051223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7904 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term7904, term7904.getClass(), "starName", "");
        setField(term7904, term7904.getClass(), "startPageUrl", "");
        Object term7907 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term7907, term7907.getClass(), "starName", "");
        setField(term7907, term7907.getClass(), "startPageUrl", "");
        ArrayList term7902 = new ArrayList();
        ((ArrayList) term7902).add(term7904);
        ((ArrayList) term7902).add(term7907);
        ArrayList term7937 = new ArrayList();
        ((ArrayList) term7937).add("bYsZEHeoeV");
        ((ArrayList) term7937).add("IwvwrQylib");
        ((ArrayList) term7937).add("ZWJgSttNjg");
        ((ArrayList) term7937).add("LQTIjJLkXH");
        ((ArrayList) term7937).add("RvkBwedFKx");
        ((ArrayList) term7937).add("DYzWJljbaE");
        ((ArrayList) term7937).add("idwbHVHUcz");
        ArrayList term8025 = new ArrayList();
        term7849 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term7912 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term7849, term7849.getClass(), "videoPreviewUrl", "bZrrPiMnsr");
        setField(term7849, term7849.getClass(), "messageChatId", "IeromvfDmz");
        setField(term7849, term7849.getClass(), "allFilmCount", "");
        setField(term7849, term7849.getClass(), "haveMagnentCount", "");
        setField(term7849, term7849.getClass(), "visitUrl", "");
        setField(term7849, term7849.getClass(), "bigImgUrl", "");
        setField(term7849, term7849.getClass(), "titleStr", "");
        setField(term7849, term7849.getClass(), "code", "");
        setField(term7849, term7849.getClass(), "publishDate", "");
        setField(term7849, term7849.getClass(), "totalTime", "");
        setField(term7849, term7849.getClass(), "director", "");
        setField(term7849, term7849.getClass(), "produceCompany", "");
        setField(term7849, term7849.getClass(), "publishCompany", "");
        setField(term7849, term7849.getClass(), "series", "");
        setField(term7849, term7849.getClass(), "types", "");
        setField(term7849, term7849.getClass(), "stars", "");
        setField(term7849, term7849.getClass(), "starsPageUrls", term7902);
        setField(term7912, term7912.getClass(), "starName", "JiSIFtJnYv");
        setField(term7912, term7912.getClass(), "startPageUrl", "wxAHQRVgKc");
        setField(term7849, term7849.getClass(), "mainStarPageUrl", term7912);
        setField(term7849, term7849.getClass(), "sampleImgs", term7937);
        setField(term7849, term7849.getClass(), "magnents", term8025);
        setIntField(term7849, term7849.getClass(), "fetchRetry", 1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProduceCompany", argTypes, term7849, args);
    }

};


