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

public class FilterRequest_setKey_18041387717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32158;

    public FilterRequest_setKey_18041387717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32214 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term32213 = ((Class) term32214).getDeclaredField((String) "STRING");
        ((Field) term32213).setAccessible(true);
        Object enum97 = ((Field) term32213).get((Object) null);
        Object term32185 = newInstance(Class.forName("java.lang.Object"));
        Object term32186 = newInstance(Class.forName("java.lang.Object"));
        Object term32187 = newInstance(Class.forName("java.lang.Object"));
        Object term32188 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term32183 = new ArrayList();
        ((ArrayList) term32183).add(term32185);
        ((ArrayList) term32183).add(term32186);
        ((ArrayList) term32183).add(term32187);
        ((ArrayList) term32183).add(term32188);
        term32158 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term32181 = newInstance(Class.forName("java.lang.Object"));
        Object term32182 = newInstance(Class.forName("java.lang.Object"));
        setField(term32158, term32158.getClass(), "key", "MHGKyEnwKc");
        setField(term32158, term32158.getClass(), "operator", null);
        setField(term32158, term32158.getClass(), "fieldType", enum97);
        setField(term32158, term32158.getClass(), "value", term32181);
        setField(term32158, term32158.getClass(), "valueTo", term32182);
        setField(term32158, term32158.getClass(), "values", term32183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ShIELyuULw";
        callMethod(klass, "setKey", argTypes, term32158, args);
    }

};


