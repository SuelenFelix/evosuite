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

public class JavbusStarInfoItem_getHips_136855608120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17328;

    public JavbusStarInfoItem_getHips_136855608120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17328 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term17328, term17328.getClass(), "messageChatId", "YPVZjrbvVl");
        setField(term17328, term17328.getClass(), "allFilmNum", "TWsXTUTREq");
        setField(term17328, term17328.getClass(), "hasMagNum", "tVsPWASlsh");
        setField(term17328, term17328.getClass(), "headPhoto", "");
        setField(term17328, term17328.getClass(), "starName", "");
        setField(term17328, term17328.getClass(), "birthday", "");
        setField(term17328, term17328.getClass(), "age", "");
        setField(term17328, term17328.getClass(), "height", "");
        setField(term17328, term17328.getClass(), "cup", "");
        setField(term17328, term17328.getClass(), "chestCircumference", "");
        setField(term17328, term17328.getClass(), "waistline", "");
        setField(term17328, term17328.getClass(), "hips", "");
        setField(term17328, term17328.getClass(), "birthPlace", "");
        setField(term17328, term17328.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHips", argTypes, term17328, args);
    }

};


