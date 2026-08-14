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

public class UrlConditions_debug_16651392634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5421;
     Object term5428;

    public UrlConditions_debug_16651392634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5423 = new HashMap();
        term5421 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term5422 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term5422, term5422.getClass(), "matchers", term5423);
        setField(term5421, term5421.getClass(), "parameterConditions", term5422);
        setField(term5421, term5421.getClass(), "referenceCondition", null);
        setField(term5421, term5421.getClass(), "hostCondition", null);
        setField(term5421, term5421.getClass(), "pathCondition", null);
        setField(term5421, term5421.getClass(), "portCondition", null);
        setField(term5421, term5421.getClass(), "schemaCondition", null);
        term5428 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        argTypes[1] = Class.forName("com.pgssoft.httpclient.internal.debug.Debugger");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5428;
        callMethod(klass, "debug", argTypes, term5421, args);
    }

};


