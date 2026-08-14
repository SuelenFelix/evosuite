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

public class RoleBO_RoleBOBuilder_toString_18934120486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20036;

    public RoleBO_RoleBOBuilder_toString_18934120486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20037 = new Long(6351887424140565471L);
        term20036 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder"));
        Object term20051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20056 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20066 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term20036, term20036.getClass(), "id", term20037);
        setField(term20036, term20036.getClass(), "name", "kGMQdqJYyB");
        setIntField(term20052, term20052.getClass(), "year", 2020);
        setShortField(term20052, term20052.getClass(), "month", (short) 12);
        setShortField(term20052, term20052.getClass(), "day", (short) 30);
        setField(term20051, term20051.getClass(), "date", term20052);
        setByteField(term20056, term20056.getClass(), "hour", (byte) 2);
        setByteField(term20056, term20056.getClass(), "minute", (byte) 11);
        setByteField(term20056, term20056.getClass(), "second", (byte) 8);
        setIntField(term20056, term20056.getClass(), "nano", 528799251);
        setField(term20051, term20051.getClass(), "time", term20056);
        setField(term20036, term20036.getClass(), "createdAt", term20051);
        setIntField(term20062, term20062.getClass(), "year", 2027);
        setShortField(term20062, term20062.getClass(), "month", (short) 9);
        setShortField(term20062, term20062.getClass(), "day", (short) 29);
        setField(term20061, term20061.getClass(), "date", term20062);
        setByteField(term20066, term20066.getClass(), "hour", (byte) 19);
        setByteField(term20066, term20066.getClass(), "minute", (byte) 13);
        setByteField(term20066, term20066.getClass(), "second", (byte) 31);
        setIntField(term20066, term20066.getClass(), "nano", 854066575);
        setField(term20061, term20061.getClass(), "time", term20066);
        setField(term20036, term20036.getClass(), "updatedAt", term20061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO$RoleBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term20036, args);
    }

};


