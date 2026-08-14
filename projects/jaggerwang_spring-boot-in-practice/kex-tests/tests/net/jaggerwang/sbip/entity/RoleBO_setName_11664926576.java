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
import java.lang.Object;

public class RoleBO_setName_11664926576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30032;

    public RoleBO_setName_11664926576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30033 = new Long(-8697239524885136781L);
        term30032 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term30047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30052 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30062 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30032, term30032.getClass(), "id", term30033);
        setField(term30032, term30032.getClass(), "name", "gltJarNuUk");
        setIntField(term30048, term30048.getClass(), "year", 2026);
        setShortField(term30048, term30048.getClass(), "month", (short) 7);
        setShortField(term30048, term30048.getClass(), "day", (short) 18);
        setField(term30047, term30047.getClass(), "date", term30048);
        setByteField(term30052, term30052.getClass(), "hour", (byte) 14);
        setByteField(term30052, term30052.getClass(), "minute", (byte) 29);
        setByteField(term30052, term30052.getClass(), "second", (byte) 53);
        setIntField(term30052, term30052.getClass(), "nano", 285756900);
        setField(term30047, term30047.getClass(), "time", term30052);
        setField(term30032, term30032.getClass(), "createdAt", term30047);
        setIntField(term30058, term30058.getClass(), "year", 2012);
        setShortField(term30058, term30058.getClass(), "month", (short) 2);
        setShortField(term30058, term30058.getClass(), "day", (short) 2);
        setField(term30057, term30057.getClass(), "date", term30058);
        setByteField(term30062, term30062.getClass(), "hour", (byte) 4);
        setByteField(term30062, term30062.getClass(), "minute", (byte) 19);
        setByteField(term30062, term30062.getClass(), "second", (byte) 58);
        setIntField(term30062, term30062.getClass(), "nano", 550709112);
        setField(term30057, term30057.getClass(), "time", term30062);
        setField(term30032, term30032.getClass(), "updatedAt", term30057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZwZIDwYcSW";
        callMethod(klass, "setName", argTypes, term30032, args);
    }

};


