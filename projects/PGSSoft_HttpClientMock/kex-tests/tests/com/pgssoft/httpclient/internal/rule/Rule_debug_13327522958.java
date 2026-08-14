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

public class Rule_debug_13327522958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555;

    public Rule_debug_13327522958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.Rule"));
        setField(term555, term555.getClass(), "urlConditions", null);
        setField(term555, term555.getClass(), "conditions", null);
        setField(term555, term555.getClass(), "actionBundles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.Rule");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        argTypes[1] = Class.forName("com.pgssoft.httpclient.internal.debug.Debugger");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "debug", argTypes, term555, args);
    }

};


