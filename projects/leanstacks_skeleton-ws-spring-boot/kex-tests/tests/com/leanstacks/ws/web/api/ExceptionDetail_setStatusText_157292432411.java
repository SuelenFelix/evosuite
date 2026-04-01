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

public class ExceptionDetail_setStatusText_157292432411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3770;

    public ExceptionDetail_setStatusText_157292432411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3770 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term3771 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term3771, term3771.getClass(), "seconds", 1775066777L);
        setIntField(term3771, term3771.getClass(), "nanos", 500384000);
        setField(term3770, term3770.getClass(), "timestamp", term3771);
        setField(term3770, term3770.getClass(), "method", "");
        setField(term3770, term3770.getClass(), "path", "");
        setIntField(term3770, term3770.getClass(), "status", 1725571209);
        setField(term3770, term3770.getClass(), "statusText", "");
        setField(term3770, term3770.getClass(), "exceptionClass", "");
        setField(term3770, term3770.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XqgfKFvPSD";
        callMethod(klass, "setStatusText", argTypes, term3770, args);
    }

};


