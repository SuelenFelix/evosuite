package com.ofpay.logback;

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
import static com.ofpay.logback.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TtlMdcListener_onStart_199807228215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906;

    public TtlMdcListener_onStart_199807228215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term906 = newInstance(Class.forName("com.ofpay.logback.TtlMdcListener"));
        setIntField(term906, term906.getClass(), "noContextWarning", 0);
        setField(term906, term906.getClass(), "context", null);
        setField(term906, term906.getClass(), "declaredOrigin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ofpay.logback.TtlMdcListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ch.qos.logback.classic.LoggerContext");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onStart", argTypes, term906, args);
    }

};


