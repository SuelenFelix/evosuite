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

public class FilterRequest_FilterRequestBuilder_value_6247398094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28103;
     Object term28136;

    public FilterRequest_FilterRequestBuilder_value_6247398094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28148 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term28147 = ((Class) term28148).getDeclaredField((String) "STRING");
        ((Field) term28147).setAccessible(true);
        Object enum86 = ((Field) term28147).get((Object) null);
        Object term28130 = newInstance(Class.forName("java.lang.Object"));
        Object term28131 = newInstance(Class.forName("java.lang.Object"));
        Object term28132 = newInstance(Class.forName("java.lang.Object"));
        Object term28133 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term28128 = new ArrayList();
        ((ArrayList) term28128).add(term28130);
        ((ArrayList) term28128).add(term28131);
        ((ArrayList) term28128).add(term28132);
        ((ArrayList) term28128).add(term28133);
        term28103 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        Object term28126 = newInstance(Class.forName("java.lang.Object"));
        Object term28127 = newInstance(Class.forName("java.lang.Object"));
        setField(term28103, term28103.getClass(), "key", "PCipZnmBOF");
        setField(term28103, term28103.getClass(), "operator", null);
        setField(term28103, term28103.getClass(), "fieldType", enum86);
        setField(term28103, term28103.getClass(), "value", term28126);
        setField(term28103, term28103.getClass(), "valueTo", term28127);
        setField(term28103, term28103.getClass(), "values", term28128);
        term28136 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28136;
        callMethod(klass, "value", argTypes, term28103, args);
    }

};


