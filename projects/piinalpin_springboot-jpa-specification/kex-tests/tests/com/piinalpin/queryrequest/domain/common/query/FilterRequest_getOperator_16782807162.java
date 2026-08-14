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

public class FilterRequest_getOperator_16782807162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30437;

    public FilterRequest_getOperator_16782807162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30476 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term30475 = ((Class) term30476).getDeclaredField((String) "DATE");
        ((Field) term30475).setAccessible(true);
        Object enum92 = ((Field) term30475).get((Object) null);
        Object term30462 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term30460 = new ArrayList();
        ((ArrayList) term30460).add(term30462);
        term30437 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term30458 = newInstance(Class.forName("java.lang.Object"));
        Object term30459 = newInstance(Class.forName("java.lang.Object"));
        setField(term30437, term30437.getClass(), "key", "xvkbvaEGYd");
        setField(term30437, term30437.getClass(), "operator", null);
        setField(term30437, term30437.getClass(), "fieldType", enum92);
        setField(term30437, term30437.getClass(), "value", term30458);
        setField(term30437, term30437.getClass(), "valueTo", term30459);
        setField(term30437, term30437.getClass(), "values", term30460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOperator", argTypes, term30437, args);
    }

};


