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

public class JavbusStarInfoItem_getAllFilmNum_17874661942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15528;

    public JavbusStarInfoItem_getAllFilmNum_17874661942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15528 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term15528, term15528.getClass(), "messageChatId", "OxlZVhvedR");
        setField(term15528, term15528.getClass(), "allFilmNum", "eoDtSQyUsr");
        setField(term15528, term15528.getClass(), "hasMagNum", "RMTgBohsAX");
        setField(term15528, term15528.getClass(), "headPhoto", "");
        setField(term15528, term15528.getClass(), "starName", "");
        setField(term15528, term15528.getClass(), "birthday", "");
        setField(term15528, term15528.getClass(), "age", "");
        setField(term15528, term15528.getClass(), "height", "");
        setField(term15528, term15528.getClass(), "cup", "");
        setField(term15528, term15528.getClass(), "chestCircumference", "");
        setField(term15528, term15528.getClass(), "waistline", "");
        setField(term15528, term15528.getClass(), "hips", "");
        setField(term15528, term15528.getClass(), "birthPlace", "");
        setField(term15528, term15528.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllFilmNum", argTypes, term15528, args);
    }

};


