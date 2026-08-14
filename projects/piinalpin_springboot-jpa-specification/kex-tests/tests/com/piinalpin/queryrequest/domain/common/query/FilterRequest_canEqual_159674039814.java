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

public class FilterRequest_canEqual_159674039814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34901;
     Object term34936;

    public FilterRequest_canEqual_159674039814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34948 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term34947 = ((Class) term34948).getDeclaredField((String) "CHAR");
        ((Field) term34947).setAccessible(true);
        Object enum105 = ((Field) term34947).get((Object) null);
        Object term34926 = newInstance(Class.forName("java.lang.Object"));
        Object term34927 = newInstance(Class.forName("java.lang.Object"));
        Object term34928 = newInstance(Class.forName("java.lang.Object"));
        Object term34929 = newInstance(Class.forName("java.lang.Object"));
        Object term34930 = newInstance(Class.forName("java.lang.Object"));
        Object term34931 = newInstance(Class.forName("java.lang.Object"));
        Object term34932 = newInstance(Class.forName("java.lang.Object"));
        Object term34933 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term34924 = new ArrayList();
        ((ArrayList) term34924).add(term34926);
        ((ArrayList) term34924).add(term34927);
        ((ArrayList) term34924).add(term34928);
        ((ArrayList) term34924).add(term34929);
        ((ArrayList) term34924).add(term34930);
        ((ArrayList) term34924).add(term34931);
        ((ArrayList) term34924).add(term34932);
        ((ArrayList) term34924).add(term34933);
        ((ArrayList) term34924).add(term34931);
        term34901 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term34922 = newInstance(Class.forName("java.lang.Object"));
        Object term34923 = newInstance(Class.forName("java.lang.Object"));
        setField(term34901, term34901.getClass(), "key", "rYbtIDVdnd");
        setField(term34901, term34901.getClass(), "operator", null);
        setField(term34901, term34901.getClass(), "fieldType", enum105);
        setField(term34901, term34901.getClass(), "value", term34922);
        setField(term34901, term34901.getClass(), "valueTo", term34923);
        setField(term34901, term34901.getClass(), "values", term34924);
        term34936 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term34936;
        callMethod(klass, "canEqual", argTypes, term34901, args);
    }

};


