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

public class FilterRequest_getValue_2967603014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31120;

    public FilterRequest_getValue_2967603014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31163 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term31162 = ((Class) term31163).getDeclaredField((String) "DATE");
        ((Field) term31162).setAccessible(true);
        Object enum94 = ((Field) term31162).get((Object) null);
        Object term31145 = newInstance(Class.forName("java.lang.Object"));
        Object term31146 = newInstance(Class.forName("java.lang.Object"));
        Object term31147 = newInstance(Class.forName("java.lang.Object"));
        Object term31148 = newInstance(Class.forName("java.lang.Object"));
        Object term31149 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term31143 = new ArrayList();
        ((ArrayList) term31143).add(term31145);
        ((ArrayList) term31143).add(term31146);
        ((ArrayList) term31143).add(term31147);
        ((ArrayList) term31143).add(term31148);
        ((ArrayList) term31143).add(term31149);
        term31120 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term31141 = newInstance(Class.forName("java.lang.Object"));
        Object term31142 = newInstance(Class.forName("java.lang.Object"));
        setField(term31120, term31120.getClass(), "key", "mfCpTPPQQm");
        setField(term31120, term31120.getClass(), "operator", null);
        setField(term31120, term31120.getClass(), "fieldType", enum94);
        setField(term31120, term31120.getClass(), "value", term31141);
        setField(term31120, term31120.getClass(), "valueTo", term31142);
        setField(term31120, term31120.getClass(), "values", term31143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term31120, args);
    }

};


