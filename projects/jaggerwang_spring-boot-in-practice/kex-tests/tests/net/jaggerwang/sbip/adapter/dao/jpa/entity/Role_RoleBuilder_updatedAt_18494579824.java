package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Role_RoleBuilder_updatedAt_18494579824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23197;
     Object term23232;

    public Role_RoleBuilder_updatedAt_18494579824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23198 = new Long(800893933628130392L);
        term23197 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder"));
        Object term23212 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23213 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23217 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23227 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23197, term23197.getClass(), "id", term23198);
        setField(term23197, term23197.getClass(), "name", "mfCpTPPQQm");
        setIntField(term23213, term23213.getClass(), "year", 2012);
        setShortField(term23213, term23213.getClass(), "month", (short) 1);
        setShortField(term23213, term23213.getClass(), "day", (short) 27);
        setField(term23212, term23212.getClass(), "date", term23213);
        setByteField(term23217, term23217.getClass(), "hour", (byte) 3);
        setByteField(term23217, term23217.getClass(), "minute", (byte) 30);
        setByteField(term23217, term23217.getClass(), "second", (byte) 25);
        setIntField(term23217, term23217.getClass(), "nano", 460782173);
        setField(term23212, term23212.getClass(), "time", term23217);
        setField(term23197, term23197.getClass(), "createdAt", term23212);
        setIntField(term23223, term23223.getClass(), "year", 2016);
        setShortField(term23223, term23223.getClass(), "month", (short) 10);
        setShortField(term23223, term23223.getClass(), "day", (short) 12);
        setField(term23222, term23222.getClass(), "date", term23223);
        setByteField(term23227, term23227.getClass(), "hour", (byte) 11);
        setByteField(term23227, term23227.getClass(), "minute", (byte) 25);
        setByteField(term23227, term23227.getClass(), "second", (byte) 37);
        setIntField(term23227, term23227.getClass(), "nano", 215113477);
        setField(term23222, term23222.getClass(), "time", term23227);
        setField(term23197, term23197.getClass(), "updatedAt", term23222);
        term23232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23237 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23233, term23233.getClass(), "year", 2012);
        setShortField(term23233, term23233.getClass(), "month", (short) 12);
        setShortField(term23233, term23233.getClass(), "day", (short) 10);
        setField(term23232, term23232.getClass(), "date", term23233);
        setByteField(term23237, term23237.getClass(), "hour", (byte) 6);
        setByteField(term23237, term23237.getClass(), "minute", (byte) 26);
        setByteField(term23237, term23237.getClass(), "second", (byte) 38);
        setIntField(term23237, term23237.getClass(), "nano", 934336730);
        setField(term23232, term23232.getClass(), "time", term23237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role$RoleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term23232;
        callMethod(klass, "updatedAt", argTypes, term23197, args);
    }

};


