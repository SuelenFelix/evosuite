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

public class UrlConditions_setHostCondition_182531599513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5485;

    public UrlConditions_setHostCondition_182531599513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5487 = new HashMap();
        term5485 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5486 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5486, term5486.getClass(), "matchers", term5487);
        setField(term5485, term5485.getClass(), "parameterConditions", term5486);
        setField(term5485, term5485.getClass(), "referenceCondition", null);
        setField(term5485, term5485.getClass(), "hostCondition", null);
        setField(term5485, term5485.getClass(), "pathCondition", null);
        setField(term5485, term5485.getClass(), "portCondition", null);
        setField(term5485, term5485.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHostCondition", argTypes, term5485, args);
    }

};


