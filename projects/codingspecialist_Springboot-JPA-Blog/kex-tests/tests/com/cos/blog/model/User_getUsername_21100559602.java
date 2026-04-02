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

public class User_getUsername_21100559602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25562;

    public User_getUsername_21100559602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25654 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term25653 = ((Class) term25654).getDeclaredField((String) "USER");
        ((Field) term25653).setAccessible(true);
        Object enum54 = ((Field) term25653).get((Object) null);
        term25562 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term25620 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term25562, term25562.getClass(), "id", 1354781442);
        setField(term25562, term25562.getClass(), "username", "PxinRhWgwT");
        setField(term25562, term25562.getClass(), "password", "pZcEKUNIXL");
        setField(term25562, term25562.getClass(), "email", "QbRtvZIDtW");
        setField(term25562, term25562.getClass(), "role", enum54);
        setField(term25562, term25562.getClass(), "oauth", "fbsmDvjMqr");
        setIntField(term25620, term25620.getClass(), "nanos", 235000000);
        setLongField(term25620, term25620.getClass(), "fastTime", 1732167331000L);
        setField(term25620, term25620.getClass(), "cdate", null);
        setField(term25562, term25562.getClass(), "createDate", term25620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term25562, args);
    }

};


