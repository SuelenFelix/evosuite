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

public class JavbusDataItem_getSeries_172569104685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15296;

    public JavbusDataItem_getSeries_172569104685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15296 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        setField(term15296, term15296.getClass(), "videoPreviewUrl", null);
        setField(term15296, term15296.getClass(), "messageChatId", null);
        setField(term15296, term15296.getClass(), "allFilmCount", null);
        setField(term15296, term15296.getClass(), "haveMagnentCount", null);
        setField(term15296, term15296.getClass(), "visitUrl", null);
        setField(term15296, term15296.getClass(), "bigImgUrl", null);
        setField(term15296, term15296.getClass(), "titleStr", null);
        setField(term15296, term15296.getClass(), "code", null);
        setField(term15296, term15296.getClass(), "publishDate", null);
        setField(term15296, term15296.getClass(), "totalTime", null);
        setField(term15296, term15296.getClass(), "director", null);
        setField(term15296, term15296.getClass(), "produceCompany", null);
        setField(term15296, term15296.getClass(), "publishCompany", null);
        setField(term15296, term15296.getClass(), "series", null);
        setField(term15296, term15296.getClass(), "types", null);
        setField(term15296, term15296.getClass(), "stars", null);
        setField(term15296, term15296.getClass(), "starsPageUrls", null);
        setField(term15296, term15296.getClass(), "mainStarPageUrl", null);
        setField(term15296, term15296.getClass(), "sampleImgs", null);
        setField(term15296, term15296.getClass(), "magnents", null);
        setIntField(term15296, term15296.getClass(), "fetchRetry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeries", argTypes, term15296, args);
    }

};


