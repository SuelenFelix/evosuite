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

public class FilterRequest_equals_189406426913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34556;
     Object term34591;

    public FilterRequest_equals_189406426913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34603 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term34602 = ((Class) term34603).getDeclaredField((String) "CHAR");
        ((Field) term34602).setAccessible(true);
        Object enum104 = ((Field) term34602).get((Object) null);
        Object term34581 = newInstance(Class.forName("java.lang.Object"));
        Object term34582 = newInstance(Class.forName("java.lang.Object"));
        Object term34583 = newInstance(Class.forName("java.lang.Object"));
        Object term34584 = newInstance(Class.forName("java.lang.Object"));
        Object term34585 = newInstance(Class.forName("java.lang.Object"));
        Object term34586 = newInstance(Class.forName("java.lang.Object"));
        Object term34587 = newInstance(Class.forName("java.lang.Object"));
        Object term34588 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term34579 = new ArrayList();
        ((ArrayList) term34579).add(term34581);
        ((ArrayList) term34579).add(term34582);
        ((ArrayList) term34579).add(term34583);
        ((ArrayList) term34579).add(term34584);
        ((ArrayList) term34579).add(term34585);
        ((ArrayList) term34579).add(term34586);
        ((ArrayList) term34579).add(term34587);
        ((ArrayList) term34579).add(term34588);
        term34556 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term34577 = newInstance(Class.forName("java.lang.Object"));
        Object term34578 = newInstance(Class.forName("java.lang.Object"));
        setField(term34556, term34556.getClass(), "key", "PqtVXXZMqK");
        setField(term34556, term34556.getClass(), "operator", null);
        setField(term34556, term34556.getClass(), "fieldType", enum104);
        setField(term34556, term34556.getClass(), "value", term34577);
        setField(term34556, term34556.getClass(), "valueTo", term34578);
        setField(term34556, term34556.getClass(), "values", term34579);
        term34591 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term34591;
        callMethod(klass, "equals", argTypes, term34556, args);
    }

};


