package com.piinalpin.queryrequest.domain.common.query;

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
import static com.piinalpin.queryrequest.domain.common.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FilterRequest_getValueTo_17470133685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31461;

    public FilterRequest_getValueTo_17470133685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31504 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term31503 = ((Class) term31504).getDeclaredField((String) "INTEGER");
        ((Field) term31503).setAccessible(true);
        Object enum95 = ((Field) term31503).get((Object) null);
        Object term31489 = newInstance(Class.forName("java.lang.Object"));
        Object term31490 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term31487 = new ArrayList();
        ((ArrayList) term31487).add(term31489);
        ((ArrayList) term31487).add(term31490);
        term31461 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term31485 = newInstance(Class.forName("java.lang.Object"));
        Object term31486 = newInstance(Class.forName("java.lang.Object"));
        setField(term31461, term31461.getClass(), "key", "OcJCIDNIXA");
        setField(term31461, term31461.getClass(), "operator", null);
        setField(term31461, term31461.getClass(), "fieldType", enum95);
        setField(term31461, term31461.getClass(), "value", term31485);
        setField(term31461, term31461.getClass(), "valueTo", term31486);
        setField(term31461, term31461.getClass(), "values", term31487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValueTo", argTypes, term31461, args);
    }

};


