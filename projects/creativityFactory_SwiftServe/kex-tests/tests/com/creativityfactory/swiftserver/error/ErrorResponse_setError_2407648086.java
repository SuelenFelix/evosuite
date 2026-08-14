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

public class ErrorResponse_setError_2407648086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;

    public ErrorResponse_setError_2407648086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        Object term356 = newInstance(Class.forName("java.util.Date"));
        setLongField(term356, term356.getClass(), "fastTime", 1429023851389L);
        setField(term356, term356.getClass(), "cdate", null);
        setField(term355, term355.getClass(), "timestamp", term356);
        setIntField(term355, term355.getClass(), "status", -1955890973);
        setField(term355, term355.getClass(), "error", "aJlieCFVtF");
        setField(term355, term355.getClass(), "message", "ZiaGIbnzTs");
        setField(term355, term355.getClass(), "path", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setError", argTypes, term355, args);
    }

};


