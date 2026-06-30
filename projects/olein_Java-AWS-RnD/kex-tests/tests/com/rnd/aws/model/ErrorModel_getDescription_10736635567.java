package com.rnd.aws.model;

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
import static com.rnd.aws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ErrorModel_getDescription_10736635567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term801;

    public ErrorModel_getDescription_10736635567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term801 = newInstance(Class.forName("com.rnd.aws.model.ErrorModel"));
        setField(term801, term801.getClass(), "message", "pCTimMblYc");
        setField(term801, term801.getClass(), "field", "hNxWaHcfhY");
        setField(term801, term801.getClass(), "description", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rnd.aws.model.ErrorModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term801, args);
    }

};


