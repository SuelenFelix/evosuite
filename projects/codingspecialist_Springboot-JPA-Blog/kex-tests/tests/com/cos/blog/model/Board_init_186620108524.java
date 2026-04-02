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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class Board_init_186620108524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20542;
     Object term20568;
     Object term20570;
     Object term20631;
     Object term20634;

    public Board_init_186620108524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20542 = new Integer(1985432430);
        term20568 = new Integer(-1769933499);
        Class<? extends Object> term20695 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term20694 = ((Class) term20695).getDeclaredField((String) "USER");
        ((Field) term20694).setAccessible(true);
        Object enum50 = ((Field) term20694).get((Object) null);
        term20570 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term20628 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term20570, term20570.getClass(), "id", -1510932472);
        setField(term20570, term20570.getClass(), "username", "MQvSpklpkB");
        setField(term20570, term20570.getClass(), "password", "SbTxRdDQQc");
        setField(term20570, term20570.getClass(), "email", "MrVdoUYAdO");
        setField(term20570, term20570.getClass(), "role", enum50);
        setField(term20570, term20570.getClass(), "oauth", "schPUnVfDW");
        setIntField(term20628, term20628.getClass(), "nanos", 858000000);
        setLongField(term20628, term20628.getClass(), "fastTime", 1418894925000L);
        setField(term20628, term20628.getClass(), "cdate", null);
        setField(term20570, term20570.getClass(), "createDate", term20628);
        term20631 = new LinkedList();
        term20634 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20639 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20635, term20635.getClass(), "year", 2021);
        setShortField(term20635, term20635.getClass(), "month", (short) 5);
        setShortField(term20635, term20635.getClass(), "day", (short) 7);
        setField(term20634, term20634.getClass(), "date", term20635);
        setByteField(term20639, term20639.getClass(), "hour", (byte) 16);
        setByteField(term20639, term20639.getClass(), "minute", (byte) 55);
        setByteField(term20639, term20639.getClass(), "second", (byte) 11);
        setIntField(term20639, term20639.getClass(), "nano", 243196047);
        setField(term20634, term20634.getClass(), "time", term20639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("com.cos.blog.model.User");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[7];
        args[0] = term20542;
        args[1] = "zaljyXXCoy";
        args[2] = "dKoYnXLGEI";
        args[3] = term20568;
        args[4] = term20570;
        args[5] = term20631;
        args[6] = term20634;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


