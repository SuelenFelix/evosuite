package com.github.cuteluobo.livedanmuarchive.exception;

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
import static com.github.cuteluobo.livedanmuarchive.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ServiceException_getOriginalException_14016477553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6601;

    public ServiceException_getOriginalException_14016477553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6601 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.exception.ServiceException"));
        setField(term6601, term6601.getClass(), "originalException", null);
        setField(term6601, term6601.getClass(), "backtrace", null);
        setField(term6601, term6601.getClass(), "detailMessage", null);
        setField(term6601, term6601.getClass(), "cause", null);
        setField(term6601, term6601.getClass(), "stackTrace", null);
        setIntField(term6601, term6601.getClass(), "depth", 0);
        setField(term6601, term6601.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.exception.ServiceException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOriginalException", argTypes, term6601, args);
    }

};


