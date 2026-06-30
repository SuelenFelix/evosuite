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

public class JavbusStarInfoItem_getBirthPlace_18012709322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17528;

    public JavbusStarInfoItem_getBirthPlace_18012709322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17528 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term17528, term17528.getClass(), "messageChatId", "dcGBEVfYLI");
        setField(term17528, term17528.getClass(), "allFilmNum", "AbYQkbUCWK");
        setField(term17528, term17528.getClass(), "hasMagNum", "PjENVjWdrp");
        setField(term17528, term17528.getClass(), "headPhoto", "");
        setField(term17528, term17528.getClass(), "starName", "");
        setField(term17528, term17528.getClass(), "birthday", "");
        setField(term17528, term17528.getClass(), "age", "");
        setField(term17528, term17528.getClass(), "height", "");
        setField(term17528, term17528.getClass(), "cup", "");
        setField(term17528, term17528.getClass(), "chestCircumference", "");
        setField(term17528, term17528.getClass(), "waistline", "");
        setField(term17528, term17528.getClass(), "hips", "");
        setField(term17528, term17528.getClass(), "birthPlace", "");
        setField(term17528, term17528.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthPlace", argTypes, term17528, args);
    }

};


