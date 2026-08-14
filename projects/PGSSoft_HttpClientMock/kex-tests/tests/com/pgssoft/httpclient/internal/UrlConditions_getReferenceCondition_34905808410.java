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

public class UrlConditions_getReferenceCondition_34905808410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9642;

    public UrlConditions_getReferenceCondition_34905808410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9644 = new HashMap();
        term9642 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term9643 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term9643, term9643.getClass(), "matchers", term9644);
        setField(term9642, term9642.getClass(), "parameterConditions", term9643);
        setField(term9642, term9642.getClass(), "referenceCondition", null);
        setField(term9642, term9642.getClass(), "hostCondition", null);
        setField(term9642, term9642.getClass(), "pathCondition", null);
        setField(term9642, term9642.getClass(), "portCondition", null);
        setField(term9642, term9642.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReferenceCondition", argTypes, term9642, args);
    }

};


