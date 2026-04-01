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

public class FilterRequest_FilterRequestBuilder_key_9765107251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26733;

    public FilterRequest_FilterRequestBuilder_key_9765107251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26792 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term26791 = ((Class) term26792).getDeclaredField((String) "BOOLEAN");
        ((Field) term26791).setAccessible(true);
        Object enum82 = ((Field) term26791).get((Object) null);
        Object term26761 = newInstance(Class.forName("java.lang.Object"));
        Object term26762 = newInstance(Class.forName("java.lang.Object"));
        Object term26763 = newInstance(Class.forName("java.lang.Object"));
        Object term26764 = newInstance(Class.forName("java.lang.Object"));
        Object term26765 = newInstance(Class.forName("java.lang.Object"));
        Object term26766 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term26759 = new ArrayList();
        ((ArrayList) term26759).add(term26761);
        ((ArrayList) term26759).add(term26762);
        ((ArrayList) term26759).add(term26763);
        ((ArrayList) term26759).add(term26764);
        ((ArrayList) term26759).add(term26765);
        ((ArrayList) term26759).add(term26766);
        term26733 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder"));
        Object term26757 = newInstance(Class.forName("java.lang.Object"));
        Object term26758 = newInstance(Class.forName("java.lang.Object"));
        setField(term26733, term26733.getClass(), "key", "QduALnDSVo");
        setField(term26733, term26733.getClass(), "operator", null);
        setField(term26733, term26733.getClass(), "fieldType", enum82);
        setField(term26733, term26733.getClass(), "value", term26757);
        setField(term26733, term26733.getClass(), "valueTo", term26758);
        setField(term26733, term26733.getClass(), "values", term26759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest$FilterRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "izPpKDErnQ";
        callMethod(klass, "key", argTypes, term26733, args);
    }

};


