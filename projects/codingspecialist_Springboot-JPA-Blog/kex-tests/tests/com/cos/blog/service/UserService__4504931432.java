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

public class UserService__4504931432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public UserService__4504931432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term132 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term131 = ((Class) term132).getDeclaredField((String) "USER");
        ((Field) term131).setAccessible(true);
        Object enum0 = ((Field) term131).get((Object) null);
        term23 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term81 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term23, term23.getClass(), "id", 568599855);
        setField(term23, term23.getClass(), "username", "sjlJAEtRrb");
        setField(term23, term23.getClass(), "password", "MuLcgQHgqz");
        setField(term23, term23.getClass(), "email", "xxtlPwDYFs");
        setField(term23, term23.getClass(), "role", enum0);
        setField(term23, term23.getClass(), "oauth", "jJCZpVmanW");
        setIntField(term81, term81.getClass(), "nanos", 244000000);
        setLongField(term81, term81.getClass(), "fastTime", 1345860612000L);
        setField(term81, term81.getClass(), "cdate", null);
        setField(term23, term23.getClass(), "createDate", term81);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cos.blog.model.User");
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "회원가입", argTypes, null, args);
    }

};


