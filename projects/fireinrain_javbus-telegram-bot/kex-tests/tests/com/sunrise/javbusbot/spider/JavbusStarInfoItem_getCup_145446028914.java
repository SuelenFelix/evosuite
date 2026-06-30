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

public class JavbusStarInfoItem_getCup_145446028914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16728;

    public JavbusStarInfoItem_getCup_145446028914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16728 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term16728, term16728.getClass(), "messageChatId", "AGaeaoutjJ");
        setField(term16728, term16728.getClass(), "allFilmNum", "oHWSUbpGiK");
        setField(term16728, term16728.getClass(), "hasMagNum", "RreVzKmtxf");
        setField(term16728, term16728.getClass(), "headPhoto", "");
        setField(term16728, term16728.getClass(), "starName", "");
        setField(term16728, term16728.getClass(), "birthday", "");
        setField(term16728, term16728.getClass(), "age", "");
        setField(term16728, term16728.getClass(), "height", "");
        setField(term16728, term16728.getClass(), "cup", "");
        setField(term16728, term16728.getClass(), "chestCircumference", "");
        setField(term16728, term16728.getClass(), "waistline", "");
        setField(term16728, term16728.getClass(), "hips", "");
        setField(term16728, term16728.getClass(), "birthPlace", "");
        setField(term16728, term16728.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCup", argTypes, term16728, args);
    }

};


