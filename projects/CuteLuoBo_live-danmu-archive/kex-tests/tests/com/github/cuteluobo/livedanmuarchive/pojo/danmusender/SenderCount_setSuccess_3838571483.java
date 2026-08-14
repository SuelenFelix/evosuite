package com.github.cuteluobo.livedanmuarchive.pojo.danmusender;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.danmusender.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SenderCount_setSuccess_3838571483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term875;
     Object term882;

    public SenderCount_setSuccess_3838571483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term875 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount"));
        Object term876 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term878 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term880 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term876, term876.getClass(), "value", 0);
        setField(term875, term875.getClass(), "success", term876);
        setIntField(term878, term878.getClass(), "value", 0);
        setField(term875, term875.getClass(), "fail", term878);
        setIntField(term880, term880.getClass(), "value", 0);
        setField(term875, term875.getClass(), "total", term880);
        term882 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term882, term882.getClass(), "value", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicInteger");
        Object[] args = new Object[1];
        args[0] = term882;
        callMethod(klass, "setSuccess", argTypes, term875, args);
    }

};


