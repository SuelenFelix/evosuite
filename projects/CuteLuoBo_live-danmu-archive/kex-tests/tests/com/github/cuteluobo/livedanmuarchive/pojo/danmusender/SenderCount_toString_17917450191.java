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

public class SenderCount_toString_17917450191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861;

    public SenderCount_toString_17917450191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term861 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount"));
        Object term862 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term864 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term866 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term862, term862.getClass(), "value", 0);
        setField(term861, term861.getClass(), "success", term862);
        setIntField(term864, term864.getClass(), "value", 0);
        setField(term861, term861.getClass(), "fail", term864);
        setIntField(term866, term866.getClass(), "value", 0);
        setField(term861, term861.getClass(), "total", term866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term861, args);
    }

};


