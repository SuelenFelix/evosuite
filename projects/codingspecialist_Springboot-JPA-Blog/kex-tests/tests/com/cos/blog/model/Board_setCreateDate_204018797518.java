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

public class Board_setCreateDate_204018797518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18791;
     Object term18920;

    public Board_setCreateDate_204018797518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18981 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term18980 = ((Class) term18981).getDeclaredField((String) "USER");
        ((Field) term18980).setAccessible(true);
        Object enum45 = ((Field) term18980).get((Object) null);
        Object term18881 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term18884 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term18887 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term18889 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term18881, term18881.getClass(), "id", 1868344256);
        setField(term18881, term18881.getClass(), "content", "");
        setIntField(term18884, term18884.getClass(), "id", 1857693976);
        setField(term18884, term18884.getClass(), "title", null);
        setField(term18884, term18884.getClass(), "content", null);
        setIntField(term18884, term18884.getClass(), "count", 1631305277);
        setField(term18884, term18884.getClass(), "user", null);
        setField(term18884, term18884.getClass(), "replys", null);
        setField(term18884, term18884.getClass(), "createDate", null);
        setField(term18881, term18881.getClass(), "board", term18884);
        setIntField(term18887, term18887.getClass(), "id", 1894454926);
        setField(term18887, term18887.getClass(), "username", null);
        setField(term18887, term18887.getClass(), "password", null);
        setField(term18887, term18887.getClass(), "email", null);
        setField(term18887, term18887.getClass(), "role", null);
        setField(term18887, term18887.getClass(), "oauth", null);
        setField(term18887, term18887.getClass(), "createDate", null);
        setField(term18881, term18881.getClass(), "user", term18887);
        setField(term18889, term18889.getClass(), "date", null);
        setField(term18889, term18889.getClass(), "time", null);
        setField(term18881, term18881.getClass(), "createDate", term18889);
        Object term18890 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term18893 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term18896 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term18898 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term18890, term18890.getClass(), "id", -932147928);
        setField(term18890, term18890.getClass(), "content", "");
        setIntField(term18893, term18893.getClass(), "id", 487369012);
        setField(term18893, term18893.getClass(), "title", null);
        setField(term18893, term18893.getClass(), "content", null);
        setIntField(term18893, term18893.getClass(), "count", -179238712);
        setField(term18893, term18893.getClass(), "user", null);
        setField(term18893, term18893.getClass(), "replys", null);
        setField(term18893, term18893.getClass(), "createDate", null);
        setField(term18890, term18890.getClass(), "board", term18893);
        setIntField(term18896, term18896.getClass(), "id", 0);
        setField(term18896, term18896.getClass(), "username", null);
        setField(term18896, term18896.getClass(), "password", null);
        setField(term18896, term18896.getClass(), "email", null);
        setField(term18896, term18896.getClass(), "role", null);
        setField(term18896, term18896.getClass(), "oauth", null);
        setField(term18896, term18896.getClass(), "createDate", null);
        setField(term18890, term18890.getClass(), "user", term18896);
        setField(term18898, term18898.getClass(), "date", null);
        setField(term18898, term18898.getClass(), "time", null);
        setField(term18890, term18890.getClass(), "createDate", term18898);
        Object term18899 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term18902 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term18905 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term18907 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term18899, term18899.getClass(), "id", -1165271567);
        setField(term18899, term18899.getClass(), "content", "");
        setIntField(term18902, term18902.getClass(), "id", 0);
        setField(term18902, term18902.getClass(), "title", null);
        setField(term18902, term18902.getClass(), "content", null);
        setIntField(term18902, term18902.getClass(), "count", 0);
        setField(term18902, term18902.getClass(), "user", null);
        setField(term18902, term18902.getClass(), "replys", null);
        setField(term18902, term18902.getClass(), "createDate", null);
        setField(term18899, term18899.getClass(), "board", term18902);
        setIntField(term18905, term18905.getClass(), "id", 0);
        setField(term18905, term18905.getClass(), "username", null);
        setField(term18905, term18905.getClass(), "password", null);
        setField(term18905, term18905.getClass(), "email", null);
        setField(term18905, term18905.getClass(), "role", null);
        setField(term18905, term18905.getClass(), "oauth", null);
        setField(term18905, term18905.getClass(), "createDate", null);
        setField(term18899, term18899.getClass(), "user", term18905);
        setField(term18907, term18907.getClass(), "date", null);
        setField(term18907, term18907.getClass(), "time", null);
        setField(term18899, term18899.getClass(), "createDate", term18907);
        ArrayList term18879 = new ArrayList();
        ((ArrayList) term18879).add(term18881);
        ((ArrayList) term18879).add(term18890);
        ((ArrayList) term18879).add(term18899);
        ((ArrayList) term18879).add(term18899);
        term18791 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term18818 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term18876 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term18910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18915 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term18791, term18791.getClass(), "id", -128435804);
        setField(term18791, term18791.getClass(), "title", "qOZXeUUmdz");
        setField(term18791, term18791.getClass(), "content", "FCovVZHqPx");
        setIntField(term18791, term18791.getClass(), "count", 2136158480);
        setIntField(term18818, term18818.getClass(), "id", 2118747457);
        setField(term18818, term18818.getClass(), "username", "jSTBfkWjge");
        setField(term18818, term18818.getClass(), "password", "uKYhZULSHp");
        setField(term18818, term18818.getClass(), "email", "xdYuLllgpn");
        setField(term18818, term18818.getClass(), "role", enum45);
        setField(term18818, term18818.getClass(), "oauth", "ayonlqalLA");
        setIntField(term18876, term18876.getClass(), "nanos", 188000000);
        setLongField(term18876, term18876.getClass(), "fastTime", 1330516243000L);
        setField(term18876, term18876.getClass(), "cdate", null);
        setField(term18818, term18818.getClass(), "createDate", term18876);
        setField(term18791, term18791.getClass(), "user", term18818);
        setField(term18791, term18791.getClass(), "replys", term18879);
        setIntField(term18911, term18911.getClass(), "year", 2022);
        setShortField(term18911, term18911.getClass(), "month", (short) 4);
        setShortField(term18911, term18911.getClass(), "day", (short) 2);
        setField(term18910, term18910.getClass(), "date", term18911);
        setByteField(term18915, term18915.getClass(), "hour", (byte) 21);
        setByteField(term18915, term18915.getClass(), "minute", (byte) 1);
        setByteField(term18915, term18915.getClass(), "second", (byte) 56);
        setIntField(term18915, term18915.getClass(), "nano", 418299217);
        setField(term18910, term18910.getClass(), "time", term18915);
        setField(term18791, term18791.getClass(), "createDate", term18910);
        term18920 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18921 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18925 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term18921, term18921.getClass(), "year", 2025);
        setShortField(term18921, term18921.getClass(), "month", (short) 9);
        setShortField(term18921, term18921.getClass(), "day", (short) 5);
        setField(term18920, term18920.getClass(), "date", term18921);
        setByteField(term18925, term18925.getClass(), "hour", (byte) 11);
        setByteField(term18925, term18925.getClass(), "minute", (byte) 59);
        setByteField(term18925, term18925.getClass(), "second", (byte) 37);
        setIntField(term18925, term18925.getClass(), "nano", 93740487);
        setField(term18920, term18920.getClass(), "time", term18925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term18920;
        callMethod(klass, "setCreateDate", argTypes, term18791, args);
    }

};


