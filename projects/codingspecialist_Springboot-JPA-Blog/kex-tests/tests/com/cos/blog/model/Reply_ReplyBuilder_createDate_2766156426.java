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

public class Reply_ReplyBuilder_createDate_2766156426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39075;
     Object term39255;

    public Reply_ReplyBuilder_createDate_2766156426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39326 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term39325 = ((Class) term39326).getDeclaredField((String) "USER");
        ((Field) term39325).setAccessible(true);
        Object enum88 = ((Field) term39325).get((Object) null);
        Object term39174 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term39174, term39174.getClass(), "id", 1692543802);
        setField(term39174, term39174.getClass(), "content", null);
        setField(term39174, term39174.getClass(), "board", null);
        setField(term39174, term39174.getClass(), "user", null);
        setField(term39174, term39174.getClass(), "createDate", null);
        Object term39176 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term39176, term39176.getClass(), "id", 0);
        setField(term39176, term39176.getClass(), "content", null);
        setField(term39176, term39176.getClass(), "board", null);
        setField(term39176, term39176.getClass(), "user", null);
        setField(term39176, term39176.getClass(), "createDate", null);
        Object term39178 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term39178, term39178.getClass(), "id", 680714112);
        setField(term39178, term39178.getClass(), "content", null);
        setField(term39178, term39178.getClass(), "board", null);
        setField(term39178, term39178.getClass(), "user", null);
        setField(term39178, term39178.getClass(), "createDate", null);
        ArrayList term39172 = new ArrayList();
        ((ArrayList) term39172).add(term39174);
        ((ArrayList) term39172).add(term39176);
        ((ArrayList) term39172).add(term39178);
        term39075 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term39089 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term39116 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term39169 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term39182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39187 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39192 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term39242 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term39245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39250 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term39075, term39075.getClass(), "id", -680529431);
        setField(term39075, term39075.getClass(), "content", "OzwvrniiKl");
        setIntField(term39089, term39089.getClass(), "id", 212698793);
        setField(term39089, term39089.getClass(), "title", "beAkHVBeEQ");
        setField(term39089, term39089.getClass(), "content", "tiGVUUaQMv");
        setIntField(term39089, term39089.getClass(), "count", 1169519385);
        setIntField(term39116, term39116.getClass(), "id", 1846078344);
        setField(term39116, term39116.getClass(), "username", "NzoNAsaJqr");
        setField(term39116, term39116.getClass(), "password", "VRKEuPftph");
        setField(term39116, term39116.getClass(), "email", "DkRegMkIWt");
        setField(term39116, term39116.getClass(), "role", enum88);
        setField(term39116, term39116.getClass(), "oauth", "IIOFAGjcXe");
        setIntField(term39169, term39169.getClass(), "nanos", 349000000);
        setLongField(term39169, term39169.getClass(), "fastTime", 1496811435000L);
        setField(term39169, term39169.getClass(), "cdate", null);
        setField(term39116, term39116.getClass(), "createDate", term39169);
        setField(term39089, term39089.getClass(), "user", term39116);
        setField(term39089, term39089.getClass(), "replys", term39172);
        setIntField(term39183, term39183.getClass(), "year", 2021);
        setShortField(term39183, term39183.getClass(), "month", (short) 7);
        setShortField(term39183, term39183.getClass(), "day", (short) 26);
        setField(term39182, term39182.getClass(), "date", term39183);
        setByteField(term39187, term39187.getClass(), "hour", (byte) 16);
        setByteField(term39187, term39187.getClass(), "minute", (byte) 31);
        setByteField(term39187, term39187.getClass(), "second", (byte) 41);
        setIntField(term39187, term39187.getClass(), "nano", 114150112);
        setField(term39182, term39182.getClass(), "time", term39187);
        setField(term39089, term39089.getClass(), "createDate", term39182);
        setField(term39075, term39075.getClass(), "board", term39089);
        setIntField(term39192, term39192.getClass(), "id", 2039538484);
        setField(term39192, term39192.getClass(), "username", "LYcLrQMkAA");
        setField(term39192, term39192.getClass(), "password", "XhbGnImmgd");
        setField(term39192, term39192.getClass(), "email", "UUTpuViRuV");
        setField(term39192, term39192.getClass(), "role", enum88);
        setField(term39192, term39192.getClass(), "oauth", "xNKBQkfPIU");
        setIntField(term39242, term39242.getClass(), "nanos", 937000000);
        setLongField(term39242, term39242.getClass(), "fastTime", 1479632670000L);
        setField(term39242, term39242.getClass(), "cdate", null);
        setField(term39192, term39192.getClass(), "createDate", term39242);
        setField(term39075, term39075.getClass(), "user", term39192);
        setIntField(term39246, term39246.getClass(), "year", 2029);
        setShortField(term39246, term39246.getClass(), "month", (short) 5);
        setShortField(term39246, term39246.getClass(), "day", (short) 13);
        setField(term39245, term39245.getClass(), "date", term39246);
        setByteField(term39250, term39250.getClass(), "hour", (byte) 15);
        setByteField(term39250, term39250.getClass(), "minute", (byte) 43);
        setByteField(term39250, term39250.getClass(), "second", (byte) 9);
        setIntField(term39250, term39250.getClass(), "nano", 324755756);
        setField(term39245, term39245.getClass(), "time", term39250);
        setField(term39075, term39075.getClass(), "createDate", term39245);
        term39255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39260 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term39256, term39256.getClass(), "year", 2010);
        setShortField(term39256, term39256.getClass(), "month", (short) 4);
        setShortField(term39256, term39256.getClass(), "day", (short) 17);
        setField(term39255, term39255.getClass(), "date", term39256);
        setByteField(term39260, term39260.getClass(), "hour", (byte) 5);
        setByteField(term39260, term39260.getClass(), "minute", (byte) 31);
        setByteField(term39260, term39260.getClass(), "second", (byte) 28);
        setIntField(term39260, term39260.getClass(), "nano", 783557285);
        setField(term39255, term39255.getClass(), "time", term39260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term39255;
        callMethod(klass, "createDate", argTypes, term39075, args);
    }

};


