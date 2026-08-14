package com.piinalpin.queryrequest.domain.common.query;

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
import static com.piinalpin.queryrequest.domain.common.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FilterRequest_setFieldType_1432650628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36319;

    public FilterRequest_setFieldType_1432650628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36319 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        setField(term36319, term36319.getClass(), "key", null);
        setField(term36319, term36319.getClass(), "operator", null);
        setField(term36319, term36319.getClass(), "fieldType", null);
        setField(term36319, term36319.getClass(), "value", null);
        setField(term36319, term36319.getClass(), "valueTo", null);
        setField(term36319, term36319.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.piinalpin.queryrequest.domain.common.query.FieldType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFieldType", argTypes, term36319, args);
    }

};


