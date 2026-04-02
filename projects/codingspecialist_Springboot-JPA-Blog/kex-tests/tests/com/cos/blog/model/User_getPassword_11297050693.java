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

public class User_getPassword_11297050693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25817;

    public User_getPassword_11297050693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25909 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term25908 = ((Class) term25909).getDeclaredField((String) "USER");
        ((Field) term25908).setAccessible(true);
        Object enum55 = ((Field) term25908).get((Object) null);
        term25817 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term25875 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term25817, term25817.getClass(), "id", -393590701);
        setField(term25817, term25817.getClass(), "username", "tycssGWZvU");
        setField(term25817, term25817.getClass(), "password", "jcvrILwbgt");
        setField(term25817, term25817.getClass(), "email", "AphrAHzPMC");
        setField(term25817, term25817.getClass(), "role", enum55);
        setField(term25817, term25817.getClass(), "oauth", "iwismCnYjB");
        setIntField(term25875, term25875.getClass(), "nanos", 814000000);
        setLongField(term25875, term25875.getClass(), "fastTime", 1498604526000L);
        setField(term25875, term25875.getClass(), "cdate", null);
        setField(term25817, term25817.getClass(), "createDate", term25875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term25817, args);
    }

};


