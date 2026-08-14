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

public class User_getEmail_4659100144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26072;

    public User_getEmail_4659100144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26164 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term26163 = ((Class) term26164).getDeclaredField((String) "USER");
        ((Field) term26163).setAccessible(true);
        Object enum56 = ((Field) term26163).get((Object) null);
        term26072 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term26130 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term26072, term26072.getClass(), "id", 86344574);
        setField(term26072, term26072.getClass(), "username", "GerBZdiruT");
        setField(term26072, term26072.getClass(), "password", "VzkPDPPGQl");
        setField(term26072, term26072.getClass(), "email", "iojOXjfZFr");
        setField(term26072, term26072.getClass(), "role", enum56);
        setField(term26072, term26072.getClass(), "oauth", "yyrkuIYJKj");
        setIntField(term26130, term26130.getClass(), "nanos", 879000000);
        setLongField(term26130, term26130.getClass(), "fastTime", 1578532431000L);
        setField(term26130, term26130.getClass(), "cdate", null);
        setField(term26072, term26072.getClass(), "createDate", term26130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term26072, args);
    }

};


