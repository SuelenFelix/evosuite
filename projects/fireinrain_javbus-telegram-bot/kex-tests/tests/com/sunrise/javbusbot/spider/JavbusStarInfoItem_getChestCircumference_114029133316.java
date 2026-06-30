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

public class JavbusStarInfoItem_getChestCircumference_114029133316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16928;

    public JavbusStarInfoItem_getChestCircumference_114029133316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16928 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term16928, term16928.getClass(), "messageChatId", "MFSosHURtm");
        setField(term16928, term16928.getClass(), "allFilmNum", "hIBYlJpYye");
        setField(term16928, term16928.getClass(), "hasMagNum", "LNendOzJhj");
        setField(term16928, term16928.getClass(), "headPhoto", "");
        setField(term16928, term16928.getClass(), "starName", "");
        setField(term16928, term16928.getClass(), "birthday", "");
        setField(term16928, term16928.getClass(), "age", "");
        setField(term16928, term16928.getClass(), "height", "");
        setField(term16928, term16928.getClass(), "cup", "");
        setField(term16928, term16928.getClass(), "chestCircumference", "");
        setField(term16928, term16928.getClass(), "waistline", "");
        setField(term16928, term16928.getClass(), "hips", "");
        setField(term16928, term16928.getClass(), "birthPlace", "");
        setField(term16928, term16928.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChestCircumference", argTypes, term16928, args);
    }

};


