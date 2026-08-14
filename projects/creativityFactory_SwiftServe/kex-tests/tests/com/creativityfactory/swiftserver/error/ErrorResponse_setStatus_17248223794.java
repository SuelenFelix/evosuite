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
import java.lang.Integer;

public class ErrorResponse_setStatus_17248223794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term253;

    public ErrorResponse_setStatus_17248223794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        Object term214 = newInstance(Class.forName("java.util.Date"));
        setLongField(term214, term214.getClass(), "fastTime", 1442639565302L);
        setField(term214, term214.getClass(), "cdate", null);
        setField(term213, term213.getClass(), "timestamp", term214);
        setIntField(term213, term213.getClass(), "status", 391863371);
        setField(term213, term213.getClass(), "error", "RMFIsYGgne");
        setField(term213, term213.getClass(), "message", "NRdvgJlhkX");
        setField(term213, term213.getClass(), "path", "uuaPigETmJ");
        term253 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term253;
        callMethod(klass, "setStatus", argTypes, term213, args);
    }

};


