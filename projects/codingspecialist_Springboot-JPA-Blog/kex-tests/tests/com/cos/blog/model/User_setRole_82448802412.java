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

public class User_setRole_82448802412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28200;
     Object enum64;

    public User_setRole_82448802412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28292 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term28291 = ((Class) term28292).getDeclaredField((String) "USER");
        ((Field) term28291).setAccessible(true);
        enum64 = ((Field) term28291).get((Object) null);
        term28200 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term28258 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term28200, term28200.getClass(), "id", 613256157);
        setField(term28200, term28200.getClass(), "username", "TeqSJDWXQD");
        setField(term28200, term28200.getClass(), "password", "XNgNLbjmim");
        setField(term28200, term28200.getClass(), "email", "InNyZMCrst");
        setField(term28200, term28200.getClass(), "role", enum64);
        setField(term28200, term28200.getClass(), "oauth", "llSJDzNeEq");
        setIntField(term28258, term28258.getClass(), "nanos", 21000000);
        setLongField(term28258, term28258.getClass(), "fastTime", 1791283637000L);
        setField(term28258, term28258.getClass(), "cdate", null);
        setField(term28200, term28200.getClass(), "createDate", term28258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.RoleType");
        Object[] args = new Object[1];
        args[0] = enum64;
        callMethod(klass, "setRole", argTypes, term28200, args);
    }

};


