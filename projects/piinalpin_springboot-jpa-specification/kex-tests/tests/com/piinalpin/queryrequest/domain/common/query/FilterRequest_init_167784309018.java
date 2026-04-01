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
import java.util.LinkedList;

public class FilterRequest_init_167784309018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum108;
     Object term35979;
     Object term35980;
     Object term35981;

    public FilterRequest_init_167784309018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36006 = Class.forName((String) "com.piinalpin.queryrequest.domain.common.query.FieldType");
        Field term36005 = ((Class) term36006).getDeclaredField((String) "STRING");
        ((Field) term36005).setAccessible(true);
        enum108 = ((Field) term36005).get((Object) null);
        term35979 = newInstance(Class.forName("java.lang.Object"));
        term35980 = newInstance(Class.forName("java.lang.Object"));
        Object term35984 = newInstance(Class.forName("java.lang.Object"));
        Object term35986 = newInstance(Class.forName("java.lang.Object"));
        Object term35988 = newInstance(Class.forName("java.lang.Object"));
        term35981 = new LinkedList();
        ((LinkedList) term35981).add(term35984);
        ((LinkedList) term35981).add(term35986);
        ((LinkedList) term35981).add(term35988);
        ((LinkedList) term35981).add((Object)null);
        ((LinkedList) term35981).add((Object)null);
        ((LinkedList) term35981).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.common.query.FilterRequest");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.piinalpin.queryrequest.domain.common.query.Operator");
        argTypes[2] = Class.forName("com.piinalpin.queryrequest.domain.common.query.FieldType");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("java.util.List");
        Object[] args = new Object[6];
        args[0] = "NTlKJDDWlk";
        args[1] = null;
        args[2] = enum108;
        args[3] = term35979;
        args[4] = term35980;
        args[5] = term35981;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


