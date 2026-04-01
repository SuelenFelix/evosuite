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

public class JavbusDataItem_setVisitUrl_32144636938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11850;

    public JavbusDataItem_setVisitUrl_32144636938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11905 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11905, term11905.getClass(), "starName", "");
        setField(term11905, term11905.getClass(), "startPageUrl", "");
        Object term11908 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11908, term11908.getClass(), "starName", "");
        setField(term11908, term11908.getClass(), "startPageUrl", "");
        Object term11911 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11911, term11911.getClass(), "starName", "");
        setField(term11911, term11911.getClass(), "startPageUrl", "");
        Object term11914 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11914, term11914.getClass(), "starName", "");
        setField(term11914, term11914.getClass(), "startPageUrl", "");
        Object term11917 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11917, term11917.getClass(), "starName", "");
        setField(term11917, term11917.getClass(), "startPageUrl", "");
        Object term11920 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11920, term11920.getClass(), "starName", "");
        setField(term11920, term11920.getClass(), "startPageUrl", "");
        ArrayList term11903 = new ArrayList();
        ((ArrayList) term11903).add(term11905);
        ((ArrayList) term11903).add(term11908);
        ((ArrayList) term11903).add(term11911);
        ((ArrayList) term11903).add(term11914);
        ((ArrayList) term11903).add(term11917);
        ((ArrayList) term11903).add(term11920);
        ArrayList term11950 = new ArrayList();
        ((ArrayList) term11950).add("KnclcuNYRb");
        ((ArrayList) term11950).add("UDZJbJPmCC");
        ((ArrayList) term11950).add("oVkgUUfHis");
        ((ArrayList) term11950).add("hoCKQzIOhx");
        Object term12004 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term12004, term12004.getClass(), "title", "");
        setField(term12004, term12004.getClass(), "resolution", "");
        setField(term12004, term12004.getClass(), "subTitle", "");
        setField(term12004, term12004.getClass(), "fileSize", "");
        setField(term12004, term12004.getClass(), "shareDate", "");
        setField(term12004, term12004.getClass(), "magnentStr", "");
        ArrayList term12002 = new ArrayList();
        ((ArrayList) term12002).add(term12004);
        term11850 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term11925 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11850, term11850.getClass(), "videoPreviewUrl", "PWBggYjpOQ");
        setField(term11850, term11850.getClass(), "messageChatId", "FDzNpfjYDI");
        setField(term11850, term11850.getClass(), "allFilmCount", "");
        setField(term11850, term11850.getClass(), "haveMagnentCount", "");
        setField(term11850, term11850.getClass(), "visitUrl", "");
        setField(term11850, term11850.getClass(), "bigImgUrl", "");
        setField(term11850, term11850.getClass(), "titleStr", "");
        setField(term11850, term11850.getClass(), "code", "");
        setField(term11850, term11850.getClass(), "publishDate", "");
        setField(term11850, term11850.getClass(), "totalTime", "");
        setField(term11850, term11850.getClass(), "director", "");
        setField(term11850, term11850.getClass(), "produceCompany", "");
        setField(term11850, term11850.getClass(), "publishCompany", "");
        setField(term11850, term11850.getClass(), "series", "");
        setField(term11850, term11850.getClass(), "types", "");
        setField(term11850, term11850.getClass(), "stars", "");
        setField(term11850, term11850.getClass(), "starsPageUrls", term11903);
        setField(term11925, term11925.getClass(), "starName", "bMQUwQqyMc");
        setField(term11925, term11925.getClass(), "startPageUrl", "CVaGhXmAUN");
        setField(term11850, term11850.getClass(), "mainStarPageUrl", term11925);
        setField(term11850, term11850.getClass(), "sampleImgs", term11950);
        setField(term11850, term11850.getClass(), "magnents", term12002);
        setIntField(term11850, term11850.getClass(), "fetchRetry", 1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DpNDxwXKkX";
        callMethod(klass, "setVisitUrl", argTypes, term11850, args);
    }

};


