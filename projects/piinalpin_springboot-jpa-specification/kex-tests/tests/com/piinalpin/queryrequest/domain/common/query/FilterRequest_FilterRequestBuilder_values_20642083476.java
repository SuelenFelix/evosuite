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
import java.util.LinkedList;

public class FilterRequest_FilterRequestBuilder_values_20642083476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28801;
     Object term28838;

    public FilterRequest_FilterRequestBuilder_values_20642083476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28852 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term28851 = ((Class) term28852).getDeclaredField((String) "STRING");
        ((Field) term28851).setAccessible(true);
        Object enum88 = ((Field) term28851).get((Object) null);
        Object term28828 = newInstance(Class.forName("java.lang.Object"));
        Object term28829 = newInstance(Class.forName("java.lang.Object"));
        Object term28830 = newInstance(Class.forName("java.lang.Object"));
        Object term28831 = newInstance(Class.forName("java.lang.Object"));
        Object term28832 = newInstance(Class.forName("java.lang.Object"));
        Object term28833 = newInstance(Class.forName("java.lang.Object"));
        Object term28834 = newInstance(Class.forName("java.lang.Object"));
        Object term28835 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term28826 = new ArrayList();
        ((ArrayList) term28826).add(term28828);
        ((ArrayList) term28826).add(term28829);
        ((ArrayList) term28826).add(term28830);
        ((ArrayList) term28826).add(term28831);
        ((ArrayList) term28826).add(term28832);
        ((ArrayList) term28826).add(term28833);
        ((ArrayList) term28826).add(term28834);
        ((ArrayList) term28826).add(term28835);
        term28801 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        Object term28824 = newInstance(Class.forName("java.lang.Object"));
        Object term28825 = newInstance(Class.forName("java.lang.Object"));
        setField(term28801, term28801.getClass(), "key", "GrqozDKFOk");
        setField(term28801, term28801.getClass(), "operator", null);
        setField(term28801, term28801.getClass(), "fieldType", enum88);
        setField(term28801, term28801.getClass(), "value", term28824);
        setField(term28801, term28801.getClass(), "valueTo", term28825);
        setField(term28801, term28801.getClass(), "values", term28826);
        term28838 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term28838;
        callMethod(klass, "values", argTypes, term28801, args);
    }

};


