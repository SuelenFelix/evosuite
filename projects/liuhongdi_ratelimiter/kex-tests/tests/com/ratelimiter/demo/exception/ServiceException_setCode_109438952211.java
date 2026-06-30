package com.ratelimiter.demo.exception;

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
import static com.ratelimiter.demo.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ServiceException_setCode_109438952211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11048;

    public ServiceException_setCode_109438952211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11048 = newInstance(Class.forName("com.ratelimiter.demo.exception.ServiceException"));
        setField(term11048, term11048.getClass(), "code", null);
        setField(term11048, term11048.getClass(), "msg", null);
        setField(term11048, term11048.getClass(), "backtrace", null);
        setField(term11048, term11048.getClass(), "detailMessage", null);
        setField(term11048, term11048.getClass(), "cause", null);
        setField(term11048, term11048.getClass(), "stackTrace", null);
        setIntField(term11048, term11048.getClass(), "depth", 0);
        setField(term11048, term11048.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.exception.ServiceException");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCode", argTypes, term11048, args);
    }

};


