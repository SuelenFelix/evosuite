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

public class User_getOauth_5055633316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26586;

    public User_getOauth_5055633316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26679 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term26678 = ((Class) term26679).getDeclaredField((String) "ADMIN");
        ((Field) term26678).setAccessible(true);
        Object enum58 = ((Field) term26678).get((Object) null);
        term26586 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term26645 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term26586, term26586.getClass(), "id", -1489991025);
        setField(term26586, term26586.getClass(), "username", "RfDgUkIYjW");
        setField(term26586, term26586.getClass(), "password", "QnZKCwkmMh");
        setField(term26586, term26586.getClass(), "email", "RVQbteztJx");
        setField(term26586, term26586.getClass(), "role", enum58);
        setField(term26586, term26586.getClass(), "oauth", "yjmUdvwSdd");
        setIntField(term26645, term26645.getClass(), "nanos", 111000000);
        setLongField(term26645, term26645.getClass(), "fastTime", 1890426666000L);
        setField(term26645, term26645.getClass(), "cdate", null);
        setField(term26586, term26586.getClass(), "createDate", term26645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOauth", argTypes, term26586, args);
    }

};


