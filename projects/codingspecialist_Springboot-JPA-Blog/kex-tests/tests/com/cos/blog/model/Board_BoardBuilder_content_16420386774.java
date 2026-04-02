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

public class Board_BoardBuilder_content_16420386774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33433;

    public Board_BoardBuilder_content_16420386774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33625 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term33624 = ((Class) term33625).getDeclaredField((String) "USER");
        ((Field) term33624).setAccessible(true);
        Object enum77 = ((Field) term33624).get((Object) null);
        Object term33523 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term33526 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term33529 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term33531 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term33523, term33523.getClass(), "id", -1644358555);
        setField(term33523, term33523.getClass(), "content", "");
        setIntField(term33526, term33526.getClass(), "id", -388591034);
        setField(term33526, term33526.getClass(), "title", null);
        setField(term33526, term33526.getClass(), "content", null);
        setIntField(term33526, term33526.getClass(), "count", -1270258033);
        setField(term33526, term33526.getClass(), "user", null);
        setField(term33526, term33526.getClass(), "replys", null);
        setField(term33526, term33526.getClass(), "createDate", null);
        setField(term33523, term33523.getClass(), "board", term33526);
        setIntField(term33529, term33529.getClass(), "id", 1677994069);
        setField(term33529, term33529.getClass(), "username", null);
        setField(term33529, term33529.getClass(), "password", null);
        setField(term33529, term33529.getClass(), "email", null);
        setField(term33529, term33529.getClass(), "role", enum77);
        setField(term33529, term33529.getClass(), "oauth", null);
        setField(term33529, term33529.getClass(), "createDate", null);
        setField(term33523, term33523.getClass(), "user", term33529);
        setField(term33531, term33531.getClass(), "date", null);
        setField(term33531, term33531.getClass(), "time", null);
        setField(term33523, term33523.getClass(), "createDate", term33531);
        Object term33532 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term33535 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term33538 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term33540 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term33532, term33532.getClass(), "id", 1761540885);
        setField(term33532, term33532.getClass(), "content", "");
        setIntField(term33535, term33535.getClass(), "id", 0);
        setField(term33535, term33535.getClass(), "title", null);
        setField(term33535, term33535.getClass(), "content", null);
        setIntField(term33535, term33535.getClass(), "count", 0);
        setField(term33535, term33535.getClass(), "user", null);
        setField(term33535, term33535.getClass(), "replys", null);
        setField(term33535, term33535.getClass(), "createDate", null);
        setField(term33532, term33532.getClass(), "board", term33535);
        setIntField(term33538, term33538.getClass(), "id", -1242946317);
        setField(term33538, term33538.getClass(), "username", null);
        setField(term33538, term33538.getClass(), "password", null);
        setField(term33538, term33538.getClass(), "email", null);
        setField(term33538, term33538.getClass(), "role", enum77);
        setField(term33538, term33538.getClass(), "oauth", null);
        setField(term33538, term33538.getClass(), "createDate", null);
        setField(term33532, term33532.getClass(), "user", term33538);
        setField(term33540, term33540.getClass(), "date", null);
        setField(term33540, term33540.getClass(), "time", null);
        setField(term33532, term33532.getClass(), "createDate", term33540);
        Object term33541 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term33544 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term33547 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term33549 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term33541, term33541.getClass(), "id", -1541566235);
        setField(term33541, term33541.getClass(), "content", "");
        setIntField(term33544, term33544.getClass(), "id", -189738995);
        setField(term33544, term33544.getClass(), "title", null);
        setField(term33544, term33544.getClass(), "content", null);
        setIntField(term33544, term33544.getClass(), "count", 1943019963);
        setField(term33544, term33544.getClass(), "user", null);
        setField(term33544, term33544.getClass(), "replys", null);
        setField(term33544, term33544.getClass(), "createDate", null);
        setField(term33541, term33541.getClass(), "board", term33544);
        setIntField(term33547, term33547.getClass(), "id", 594705497);
        setField(term33547, term33547.getClass(), "username", null);
        setField(term33547, term33547.getClass(), "password", null);
        setField(term33547, term33547.getClass(), "email", null);
        setField(term33547, term33547.getClass(), "role", null);
        setField(term33547, term33547.getClass(), "oauth", null);
        setField(term33547, term33547.getClass(), "createDate", null);
        setField(term33541, term33541.getClass(), "user", term33547);
        setField(term33549, term33549.getClass(), "date", null);
        setField(term33549, term33549.getClass(), "time", null);
        setField(term33541, term33541.getClass(), "createDate", term33549);
        ArrayList term33521 = new ArrayList();
        ((ArrayList) term33521).add(term33523);
        ((ArrayList) term33521).add(term33532);
        ((ArrayList) term33521).add(term33541);
        ((ArrayList) term33521).add(term33541);
        term33433 = newInstance(Class.forName("com.cos.blog.model.Board$BoardBuilder"));
        Object term33460 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term33518 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term33552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33557 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term33433, term33433.getClass(), "id", -1549603566);
        setField(term33433, term33433.getClass(), "title", "CFGOXMbAUn");
        setField(term33433, term33433.getClass(), "content", "OxlZVhvedR");
        setIntField(term33433, term33433.getClass(), "count", 1077223540);
        setIntField(term33460, term33460.getClass(), "id", -1823813592);
        setField(term33460, term33460.getClass(), "username", "eoDtSQyUsr");
        setField(term33460, term33460.getClass(), "password", "RMTgBohsAX");
        setField(term33460, term33460.getClass(), "email", "kdYeXJnJGG");
        setField(term33460, term33460.getClass(), "role", enum77);
        setField(term33460, term33460.getClass(), "oauth", "XEdoshuvxD");
        setIntField(term33518, term33518.getClass(), "nanos", 295000000);
        setLongField(term33518, term33518.getClass(), "fastTime", 1629683099000L);
        setField(term33518, term33518.getClass(), "cdate", null);
        setField(term33460, term33460.getClass(), "createDate", term33518);
        setField(term33433, term33433.getClass(), "user", term33460);
        setField(term33433, term33433.getClass(), "replys", term33521);
        setIntField(term33553, term33553.getClass(), "year", 2015);
        setShortField(term33553, term33553.getClass(), "month", (short) 11);
        setShortField(term33553, term33553.getClass(), "day", (short) 12);
        setField(term33552, term33552.getClass(), "date", term33553);
        setByteField(term33557, term33557.getClass(), "hour", (byte) 8);
        setByteField(term33557, term33557.getClass(), "minute", (byte) 57);
        setByteField(term33557, term33557.getClass(), "second", (byte) 39);
        setIntField(term33557, term33557.getClass(), "nano", 144990931);
        setField(term33552, term33552.getClass(), "time", term33557);
        setField(term33433, term33433.getClass(), "createDate", term33552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board$BoardBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "csnhUIxUaP";
        callMethod(klass, "content", argTypes, term33433, args);
    }

};


