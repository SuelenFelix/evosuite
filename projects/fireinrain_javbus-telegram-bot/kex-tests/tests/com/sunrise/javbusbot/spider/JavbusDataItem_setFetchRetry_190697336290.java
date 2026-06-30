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
import java.lang.Integer;

public class JavbusDataItem_setFetchRetry_190697336290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15306;
     Object term15308;

    public JavbusDataItem_setFetchRetry_190697336290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15306 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        setField(term15306, term15306.getClass(), "videoPreviewUrl", null);
        setField(term15306, term15306.getClass(), "messageChatId", null);
        setField(term15306, term15306.getClass(), "allFilmCount", null);
        setField(term15306, term15306.getClass(), "haveMagnentCount", null);
        setField(term15306, term15306.getClass(), "visitUrl", null);
        setField(term15306, term15306.getClass(), "bigImgUrl", null);
        setField(term15306, term15306.getClass(), "titleStr", null);
        setField(term15306, term15306.getClass(), "code", null);
        setField(term15306, term15306.getClass(), "publishDate", null);
        setField(term15306, term15306.getClass(), "totalTime", null);
        setField(term15306, term15306.getClass(), "director", null);
        setField(term15306, term15306.getClass(), "produceCompany", null);
        setField(term15306, term15306.getClass(), "publishCompany", null);
        setField(term15306, term15306.getClass(), "series", null);
        setField(term15306, term15306.getClass(), "types", null);
        setField(term15306, term15306.getClass(), "stars", null);
        setField(term15306, term15306.getClass(), "starsPageUrls", null);
        setField(term15306, term15306.getClass(), "mainStarPageUrl", null);
        setField(term15306, term15306.getClass(), "sampleImgs", null);
        setField(term15306, term15306.getClass(), "magnents", null);
        setIntField(term15306, term15306.getClass(), "fetchRetry", 0);
        term15308 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15308;
        callMethod(klass, "setFetchRetry", argTypes, term15306, args);
    }

};


