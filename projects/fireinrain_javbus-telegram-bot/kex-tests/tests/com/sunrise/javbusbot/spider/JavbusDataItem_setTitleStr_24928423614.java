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

public class JavbusDataItem_setTitleStr_24928423614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5159;

    public JavbusDataItem_setTitleStr_24928423614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5212 = new ArrayList();
        ArrayList term5241 = new ArrayList();
        ((ArrayList) term5241).add("LvLbdICdfA");
        Object term5259 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term5259, term5259.getClass(), "title", "");
        setField(term5259, term5259.getClass(), "resolution", "");
        setField(term5259, term5259.getClass(), "subTitle", "");
        setField(term5259, term5259.getClass(), "fileSize", "");
        setField(term5259, term5259.getClass(), "shareDate", "");
        setField(term5259, term5259.getClass(), "magnentStr", "");
        Object term5266 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term5266, term5266.getClass(), "title", "");
        setField(term5266, term5266.getClass(), "resolution", "");
        setField(term5266, term5266.getClass(), "subTitle", "");
        setField(term5266, term5266.getClass(), "fileSize", "");
        setField(term5266, term5266.getClass(), "shareDate", "");
        setField(term5266, term5266.getClass(), "magnentStr", "");
        Object term5273 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term5273, term5273.getClass(), "title", "");
        setField(term5273, term5273.getClass(), "resolution", "");
        setField(term5273, term5273.getClass(), "subTitle", "");
        setField(term5273, term5273.getClass(), "fileSize", "");
        setField(term5273, term5273.getClass(), "shareDate", "");
        setField(term5273, term5273.getClass(), "magnentStr", "");
        Object term5280 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term5280, term5280.getClass(), "title", "");
        setField(term5280, term5280.getClass(), "resolution", "");
        setField(term5280, term5280.getClass(), "subTitle", "");
        setField(term5280, term5280.getClass(), "fileSize", "");
        setField(term5280, term5280.getClass(), "shareDate", "");
        setField(term5280, term5280.getClass(), "magnentStr", "");
        Object term5287 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term5287, term5287.getClass(), "title", "");
        setField(term5287, term5287.getClass(), "resolution", "");
        setField(term5287, term5287.getClass(), "subTitle", "");
        setField(term5287, term5287.getClass(), "fileSize", "");
        setField(term5287, term5287.getClass(), "shareDate", "");
        setField(term5287, term5287.getClass(), "magnentStr", "");
        ArrayList term5257 = new ArrayList();
        ((ArrayList) term5257).add(term5259);
        ((ArrayList) term5257).add(term5266);
        ((ArrayList) term5257).add(term5273);
        ((ArrayList) term5257).add(term5280);
        ((ArrayList) term5257).add(term5287);
        term5159 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term5216 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term5159, term5159.getClass(), "videoPreviewUrl", "QaoYFZhScg");
        setField(term5159, term5159.getClass(), "messageChatId", "UTvXIenLCR");
        setField(term5159, term5159.getClass(), "allFilmCount", "");
        setField(term5159, term5159.getClass(), "haveMagnentCount", "");
        setField(term5159, term5159.getClass(), "visitUrl", "");
        setField(term5159, term5159.getClass(), "bigImgUrl", "");
        setField(term5159, term5159.getClass(), "titleStr", "");
        setField(term5159, term5159.getClass(), "code", "");
        setField(term5159, term5159.getClass(), "publishDate", "");
        setField(term5159, term5159.getClass(), "totalTime", "");
        setField(term5159, term5159.getClass(), "director", "");
        setField(term5159, term5159.getClass(), "produceCompany", "");
        setField(term5159, term5159.getClass(), "publishCompany", "");
        setField(term5159, term5159.getClass(), "series", "");
        setField(term5159, term5159.getClass(), "types", "");
        setField(term5159, term5159.getClass(), "stars", "");
        setField(term5159, term5159.getClass(), "starsPageUrls", term5212);
        setField(term5216, term5216.getClass(), "starName", "PLeKpWaxhQ");
        setField(term5216, term5216.getClass(), "startPageUrl", "EBSKhqDdUW");
        setField(term5159, term5159.getClass(), "mainStarPageUrl", term5216);
        setField(term5159, term5159.getClass(), "sampleImgs", term5241);
        setField(term5159, term5159.getClass(), "magnents", term5257);
        setIntField(term5159, term5159.getClass(), "fetchRetry", 767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MzXzaqaiHW";
        callMethod(klass, "setTitleStr", argTypes, term5159, args);
    }

};


