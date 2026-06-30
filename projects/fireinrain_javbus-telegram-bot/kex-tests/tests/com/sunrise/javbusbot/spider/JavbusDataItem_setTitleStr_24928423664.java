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

public class JavbusDataItem_setTitleStr_24928423664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15254;

    public JavbusDataItem_setTitleStr_24928423664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15254 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        setField(term15254, term15254.getClass(), "videoPreviewUrl", null);
        setField(term15254, term15254.getClass(), "messageChatId", null);
        setField(term15254, term15254.getClass(), "allFilmCount", null);
        setField(term15254, term15254.getClass(), "haveMagnentCount", null);
        setField(term15254, term15254.getClass(), "visitUrl", null);
        setField(term15254, term15254.getClass(), "bigImgUrl", null);
        setField(term15254, term15254.getClass(), "titleStr", null);
        setField(term15254, term15254.getClass(), "code", null);
        setField(term15254, term15254.getClass(), "publishDate", null);
        setField(term15254, term15254.getClass(), "totalTime", null);
        setField(term15254, term15254.getClass(), "director", null);
        setField(term15254, term15254.getClass(), "produceCompany", null);
        setField(term15254, term15254.getClass(), "publishCompany", null);
        setField(term15254, term15254.getClass(), "series", null);
        setField(term15254, term15254.getClass(), "types", null);
        setField(term15254, term15254.getClass(), "stars", null);
        setField(term15254, term15254.getClass(), "starsPageUrls", null);
        setField(term15254, term15254.getClass(), "mainStarPageUrl", null);
        setField(term15254, term15254.getClass(), "sampleImgs", null);
        setField(term15254, term15254.getClass(), "magnents", null);
        setIntField(term15254, term15254.getClass(), "fetchRetry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitleStr", argTypes, term15254, args);
    }

};


