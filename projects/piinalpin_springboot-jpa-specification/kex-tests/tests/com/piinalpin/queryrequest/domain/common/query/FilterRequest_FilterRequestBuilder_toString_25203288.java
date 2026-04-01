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

public class FilterRequest_FilterRequestBuilder_toString_25203288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29496;

    public FilterRequest_FilterRequestBuilder_toString_25203288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29543 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term29542 = ((Class) term29543).getDeclaredField((String) "INTEGER");
        ((Field) term29542).setAccessible(true);
        Object enum90 = ((Field) term29542).get((Object) null);
        Object term29524 = newInstance(Class.forName("java.lang.Object"));
        Object term29525 = newInstance(Class.forName("java.lang.Object"));
        Object term29526 = newInstance(Class.forName("java.lang.Object"));
        Object term29527 = newInstance(Class.forName("java.lang.Object"));
        Object term29528 = newInstance(Class.forName("java.lang.Object"));
        Object term29529 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term29522 = new ArrayList();
        ((ArrayList) term29522).add(term29524);
        ((ArrayList) term29522).add(term29525);
        ((ArrayList) term29522).add(term29526);
        ((ArrayList) term29522).add(term29527);
        ((ArrayList) term29522).add(term29528);
        ((ArrayList) term29522).add(term29529);
        term29496 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        Object term29520 = newInstance(Class.forName("java.lang.Object"));
        Object term29521 = newInstance(Class.forName("java.lang.Object"));
        setField(term29496, term29496.getClass(), "key", "SFqCrhEWLm");
        setField(term29496, term29496.getClass(), "operator", null);
        setField(term29496, term29496.getClass(), "fieldType", enum90);
        setField(term29496, term29496.getClass(), "value", term29520);
        setField(term29496, term29496.getClass(), "valueTo", term29521);
        setField(term29496, term29496.getClass(), "values", term29522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29496, args);
    }

};


