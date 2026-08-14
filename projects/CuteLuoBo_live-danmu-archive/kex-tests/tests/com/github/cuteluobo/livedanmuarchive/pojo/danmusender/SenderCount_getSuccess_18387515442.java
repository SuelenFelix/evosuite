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

public class SenderCount_getSuccess_18387515442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;

    public SenderCount_getSuccess_18387515442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term868 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount"));
        Object term869 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term871 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term873 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term869, term869.getClass(), "value", 0);
        setField(term868, term868.getClass(), "success", term869);
        setIntField(term871, term871.getClass(), "value", 0);
        setField(term868, term868.getClass(), "fail", term871);
        setIntField(term873, term873.getClass(), "value", 0);
        setField(term868, term868.getClass(), "total", term873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccess", argTypes, term868, args);
    }

};


