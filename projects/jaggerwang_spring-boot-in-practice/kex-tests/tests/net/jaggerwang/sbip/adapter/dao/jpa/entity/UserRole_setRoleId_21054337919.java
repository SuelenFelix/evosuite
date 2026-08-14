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

public class UserRole_setRoleId_21054337919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13861;
     Object term13888;

    public UserRole_setRoleId_21054337919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13862 = new Long(-8992404862613425105L);
        Long term13864 = new Long(3103198349031409063L);
        Long term13866 = new Long(753095050088595263L);
        term13861 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13873 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13878 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13879 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13883 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13861, term13861.getClass(), "id", term13862);
        setField(term13861, term13861.getClass(), "userId", term13864);
        setField(term13861, term13861.getClass(), "roleId", term13866);
        setIntField(term13869, term13869.getClass(), "year", 2022);
        setShortField(term13869, term13869.getClass(), "month", (short) 8);
        setShortField(term13869, term13869.getClass(), "day", (short) 30);
        setField(term13868, term13868.getClass(), "date", term13869);
        setByteField(term13873, term13873.getClass(), "hour", (byte) 3);
        setByteField(term13873, term13873.getClass(), "minute", (byte) 13);
        setByteField(term13873, term13873.getClass(), "second", (byte) 34);
        setIntField(term13873, term13873.getClass(), "nano", 69286341);
        setField(term13868, term13868.getClass(), "time", term13873);
        setField(term13861, term13861.getClass(), "createdAt", term13868);
        setIntField(term13879, term13879.getClass(), "year", 2013);
        setShortField(term13879, term13879.getClass(), "month", (short) 5);
        setShortField(term13879, term13879.getClass(), "day", (short) 14);
        setField(term13878, term13878.getClass(), "date", term13879);
        setByteField(term13883, term13883.getClass(), "hour", (byte) 12);
        setByteField(term13883, term13883.getClass(), "minute", (byte) 8);
        setByteField(term13883, term13883.getClass(), "second", (byte) 12);
        setIntField(term13883, term13883.getClass(), "nano", 597594916);
        setField(term13878, term13878.getClass(), "time", term13883);
        setField(term13861, term13861.getClass(), "updatedAt", term13878);
        term13888 = new Long(3643973882575578879L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term13888;
        callMethod(klass, "setRoleId", argTypes, term13861, args);
    }

};


