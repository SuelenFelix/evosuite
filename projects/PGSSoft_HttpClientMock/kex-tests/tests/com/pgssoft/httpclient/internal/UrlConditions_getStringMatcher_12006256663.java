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

public class UrlConditions_getStringMatcher_12006256663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9473;

    public UrlConditions_getStringMatcher_12006256663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9473 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        setField(term9473, term9473.getClass(), "parameterConditions", null);
        setField(term9473, term9473.getClass(), "referenceCondition", null);
        setField(term9473, term9473.getClass(), "hostCondition", null);
        setField(term9473, term9473.getClass(), "pathCondition", null);
        setField(term9473, term9473.getClass(), "portCondition", null);
        setField(term9473, term9473.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getStringMatcher", argTypes, term9473, args);
    }

};


