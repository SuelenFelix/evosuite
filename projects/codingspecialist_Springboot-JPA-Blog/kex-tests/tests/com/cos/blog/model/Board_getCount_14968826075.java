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

public class Board_getCount_14968826075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14967;

    public Board_getCount_14968826075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15120 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term15119 = ((Class) term15120).getDeclaredField((String) "USER");
        ((Field) term15119).setAccessible(true);
        Object enum34 = ((Field) term15119).get((Object) null);
        ArrayList term15055 = new ArrayList();
        term14967 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term14994 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term15052 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term15059 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15060 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15064 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14967, term14967.getClass(), "id", 1916544127);
        setField(term14967, term14967.getClass(), "title", "cuWgFcYkPC");
        setField(term14967, term14967.getClass(), "content", "HfbcOKkXBm");
        setIntField(term14967, term14967.getClass(), "count", -1133405894);
        setIntField(term14994, term14994.getClass(), "id", 1289741214);
        setField(term14994, term14994.getClass(), "username", "pLbTzSMbsN");
        setField(term14994, term14994.getClass(), "password", "lFSbxerCPP");
        setField(term14994, term14994.getClass(), "email", "vjaZIyixCm");
        setField(term14994, term14994.getClass(), "role", enum34);
        setField(term14994, term14994.getClass(), "oauth", "gAAPyftlIR");
        setIntField(term15052, term15052.getClass(), "nanos", 674000000);
        setLongField(term15052, term15052.getClass(), "fastTime", 1755777777000L);
        setField(term15052, term15052.getClass(), "cdate", null);
        setField(term14994, term14994.getClass(), "createDate", term15052);
        setField(term14967, term14967.getClass(), "user", term14994);
        setField(term14967, term14967.getClass(), "replys", term15055);
        setIntField(term15060, term15060.getClass(), "year", 2020);
        setShortField(term15060, term15060.getClass(), "month", (short) 4);
        setShortField(term15060, term15060.getClass(), "day", (short) 2);
        setField(term15059, term15059.getClass(), "date", term15060);
        setByteField(term15064, term15064.getClass(), "hour", (byte) 11);
        setByteField(term15064, term15064.getClass(), "minute", (byte) 26);
        setByteField(term15064, term15064.getClass(), "second", (byte) 22);
        setIntField(term15064, term15064.getClass(), "nano", 168224721);
        setField(term15059, term15059.getClass(), "time", term15064);
        setField(term14967, term14967.getClass(), "createDate", term15059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCount", argTypes, term14967, args);
    }

};


