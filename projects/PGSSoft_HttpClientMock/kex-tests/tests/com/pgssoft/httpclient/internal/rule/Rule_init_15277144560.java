package com.pgssoft.httpclient.internal.rule;

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
import static com.pgssoft.httpclient.internal.rule.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class Rule_init_15277144560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;
     Object term410;
     Object term413;

    public Rule_init_15277144560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term405 = new HashMap();
        term403 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term404 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term404, term404.getClass(), "matchers", term405);
        setField(term403, term403.getClass(), "parameterConditions", term404);
        setField(term403, term403.getClass(), "referenceCondition", null);
        setField(term403, term403.getClass(), "hostCondition", null);
        setField(term403, term403.getClass(), "pathCondition", null);
        setField(term403, term403.getClass(), "portCondition", null);
        setField(term403, term403.getClass(), "schemaCondition", null);
        term410 = new LinkedList();
        term413 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.Rule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.Queue");
        Object[] args = new Object[3];
        args[0] = term403;
        args[1] = term410;
        args[2] = term413;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


