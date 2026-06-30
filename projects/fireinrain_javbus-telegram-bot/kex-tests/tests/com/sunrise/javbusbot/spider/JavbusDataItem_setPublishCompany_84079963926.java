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

public class JavbusDataItem_setPublishCompany_84079963926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8502;

    public JavbusDataItem_setPublishCompany_84079963926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8557 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term8557, term8557.getClass(), "starName", "");
        setField(term8557, term8557.getClass(), "startPageUrl", "");
        Object term8560 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term8560, term8560.getClass(), "starName", "");
        setField(term8560, term8560.getClass(), "startPageUrl", "");
        Object term8563 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term8563, term8563.getClass(), "starName", "");
        setField(term8563, term8563.getClass(), "startPageUrl", "");
        ArrayList term8555 = new ArrayList();
        ((ArrayList) term8555).add(term8557);
        ((ArrayList) term8555).add(term8560);
        ((ArrayList) term8555).add(term8563);
        ArrayList term8593 = new ArrayList();
        ((ArrayList) term8593).add("KJSTLGsSvO");
        ((ArrayList) term8593).add("kSkiIpaepq");
        ((ArrayList) term8593).add("FzJhDecyvI");
        ((ArrayList) term8593).add("zOxseYMSdY");
        Object term8647 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term8647, term8647.getClass(), "title", "");
        setField(term8647, term8647.getClass(), "resolution", "");
        setField(term8647, term8647.getClass(), "subTitle", "");
        setField(term8647, term8647.getClass(), "fileSize", "");
        setField(term8647, term8647.getClass(), "shareDate", "");
        setField(term8647, term8647.getClass(), "magnentStr", "");
        ArrayList term8645 = new ArrayList();
        ((ArrayList) term8645).add(term8647);
        term8502 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term8568 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term8502, term8502.getClass(), "videoPreviewUrl", "SOJpgWUZCf");
        setField(term8502, term8502.getClass(), "messageChatId", "jgywFOzBDw");
        setField(term8502, term8502.getClass(), "allFilmCount", "");
        setField(term8502, term8502.getClass(), "haveMagnentCount", "");
        setField(term8502, term8502.getClass(), "visitUrl", "");
        setField(term8502, term8502.getClass(), "bigImgUrl", "");
        setField(term8502, term8502.getClass(), "titleStr", "");
        setField(term8502, term8502.getClass(), "code", "");
        setField(term8502, term8502.getClass(), "publishDate", "");
        setField(term8502, term8502.getClass(), "totalTime", "");
        setField(term8502, term8502.getClass(), "director", "");
        setField(term8502, term8502.getClass(), "produceCompany", "");
        setField(term8502, term8502.getClass(), "publishCompany", "");
        setField(term8502, term8502.getClass(), "series", "");
        setField(term8502, term8502.getClass(), "types", "");
        setField(term8502, term8502.getClass(), "stars", "");
        setField(term8502, term8502.getClass(), "starsPageUrls", term8555);
        setField(term8568, term8568.getClass(), "starName", "CoqUcmjnkF");
        setField(term8568, term8568.getClass(), "startPageUrl", "oOrXvGaFwa");
        setField(term8502, term8502.getClass(), "mainStarPageUrl", term8568);
        setField(term8502, term8502.getClass(), "sampleImgs", term8593);
        setField(term8502, term8502.getClass(), "magnents", term8645);
        setIntField(term8502, term8502.getClass(), "fetchRetry", 2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fSNUaokVWs";
        callMethod(klass, "setPublishCompany", argTypes, term8502, args);
    }

};


