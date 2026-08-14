package com.github.cuteluobo.livedanmuarchive.async;

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
import static com.github.cuteluobo.livedanmuarchive.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AbstractDanMuSender_setSenderCount_164963024611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2127;

    public AbstractDanMuSender_setSenderCount_164963024611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2127 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount"));
        Object term2128 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term2130 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term2132 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term2128, term2128.getClass(), "value", 0);
        setField(term2127, term2127.getClass(), "success", term2128);
        setIntField(term2130, term2130.getClass(), "value", 0);
        setField(term2127, term2127.getClass(), "fail", term2130);
        setIntField(term2132, term2132.getClass(), "value", 0);
        setField(term2127, term2127.getClass(), "total", term2132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.AbstractDanMuSender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.danmusender.SenderCount");
        Object[] args = new Object[1];
        args[0] = term2127;
        callMethod(klass, "setSenderCount", argTypes, null, args);
    }

};


