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

public class User_hashCode_187402212617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29506;

    public User_hashCode_187402212617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29598 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term29597 = ((Class) term29598).getDeclaredField((String) "USER");
        ((Field) term29597).setAccessible(true);
        Object enum69 = ((Field) term29597).get((Object) null);
        term29506 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term29564 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term29506, term29506.getClass(), "id", -1085899912);
        setField(term29506, term29506.getClass(), "username", "XZmoxlxcKh");
        setField(term29506, term29506.getClass(), "password", "aHNGawFCfD");
        setField(term29506, term29506.getClass(), "email", "cHjhnXKTVF");
        setField(term29506, term29506.getClass(), "role", enum69);
        setField(term29506, term29506.getClass(), "oauth", "NVsXpTZPoM");
        setIntField(term29564, term29564.getClass(), "nanos", 673000000);
        setLongField(term29564, term29564.getClass(), "fastTime", 1511083798000L);
        setField(term29564, term29564.getClass(), "cdate", null);
        setField(term29506, term29506.getClass(), "createDate", term29564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term29506, args);
    }

};


