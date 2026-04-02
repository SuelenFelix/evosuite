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
import java.lang.String;
import java.lang.Object;

public class User_UserBuilder_toString_6037342689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13628;

    public User_UserBuilder_toString_6037342689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13720 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term13719 = ((Class) term13720).getDeclaredField((String) "USER");
        ((Field) term13719).setAccessible(true);
        Object enum30 = ((Field) term13719).get((Object) null);
        term13628 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        Object term13686 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term13628, term13628.getClass(), "id", 1023209512);
        setField(term13628, term13628.getClass(), "username", "KSZfGbvzPE");
        setField(term13628, term13628.getClass(), "password", "YfgYGgzYER");
        setField(term13628, term13628.getClass(), "email", "IDClvDZuqE");
        setField(term13628, term13628.getClass(), "role", enum30);
        setField(term13628, term13628.getClass(), "oauth", "cMvKxpZOvg");
        setIntField(term13686, term13686.getClass(), "nanos", 464000000);
        setLongField(term13686, term13686.getClass(), "fastTime", 1724949706000L);
        setField(term13686, term13686.getClass(), "cdate", null);
        setField(term13628, term13628.getClass(), "createDate", term13686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13628, args);
    }

};


