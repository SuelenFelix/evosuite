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
import java.lang.Integer;

public class Board_BoardBuilder_count_11357350565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33798;
     Object term33900;

    public Board_BoardBuilder_count_11357350565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33953 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term33952 = ((Class) term33953).getDeclaredField((String) "USER");
        ((Field) term33952).setAccessible(true);
        Object enum78 = ((Field) term33952).get((Object) null);
        ArrayList term33886 = new ArrayList();
        term33798 = newInstance(Class.forName("com.cos.blog.model.Board$BoardBuilder"));
        Object term33825 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term33883 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term33890 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33891 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33895 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term33798, term33798.getClass(), "id", -1320402633);
        setField(term33798, term33798.getClass(), "title", "fmWYICGnwt");
        setField(term33798, term33798.getClass(), "content", "FlZbOFNISk");
        setIntField(term33798, term33798.getClass(), "count", 919602316);
        setIntField(term33825, term33825.getClass(), "id", 1833713431);
        setField(term33825, term33825.getClass(), "username", "zDtePZrZQH");
        setField(term33825, term33825.getClass(), "password", "YPVZjrbvVl");
        setField(term33825, term33825.getClass(), "email", "TWsXTUTREq");
        setField(term33825, term33825.getClass(), "role", enum78);
        setField(term33825, term33825.getClass(), "oauth", "tVsPWASlsh");
        setIntField(term33883, term33883.getClass(), "nanos", 969000000);
        setLongField(term33883, term33883.getClass(), "fastTime", 1766236744000L);
        setField(term33883, term33883.getClass(), "cdate", null);
        setField(term33825, term33825.getClass(), "createDate", term33883);
        setField(term33798, term33798.getClass(), "user", term33825);
        setField(term33798, term33798.getClass(), "replys", term33886);
        setIntField(term33891, term33891.getClass(), "year", 2015);
        setShortField(term33891, term33891.getClass(), "month", (short) 3);
        setShortField(term33891, term33891.getClass(), "day", (short) 10);
        setField(term33890, term33890.getClass(), "date", term33891);
        setByteField(term33895, term33895.getClass(), "hour", (byte) 6);
        setByteField(term33895, term33895.getClass(), "minute", (byte) 11);
        setByteField(term33895, term33895.getClass(), "second", (byte) 21);
        setIntField(term33895, term33895.getClass(), "nano", 925797004);
        setField(term33890, term33890.getClass(), "time", term33895);
        setField(term33798, term33798.getClass(), "createDate", term33890);
        term33900 = new Integer(-706222608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board$BoardBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33900;
        callMethod(klass, "count", argTypes, term33798, args);
    }

};


