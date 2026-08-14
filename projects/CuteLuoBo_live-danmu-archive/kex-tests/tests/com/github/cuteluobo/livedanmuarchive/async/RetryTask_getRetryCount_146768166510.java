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

public class RetryTask_getRetryCount_146768166510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1761;

    public RetryTask_getRetryCount_146768166510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1761 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.RetryTask"));
        setField(term1761, term1761.getClass(), "task", null);
        setIntField(term1761, term1761.getClass(), "retryCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.RetryTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRetryCount", argTypes, term1761, args);
    }

};


