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

public class User_getId_21429111121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25307;

    public User_getId_21429111121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25399 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term25398 = ((Class) term25399).getDeclaredField((String) "USER");
        ((Field) term25398).setAccessible(true);
        Object enum53 = ((Field) term25398).get((Object) null);
        term25307 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term25365 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term25307, term25307.getClass(), "id", 1970654816);
        setField(term25307, term25307.getClass(), "username", "GvmOxwMrOk");
        setField(term25307, term25307.getClass(), "password", "WXUKmhwFsK");
        setField(term25307, term25307.getClass(), "email", "OcfokBTzZZ");
        setField(term25307, term25307.getClass(), "role", enum53);
        setField(term25307, term25307.getClass(), "oauth", "zeBhlhyhkL");
        setIntField(term25365, term25365.getClass(), "nanos", 971000000);
        setLongField(term25365, term25365.getClass(), "fastTime", 1837498636000L);
        setField(term25365, term25365.getClass(), "cdate", null);
        setField(term25307, term25307.getClass(), "createDate", term25365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term25307, args);
    }

};


