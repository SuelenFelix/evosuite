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

public class ErrorModel_getMessage_19741050813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;

    public ErrorModel_getMessage_19741050813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489 = newInstance(Class.forName("com.rnd.aws.model.ErrorModel"));
        setField(term489, term489.getClass(), "message", "EGtDIRbSSb");
        setField(term489, term489.getClass(), "field", "SzjVpOQTyS");
        setField(term489, term489.getClass(), "description", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.rnd.aws.model.ErrorModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term489, args);
    }

};


