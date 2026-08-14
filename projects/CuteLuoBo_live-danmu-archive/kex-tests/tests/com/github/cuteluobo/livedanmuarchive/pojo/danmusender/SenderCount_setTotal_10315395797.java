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

public class SenderCount_setTotal_10315395797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term907;
     Object term914;

    public SenderCount_setTotal_10315395797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term907 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount"));
        Object term908 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term910 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term912 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term908, term908.getClass(), "value", 0);
        setField(term907, term907.getClass(), "success", term908);
        setIntField(term910, term910.getClass(), "value", 0);
        setField(term907, term907.getClass(), "fail", term910);
        setIntField(term912, term912.getClass(), "value", 0);
        setField(term907, term907.getClass(), "total", term912);
        term914 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term914, term914.getClass(), "value", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicInteger");
        Object[] args = new Object[1];
        args[0] = term914;
        callMethod(klass, "setTotal", argTypes, term907, args);
    }

};


