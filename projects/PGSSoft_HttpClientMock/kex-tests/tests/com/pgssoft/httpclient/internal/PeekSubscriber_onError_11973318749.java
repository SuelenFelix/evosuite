package com.pgssoft.httpclient.internal;

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
import static com.pgssoft.httpclient.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PeekSubscriber_onError_11973318749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8729;

    public PeekSubscriber_onError_11973318749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8729 = newInstance(Class.forName("com.pgssoft.httpclient.internal.PeekSubscriber"));
        setField(term8729, term8729.getClass(), "subscription", null);
        setField(term8729, term8729.getClass(), "content", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.PeekSubscriber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Throwable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onError", argTypes, term8729, args);
    }

};


