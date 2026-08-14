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

public class UrlConditions_getSchemaCondition_196374901818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5520;

    public UrlConditions_getSchemaCondition_196374901818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5522 = new HashMap();
        term5520 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5521 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5521, term5521.getClass(), "matchers", term5522);
        setField(term5520, term5520.getClass(), "parameterConditions", term5521);
        setField(term5520, term5520.getClass(), "referenceCondition", null);
        setField(term5520, term5520.getClass(), "hostCondition", null);
        setField(term5520, term5520.getClass(), "pathCondition", null);
        setField(term5520, term5520.getClass(), "portCondition", null);
        setField(term5520, term5520.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchemaCondition", argTypes, term5520, args);
    }

};


