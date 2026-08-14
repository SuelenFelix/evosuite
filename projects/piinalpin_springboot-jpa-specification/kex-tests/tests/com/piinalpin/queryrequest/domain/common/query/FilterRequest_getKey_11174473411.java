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

public class FilterRequest_getKey_11174473411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30097;

    public FilterRequest_getKey_11174473411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30139 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term30138 = ((Class) term30139).getDeclaredField((String) "DATE");
        ((Field) term30138).setAccessible(true);
        Object enum91 = ((Field) term30138).get((Object) null);
        Object term30122 = newInstance(Class.forName("java.lang.Object"));
        Object term30123 = newInstance(Class.forName("java.lang.Object"));
        Object term30124 = newInstance(Class.forName("java.lang.Object"));
        Object term30125 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term30120 = new ArrayList();
        ((ArrayList) term30120).add(term30122);
        ((ArrayList) term30120).add(term30123);
        ((ArrayList) term30120).add(term30124);
        ((ArrayList) term30120).add(term30125);
        term30097 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term30118 = newInstance(Class.forName("java.lang.Object"));
        Object term30119 = newInstance(Class.forName("java.lang.Object"));
        setField(term30097, term30097.getClass(), "key", "aSkmSwTnEw");
        setField(term30097, term30097.getClass(), "operator", null);
        setField(term30097, term30097.getClass(), "fieldType", enum91);
        setField(term30097, term30097.getClass(), "value", term30118);
        setField(term30097, term30097.getClass(), "valueTo", term30119);
        setField(term30097, term30097.getClass(), "values", term30120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey", argTypes, term30097, args);
    }

};


