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

public class DelaySampleImgPush_compareTo_164195064212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20916;

    public DelaySampleImgPush_compareTo_164195064212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20916 = newInstance(Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush"));
        setField(term20916, term20916.getClass(), "code", null);
        setField(term20916, term20916.getClass(), "javbusDataItem", null);
        setLongField(term20916, term20916.getClass(), "excuteTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.Delayed");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "compareTo", argTypes, term20916, args);
    }

};


