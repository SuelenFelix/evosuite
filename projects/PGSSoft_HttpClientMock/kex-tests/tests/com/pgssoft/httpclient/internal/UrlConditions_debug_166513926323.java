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

public class UrlConditions_debug_166513926323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9714;

    public UrlConditions_debug_166513926323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9714 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        setField(term9714, term9714.getClass(), "parameterConditions", null);
        setField(term9714, term9714.getClass(), "referenceCondition", null);
        setField(term9714, term9714.getClass(), "hostCondition", null);
        setField(term9714, term9714.getClass(), "pathCondition", null);
        setField(term9714, term9714.getClass(), "portCondition", null);
        setField(term9714, term9714.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        argTypes[1] = Class.forName("com.pgssoft.httpclient.internal.debug.Debugger");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "debug", argTypes, term9714, args);
    }

};


