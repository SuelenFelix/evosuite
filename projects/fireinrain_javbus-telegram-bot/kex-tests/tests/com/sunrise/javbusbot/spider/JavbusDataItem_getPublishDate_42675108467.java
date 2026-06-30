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

public class JavbusDataItem_getPublishDate_42675108467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15260;

    public JavbusDataItem_getPublishDate_42675108467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15260 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        setField(term15260, term15260.getClass(), "videoPreviewUrl", null);
        setField(term15260, term15260.getClass(), "messageChatId", null);
        setField(term15260, term15260.getClass(), "allFilmCount", null);
        setField(term15260, term15260.getClass(), "haveMagnentCount", null);
        setField(term15260, term15260.getClass(), "visitUrl", null);
        setField(term15260, term15260.getClass(), "bigImgUrl", null);
        setField(term15260, term15260.getClass(), "titleStr", null);
        setField(term15260, term15260.getClass(), "code", null);
        setField(term15260, term15260.getClass(), "publishDate", null);
        setField(term15260, term15260.getClass(), "totalTime", null);
        setField(term15260, term15260.getClass(), "director", null);
        setField(term15260, term15260.getClass(), "produceCompany", null);
        setField(term15260, term15260.getClass(), "publishCompany", null);
        setField(term15260, term15260.getClass(), "series", null);
        setField(term15260, term15260.getClass(), "types", null);
        setField(term15260, term15260.getClass(), "stars", null);
        setField(term15260, term15260.getClass(), "starsPageUrls", null);
        setField(term15260, term15260.getClass(), "mainStarPageUrl", null);
        setField(term15260, term15260.getClass(), "sampleImgs", null);
        setField(term15260, term15260.getClass(), "magnents", null);
        setIntField(term15260, term15260.getClass(), "fetchRetry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublishDate", argTypes, term15260, args);
    }

};


