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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Reply_getContent_17465977546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3041;

    public Reply_getContent_17465977546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3284 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term3283 = ((Class) term3284).getDeclaredField((String) "USER");
        ((Field) term3283).setAccessible(true);
        Object enum4 = ((Field) term3283).get((Object) null);
        ArrayList term3138 = new ArrayList();
        Class<? extends Object> term3478 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term3477 = ((Class) term3478).getDeclaredField((String) "USER");
        ((Field) term3477).setAccessible(true);
        Object enum5 = ((Field) term3477).get((Object) null);
        term3041 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term3055 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term3082 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term3135 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3147 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3152 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term3210 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3218 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3041, term3041.getClass(), "id", -1034506028);
        setField(term3041, term3041.getClass(), "content", "VGizxZnyHX");
        setIntField(term3055, term3055.getClass(), "id", -1263114719);
        setField(term3055, term3055.getClass(), "title", "kVEZMHmRtR");
        setField(term3055, term3055.getClass(), "content", "ekxGuOYIwi");
        setIntField(term3055, term3055.getClass(), "count", -894662986);
        setIntField(term3082, term3082.getClass(), "id", 304775596);
        setField(term3082, term3082.getClass(), "username", "RbVQXSpxXy");
        setField(term3082, term3082.getClass(), "password", "YpJbIgJWWv");
        setField(term3082, term3082.getClass(), "email", "JppkknKVOw");
        setField(term3082, term3082.getClass(), "role", enum4);
        setField(term3082, term3082.getClass(), "oauth", "iljANwuEjk");
        setIntField(term3135, term3135.getClass(), "nanos", 580000000);
        setLongField(term3135, term3135.getClass(), "fastTime", 1437746523000L);
        setField(term3135, term3135.getClass(), "cdate", null);
        setField(term3082, term3082.getClass(), "createDate", term3135);
        setField(term3055, term3055.getClass(), "user", term3082);
        setField(term3055, term3055.getClass(), "replys", term3138);
        setIntField(term3143, term3143.getClass(), "year", 2016);
        setShortField(term3143, term3143.getClass(), "month", (short) 6);
        setShortField(term3143, term3143.getClass(), "day", (short) 15);
        setField(term3142, term3142.getClass(), "date", term3143);
        setByteField(term3147, term3147.getClass(), "hour", (byte) 21);
        setByteField(term3147, term3147.getClass(), "minute", (byte) 23);
        setByteField(term3147, term3147.getClass(), "second", (byte) 23);
        setIntField(term3147, term3147.getClass(), "nano", 433372070);
        setField(term3142, term3142.getClass(), "time", term3147);
        setField(term3055, term3055.getClass(), "createDate", term3142);
        setField(term3041, term3041.getClass(), "board", term3055);
        setIntField(term3152, term3152.getClass(), "id", -1347665717);
        setField(term3152, term3152.getClass(), "username", "kNqaJKIATy");
        setField(term3152, term3152.getClass(), "password", "vKQukfbJUd");
        setField(term3152, term3152.getClass(), "email", "lFRJFUMVbx");
        setField(term3152, term3152.getClass(), "role", enum5);
        setField(term3152, term3152.getClass(), "oauth", "sZdUNdggUW");
        setIntField(term3210, term3210.getClass(), "nanos", 825000000);
        setLongField(term3210, term3210.getClass(), "fastTime", 1668558429000L);
        setField(term3210, term3210.getClass(), "cdate", null);
        setField(term3152, term3152.getClass(), "createDate", term3210);
        setField(term3041, term3041.getClass(), "user", term3152);
        setIntField(term3214, term3214.getClass(), "year", 2012);
        setShortField(term3214, term3214.getClass(), "month", (short) 8);
        setShortField(term3214, term3214.getClass(), "day", (short) 25);
        setField(term3213, term3213.getClass(), "date", term3214);
        setByteField(term3218, term3218.getClass(), "hour", (byte) 19);
        setByteField(term3218, term3218.getClass(), "minute", (byte) 49);
        setByteField(term3218, term3218.getClass(), "second", (byte) 8);
        setIntField(term3218, term3218.getClass(), "nano", 912685024);
        setField(term3213, term3213.getClass(), "time", term3218);
        setField(term3041, term3041.getClass(), "createDate", term3213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term3041, args);
    }

};


