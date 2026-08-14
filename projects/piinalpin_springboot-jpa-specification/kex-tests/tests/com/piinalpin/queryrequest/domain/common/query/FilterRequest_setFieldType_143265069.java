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

public class FilterRequest_setFieldType_143265069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32878;
     Object enum100;

    public FilterRequest_setFieldType_143265069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32928 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term32927 = ((Class) term32928).getDeclaredField((String) "DATE");
        ((Field) term32927).setAccessible(true);
        Object enum99 = ((Field) term32927).get((Object) null);
        Object term32903 = newInstance(Class.forName("java.lang.Object"));
        Object term32904 = newInstance(Class.forName("java.lang.Object"));
        Object term32905 = newInstance(Class.forName("java.lang.Object"));
        Object term32906 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term32901 = new ArrayList();
        ((ArrayList) term32901).add(term32903);
        ((ArrayList) term32901).add(term32904);
        ((ArrayList) term32901).add(term32905);
        ((ArrayList) term32901).add(term32906);
        term32878 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term32899 = newInstance(Class.forName("java.lang.Object"));
        Object term32900 = newInstance(Class.forName("java.lang.Object"));
        setField(term32878, term32878.getClass(), "key", "pJbnHTYrxn");
        setField(term32878, term32878.getClass(), "operator", null);
        setField(term32878, term32878.getClass(), "fieldType", enum99);
        setField(term32878, term32878.getClass(), "value", term32899);
        setField(term32878, term32878.getClass(), "valueTo", term32900);
        setField(term32878, term32878.getClass(), "values", term32901);
        Class<? extends Object> term33227 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term33226 = ((Class) term33227).getDeclaredField((String) "CHAR");
        ((Field) term33226).setAccessible(true);
        enum100 = ((Field) term33226).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.piinalpin.queryrequest.domain.common.query.FieldType");
        Object[] args = new Object[1];
        args[0] = enum100;
        callMethod(klass, "setFieldType", argTypes, term32878, args);
    }

};


