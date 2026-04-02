package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class User_init_72737572420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30020;
     Object enum71;
     Object term30079;

    public User_init_72737572420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30020 = new Integer(890505372);
        Class<? extends Object> term30113 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term30112 = ((Class) term30113).getDeclaredField((String) "ADMIN");
        ((Field) term30112).setAccessible(true);
        enum71 = ((Field) term30112).get((Object) null);
        term30079 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term30079, term30079.getClass(), "nanos", 781000000);
        setLongField(term30079, term30079.getClass(), "fastTime", 1444163840000L);
        setField(term30079, term30079.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.cos.blog.model.RoleType");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[7];
        args[0] = term30020;
        args[1] = "ODhSWAnZWd";
        args[2] = "NQkFXmkuYK";
        args[3] = "kHzsJWDHsz";
        args[4] = enum71;
        args[5] = "jIfbtgnHqt";
        args[6] = term30079;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


