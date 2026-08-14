package com.pgssoft.httpclient.internal.condition;

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
import static com.pgssoft.httpclient.internal.condition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HeaderCondition_matches_14840298484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;

    public HeaderCondition_matches_14840298484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69 = newInstance(Class.forName("com.pgssoft.httpclient.internal.condition.HeaderCondition"));
        setField(term69, term69.getClass(), "header", null);
        setField(term69, term69.getClass(), "expectedValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.condition.HeaderCondition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "matches", argTypes, term69, args);
    }

};


