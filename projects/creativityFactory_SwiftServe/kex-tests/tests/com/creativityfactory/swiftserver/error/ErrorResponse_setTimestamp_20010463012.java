package com.creativityfactory.swiftserver.error;

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
import static com.creativityfactory.swiftserver.error.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ErrorResponse_setTimestamp_20010463012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;
     Object term111;

    public ErrorResponse_setTimestamp_20010463012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        Object term72 = newInstance(Class.forName("java.util.Date"));
        setLongField(term72, term72.getClass(), "fastTime", 1480438351369L);
        setField(term72, term72.getClass(), "cdate", null);
        setField(term71, term71.getClass(), "timestamp", term72);
        setIntField(term71, term71.getClass(), "status", 1162663216);
        setField(term71, term71.getClass(), "error", "xxtlPwDYFs");
        setField(term71, term71.getClass(), "message", "jJCZpVmanW");
        setField(term71, term71.getClass(), "path", "EGtDIRbSSb");
        term111 = newInstance(Class.forName("java.util.Date"));
        setLongField(term111, term111.getClass(), "fastTime", 1610940182830L);
        setField(term111, term111.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term111;
        callMethod(klass, "setTimestamp", argTypes, term71, args);
    }

};


