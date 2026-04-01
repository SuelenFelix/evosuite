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

public class FilterRequest_setOperator_18729839048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32528;

    public FilterRequest_setOperator_18729839048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32574 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term32573 = ((Class) term32574).getDeclaredField((String) "STRING");
        ((Field) term32573).setAccessible(true);
        Object enum98 = ((Field) term32573).get((Object) null);
        Object term32555 = newInstance(Class.forName("java.lang.Object"));
        Object term32556 = newInstance(Class.forName("java.lang.Object"));
        Object term32557 = newInstance(Class.forName("java.lang.Object"));
        Object term32558 = newInstance(Class.forName("java.lang.Object"));
        Object term32559 = newInstance(Class.forName("java.lang.Object"));
        Object term32560 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term32553 = new ArrayList();
        ((ArrayList) term32553).add(term32555);
        ((ArrayList) term32553).add(term32556);
        ((ArrayList) term32553).add(term32557);
        ((ArrayList) term32553).add(term32558);
        ((ArrayList) term32553).add(term32559);
        ((ArrayList) term32553).add(term32560);
        term32528 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term32551 = newInstance(Class.forName("java.lang.Object"));
        Object term32552 = newInstance(Class.forName("java.lang.Object"));
        setField(term32528, term32528.getClass(), "key", "IpQuOGMgmj");
        setField(term32528, term32528.getClass(), "operator", null);
        setField(term32528, term32528.getClass(), "fieldType", enum98);
        setField(term32528, term32528.getClass(), "value", term32551);
        setField(term32528, term32528.getClass(), "valueTo", term32552);
        setField(term32528, term32528.getClass(), "values", term32553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.piinalpin.queryrequest.domain.common.query.Operator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOperator", argTypes, term32528, args);
    }

};


