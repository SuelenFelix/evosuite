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

public class JavbusDataItem_setBigImgUrl_165145497962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15250;

    public JavbusDataItem_setBigImgUrl_165145497962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15250 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        setField(term15250, term15250.getClass(), "videoPreviewUrl", null);
        setField(term15250, term15250.getClass(), "messageChatId", null);
        setField(term15250, term15250.getClass(), "allFilmCount", null);
        setField(term15250, term15250.getClass(), "haveMagnentCount", null);
        setField(term15250, term15250.getClass(), "visitUrl", null);
        setField(term15250, term15250.getClass(), "bigImgUrl", null);
        setField(term15250, term15250.getClass(), "titleStr", null);
        setField(term15250, term15250.getClass(), "code", null);
        setField(term15250, term15250.getClass(), "publishDate", null);
        setField(term15250, term15250.getClass(), "totalTime", null);
        setField(term15250, term15250.getClass(), "director", null);
        setField(term15250, term15250.getClass(), "produceCompany", null);
        setField(term15250, term15250.getClass(), "publishCompany", null);
        setField(term15250, term15250.getClass(), "series", null);
        setField(term15250, term15250.getClass(), "types", null);
        setField(term15250, term15250.getClass(), "stars", null);
        setField(term15250, term15250.getClass(), "starsPageUrls", null);
        setField(term15250, term15250.getClass(), "mainStarPageUrl", null);
        setField(term15250, term15250.getClass(), "sampleImgs", null);
        setField(term15250, term15250.getClass(), "magnents", null);
        setIntField(term15250, term15250.getClass(), "fetchRetry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBigImgUrl", argTypes, term15250, args);
    }

};


