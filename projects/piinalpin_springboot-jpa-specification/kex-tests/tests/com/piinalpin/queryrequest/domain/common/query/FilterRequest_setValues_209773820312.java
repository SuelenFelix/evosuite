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
import java.util.LinkedList;

public class FilterRequest_setValues_209773820312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34212;
     Object term34244;

    public FilterRequest_setValues_209773820312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34258 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term34257 = ((Class) term34258).getDeclaredField((String) "DATE");
        ((Field) term34257).setAccessible(true);
        Object enum103 = ((Field) term34257).get((Object) null);
        Object term34237 = newInstance(Class.forName("java.lang.Object"));
        Object term34238 = newInstance(Class.forName("java.lang.Object"));
        Object term34239 = newInstance(Class.forName("java.lang.Object"));
        Object term34240 = newInstance(Class.forName("java.lang.Object"));
        Object term34241 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term34235 = new ArrayList();
        ((ArrayList) term34235).add(term34237);
        ((ArrayList) term34235).add(term34238);
        ((ArrayList) term34235).add(term34239);
        ((ArrayList) term34235).add(term34240);
        ((ArrayList) term34235).add(term34241);
        term34212 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term34233 = newInstance(Class.forName("java.lang.Object"));
        Object term34234 = newInstance(Class.forName("java.lang.Object"));
        setField(term34212, term34212.getClass(), "key", "WBAOTqErtm");
        setField(term34212, term34212.getClass(), "operator", null);
        setField(term34212, term34212.getClass(), "fieldType", enum103);
        setField(term34212, term34212.getClass(), "value", term34233);
        setField(term34212, term34212.getClass(), "valueTo", term34234);
        setField(term34212, term34212.getClass(), "values", term34235);
        term34244 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term34244;
        callMethod(klass, "setValues", argTypes, term34212, args);
    }

};


