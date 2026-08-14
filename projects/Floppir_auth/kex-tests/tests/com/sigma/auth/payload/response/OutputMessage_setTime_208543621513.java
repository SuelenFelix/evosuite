package com.sigma.auth.payload.response;

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
import static com.sigma.auth.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OutputMessage_setTime_208543621513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1176;

    public OutputMessage_setTime_208543621513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1176 = newInstance(Class.forName("com.sigma.auth.payload.response.OutputMessage"));
        setField(term1176, term1176.getClass(), "from", null);
        setField(term1176, term1176.getClass(), "text", null);
        setField(term1176, term1176.getClass(), "time", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.payload.response.OutputMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTime", argTypes, term1176, args);
    }

};


