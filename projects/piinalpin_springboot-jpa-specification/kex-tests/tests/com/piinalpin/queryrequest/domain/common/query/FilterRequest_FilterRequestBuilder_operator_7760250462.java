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

public class FilterRequest_FilterRequestBuilder_operator_7760250462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27109;

    public FilterRequest_FilterRequestBuilder_operator_7760250462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27148 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term27147 = ((Class) term27148).getDeclaredField((String) "CHAR");
        ((Field) term27147).setAccessible(true);
        Object enum83 = ((Field) term27147).get((Object) null);
        Object term27134 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term27132 = new ArrayList();
        ((ArrayList) term27132).add(term27134);
        term27109 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        Object term27130 = newInstance(Class.forName("java.lang.Object"));
        Object term27131 = newInstance(Class.forName("java.lang.Object"));
        setField(term27109, term27109.getClass(), "key", "NnpwZBUTvx");
        setField(term27109, term27109.getClass(), "operator", null);
        setField(term27109, term27109.getClass(), "fieldType", enum83);
        setField(term27109, term27109.getClass(), "value", term27130);
        setField(term27109, term27109.getClass(), "valueTo", term27131);
        setField(term27109, term27109.getClass(), "values", term27132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.piinalpin.queryrequest.domain.common.query.Operator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "operator", argTypes, term27109, args);
    }

};


