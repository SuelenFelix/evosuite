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

public class RetryTask_decreaseRetryCount_20782944397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1755;

    public RetryTask_decreaseRetryCount_20782944397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1755 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.async.RetryTask"));
        setField(term1755, term1755.getClass(), "task", null);
        setIntField(term1755, term1755.getClass(), "retryCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.RetryTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "decreaseRetryCount", argTypes, term1755, args);
    }

};


