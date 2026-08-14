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

public class User_getCreateDate_11895754557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26845;

    public User_getCreateDate_11895754557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26938 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term26937 = ((Class) term26938).getDeclaredField((String) "ADMIN");
        ((Field) term26937).setAccessible(true);
        Object enum59 = ((Field) term26937).get((Object) null);
        term26845 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term26904 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term26845, term26845.getClass(), "id", -1542979444);
        setField(term26845, term26845.getClass(), "username", "COsGswsrtI");
        setField(term26845, term26845.getClass(), "password", "ebUWnoVDmk");
        setField(term26845, term26845.getClass(), "email", "wCcojFgWKb");
        setField(term26845, term26845.getClass(), "role", enum59);
        setField(term26845, term26845.getClass(), "oauth", "iHtqLPNWTt");
        setIntField(term26904, term26904.getClass(), "nanos", 23000000);
        setLongField(term26904, term26904.getClass(), "fastTime", 1401533135000L);
        setField(term26904, term26904.getClass(), "cdate", null);
        setField(term26845, term26845.getClass(), "createDate", term26904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term26845, args);
    }

};


