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

public class ServiceException_getCode_148070120610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11046;

    public ServiceException_getCode_148070120610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11046 = newInstance(Class.forName("com.ratelimiter.demo.exception.ServiceException"));
        setField(term11046, term11046.getClass(), "code", null);
        setField(term11046, term11046.getClass(), "msg", null);
        setField(term11046, term11046.getClass(), "backtrace", null);
        setField(term11046, term11046.getClass(), "detailMessage", null);
        setField(term11046, term11046.getClass(), "cause", null);
        setField(term11046, term11046.getClass(), "stackTrace", null);
        setIntField(term11046, term11046.getClass(), "depth", 0);
        setField(term11046, term11046.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.exception.ServiceException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCode", argTypes, term11046, args);
    }

};


