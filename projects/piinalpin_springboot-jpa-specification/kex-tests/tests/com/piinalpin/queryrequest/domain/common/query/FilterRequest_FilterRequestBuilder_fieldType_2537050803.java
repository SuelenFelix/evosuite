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

public class FilterRequest_FilterRequestBuilder_fieldType_2537050803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27446;
     Object enum85;

    public FilterRequest_FilterRequestBuilder_fieldType_2537050803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27497 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term27496 = ((Class) term27497).getDeclaredField((String) "BOOLEAN");
        ((Field) term27496).setAccessible(true);
        Object enum84 = ((Field) term27496).get((Object) null);
        Object term27474 = newInstance(Class.forName("java.lang.Object"));
        Object term27475 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term27472 = new ArrayList();
        ((ArrayList) term27472).add(term27474);
        ((ArrayList) term27472).add(term27475);
        term27446 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        Object term27470 = newInstance(Class.forName("java.lang.Object"));
        Object term27471 = newInstance(Class.forName("java.lang.Object"));
        setField(term27446, term27446.getClass(), "key", "tlQSNgTkQX");
        setField(term27446, term27446.getClass(), "operator", null);
        setField(term27446, term27446.getClass(), "fieldType", enum84);
        setField(term27446, term27446.getClass(), "value", term27470);
        setField(term27446, term27446.getClass(), "valueTo", term27471);
        setField(term27446, term27446.getClass(), "values", term27472);
        Class<? extends Object> term27805 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term27804 = ((Class) term27805).getDeclaredField((String) "DATE");
        ((Field) term27804).setAccessible(true);
        enum85 = ((Field) term27804).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.piinalpin.queryrequest.domain.common.query.FieldType");
        Object[] args = new Object[1];
        args[0] = enum85;
        callMethod(klass, "fieldType", argTypes, term27446, args);
    }

};


