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

public class UrlConditions_setParameterConditions_18175388968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5450;
     Object term5457;

    public UrlConditions_setParameterConditions_18175388968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5452 = new HashMap();
        term5450 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5451 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5451, term5451.getClass(), "matchers", term5452);
        setField(term5450, term5450.getClass(), "parameterConditions", term5451);
        setField(term5450, term5450.getClass(), "referenceCondition", null);
        setField(term5450, term5450.getClass(), "hostCondition", null);
        setField(term5450, term5450.getClass(), "pathCondition", null);
        setField(term5450, term5450.getClass(), "portCondition", null);
        setField(term5450, term5450.getClass(), "schemaCondition", null);
        HashMap term5458 = new HashMap();
        term5457 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5457, term5457.getClass(), "matchers", term5458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher");
        Object[] args = new Object[1];
        args[0] = term5457;
        callMethod(klass, "setParameterConditions", argTypes, term5450, args);
    }

};


