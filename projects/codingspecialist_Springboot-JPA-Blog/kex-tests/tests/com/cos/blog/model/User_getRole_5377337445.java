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

public class User_getRole_5377337445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26327;

    public User_getRole_5377337445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26420 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term26419 = ((Class) term26420).getDeclaredField((String) "ADMIN");
        ((Field) term26419).setAccessible(true);
        Object enum57 = ((Field) term26419).get((Object) null);
        term26327 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term26386 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term26327, term26327.getClass(), "id", -829441157);
        setField(term26327, term26327.getClass(), "username", "reGIMbnrGF");
        setField(term26327, term26327.getClass(), "password", "yquSngBHqd");
        setField(term26327, term26327.getClass(), "email", "ZSdaJkZZPm");
        setField(term26327, term26327.getClass(), "role", enum57);
        setField(term26327, term26327.getClass(), "oauth", "ICnzwgujDT");
        setIntField(term26386, term26386.getClass(), "nanos", 939000000);
        setLongField(term26386, term26386.getClass(), "fastTime", 1476086371000L);
        setField(term26386, term26386.getClass(), "cdate", null);
        setField(term26327, term26327.getClass(), "createDate", term26386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term26327, args);
    }

};


