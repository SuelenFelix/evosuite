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

public class JavbusDataItem_toPrettySampleImgs_28006143297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15322;

    public JavbusDataItem_toPrettySampleImgs_28006143297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15322 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        setField(term15322, term15322.getClass(), "videoPreviewUrl", null);
        setField(term15322, term15322.getClass(), "messageChatId", null);
        setField(term15322, term15322.getClass(), "allFilmCount", null);
        setField(term15322, term15322.getClass(), "haveMagnentCount", null);
        setField(term15322, term15322.getClass(), "visitUrl", null);
        setField(term15322, term15322.getClass(), "bigImgUrl", null);
        setField(term15322, term15322.getClass(), "titleStr", null);
        setField(term15322, term15322.getClass(), "code", null);
        setField(term15322, term15322.getClass(), "publishDate", null);
        setField(term15322, term15322.getClass(), "totalTime", null);
        setField(term15322, term15322.getClass(), "director", null);
        setField(term15322, term15322.getClass(), "produceCompany", null);
        setField(term15322, term15322.getClass(), "publishCompany", null);
        setField(term15322, term15322.getClass(), "series", null);
        setField(term15322, term15322.getClass(), "types", null);
        setField(term15322, term15322.getClass(), "stars", null);
        setField(term15322, term15322.getClass(), "starsPageUrls", null);
        setField(term15322, term15322.getClass(), "mainStarPageUrl", null);
        setField(term15322, term15322.getClass(), "sampleImgs", null);
        setField(term15322, term15322.getClass(), "magnents", null);
        setIntField(term15322, term15322.getClass(), "fetchRetry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toPrettySampleImgs", argTypes, term15322, args);
    }

};


