package com.pgssoft.httpclient.internal;

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
import static com.pgssoft.httpclient.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class UrlConditions_setParameterConditions_18175388969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9629;
     Object term9636;

    public UrlConditions_setParameterConditions_18175388969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9631 = new HashMap();
        term9629 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term9630 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term9630, term9630.getClass(), "matchers", term9631);
        setField(term9629, term9629.getClass(), "parameterConditions", term9630);
        setField(term9629, term9629.getClass(), "referenceCondition", null);
        setField(term9629, term9629.getClass(), "hostCondition", null);
        setField(term9629, term9629.getClass(), "pathCondition", null);
        setField(term9629, term9629.getClass(), "portCondition", null);
        setField(term9629, term9629.getClass(), "schemaCondition", null);
        HashMap term9637 = new HashMap();
        term9636 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term9636, term9636.getClass(), "matchers", term9637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher");
        Object[] args = new Object[1];
        args[0] = term9636;
        callMethod(klass, "setParameterConditions", argTypes, term9629, args);
    }

};


