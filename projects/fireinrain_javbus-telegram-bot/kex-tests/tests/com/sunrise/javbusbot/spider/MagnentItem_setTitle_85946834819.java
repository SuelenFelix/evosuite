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

public class MagnentItem_setTitle_85946834819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22931;

    public MagnentItem_setTitle_85946834819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22931 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term22931, term22931.getClass(), "title", null);
        setField(term22931, term22931.getClass(), "resolution", null);
        setField(term22931, term22931.getClass(), "subTitle", null);
        setField(term22931, term22931.getClass(), "fileSize", null);
        setField(term22931, term22931.getClass(), "shareDate", null);
        setField(term22931, term22931.getClass(), "magnentStr", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term22931, args);
    }

};


