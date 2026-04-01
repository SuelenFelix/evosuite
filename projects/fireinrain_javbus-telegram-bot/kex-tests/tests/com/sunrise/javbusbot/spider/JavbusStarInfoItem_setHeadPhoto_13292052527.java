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

public class JavbusStarInfoItem_setHeadPhoto_13292052527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18017;

    public JavbusStarInfoItem_setHeadPhoto_13292052527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18017 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term18017, term18017.getClass(), "messageChatId", "loCxNBoGfW");
        setField(term18017, term18017.getClass(), "allFilmNum", "PGVYUjJrZh");
        setField(term18017, term18017.getClass(), "hasMagNum", "OHliEqVque");
        setField(term18017, term18017.getClass(), "headPhoto", "");
        setField(term18017, term18017.getClass(), "starName", "");
        setField(term18017, term18017.getClass(), "birthday", "");
        setField(term18017, term18017.getClass(), "age", "");
        setField(term18017, term18017.getClass(), "height", "");
        setField(term18017, term18017.getClass(), "cup", "");
        setField(term18017, term18017.getClass(), "chestCircumference", "");
        setField(term18017, term18017.getClass(), "waistline", "");
        setField(term18017, term18017.getClass(), "hips", "");
        setField(term18017, term18017.getClass(), "birthPlace", "");
        setField(term18017, term18017.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kQWmmbQQqu";
        callMethod(klass, "setHeadPhoto", argTypes, term18017, args);
    }

};


