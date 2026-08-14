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

public class UserRole_UserRoleBuilder_createdAt_3382028594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27336;
     Object term27363;

    public UserRole_UserRoleBuilder_createdAt_3382028594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27337 = new Long(2978561187278004830L);
        Long term27339 = new Long(4903104596895674146L);
        Long term27341 = new Long(3410093279424884335L);
        term27336 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder"));
        Object term27343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27348 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27358 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27336, term27336.getClass(), "id", term27337);
        setField(term27336, term27336.getClass(), "userId", term27339);
        setField(term27336, term27336.getClass(), "roleId", term27341);
        setIntField(term27344, term27344.getClass(), "year", 2012);
        setShortField(term27344, term27344.getClass(), "month", (short) 7);
        setShortField(term27344, term27344.getClass(), "day", (short) 6);
        setField(term27343, term27343.getClass(), "date", term27344);
        setByteField(term27348, term27348.getClass(), "hour", (byte) 0);
        setByteField(term27348, term27348.getClass(), "minute", (byte) 48);
        setByteField(term27348, term27348.getClass(), "second", (byte) 16);
        setIntField(term27348, term27348.getClass(), "nano", 235139356);
        setField(term27343, term27343.getClass(), "time", term27348);
        setField(term27336, term27336.getClass(), "createdAt", term27343);
        setIntField(term27354, term27354.getClass(), "year", 2023);
        setShortField(term27354, term27354.getClass(), "month", (short) 2);
        setShortField(term27354, term27354.getClass(), "day", (short) 6);
        setField(term27353, term27353.getClass(), "date", term27354);
        setByteField(term27358, term27358.getClass(), "hour", (byte) 3);
        setByteField(term27358, term27358.getClass(), "minute", (byte) 1);
        setByteField(term27358, term27358.getClass(), "second", (byte) 52);
        setIntField(term27358, term27358.getClass(), "nano", 345404097);
        setField(term27353, term27353.getClass(), "time", term27358);
        setField(term27336, term27336.getClass(), "updatedAt", term27353);
        term27363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27368 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27364, term27364.getClass(), "year", 2017);
        setShortField(term27364, term27364.getClass(), "month", (short) 2);
        setShortField(term27364, term27364.getClass(), "day", (short) 28);
        setField(term27363, term27363.getClass(), "date", term27364);
        setByteField(term27368, term27368.getClass(), "hour", (byte) 16);
        setByteField(term27368, term27368.getClass(), "minute", (byte) 54);
        setByteField(term27368, term27368.getClass(), "second", (byte) 4);
        setIntField(term27368, term27368.getClass(), "nano", 721722853);
        setField(term27363, term27363.getClass(), "time", term27368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term27363;
        callMethod(klass, "createdAt", argTypes, term27336, args);
    }

};


