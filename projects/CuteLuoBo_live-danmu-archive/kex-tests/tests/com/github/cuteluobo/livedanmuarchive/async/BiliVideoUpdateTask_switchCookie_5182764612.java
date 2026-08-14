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

public class BiliVideoUpdateTask_switchCookie_5182764612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1625;

    public BiliVideoUpdateTask_switchCookie_5182764612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1625 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask"));
        setField(term1625, term1625.getClass(), "logger", null);
        setField(term1625, term1625.getClass(), "latest", null);
        setField(term1625, term1625.getClass(), "cookie", null);
        setField(term1625, term1625.getClass(), "baseUserInfo", null);
        setField(term1625, term1625.getClass(), "uid", null);
        setField(term1625, term1625.getClass(), "tagMatch", null);
        setField(term1625, term1625.getClass(), "titleMatch", null);
        setField(term1625, term1625.getClass(), "videoPartTimeRegular", null);
        setField(term1625, term1625.getClass(), "videoPartTimeFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.BiliVideoUpdateTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "switchCookie", argTypes, term1625, args);
    }

};


