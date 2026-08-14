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

public class SenderCount_setFail_16249773155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;
     Object term898;

    public SenderCount_setFail_16249773155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term891 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount"));
        Object term892 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term894 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term896 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term892, term892.getClass(), "value", 0);
        setField(term891, term891.getClass(), "success", term892);
        setIntField(term894, term894.getClass(), "value", 0);
        setField(term891, term891.getClass(), "fail", term894);
        setIntField(term896, term896.getClass(), "value", 0);
        setField(term891, term891.getClass(), "total", term896);
        term898 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term898, term898.getClass(), "value", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.concurrent.atomic.AtomicInteger");
        Object[] args = new Object[1];
        args[0] = term898;
        callMethod(klass, "setFail", argTypes, term891, args);
    }

};


