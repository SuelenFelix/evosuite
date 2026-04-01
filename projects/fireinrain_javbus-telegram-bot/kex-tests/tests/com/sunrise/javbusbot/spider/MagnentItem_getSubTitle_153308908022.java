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

public class MagnentItem_getSubTitle_153308908022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22934;

    public MagnentItem_getSubTitle_153308908022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22934 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term22934, term22934.getClass(), "title", null);
        setField(term22934, term22934.getClass(), "resolution", null);
        setField(term22934, term22934.getClass(), "subTitle", null);
        setField(term22934, term22934.getClass(), "fileSize", null);
        setField(term22934, term22934.getClass(), "shareDate", null);
        setField(term22934, term22934.getClass(), "magnentStr", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubTitle", argTypes, term22934, args);
    }

};


