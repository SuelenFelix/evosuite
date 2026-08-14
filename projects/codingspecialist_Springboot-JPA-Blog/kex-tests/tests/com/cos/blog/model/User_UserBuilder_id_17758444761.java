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
import java.lang.Integer;

public class User_UserBuilder_id_17758444761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11313;
     Object term11375;

    public User_UserBuilder_id_17758444761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11408 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term11407 = ((Class) term11408).getDeclaredField((String) "ADMIN");
        ((Field) term11407).setAccessible(true);
        Object enum21 = ((Field) term11407).get((Object) null);
        term11313 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        Object term11372 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term11313, term11313.getClass(), "id", 768407648);
        setField(term11313, term11313.getClass(), "username", "laTITSWZuc");
        setField(term11313, term11313.getClass(), "password", "fkzRpxlAqS");
        setField(term11313, term11313.getClass(), "email", "VYvbTGKslj");
        setField(term11313, term11313.getClass(), "role", enum21);
        setField(term11313, term11313.getClass(), "oauth", "owLqDDnwZA");
        setIntField(term11372, term11372.getClass(), "nanos", 146000000);
        setLongField(term11372, term11372.getClass(), "fastTime", 1342867076000L);
        setField(term11372, term11372.getClass(), "cdate", null);
        setField(term11313, term11313.getClass(), "createDate", term11372);
        term11375 = new Integer(-350454594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11375;
        callMethod(klass, "id", argTypes, term11313, args);
    }

};


