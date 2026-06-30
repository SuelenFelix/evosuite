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
import java.lang.Long;

public class DelaySampleImgPush_setExcuteTime_133316263918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20928;
     Object term20930;

    public DelaySampleImgPush_setExcuteTime_133316263918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20928 = newInstance(Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush"));
        setField(term20928, term20928.getClass(), "code", null);
        setField(term20928, term20928.getClass(), "javbusDataItem", null);
        setLongField(term20928, term20928.getClass(), "excuteTime", 0L);
        term20930 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term20930;
        callMethod(klass, "setExcuteTime", argTypes, term20928, args);
    }

};


