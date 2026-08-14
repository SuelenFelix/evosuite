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

public class UserRole_UserRoleBuilder_updatedAt_2583309425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27373;
     Object term27400;

    public UserRole_UserRoleBuilder_updatedAt_2583309425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27374 = new Long(-8848853088235282046L);
        Long term27376 = new Long(5646422912118770408L);
        Long term27378 = new Long(1370021222113276207L);
        term27373 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder"));
        Object term27380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27385 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27390 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27391 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27395 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27373, term27373.getClass(), "id", term27374);
        setField(term27373, term27373.getClass(), "userId", term27376);
        setField(term27373, term27373.getClass(), "roleId", term27378);
        setIntField(term27381, term27381.getClass(), "year", 2018);
        setShortField(term27381, term27381.getClass(), "month", (short) 8);
        setShortField(term27381, term27381.getClass(), "day", (short) 4);
        setField(term27380, term27380.getClass(), "date", term27381);
        setByteField(term27385, term27385.getClass(), "hour", (byte) 8);
        setByteField(term27385, term27385.getClass(), "minute", (byte) 15);
        setByteField(term27385, term27385.getClass(), "second", (byte) 15);
        setIntField(term27385, term27385.getClass(), "nano", 116834692);
        setField(term27380, term27380.getClass(), "time", term27385);
        setField(term27373, term27373.getClass(), "createdAt", term27380);
        setIntField(term27391, term27391.getClass(), "year", 2025);
        setShortField(term27391, term27391.getClass(), "month", (short) 8);
        setShortField(term27391, term27391.getClass(), "day", (short) 18);
        setField(term27390, term27390.getClass(), "date", term27391);
        setByteField(term27395, term27395.getClass(), "hour", (byte) 11);
        setByteField(term27395, term27395.getClass(), "minute", (byte) 28);
        setByteField(term27395, term27395.getClass(), "second", (byte) 28);
        setIntField(term27395, term27395.getClass(), "nano", 32159081);
        setField(term27390, term27390.getClass(), "time", term27395);
        setField(term27373, term27373.getClass(), "updatedAt", term27390);
        term27400 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27401 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27405 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27401, term27401.getClass(), "year", 2026);
        setShortField(term27401, term27401.getClass(), "month", (short) 5);
        setShortField(term27401, term27401.getClass(), "day", (short) 14);
        setField(term27400, term27400.getClass(), "date", term27401);
        setByteField(term27405, term27405.getClass(), "hour", (byte) 3);
        setByteField(term27405, term27405.getClass(), "minute", (byte) 43);
        setByteField(term27405, term27405.getClass(), "second", (byte) 41);
        setIntField(term27405, term27405.getClass(), "nano", 519970122);
        setField(term27400, term27400.getClass(), "time", term27405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term27400;
        callMethod(klass, "updatedAt", argTypes, term27373, args);
    }

};


