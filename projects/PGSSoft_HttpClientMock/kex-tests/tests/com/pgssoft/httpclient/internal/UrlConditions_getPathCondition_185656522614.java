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

public class UrlConditions_getPathCondition_185656522614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5492;

    public UrlConditions_getPathCondition_185656522614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5494 = new HashMap();
        term5492 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5493 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5493, term5493.getClass(), "matchers", term5494);
        setField(term5492, term5492.getClass(), "parameterConditions", term5493);
        setField(term5492, term5492.getClass(), "referenceCondition", null);
        setField(term5492, term5492.getClass(), "hostCondition", null);
        setField(term5492, term5492.getClass(), "pathCondition", null);
        setField(term5492, term5492.getClass(), "portCondition", null);
        setField(term5492, term5492.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathCondition", argTypes, term5492, args);
    }

};


