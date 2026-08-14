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

public class UserRole_getRoleId_3891976614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13722;

    public UserRole_getRoleId_3891976614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13723 = new Long(8024477479047145752L);
        Long term13725 = new Long(7006402814669334483L);
        Long term13727 = new Long(-4003544865306793676L);
        term13722 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13744 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13722, term13722.getClass(), "id", term13723);
        setField(term13722, term13722.getClass(), "userId", term13725);
        setField(term13722, term13722.getClass(), "roleId", term13727);
        setIntField(term13730, term13730.getClass(), "year", 2016);
        setShortField(term13730, term13730.getClass(), "month", (short) 11);
        setShortField(term13730, term13730.getClass(), "day", (short) 20);
        setField(term13729, term13729.getClass(), "date", term13730);
        setByteField(term13734, term13734.getClass(), "hour", (byte) 17);
        setByteField(term13734, term13734.getClass(), "minute", (byte) 20);
        setByteField(term13734, term13734.getClass(), "second", (byte) 21);
        setIntField(term13734, term13734.getClass(), "nano", 340096364);
        setField(term13729, term13729.getClass(), "time", term13734);
        setField(term13722, term13722.getClass(), "createdAt", term13729);
        setIntField(term13740, term13740.getClass(), "year", 2024);
        setShortField(term13740, term13740.getClass(), "month", (short) 10);
        setShortField(term13740, term13740.getClass(), "day", (short) 28);
        setField(term13739, term13739.getClass(), "date", term13740);
        setByteField(term13744, term13744.getClass(), "hour", (byte) 5);
        setByteField(term13744, term13744.getClass(), "minute", (byte) 13);
        setByteField(term13744, term13744.getClass(), "second", (byte) 51);
        setIntField(term13744, term13744.getClass(), "nano", 605693001);
        setField(term13739, term13739.getClass(), "time", term13744);
        setField(term13722, term13722.getClass(), "updatedAt", term13739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoleId", argTypes, term13722, args);
    }

};


