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

public class Reply_ReplyBuilder_build_9069698707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39529;

    public Reply_ReplyBuilder_build_9069698707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39764 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term39763 = ((Class) term39764).getDeclaredField((String) "ADMIN");
        ((Field) term39763).setAccessible(true);
        Object enum89 = ((Field) term39763).get((Object) null);
        ArrayList term39626 = new ArrayList();
        term39529 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term39543 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term39570 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term39623 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term39630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39635 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39640 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term39690 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term39693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39698 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term39529, term39529.getClass(), "id", 1235736068);
        setField(term39529, term39529.getClass(), "content", "IaRILCkXUB");
        setIntField(term39543, term39543.getClass(), "id", 329424176);
        setField(term39543, term39543.getClass(), "title", "XRaUSsHhJf");
        setField(term39543, term39543.getClass(), "content", "ndknwPavsb");
        setIntField(term39543, term39543.getClass(), "count", -1897199214);
        setIntField(term39570, term39570.getClass(), "id", -1016478729);
        setField(term39570, term39570.getClass(), "username", "XbwSBHmjuZ");
        setField(term39570, term39570.getClass(), "password", "vHdYsSmEmG");
        setField(term39570, term39570.getClass(), "email", "UDIVCqBmxp");
        setField(term39570, term39570.getClass(), "role", enum89);
        setField(term39570, term39570.getClass(), "oauth", "npyBQorcHP");
        setIntField(term39623, term39623.getClass(), "nanos", 668000000);
        setLongField(term39623, term39623.getClass(), "fastTime", 1476956500000L);
        setField(term39623, term39623.getClass(), "cdate", null);
        setField(term39570, term39570.getClass(), "createDate", term39623);
        setField(term39543, term39543.getClass(), "user", term39570);
        setField(term39543, term39543.getClass(), "replys", term39626);
        setIntField(term39631, term39631.getClass(), "year", 2015);
        setShortField(term39631, term39631.getClass(), "month", (short) 5);
        setShortField(term39631, term39631.getClass(), "day", (short) 30);
        setField(term39630, term39630.getClass(), "date", term39631);
        setByteField(term39635, term39635.getClass(), "hour", (byte) 6);
        setByteField(term39635, term39635.getClass(), "minute", (byte) 20);
        setByteField(term39635, term39635.getClass(), "second", (byte) 29);
        setIntField(term39635, term39635.getClass(), "nano", 871322714);
        setField(term39630, term39630.getClass(), "time", term39635);
        setField(term39543, term39543.getClass(), "createDate", term39630);
        setField(term39529, term39529.getClass(), "board", term39543);
        setIntField(term39640, term39640.getClass(), "id", -206889003);
        setField(term39640, term39640.getClass(), "username", "pzvYCQwkoA");
        setField(term39640, term39640.getClass(), "password", "TGLDiqWTkO");
        setField(term39640, term39640.getClass(), "email", "NwjEUxXUkk");
        setField(term39640, term39640.getClass(), "role", enum89);
        setField(term39640, term39640.getClass(), "oauth", "CFBoXISoRu");
        setIntField(term39690, term39690.getClass(), "nanos", 666000000);
        setLongField(term39690, term39690.getClass(), "fastTime", 1730028404000L);
        setField(term39690, term39690.getClass(), "cdate", null);
        setField(term39640, term39640.getClass(), "createDate", term39690);
        setField(term39529, term39529.getClass(), "user", term39640);
        setIntField(term39694, term39694.getClass(), "year", 2029);
        setShortField(term39694, term39694.getClass(), "month", (short) 9);
        setShortField(term39694, term39694.getClass(), "day", (short) 21);
        setField(term39693, term39693.getClass(), "date", term39694);
        setByteField(term39698, term39698.getClass(), "hour", (byte) 3);
        setByteField(term39698, term39698.getClass(), "minute", (byte) 36);
        setByteField(term39698, term39698.getClass(), "second", (byte) 11);
        setIntField(term39698, term39698.getClass(), "nano", 295278203);
        setField(term39693, term39693.getClass(), "time", term39698);
        setField(term39529, term39529.getClass(), "createDate", term39693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term39529, args);
    }

};


