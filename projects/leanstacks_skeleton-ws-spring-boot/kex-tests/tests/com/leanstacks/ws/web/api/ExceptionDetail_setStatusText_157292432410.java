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

public class ExceptionDetail_setStatusText_157292432410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;

    public ExceptionDetail_setStatusText_157292432410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("com.leanstacks.ws.web.api.ExceptionDetail"));
        Object term186 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term186, term186.getClass(), "seconds", 1775067626L);
        setIntField(term186, term186.getClass(), "nanos", 964146000);
        setField(term185, term185.getClass(), "timestamp", term186);
        setField(term185, term185.getClass(), "method", "");
        setField(term185, term185.getClass(), "path", "");
        setIntField(term185, term185.getClass(), "status", 1725571209);
        setField(term185, term185.getClass(), "statusText", "");
        setField(term185, term185.getClass(), "exceptionClass", "");
        setField(term185, term185.getClass(), "exceptionMessage", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.ExceptionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "setStatusText", argTypes, term185, args);
    }

};


