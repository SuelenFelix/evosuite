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

public class MagnentItem_getResolution_114599398820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22932;

    public MagnentItem_getResolution_114599398820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22932 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term22932, term22932.getClass(), "title", null);
        setField(term22932, term22932.getClass(), "resolution", null);
        setField(term22932, term22932.getClass(), "subTitle", null);
        setField(term22932, term22932.getClass(), "fileSize", null);
        setField(term22932, term22932.getClass(), "shareDate", null);
        setField(term22932, term22932.getClass(), "magnentStr", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResolution", argTypes, term22932, args);
    }

};


