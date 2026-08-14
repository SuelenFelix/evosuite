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

public class UserFollow_getUpdatedAt_2591732046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11671;

    public UserFollow_getUpdatedAt_2591732046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11672 = new Long(3746481521207337771L);
        Long term11674 = new Long(4341016500855678917L);
        Long term11676 = new Long(-5871746020807491998L);
        term11671 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11693 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11671, term11671.getClass(), "id", term11672);
        setField(term11671, term11671.getClass(), "followingId", term11674);
        setField(term11671, term11671.getClass(), "followerId", term11676);
        setIntField(term11679, term11679.getClass(), "year", 2010);
        setShortField(term11679, term11679.getClass(), "month", (short) 1);
        setShortField(term11679, term11679.getClass(), "day", (short) 10);
        setField(term11678, term11678.getClass(), "date", term11679);
        setByteField(term11683, term11683.getClass(), "hour", (byte) 12);
        setByteField(term11683, term11683.getClass(), "minute", (byte) 46);
        setByteField(term11683, term11683.getClass(), "second", (byte) 5);
        setIntField(term11683, term11683.getClass(), "nano", 540440953);
        setField(term11678, term11678.getClass(), "time", term11683);
        setField(term11671, term11671.getClass(), "createdAt", term11678);
        setIntField(term11689, term11689.getClass(), "year", 2028);
        setShortField(term11689, term11689.getClass(), "month", (short) 5);
        setShortField(term11689, term11689.getClass(), "day", (short) 7);
        setField(term11688, term11688.getClass(), "date", term11689);
        setByteField(term11693, term11693.getClass(), "hour", (byte) 7);
        setByteField(term11693, term11693.getClass(), "minute", (byte) 48);
        setByteField(term11693, term11693.getClass(), "second", (byte) 4);
        setIntField(term11693, term11693.getClass(), "nano", 380425174);
        setField(term11688, term11688.getClass(), "time", term11693);
        setField(term11671, term11671.getClass(), "updatedAt", term11688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term11671, args);
    }

};


