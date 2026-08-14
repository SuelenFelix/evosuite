package com.cos.blog.service;

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
import static com.cos.blog.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UserService__2782315313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public UserService__2782315313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term387 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term386 = ((Class) term387).getDeclaredField((String) "USER");
        ((Field) term386).setAccessible(true);
        Object enum1 = ((Field) term386).get((Object) null);
        term295 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term353 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term295, term295.getClass(), "id", 1162663216);
        setField(term295, term295.getClass(), "username", "EGtDIRbSSb");
        setField(term295, term295.getClass(), "password", "SzjVpOQTyS");
        setField(term295, term295.getClass(), "email", "MjGYSRKTNF");
        setField(term295, term295.getClass(), "role", enum1);
        setField(term295, term295.getClass(), "oauth", "hRNSzYYIrc");
        setIntField(term353, term353.getClass(), "nanos", 369000000);
        setLongField(term353, term353.getClass(), "fastTime", 1480427551000L);
        setField(term353, term353.getClass(), "cdate", null);
        setField(term295, term295.getClass(), "createDate", term353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.User");
        Object[] args = new Object[1];
        args[0] = term295;
        callMethod(klass, "회원수정", argTypes, null, args);
    }

};


