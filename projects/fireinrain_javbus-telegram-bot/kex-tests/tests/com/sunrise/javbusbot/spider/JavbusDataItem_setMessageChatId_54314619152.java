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

public class JavbusDataItem_setMessageChatId_54314619152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15230;

    public JavbusDataItem_setMessageChatId_54314619152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15230 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        setField(term15230, term15230.getClass(), "videoPreviewUrl", null);
        setField(term15230, term15230.getClass(), "messageChatId", null);
        setField(term15230, term15230.getClass(), "allFilmCount", null);
        setField(term15230, term15230.getClass(), "haveMagnentCount", null);
        setField(term15230, term15230.getClass(), "visitUrl", null);
        setField(term15230, term15230.getClass(), "bigImgUrl", null);
        setField(term15230, term15230.getClass(), "titleStr", null);
        setField(term15230, term15230.getClass(), "code", null);
        setField(term15230, term15230.getClass(), "publishDate", null);
        setField(term15230, term15230.getClass(), "totalTime", null);
        setField(term15230, term15230.getClass(), "director", null);
        setField(term15230, term15230.getClass(), "produceCompany", null);
        setField(term15230, term15230.getClass(), "publishCompany", null);
        setField(term15230, term15230.getClass(), "series", null);
        setField(term15230, term15230.getClass(), "types", null);
        setField(term15230, term15230.getClass(), "stars", null);
        setField(term15230, term15230.getClass(), "starsPageUrls", null);
        setField(term15230, term15230.getClass(), "mainStarPageUrl", null);
        setField(term15230, term15230.getClass(), "sampleImgs", null);
        setField(term15230, term15230.getClass(), "magnents", null);
        setIntField(term15230, term15230.getClass(), "fetchRetry", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMessageChatId", argTypes, term15230, args);
    }

};


