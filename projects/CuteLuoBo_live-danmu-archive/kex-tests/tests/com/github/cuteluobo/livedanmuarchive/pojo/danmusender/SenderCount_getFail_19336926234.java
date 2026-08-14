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

public class SenderCount_getFail_19336926234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884;

    public SenderCount_getFail_19336926234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount"));
        Object term885 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term887 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term889 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term885, term885.getClass(), "value", 0);
        setField(term884, term884.getClass(), "success", term885);
        setIntField(term887, term887.getClass(), "value", 0);
        setField(term884, term884.getClass(), "fail", term887);
        setIntField(term889, term889.getClass(), "value", 0);
        setField(term884, term884.getClass(), "total", term889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFail", argTypes, term884, args);
    }

};


