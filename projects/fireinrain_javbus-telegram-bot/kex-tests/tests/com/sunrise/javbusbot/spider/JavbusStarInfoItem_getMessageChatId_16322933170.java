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

public class JavbusStarInfoItem_getMessageChatId_16322933170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15328;

    public JavbusStarInfoItem_getMessageChatId_16322933170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15328 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term15328, term15328.getClass(), "messageChatId", "BixZhUjVme");
        setField(term15328, term15328.getClass(), "allFilmNum", "BmnUezUoWz");
        setField(term15328, term15328.getClass(), "hasMagNum", "QqeCgeRpIS");
        setField(term15328, term15328.getClass(), "headPhoto", "");
        setField(term15328, term15328.getClass(), "starName", "");
        setField(term15328, term15328.getClass(), "birthday", "");
        setField(term15328, term15328.getClass(), "age", "");
        setField(term15328, term15328.getClass(), "height", "");
        setField(term15328, term15328.getClass(), "cup", "");
        setField(term15328, term15328.getClass(), "chestCircumference", "");
        setField(term15328, term15328.getClass(), "waistline", "");
        setField(term15328, term15328.getClass(), "hips", "");
        setField(term15328, term15328.getClass(), "birthPlace", "");
        setField(term15328, term15328.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessageChatId", argTypes, term15328, args);
    }

};


