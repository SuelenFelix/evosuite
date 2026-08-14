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

public class SenderCount_getTotal_14207207136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900;

    public SenderCount_getTotal_14207207136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term900 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount"));
        Object term901 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term903 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term905 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term901, term901.getClass(), "value", 0);
        setField(term900, term900.getClass(), "success", term901);
        setIntField(term903, term903.getClass(), "value", 0);
        setField(term900, term900.getClass(), "fail", term903);
        setIntField(term905, term905.getClass(), "value", 0);
        setField(term900, term900.getClass(), "total", term905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotal", argTypes, term900, args);
    }

};


