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

public class UrlConditions_describeMatcher_14401092147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9615;

    public UrlConditions_describeMatcher_14401092147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9617 = new HashMap();
        term9615 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term9616 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term9616, term9616.getClass(), "matchers", term9617);
        setField(term9615, term9615.getClass(), "parameterConditions", term9616);
        setField(term9615, term9615.getClass(), "referenceCondition", null);
        setField(term9615, term9615.getClass(), "hostCondition", null);
        setField(term9615, term9615.getClass(), "pathCondition", null);
        setField(term9615, term9615.getClass(), "portCondition", null);
        setField(term9615, term9615.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "describeMatcher", argTypes, term9615, args);
    }

};


