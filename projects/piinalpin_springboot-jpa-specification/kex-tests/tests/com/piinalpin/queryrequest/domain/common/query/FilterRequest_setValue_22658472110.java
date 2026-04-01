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

public class FilterRequest_setValue_22658472110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33525;
     Object term33558;

    public FilterRequest_setValue_22658472110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33570 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term33569 = ((Class) term33570).getDeclaredField((String) "LONG");
        ((Field) term33569).setAccessible(true);
        Object enum101 = ((Field) term33569).get((Object) null);
        Object term33550 = newInstance(Class.forName("java.lang.Object"));
        Object term33551 = newInstance(Class.forName("java.lang.Object"));
        Object term33552 = newInstance(Class.forName("java.lang.Object"));
        Object term33553 = newInstance(Class.forName("java.lang.Object"));
        Object term33554 = newInstance(Class.forName("java.lang.Object"));
        Object term33555 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term33548 = new ArrayList();
        ((ArrayList) term33548).add(term33550);
        ((ArrayList) term33548).add(term33551);
        ((ArrayList) term33548).add(term33552);
        ((ArrayList) term33548).add(term33553);
        ((ArrayList) term33548).add(term33554);
        ((ArrayList) term33548).add(term33555);
        term33525 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term33546 = newInstance(Class.forName("java.lang.Object"));
        Object term33547 = newInstance(Class.forName("java.lang.Object"));
        setField(term33525, term33525.getClass(), "key", "iIRsCSYqXH");
        setField(term33525, term33525.getClass(), "operator", null);
        setField(term33525, term33525.getClass(), "fieldType", enum101);
        setField(term33525, term33525.getClass(), "value", term33546);
        setField(term33525, term33525.getClass(), "valueTo", term33547);
        setField(term33525, term33525.getClass(), "values", term33548);
        term33558 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term33558;
        callMethod(klass, "setValue", argTypes, term33525, args);
    }

};


