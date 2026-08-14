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

public class TtlMdcListener_onLevelChange_178020749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896;

    public TtlMdcListener_onLevelChange_178020749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term896 = newInstance(Class.forName("com.ofpay.logback.TtlMdcListener"));
        setIntField(term896, term896.getClass(), "noContextWarning", 0);
        setField(term896, term896.getClass(), "context", null);
        setField(term896, term896.getClass(), "declaredOrigin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ofpay.logback.TtlMdcListener");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ch.qos.logback.classic.Logger");
        argTypes[1] = Class.forName("ch.qos.logback.classic.Level");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "onLevelChange", argTypes, term896, args);
    }

};


