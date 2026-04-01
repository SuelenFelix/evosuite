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

public class FilterRequest_getValues_17807856216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31811;

    public FilterRequest_getValues_17807856216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31854 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term31853 = ((Class) term31854).getDeclaredField((String) "STRING");
        ((Field) term31853).setAccessible(true);
        Object enum96 = ((Field) term31853).get((Object) null);
        Object term31838 = newInstance(Class.forName("java.lang.Object"));
        Object term31839 = newInstance(Class.forName("java.lang.Object"));
        Object term31840 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term31836 = new ArrayList();
        ((ArrayList) term31836).add(term31838);
        ((ArrayList) term31836).add(term31839);
        ((ArrayList) term31836).add(term31840);
        term31811 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term31834 = newInstance(Class.forName("java.lang.Object"));
        Object term31835 = newInstance(Class.forName("java.lang.Object"));
        setField(term31811, term31811.getClass(), "key", "XfRABIFVEp");
        setField(term31811, term31811.getClass(), "operator", null);
        setField(term31811, term31811.getClass(), "fieldType", enum96);
        setField(term31811, term31811.getClass(), "value", term31834);
        setField(term31811, term31811.getClass(), "valueTo", term31835);
        setField(term31811, term31811.getClass(), "values", term31836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValues", argTypes, term31811, args);
    }

};


