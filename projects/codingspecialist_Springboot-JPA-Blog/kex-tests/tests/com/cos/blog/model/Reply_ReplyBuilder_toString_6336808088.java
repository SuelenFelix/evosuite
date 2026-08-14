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

public class Reply_ReplyBuilder_toString_6336808088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39970;

    public Reply_ReplyBuilder_toString_6336808088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40218 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term40217 = ((Class) term40218).getDeclaredField((String) "USER");
        ((Field) term40217).setAccessible(true);
        Object enum90 = ((Field) term40217).get((Object) null);
        Object term40069 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term40069, term40069.getClass(), "id", 1397781598);
        setField(term40069, term40069.getClass(), "content", null);
        setField(term40069, term40069.getClass(), "board", null);
        setField(term40069, term40069.getClass(), "user", null);
        setField(term40069, term40069.getClass(), "createDate", null);
        Object term40071 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term40071, term40071.getClass(), "id", 0);
        setField(term40071, term40071.getClass(), "content", null);
        setField(term40071, term40071.getClass(), "board", null);
        setField(term40071, term40071.getClass(), "user", null);
        setField(term40071, term40071.getClass(), "createDate", null);
        ArrayList term40067 = new ArrayList();
        ((ArrayList) term40067).add(term40069);
        ((ArrayList) term40067).add(term40071);
        Class<? extends Object> term40412 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term40411 = ((Class) term40412).getDeclaredField((String) "ADMIN");
        ((Field) term40411).setAccessible(true);
        Object enum91 = ((Field) term40411).get((Object) null);
        term39970 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term39984 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term40011 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term40064 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term40075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40080 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40085 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term40144 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term40147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40152 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term39970, term39970.getClass(), "id", 638046409);
        setField(term39970, term39970.getClass(), "content", "gRmiKAUyCW");
        setIntField(term39984, term39984.getClass(), "id", 427274898);
        setField(term39984, term39984.getClass(), "title", "rfXVAViErl");
        setField(term39984, term39984.getClass(), "content", "GcMaBtNShc");
        setIntField(term39984, term39984.getClass(), "count", -1654552020);
        setIntField(term40011, term40011.getClass(), "id", -1049546692);
        setField(term40011, term40011.getClass(), "username", "kqGufqJbqf");
        setField(term40011, term40011.getClass(), "password", "wqMYxsvXwx");
        setField(term40011, term40011.getClass(), "email", "qUfONYtlAU");
        setField(term40011, term40011.getClass(), "role", enum90);
        setField(term40011, term40011.getClass(), "oauth", "QMHmlsCFoq");
        setIntField(term40064, term40064.getClass(), "nanos", 749000000);
        setLongField(term40064, term40064.getClass(), "fastTime", 1644588349000L);
        setField(term40064, term40064.getClass(), "cdate", null);
        setField(term40011, term40011.getClass(), "createDate", term40064);
        setField(term39984, term39984.getClass(), "user", term40011);
        setField(term39984, term39984.getClass(), "replys", term40067);
        setIntField(term40076, term40076.getClass(), "year", 2026);
        setShortField(term40076, term40076.getClass(), "month", (short) 11);
        setShortField(term40076, term40076.getClass(), "day", (short) 25);
        setField(term40075, term40075.getClass(), "date", term40076);
        setByteField(term40080, term40080.getClass(), "hour", (byte) 12);
        setByteField(term40080, term40080.getClass(), "minute", (byte) 39);
        setByteField(term40080, term40080.getClass(), "second", (byte) 8);
        setIntField(term40080, term40080.getClass(), "nano", 444272669);
        setField(term40075, term40075.getClass(), "time", term40080);
        setField(term39984, term39984.getClass(), "createDate", term40075);
        setField(term39970, term39970.getClass(), "board", term39984);
        setIntField(term40085, term40085.getClass(), "id", -1042022818);
        setField(term40085, term40085.getClass(), "username", "DejzaVMRwf");
        setField(term40085, term40085.getClass(), "password", "vpcvPRFXOI");
        setField(term40085, term40085.getClass(), "email", "LpBQSpICQX");
        setField(term40085, term40085.getClass(), "role", enum91);
        setField(term40085, term40085.getClass(), "oauth", "uPhRdRCFnR");
        setIntField(term40144, term40144.getClass(), "nanos", 255000000);
        setLongField(term40144, term40144.getClass(), "fastTime", 1796684752000L);
        setField(term40144, term40144.getClass(), "cdate", null);
        setField(term40085, term40085.getClass(), "createDate", term40144);
        setField(term39970, term39970.getClass(), "user", term40085);
        setIntField(term40148, term40148.getClass(), "year", 2023);
        setShortField(term40148, term40148.getClass(), "month", (short) 1);
        setShortField(term40148, term40148.getClass(), "day", (short) 9);
        setField(term40147, term40147.getClass(), "date", term40148);
        setByteField(term40152, term40152.getClass(), "hour", (byte) 5);
        setByteField(term40152, term40152.getClass(), "minute", (byte) 45);
        setByteField(term40152, term40152.getClass(), "second", (byte) 39);
        setIntField(term40152, term40152.getClass(), "nano", 734895244);
        setField(term40147, term40147.getClass(), "time", term40152);
        setField(term39970, term39970.getClass(), "createDate", term40147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term39970, args);
    }

};


