package com.github.cuteluobo.livedanmuarchive.service.Impl;

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
import static com.github.cuteluobo.livedanmuarchive.service.Impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BiliVideoUpdateListenServiceImpl_setCookie_198795518413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11888;

    public BiliVideoUpdateListenServiceImpl_setCookie_198795518413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11888 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.BiliVideoUpdateListenServiceImpl"));
        setField(term11888, term11888.getClass(), "cookie", null);
        setIntField(term11888, term11888.getClass(), "delaySeconds", 0);
        setField(term11888, term11888.getClass(), "taskMap", null);
        setField(term11888, term11888.getClass(), "pool", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.BiliVideoUpdateListenServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCookie", argTypes, term11888, args);
    }

};


