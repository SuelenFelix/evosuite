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

public class UrlConditions_setSchemaCondition_6432371019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9705;

    public UrlConditions_setSchemaCondition_6432371019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9707 = new HashMap();
        term9705 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term9706 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term9706, term9706.getClass(), "matchers", term9707);
        setField(term9705, term9705.getClass(), "parameterConditions", term9706);
        setField(term9705, term9705.getClass(), "referenceCondition", null);
        setField(term9705, term9705.getClass(), "hostCondition", null);
        setField(term9705, term9705.getClass(), "pathCondition", null);
        setField(term9705, term9705.getClass(), "portCondition", null);
        setField(term9705, term9705.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSchemaCondition", argTypes, term9705, args);
    }

};


