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

public class ErrorResponse_setMessage_16360706018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517;

    public ErrorResponse_setMessage_16360706018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        Object term518 = newInstance(Class.forName("java.util.Date"));
        setLongField(term518, term518.getClass(), "fastTime", 1645834034896L);
        setField(term518, term518.getClass(), "cdate", null);
        setField(term517, term517.getClass(), "timestamp", term518);
        setIntField(term517, term517.getClass(), "status", 1227103734);
        setField(term517, term517.getClass(), "error", "xOEqzGAmDU");
        setField(term517, term517.getClass(), "message", "eZFUvlxvGV");
        setField(term517, term517.getClass(), "path", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "setMessage", argTypes, term517, args);
    }

};


