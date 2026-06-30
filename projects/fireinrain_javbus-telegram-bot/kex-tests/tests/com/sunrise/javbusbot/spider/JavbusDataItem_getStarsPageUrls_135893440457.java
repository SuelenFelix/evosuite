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

public class JavbusDataItem_getStarsPageUrls_135893440457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15240;

    public JavbusDataItem_getStarsPageUrls_135893440457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15240 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        setField(term15240, term15240.getClass(), "videoPreviewUrl", null);
        setField(term15240, term15240.getClass(), "messageChatId", null);
        setField(term15240, term15240.getClass(), "allFilmCount", null);
        setField(term15240, term15240.getClass(), "haveMagnentCount", null);
        setField(term15240, term15240.getClass(), "visitUrl", null);
        setField(term15240, term15240.getClass(), "bigImgUrl", null);
        setField(term15240, term15240.getClass(), "titleStr", null);
        setField(term15240, term15240.getClass(), "code", null);
        setField(term15240, term15240.getClass(), "publishDate", null);
        setField(term15240, term15240.getClass(), "totalTime", null);
        setField(term15240, term15240.getClass(), "director", null);
        setField(term15240, term15240.getClass(), "produceCompany", null);
        setField(term15240, term15240.getClass(), "publishCompany", null);
        setField(term15240, term15240.getClass(), "series", null);
        setField(term15240, term15240.getClass(), "types", null);
        setField(term15240, term15240.getClass(), "stars", null);
        setField(term15240, term15240.getClass(), "starsPageUrls", null);
        setField(term15240, term15240.getClass(), "mainStarPageUrl", null);
        setField(term15240, term15240.getClass(), "sampleImgs", null);
        setField(term15240, term15240.getClass(), "magnents", null);
        setIntField(term15240, term15240.getClass(), "fetchRetry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarsPageUrls", argTypes, term15240, args);
    }

};


