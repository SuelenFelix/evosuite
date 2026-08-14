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

public class UserRole_UserRoleBuilder_toString_4784829457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27437;

    public UserRole_UserRoleBuilder_toString_4784829457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27438 = new Long(2355652609935652353L);
        Long term27440 = new Long(7393438062788805516L);
        Long term27442 = new Long(5383032785479262184L);
        term27437 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder"));
        Object term27444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27449 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27459 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27437, term27437.getClass(), "id", term27438);
        setField(term27437, term27437.getClass(), "userId", term27440);
        setField(term27437, term27437.getClass(), "roleId", term27442);
        setIntField(term27445, term27445.getClass(), "year", 2015);
        setShortField(term27445, term27445.getClass(), "month", (short) 1);
        setShortField(term27445, term27445.getClass(), "day", (short) 23);
        setField(term27444, term27444.getClass(), "date", term27445);
        setByteField(term27449, term27449.getClass(), "hour", (byte) 0);
        setByteField(term27449, term27449.getClass(), "minute", (byte) 5);
        setByteField(term27449, term27449.getClass(), "second", (byte) 21);
        setIntField(term27449, term27449.getClass(), "nano", 402778195);
        setField(term27444, term27444.getClass(), "time", term27449);
        setField(term27437, term27437.getClass(), "createdAt", term27444);
        setIntField(term27455, term27455.getClass(), "year", 2022);
        setShortField(term27455, term27455.getClass(), "month", (short) 4);
        setShortField(term27455, term27455.getClass(), "day", (short) 2);
        setField(term27454, term27454.getClass(), "date", term27455);
        setByteField(term27459, term27459.getClass(), "hour", (byte) 21);
        setByteField(term27459, term27459.getClass(), "minute", (byte) 1);
        setByteField(term27459, term27459.getClass(), "second", (byte) 56);
        setIntField(term27459, term27459.getClass(), "nano", 418299217);
        setField(term27454, term27454.getClass(), "time", term27459);
        setField(term27437, term27437.getClass(), "updatedAt", term27454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27437, args);
    }

};


