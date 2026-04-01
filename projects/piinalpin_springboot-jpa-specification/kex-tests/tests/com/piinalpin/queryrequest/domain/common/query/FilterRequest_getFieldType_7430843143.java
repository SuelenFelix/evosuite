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

public class FilterRequest_getFieldType_7430843143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30774;

    public FilterRequest_getFieldType_7430843143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30816 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term30815 = ((Class) term30816).getDeclaredField((String) "DOUBLE");
        ((Field) term30815).setAccessible(true);
        Object enum93 = ((Field) term30815).get((Object) null);
        Object term30801 = newInstance(Class.forName("java.lang.Object"));
        Object term30802 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term30799 = new ArrayList();
        ((ArrayList) term30799).add(term30801);
        ((ArrayList) term30799).add(term30802);
        term30774 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term30797 = newInstance(Class.forName("java.lang.Object"));
        Object term30798 = newInstance(Class.forName("java.lang.Object"));
        setField(term30774, term30774.getClass(), "key", "HBGNxdNURv");
        setField(term30774, term30774.getClass(), "operator", null);
        setField(term30774, term30774.getClass(), "fieldType", enum93);
        setField(term30774, term30774.getClass(), "value", term30797);
        setField(term30774, term30774.getClass(), "valueTo", term30798);
        setField(term30774, term30774.getClass(), "values", term30799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldType", argTypes, term30774, args);
    }

};


