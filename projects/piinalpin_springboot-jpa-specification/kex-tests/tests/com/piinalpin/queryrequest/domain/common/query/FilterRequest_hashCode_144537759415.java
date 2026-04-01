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

public class FilterRequest_hashCode_144537759415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35246;

    public FilterRequest_hashCode_144537759415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35294 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term35293 = ((Class) term35294).getDeclaredField((String) "INTEGER");
        ((Field) term35293).setAccessible(true);
        Object enum106 = ((Field) term35293).get((Object) null);
        Object term35274 = newInstance(Class.forName("java.lang.Object"));
        Object term35275 = newInstance(Class.forName("java.lang.Object"));
        Object term35276 = newInstance(Class.forName("java.lang.Object"));
        Object term35277 = newInstance(Class.forName("java.lang.Object"));
        Object term35278 = newInstance(Class.forName("java.lang.Object"));
        Object term35279 = newInstance(Class.forName("java.lang.Object"));
        Object term35280 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term35272 = new ArrayList();
        ((ArrayList) term35272).add(term35274);
        ((ArrayList) term35272).add(term35275);
        ((ArrayList) term35272).add(term35276);
        ((ArrayList) term35272).add(term35277);
        ((ArrayList) term35272).add(term35278);
        ((ArrayList) term35272).add(term35279);
        ((ArrayList) term35272).add(term35280);
        term35246 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest"));
        Object term35270 = newInstance(Class.forName("java.lang.Object"));
        Object term35271 = newInstance(Class.forName("java.lang.Object"));
        setField(term35246, term35246.getClass(), "key", "UKAReurpHG");
        setField(term35246, term35246.getClass(), "operator", null);
        setField(term35246, term35246.getClass(), "fieldType", enum106);
        setField(term35246, term35246.getClass(), "value", term35270);
        setField(term35246, term35246.getClass(), "valueTo", term35271);
        setField(term35246, term35246.getClass(), "values", term35272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term35246, args);
    }

};


