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

public class ErrorResponse_getPath_13256809619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609;

    public ErrorResponse_getPath_13256809619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term609 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        Object term610 = newInstance(Class.forName("java.util.Date"));
        setLongField(term610, term610.getClass(), "fastTime", 1500721068023L);
        setField(term610, term610.getClass(), "cdate", null);
        setField(term609, term609.getClass(), "timestamp", term610);
        setIntField(term609, term609.getClass(), "status", -1339778481);
        setField(term609, term609.getClass(), "error", "flxyYxBRtu");
        setField(term609, term609.getClass(), "message", "OclPbYPkcH");
        setField(term609, term609.getClass(), "path", "IoAlmYsBwc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term609, args);
    }

};


