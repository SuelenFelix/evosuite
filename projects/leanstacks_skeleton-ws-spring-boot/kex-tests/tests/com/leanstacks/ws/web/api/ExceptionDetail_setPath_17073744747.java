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

public class ExceptionDetail_setPath_17073744747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3686;

    public ExceptionDetail_setPath_17073744747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3686 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3687 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3687, term3687.getClass(), "seconds", 1775066777L);
        setIntField(term3687, term3687.getClass(), "nanos", 327074000);
        setField(term3686, term3686.getClass(), "timestamp", term3687);
        setField(term3686, term3686.getClass(), "method", "");
        setField(term3686, term3686.getClass(), "path", "");
        setIntField(term3686, term3686.getClass(), "status", -616727354);
        setField(term3686, term3686.getClass(), "statusText", "");
        setField(term3686, term3686.getClass(), "exceptionClass", "");
        setField(term3686, term3686.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DfISiziTgG";
        callMethod(klass, "setPath", argTypes, term3686, args);
    }

};


