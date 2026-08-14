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

public class User_setEmail_88957843011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27919;

    public User_setEmail_88957843011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28024 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term28023 = ((Class) term28024).getDeclaredField((String) "ADMIN");
        ((Field) term28023).setAccessible(true);
        Object enum63 = ((Field) term28023).get((Object) null);
        term27919 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term27978 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term27919, term27919.getClass(), "id", -712023865);
        setField(term27919, term27919.getClass(), "username", "oNGVAyjCob");
        setField(term27919, term27919.getClass(), "password", "lzqPLDonds");
        setField(term27919, term27919.getClass(), "email", "gCFzBxPZKw");
        setField(term27919, term27919.getClass(), "role", enum63);
        setField(term27919, term27919.getClass(), "oauth", "YNVbzJpOdk");
        setIntField(term27978, term27978.getClass(), "nanos", 870000000);
        setLongField(term27978, term27978.getClass(), "fastTime", 1560275598000L);
        setField(term27978, term27978.getClass(), "cdate", null);
        setField(term27919, term27919.getClass(), "createDate", term27978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CjPfMVeNPm";
        callMethod(klass, "setEmail", argTypes, term27919, args);
    }

};


