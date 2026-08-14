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

public class TtlMdcListener_stop_2354928472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public TtlMdcListener_stop_2354928472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("com.ofpay.logback.TtlMdcListener"));
        setIntField(term3, term3.getClass(), "noContextWarning", 1162663216);
        setField(term3, term3.getClass(), "context", null);
        setField(term3, term3.getClass(), "declaredOrigin", term3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ofpay.logback.TtlMdcListener");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stop", argTypes, term3, args);
    }

};


