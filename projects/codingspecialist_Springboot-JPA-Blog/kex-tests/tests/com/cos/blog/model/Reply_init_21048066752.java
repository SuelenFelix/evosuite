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
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Reply_init_21048066752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1977;
     Object term1991;
     Object term2093;
     Object term2155;

    public Reply_init_21048066752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1977 = new Integer(1596070772);
        Class<? extends Object> term2226 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term2225 = ((Class) term2226).getDeclaredField((String) "USER");
        ((Field) term2225).setAccessible(true);
        Object enum1 = ((Field) term2225).get((Object) null);
        ArrayList term2079 = new ArrayList();
        term1991 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term2018 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term2076 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2088 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1991, term1991.getClass(), "id", 97029295);
        setField(term1991, term1991.getClass(), "title", "mXGCWJDOqA");
        setField(term1991, term1991.getClass(), "content", "dpNsDgfPso");
        setIntField(term1991, term1991.getClass(), "count", -1371869594);
        setIntField(term2018, term2018.getClass(), "id", -2095575670);
        setField(term2018, term2018.getClass(), "username", "hCWPJQKpdc");
        setField(term2018, term2018.getClass(), "password", "WzMEhMXkKx");
        setField(term2018, term2018.getClass(), "email", "XOiDvlDhdc");
        setField(term2018, term2018.getClass(), "role", enum1);
        setField(term2018, term2018.getClass(), "oauth", "AdxvLJhNLe");
        setIntField(term2076, term2076.getClass(), "nanos", 896000000);
        setLongField(term2076, term2076.getClass(), "fastTime", 1645823234000L);
        setField(term2076, term2076.getClass(), "cdate", null);
        setField(term2018, term2018.getClass(), "createDate", term2076);
        setField(term1991, term1991.getClass(), "user", term2018);
        setField(term1991, term1991.getClass(), "replys", term2079);
        setIntField(term2084, term2084.getClass(), "year", 2012);
        setShortField(term2084, term2084.getClass(), "month", (short) 9);
        setShortField(term2084, term2084.getClass(), "day", (short) 11);
        setField(term2083, term2083.getClass(), "date", term2084);
        setByteField(term2088, term2088.getClass(), "hour", (byte) 22);
        setByteField(term2088, term2088.getClass(), "minute", (byte) 10);
        setByteField(term2088, term2088.getClass(), "second", (byte) 8);
        setIntField(term2088, term2088.getClass(), "nano", 380008862);
        setField(term2083, term2083.getClass(), "time", term2088);
        setField(term1991, term1991.getClass(), "createDate", term2083);
        Class<? extends Object> term2420 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term2419 = ((Class) term2420).getDeclaredField((String) "ADMIN");
        ((Field) term2419).setAccessible(true);
        Object enum2 = ((Field) term2419).get((Object) null);
        term2093 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term2152 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term2093, term2093.getClass(), "id", 1225272962);
        setField(term2093, term2093.getClass(), "username", "lHfTrWKMPk");
        setField(term2093, term2093.getClass(), "password", "JDaAnsVTGV");
        setField(term2093, term2093.getClass(), "email", "mLUZFTfjle");
        setField(term2093, term2093.getClass(), "role", enum2);
        setField(term2093, term2093.getClass(), "oauth", "xIeFjkHkOe");
        setIntField(term2152, term2152.getClass(), "nanos", 23000000);
        setLongField(term2152, term2152.getClass(), "fastTime", 1500710268000L);
        setField(term2152, term2152.getClass(), "cdate", null);
        setField(term2093, term2093.getClass(), "createDate", term2152);
        term2155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2160 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2156, term2156.getClass(), "year", 2021);
        setShortField(term2156, term2156.getClass(), "month", (short) 9);
        setShortField(term2156, term2156.getClass(), "day", (short) 7);
        setField(term2155, term2155.getClass(), "date", term2156);
        setByteField(term2160, term2160.getClass(), "hour", (byte) 5);
        setByteField(term2160, term2160.getClass(), "minute", (byte) 25);
        setByteField(term2160, term2160.getClass(), "second", (byte) 7);
        setIntField(term2160, term2160.getClass(), "nano", 755924076);
        setField(term2155, term2155.getClass(), "time", term2160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.cos.blog.model.Board");
        argTypes[3] = Class.forName("com.cos.blog.model.User");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[5];
        args[0] = term1977;
        args[1] = "pORebkoRdD";
        args[2] = term1991;
        args[3] = term2093;
        args[4] = term2155;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


