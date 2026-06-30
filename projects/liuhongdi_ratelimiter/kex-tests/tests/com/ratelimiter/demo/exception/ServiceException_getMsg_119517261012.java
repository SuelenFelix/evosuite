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

public class ServiceException_getMsg_119517261012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11050;

    public ServiceException_getMsg_119517261012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11050 = newInstance(Class.forName("com.ratelimiter.demo.exception.ServiceException"));
        setField(term11050, term11050.getClass(), "code", null);
        setField(term11050, term11050.getClass(), "msg", null);
        setField(term11050, term11050.getClass(), "backtrace", null);
        setField(term11050, term11050.getClass(), "detailMessage", null);
        setField(term11050, term11050.getClass(), "cause", null);
        setField(term11050, term11050.getClass(), "stackTrace", null);
        setIntField(term11050, term11050.getClass(), "depth", 0);
        setField(term11050, term11050.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ratelimiter.demo.exception.ServiceException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMsg", argTypes, term11050, args);
    }

};


