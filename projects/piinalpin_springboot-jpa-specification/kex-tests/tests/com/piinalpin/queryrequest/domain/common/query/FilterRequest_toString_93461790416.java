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

public class FilterRequest_toString_93461790416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35601;

    public FilterRequest_toString_93461790416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35650 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term35649 = ((Class) term35650).getDeclaredField((String) "BOOLEAN");
        ((Field) term35649).setAccessible(true);
        Object enum107 = ((Field) term35649).get((Object) null);
        Object term35629 = newInstance(Class.forName("java.lang.Object"));
        Object term35630 = newInstance(Class.forName("java.lang.Object"));
        Object term35631 = newInstance(Class.forName("java.lang.Object"));
        Object term35632 = newInstance(Class.forName("java.lang.Object"));
        Object term35633 = newInstance(Class.forName("java.lang.Object"));
        Object term35634 = newInstance(Class.forName("java.lang.Object"));
        Object term35635 = newInstance(Class.forName("java.lang.Object"));
        Object term35636 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term35627 = new ArrayList();
        ((ArrayList) term35627).add(term35629);
        ((ArrayList) term35627).add(term35630);
        ((ArrayList) term35627).add(term35631);
        ((ArrayList) term35627).add(term35632);
        ((ArrayList) term35627).add(term35633);
        ((ArrayList) term35627).add(term35634);
        ((ArrayList) term35627).add(term35635);
        ((ArrayList) term35627).add(term35636);
        term35601 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term35625 = newInstance(Class.forName("java.lang.Object"));
        Object term35626 = newInstance(Class.forName("java.lang.Object"));
        setField(term35601, term35601.getClass(), "key", "WVRMUmrljA");
        setField(term35601, term35601.getClass(), "operator", null);
        setField(term35601, term35601.getClass(), "fieldType", enum107);
        setField(term35601, term35601.getClass(), "value", term35625);
        setField(term35601, term35601.getClass(), "valueTo", term35626);
        setField(term35601, term35601.getClass(), "values", term35627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term35601, args);
    }

};


