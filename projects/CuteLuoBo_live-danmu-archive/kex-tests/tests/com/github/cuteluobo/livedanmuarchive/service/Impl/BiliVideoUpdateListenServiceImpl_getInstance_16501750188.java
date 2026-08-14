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

public class BiliVideoUpdateListenServiceImpl_getInstance_16501750188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11878;

    public BiliVideoUpdateListenServiceImpl_getInstance_16501750188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11878 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.BiliVideoUpdateListenServiceImpl"));
        setField(term11878, term11878.getClass(), "cookie", null);
        setIntField(term11878, term11878.getClass(), "delaySeconds", 0);
        setField(term11878, term11878.getClass(), "taskMap", null);
        setField(term11878, term11878.getClass(), "pool", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.BiliVideoUpdateListenServiceImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstance", argTypes, term11878, args);
    }

};


