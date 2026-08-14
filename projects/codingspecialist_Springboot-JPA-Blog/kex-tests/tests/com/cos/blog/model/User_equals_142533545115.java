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

public class User_equals_142533545115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28990;
     Object term29052;

    public User_equals_142533545115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29084 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term29083 = ((Class) term29084).getDeclaredField((String) "ADMIN");
        ((Field) term29083).setAccessible(true);
        Object enum67 = ((Field) term29083).get((Object) null);
        term28990 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term29049 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term28990, term28990.getClass(), "id", -1495693617);
        setField(term28990, term28990.getClass(), "username", "PNJdNWkxgW");
        setField(term28990, term28990.getClass(), "password", "aCTJvzQZSQ");
        setField(term28990, term28990.getClass(), "email", "hcvedmWnmW");
        setField(term28990, term28990.getClass(), "role", enum67);
        setField(term28990, term28990.getClass(), "oauth", "rBZaHWidIS");
        setIntField(term29049, term29049.getClass(), "nanos", 444000000);
        setLongField(term29049, term29049.getClass(), "fastTime", 1549827958000L);
        setField(term29049, term29049.getClass(), "cdate", null);
        setField(term28990, term28990.getClass(), "createDate", term29049);
        term29052 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29052;
        callMethod(klass, "equals", argTypes, term28990, args);
    }

};


