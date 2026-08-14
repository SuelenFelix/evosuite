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

public class FilterRequest_FilterRequestBuilder_valueTo_16220483265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28452;
     Object term28485;

    public FilterRequest_FilterRequestBuilder_valueTo_16220483265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28497 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term28496 = ((Class) term28497).getDeclaredField((String) "DOUBLE");
        ((Field) term28496).setAccessible(true);
        Object enum87 = ((Field) term28496).get((Object) null);
        Object term28479 = newInstance(Class.forName("java.lang.Object"));
        Object term28480 = newInstance(Class.forName("java.lang.Object"));
        Object term28481 = newInstance(Class.forName("java.lang.Object"));
        Object term28482 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term28477 = new ArrayList();
        ((ArrayList) term28477).add(term28479);
        ((ArrayList) term28477).add(term28480);
        ((ArrayList) term28477).add(term28481);
        ((ArrayList) term28477).add(term28482);
        term28452 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        Object term28475 = newInstance(Class.forName("java.lang.Object"));
        Object term28476 = newInstance(Class.forName("java.lang.Object"));
        setField(term28452, term28452.getClass(), "key", "zcorEihhLK");
        setField(term28452, term28452.getClass(), "operator", null);
        setField(term28452, term28452.getClass(), "fieldType", enum87);
        setField(term28452, term28452.getClass(), "value", term28475);
        setField(term28452, term28452.getClass(), "valueTo", term28476);
        setField(term28452, term28452.getClass(), "values", term28477);
        term28485 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28485;
        callMethod(klass, "valueTo", argTypes, term28452, args);
    }

};


