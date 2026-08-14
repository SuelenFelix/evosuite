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

public class FilterRequest_setValueTo_208996574011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33868;
     Object term33902;

    public FilterRequest_setValueTo_208996574011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33914 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term33913 = ((Class) term33914).getDeclaredField((String) "CHAR");
        ((Field) term33913).setAccessible(true);
        Object enum102 = ((Field) term33913).get((Object) null);
        Object term33893 = newInstance(Class.forName("java.lang.Object"));
        Object term33894 = newInstance(Class.forName("java.lang.Object"));
        Object term33895 = newInstance(Class.forName("java.lang.Object"));
        Object term33896 = newInstance(Class.forName("java.lang.Object"));
        Object term33897 = newInstance(Class.forName("java.lang.Object"));
        Object term33898 = newInstance(Class.forName("java.lang.Object"));
        Object term33899 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term33891 = new ArrayList();
        ((ArrayList) term33891).add(term33893);
        ((ArrayList) term33891).add(term33894);
        ((ArrayList) term33891).add(term33895);
        ((ArrayList) term33891).add(term33896);
        ((ArrayList) term33891).add(term33897);
        ((ArrayList) term33891).add(term33898);
        ((ArrayList) term33891).add(term33899);
        term33868 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term33889 = newInstance(Class.forName("java.lang.Object"));
        Object term33890 = newInstance(Class.forName("java.lang.Object"));
        setField(term33868, term33868.getClass(), "key", "nghfqDXyCG");
        setField(term33868, term33868.getClass(), "operator", null);
        setField(term33868, term33868.getClass(), "fieldType", enum102);
        setField(term33868, term33868.getClass(), "value", term33889);
        setField(term33868, term33868.getClass(), "valueTo", term33890);
        setField(term33868, term33868.getClass(), "values", term33891);
        term33902 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term33902;
        callMethod(klass, "setValueTo", argTypes, term33868, args);
    }

};


