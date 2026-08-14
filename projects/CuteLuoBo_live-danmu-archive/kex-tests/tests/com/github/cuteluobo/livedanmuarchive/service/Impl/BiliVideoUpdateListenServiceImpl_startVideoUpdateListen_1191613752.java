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
import java.util.HashMap;

public class BiliVideoUpdateListenServiceImpl_startVideoUpdateListen_1191613752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11667;

    public BiliVideoUpdateListenServiceImpl_startVideoUpdateListen_1191613752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11681 = new HashMap();
        term11667 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.BiliVideoUpdateListenServiceImpl"));
        setField(term11667, term11667.getClass(), "cookie", "BbNeQJpYPr");
        setIntField(term11667, term11667.getClass(), "delaySeconds", -525257914);
        setField(term11667, term11667.getClass(), "taskMap", term11681);
        setField(term11667, term11667.getClass(), "pool", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.BiliVideoUpdateListenServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "riMtzCoxNj";
        callMethod(klass, "startVideoUpdateListen", argTypes, term11667, args);
    }

};


