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

public class FilterRequest_FilterRequestBuilder_key_97651072510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29850;

    public FilterRequest_FilterRequestBuilder_key_97651072510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29850 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        setField(term29850, term29850.getClass(), "key", null);
        setField(term29850, term29850.getClass(), "operator", null);
        setField(term29850, term29850.getClass(), "fieldType", null);
        setField(term29850, term29850.getClass(), "value", null);
        setField(term29850, term29850.getClass(), "valueTo", null);
        setField(term29850, term29850.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "key", argTypes, term29850, args);
    }

};


