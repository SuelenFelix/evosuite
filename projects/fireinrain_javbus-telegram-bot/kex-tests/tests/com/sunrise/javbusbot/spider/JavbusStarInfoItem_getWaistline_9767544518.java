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

public class JavbusStarInfoItem_getWaistline_9767544518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17128;

    public JavbusStarInfoItem_getWaistline_9767544518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17128 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem"));
        setField(term17128, term17128.getClass(), "messageChatId", "UueEixdrss");
        setField(term17128, term17128.getClass(), "allFilmNum", "ceafBXJyBB");
        setField(term17128, term17128.getClass(), "hasMagNum", "VNHIbCXqhH");
        setField(term17128, term17128.getClass(), "headPhoto", "");
        setField(term17128, term17128.getClass(), "starName", "");
        setField(term17128, term17128.getClass(), "birthday", "");
        setField(term17128, term17128.getClass(), "age", "");
        setField(term17128, term17128.getClass(), "height", "");
        setField(term17128, term17128.getClass(), "cup", "");
        setField(term17128, term17128.getClass(), "chestCircumference", "");
        setField(term17128, term17128.getClass(), "waistline", "");
        setField(term17128, term17128.getClass(), "hips", "");
        setField(term17128, term17128.getClass(), "birthPlace", "");
        setField(term17128, term17128.getClass(), "hobby", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusStarInfoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWaistline", argTypes, term17128, args);
    }

};


