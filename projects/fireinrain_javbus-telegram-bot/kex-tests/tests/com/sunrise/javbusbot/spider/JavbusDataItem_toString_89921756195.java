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

public class JavbusDataItem_toString_89921756195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15318;

    public JavbusDataItem_toString_89921756195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15318 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        setField(term15318, term15318.getClass(), "videoPreviewUrl", null);
        setField(term15318, term15318.getClass(), "messageChatId", null);
        setField(term15318, term15318.getClass(), "allFilmCount", null);
        setField(term15318, term15318.getClass(), "haveMagnentCount", null);
        setField(term15318, term15318.getClass(), "visitUrl", null);
        setField(term15318, term15318.getClass(), "bigImgUrl", null);
        setField(term15318, term15318.getClass(), "titleStr", null);
        setField(term15318, term15318.getClass(), "code", null);
        setField(term15318, term15318.getClass(), "publishDate", null);
        setField(term15318, term15318.getClass(), "totalTime", null);
        setField(term15318, term15318.getClass(), "director", null);
        setField(term15318, term15318.getClass(), "produceCompany", null);
        setField(term15318, term15318.getClass(), "publishCompany", null);
        setField(term15318, term15318.getClass(), "series", null);
        setField(term15318, term15318.getClass(), "types", null);
        setField(term15318, term15318.getClass(), "stars", null);
        setField(term15318, term15318.getClass(), "starsPageUrls", null);
        setField(term15318, term15318.getClass(), "mainStarPageUrl", null);
        setField(term15318, term15318.getClass(), "sampleImgs", null);
        setField(term15318, term15318.getClass(), "magnents", null);
        setIntField(term15318, term15318.getClass(), "fetchRetry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15318, args);
    }

};


