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

public class UrlConditions_portDebugDescription_990748926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9608;

    public UrlConditions_portDebugDescription_990748926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9610 = new HashMap();
        term9608 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term9609 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term9609, term9609.getClass(), "matchers", term9610);
        setField(term9608, term9608.getClass(), "parameterConditions", term9609);
        setField(term9608, term9608.getClass(), "referenceCondition", null);
        setField(term9608, term9608.getClass(), "hostCondition", null);
        setField(term9608, term9608.getClass(), "pathCondition", null);
        setField(term9608, term9608.getClass(), "portCondition", null);
        setField(term9608, term9608.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "portDebugDescription", argTypes, term9608, args);
    }

};


