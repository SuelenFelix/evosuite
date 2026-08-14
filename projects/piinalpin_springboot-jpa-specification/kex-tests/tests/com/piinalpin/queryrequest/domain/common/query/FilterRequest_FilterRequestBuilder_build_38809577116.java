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

public class FilterRequest_FilterRequestBuilder_build_38809577116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29856;

    public FilterRequest_FilterRequestBuilder_build_38809577116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29856 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        setField(term29856, term29856.getClass(), "key", null);
        setField(term29856, term29856.getClass(), "operator", null);
        setField(term29856, term29856.getClass(), "fieldType", null);
        setField(term29856, term29856.getClass(), "value", null);
        setField(term29856, term29856.getClass(), "valueTo", null);
        setField(term29856, term29856.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term29856, args);
    }

};


