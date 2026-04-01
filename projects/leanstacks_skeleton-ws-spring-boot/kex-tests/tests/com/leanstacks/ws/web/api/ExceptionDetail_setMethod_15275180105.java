package com.leanstacks.ws.web.api;

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
import static com.leanstacks.ws.web.api.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExceptionDetail_setMethod_15275180105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3634;

    public ExceptionDetail_setMethod_15275180105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3634 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3635 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3635, term3635.getClass(), "seconds", 1775066777L);
        setIntField(term3635, term3635.getClass(), "nanos", 239649000);
        setField(term3634, term3634.getClass(), "timestamp", term3635);
        setField(term3634, term3634.getClass(), "method", "");
        setField(term3634, term3634.getClass(), "path", "");
        setIntField(term3634, term3634.getClass(), "status", 391863371);
        setField(term3634, term3634.getClass(), "statusText", "");
        setField(term3634, term3634.getClass(), "exceptionClass", "");
        setField(term3634, term3634.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jiKYgYHqIS";
        callMethod(klass, "setMethod", argTypes, term3634, args);
    }

};


