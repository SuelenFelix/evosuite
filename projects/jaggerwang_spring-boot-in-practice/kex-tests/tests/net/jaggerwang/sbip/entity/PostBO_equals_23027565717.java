package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_equals_23027565717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18072;
     Object term18133;

    public PostBO_equals_23027565717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18073 = new Long(3077284143733577490L);
        Long term18075 = new Long(4458302820344896046L);
        Class<? extends Object> term18135 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term18134 = ((Class) term18135).getDeclaredField((String) "TEXT");
        ((Field) term18134).setAccessible(true);
        Object enum50 = ((Field) term18134).get((Object) null);
        Long term18099 = new Long(-432424084523104253L);
        Long term18101 = new Long(6150186973473930616L);
        Long term18103 = new Long(-3850323135468805420L);
        Long term18105 = new Long(-5207216109884759743L);
        Long term18107 = new Long(8765880103547975810L);
        ArrayList term18097 = new ArrayList();
        ((ArrayList) term18097).add(term18099);
        ((ArrayList) term18097).add(term18101);
        ((ArrayList) term18097).add(term18103);
        ((ArrayList) term18097).add(term18105);
        ((ArrayList) term18097).add(term18107);
        Long term18111 = new Long(4552367707739103094L);
        term18072 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term18113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18118 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18128 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18072, term18072.getClass(), "id", term18073);
        setField(term18072, term18072.getClass(), "userId", term18075);
        setField(term18072, term18072.getClass(), "type", enum50);
        setField(term18072, term18072.getClass(), "text", "xtftXXMbem");
        setField(term18072, term18072.getClass(), "imageIds", term18097);
        setField(term18072, term18072.getClass(), "videoId", term18111);
        setIntField(term18114, term18114.getClass(), "year", 2023);
        setShortField(term18114, term18114.getClass(), "month", (short) 8);
        setShortField(term18114, term18114.getClass(), "day", (short) 21);
        setField(term18113, term18113.getClass(), "date", term18114);
        setByteField(term18118, term18118.getClass(), "hour", (byte) 10);
        setByteField(term18118, term18118.getClass(), "minute", (byte) 36);
        setByteField(term18118, term18118.getClass(), "second", (byte) 15);
        setIntField(term18118, term18118.getClass(), "nano", 257070204);
        setField(term18113, term18113.getClass(), "time", term18118);
        setField(term18072, term18072.getClass(), "createdAt", term18113);
        setIntField(term18124, term18124.getClass(), "year", 2012);
        setShortField(term18124, term18124.getClass(), "month", (short) 12);
        setShortField(term18124, term18124.getClass(), "day", (short) 14);
        setField(term18123, term18123.getClass(), "date", term18124);
        setByteField(term18128, term18128.getClass(), "hour", (byte) 1);
        setByteField(term18128, term18128.getClass(), "minute", (byte) 47);
        setByteField(term18128, term18128.getClass(), "second", (byte) 3);
        setIntField(term18128, term18128.getClass(), "nano", 359751066);
        setField(term18123, term18123.getClass(), "time", term18128);
        setField(term18072, term18072.getClass(), "updatedAt", term18123);
        term18133 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18133;
        callMethod(klass, "equals", argTypes, term18072, args);
    }

};


