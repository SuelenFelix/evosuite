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

public class UrlConditions_matches_139588897922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9713;

    public UrlConditions_matches_139588897922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9713 = newInstance(Class.forName("com.pgssoft.httpclient.internal.UrlConditions"));
        setField(term9713, term9713.getClass(), "parameterConditions", null);
        setField(term9713, term9713.getClass(), "referenceCondition", null);
        setField(term9713, term9713.getClass(), "hostCondition", null);
        setField(term9713, term9713.getClass(), "pathCondition", null);
        setField(term9713, term9713.getClass(), "portCondition", null);
        setField(term9713, term9713.getClass(), "schemaCondition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pgssoft.httpclient.internal.UrlConditions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "matches", argTypes, term9713, args);
    }

};


