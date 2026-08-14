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

public class UrlConditions_debug_16651392635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9600;
     Object term9607;

    public UrlConditions_debug_16651392635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9602 = new HashMap();
        term9600 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        Object term9601 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlParamsMatcher"));
        setField(term9601, term9601.getClass(), "matchers", term9602);
        setField(term9600, term9600.getClass(), "parameterConditions", term9601);
        setField(term9600, term9600.getClass(), "referenceCondition", null);
        setField(term9600, term9600.getClass(), "hostCondition", null);
        setField(term9600, term9600.getClass(), "pathCondition", null);
        setField(term9600, term9600.getClass(), "portCondition", null);
        setField(term9600, term9600.getClass(), "schemaCondition", null);
        term9607 = newInstance(Class.forName("com.pgssoft.httpclient.internal.debug.Debugger"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        argTypes[1] = Class.forName("com.pgssoft.httpclient.internal.debug.Debugger");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9607;
        callMethod(klass, "debug", argTypes, term9600, args);
    }

};


