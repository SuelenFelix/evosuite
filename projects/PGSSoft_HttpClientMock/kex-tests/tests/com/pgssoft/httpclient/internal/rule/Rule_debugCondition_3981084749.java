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

public class Rule_debugCondition_3981084749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556;

    public Rule_debugCondition_3981084749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556 = newInstance(Class.forName("com.pgssoft.httpclient.internal.rule.Rule"));
        setField(term556, term556.getClass(), "urlConditions", null);
        setField(term556, term556.getClass(), "conditions", null);
        setField(term556, term556.getClass(), "actionBundles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.rule.Rule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.pgssoft.httpclient.Condition");
        argTypes[1] = Class.forName("java.net.http.HttpRequest");
        argTypes[2] = Class.forName("com.pgssoft.httpclient.internal.debug.Debugger");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "debugCondition", argTypes, term556, args);
    }

};


