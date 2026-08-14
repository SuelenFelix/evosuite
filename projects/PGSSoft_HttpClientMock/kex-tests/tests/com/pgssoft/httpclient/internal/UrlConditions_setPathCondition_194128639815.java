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

public class UrlConditions_setPathCondition_194128639815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5499;

    public UrlConditions_setPathCondition_194128639815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5501 = new HashMap();
        term5499 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5500 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5500, term5500.getClass(), "matchers", term5501);
        setField(term5499, term5499.getClass(), "parameterConditions", term5500);
        setField(term5499, term5499.getClass(), "referenceCondition", null);
        setField(term5499, term5499.getClass(), "hostCondition", null);
        setField(term5499, term5499.getClass(), "pathCondition", null);
        setField(term5499, term5499.getClass(), "portCondition", null);
        setField(term5499, term5499.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPathCondition", argTypes, term5499, args);
    }

};


