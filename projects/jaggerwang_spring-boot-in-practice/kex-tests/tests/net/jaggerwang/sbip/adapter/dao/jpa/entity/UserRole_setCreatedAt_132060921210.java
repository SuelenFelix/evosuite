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

public class UserRole_setCreatedAt_132060921210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13890;
     Object term13917;

    public UserRole_setCreatedAt_132060921210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13891 = new Long(-1750555031444556464L);
        Long term13893 = new Long(-3231440836116263235L);
        Long term13895 = new Long(8010417010297313651L);
        term13890 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13897 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13902 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13912 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13890, term13890.getClass(), "id", term13891);
        setField(term13890, term13890.getClass(), "userId", term13893);
        setField(term13890, term13890.getClass(), "roleId", term13895);
        setIntField(term13898, term13898.getClass(), "year", 2020);
        setShortField(term13898, term13898.getClass(), "month", (short) 4);
        setShortField(term13898, term13898.getClass(), "day", (short) 2);
        setField(term13897, term13897.getClass(), "date", term13898);
        setByteField(term13902, term13902.getClass(), "hour", (byte) 11);
        setByteField(term13902, term13902.getClass(), "minute", (byte) 26);
        setByteField(term13902, term13902.getClass(), "second", (byte) 22);
        setIntField(term13902, term13902.getClass(), "nano", 168224721);
        setField(term13897, term13897.getClass(), "time", term13902);
        setField(term13890, term13890.getClass(), "createdAt", term13897);
        setIntField(term13908, term13908.getClass(), "year", 2010);
        setShortField(term13908, term13908.getClass(), "month", (short) 10);
        setShortField(term13908, term13908.getClass(), "day", (short) 26);
        setField(term13907, term13907.getClass(), "date", term13908);
        setByteField(term13912, term13912.getClass(), "hour", (byte) 6);
        setByteField(term13912, term13912.getClass(), "minute", (byte) 28);
        setByteField(term13912, term13912.getClass(), "second", (byte) 52);
        setIntField(term13912, term13912.getClass(), "nano", 197540216);
        setField(term13907, term13907.getClass(), "time", term13912);
        setField(term13890, term13890.getClass(), "updatedAt", term13907);
        term13917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13922 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13918, term13918.getClass(), "year", 2028);
        setShortField(term13918, term13918.getClass(), "month", (short) 2);
        setShortField(term13918, term13918.getClass(), "day", (short) 8);
        setField(term13917, term13917.getClass(), "date", term13918);
        setByteField(term13922, term13922.getClass(), "hour", (byte) 16);
        setByteField(term13922, term13922.getClass(), "minute", (byte) 14);
        setByteField(term13922, term13922.getClass(), "second", (byte) 31);
        setIntField(term13922, term13922.getClass(), "nano", 824823232);
        setField(term13917, term13917.getClass(), "time", term13922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term13917;
        callMethod(klass, "setCreatedAt", argTypes, term13890, args);
    }

};


