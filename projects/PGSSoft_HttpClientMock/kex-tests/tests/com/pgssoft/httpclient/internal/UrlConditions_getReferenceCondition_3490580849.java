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

public class UrlConditions_getReferenceCondition_3490580849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5463;

    public UrlConditions_getReferenceCondition_3490580849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5465 = new HashMap();
        term5463 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5464 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5464, term5464.getClass(), "matchers", term5465);
        setField(term5463, term5463.getClass(), "parameterConditions", term5464);
        setField(term5463, term5463.getClass(), "referenceCondition", null);
        setField(term5463, term5463.getClass(), "hostCondition", null);
        setField(term5463, term5463.getClass(), "pathCondition", null);
        setField(term5463, term5463.getClass(), "portCondition", null);
        setField(term5463, term5463.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReferenceCondition", argTypes, term5463, args);
    }

};


