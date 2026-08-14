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

public class UrlConditions_setSchemaCondition_6432371020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5528;

    public UrlConditions_setSchemaCondition_6432371020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5530 = new HashMap();
        term5528 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5529 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5529, term5529.getClass(), "matchers", term5530);
        setField(term5528, term5528.getClass(), "parameterConditions", term5529);
        setField(term5528, term5528.getClass(), "referenceCondition", null);
        setField(term5528, term5528.getClass(), "hostCondition", null);
        setField(term5528, term5528.getClass(), "pathCondition", null);
        setField(term5528, term5528.getClass(), "portCondition", null);
        setField(term5528, term5528.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSchemaCondition", argTypes, term5528, args);
    }

};


