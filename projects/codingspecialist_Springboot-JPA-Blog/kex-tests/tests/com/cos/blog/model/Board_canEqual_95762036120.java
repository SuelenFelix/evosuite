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

public class Board_canEqual_95762036120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19483;
     Object term19595;

    public Board_canEqual_95762036120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19647 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term19646 = ((Class) term19647).getDeclaredField((String) "ADMIN");
        ((Field) term19646).setAccessible(true);
        Object enum47 = ((Field) term19646).get((Object) null);
        Object term19574 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term19577 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term19580 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term19582 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term19574, term19574.getClass(), "id", 532588266);
        setField(term19574, term19574.getClass(), "content", "");
        setIntField(term19577, term19577.getClass(), "id", -1286686332);
        setField(term19577, term19577.getClass(), "title", null);
        setField(term19577, term19577.getClass(), "content", null);
        setIntField(term19577, term19577.getClass(), "count", -284885486);
        setField(term19577, term19577.getClass(), "user", null);
        setField(term19577, term19577.getClass(), "replys", null);
        setField(term19577, term19577.getClass(), "createDate", null);
        setField(term19574, term19574.getClass(), "board", term19577);
        setIntField(term19580, term19580.getClass(), "id", 0);
        setField(term19580, term19580.getClass(), "username", null);
        setField(term19580, term19580.getClass(), "password", null);
        setField(term19580, term19580.getClass(), "email", null);
        setField(term19580, term19580.getClass(), "role", null);
        setField(term19580, term19580.getClass(), "oauth", null);
        setField(term19580, term19580.getClass(), "createDate", null);
        setField(term19574, term19574.getClass(), "user", term19580);
        setField(term19582, term19582.getClass(), "date", null);
        setField(term19582, term19582.getClass(), "time", null);
        setField(term19574, term19574.getClass(), "createDate", term19582);
        ArrayList term19572 = new ArrayList();
        ((ArrayList) term19572).add(term19574);
        term19483 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term19510 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term19569 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term19585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19590 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19483, term19483.getClass(), "id", -68615285);
        setField(term19483, term19483.getClass(), "title", "EmAvkhGlPV");
        setField(term19483, term19483.getClass(), "content", "mBrbyQVzve");
        setIntField(term19483, term19483.getClass(), "count", -337504086);
        setIntField(term19510, term19510.getClass(), "id", 2074130991);
        setField(term19510, term19510.getClass(), "username", "FQODEbQeKa");
        setField(term19510, term19510.getClass(), "password", "iLsUPvsdys");
        setField(term19510, term19510.getClass(), "email", "zsglFxvzdp");
        setField(term19510, term19510.getClass(), "role", enum47);
        setField(term19510, term19510.getClass(), "oauth", "zhXtSGLnJR");
        setIntField(term19569, term19569.getClass(), "nanos", 637000000);
        setLongField(term19569, term19569.getClass(), "fastTime", 1667554008000L);
        setField(term19569, term19569.getClass(), "cdate", null);
        setField(term19510, term19510.getClass(), "createDate", term19569);
        setField(term19483, term19483.getClass(), "user", term19510);
        setField(term19483, term19483.getClass(), "replys", term19572);
        setIntField(term19586, term19586.getClass(), "year", 2027);
        setShortField(term19586, term19586.getClass(), "month", (short) 3);
        setShortField(term19586, term19586.getClass(), "day", (short) 20);
        setField(term19585, term19585.getClass(), "date", term19586);
        setByteField(term19590, term19590.getClass(), "hour", (byte) 9);
        setByteField(term19590, term19590.getClass(), "minute", (byte) 34);
        setByteField(term19590, term19590.getClass(), "second", (byte) 31);
        setIntField(term19590, term19590.getClass(), "nano", 746182707);
        setField(term19585, term19585.getClass(), "time", term19590);
        setField(term19483, term19483.getClass(), "createDate", term19585);
        term19595 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term19595;
        callMethod(klass, "canEqual", argTypes, term19483, args);
    }

};


