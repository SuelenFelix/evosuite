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

public class UrlConditions_setPathCondition_194128639833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9724;

    public UrlConditions_setPathCondition_194128639833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9724 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        setField(term9724, term9724.getClass(), "parameterConditions", null);
        setField(term9724, term9724.getClass(), "referenceCondition", null);
        setField(term9724, term9724.getClass(), "hostCondition", null);
        setField(term9724, term9724.getClass(), "pathCondition", null);
        setField(term9724, term9724.getClass(), "portCondition", null);
        setField(term9724, term9724.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPathCondition", argTypes, term9724, args);
    }

};


