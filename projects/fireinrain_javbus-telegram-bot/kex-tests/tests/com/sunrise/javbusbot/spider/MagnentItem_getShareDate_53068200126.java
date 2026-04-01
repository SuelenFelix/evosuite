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

public class MagnentItem_getShareDate_53068200126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22938;

    public MagnentItem_getShareDate_53068200126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22938 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term22938, term22938.getClass(), "title", null);
        setField(term22938, term22938.getClass(), "resolution", null);
        setField(term22938, term22938.getClass(), "subTitle", null);
        setField(term22938, term22938.getClass(), "fileSize", null);
        setField(term22938, term22938.getClass(), "shareDate", null);
        setField(term22938, term22938.getClass(), "magnentStr", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.MagnentItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShareDate", argTypes, term22938, args);
    }

};


