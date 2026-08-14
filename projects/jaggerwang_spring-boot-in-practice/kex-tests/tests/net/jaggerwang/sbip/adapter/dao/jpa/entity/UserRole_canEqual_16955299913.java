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

public class UserRole_canEqual_16955299913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13992;
     Object term14019;

    public UserRole_canEqual_16955299913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13993 = new Long(-1223573843683081410L);
        Long term13995 = new Long(3453457027014743006L);
        Long term13997 = new Long(3931473624300151730L);
        term13992 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14004 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14009 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14010 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14014 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13992, term13992.getClass(), "id", term13993);
        setField(term13992, term13992.getClass(), "userId", term13995);
        setField(term13992, term13992.getClass(), "roleId", term13997);
        setIntField(term14000, term14000.getClass(), "year", 2010);
        setShortField(term14000, term14000.getClass(), "month", (short) 9);
        setShortField(term14000, term14000.getClass(), "day", (short) 20);
        setField(term13999, term13999.getClass(), "date", term14000);
        setByteField(term14004, term14004.getClass(), "hour", (byte) 3);
        setByteField(term14004, term14004.getClass(), "minute", (byte) 41);
        setByteField(term14004, term14004.getClass(), "second", (byte) 7);
        setIntField(term14004, term14004.getClass(), "nano", 796515800);
        setField(term13999, term13999.getClass(), "time", term14004);
        setField(term13992, term13992.getClass(), "createdAt", term13999);
        setIntField(term14010, term14010.getClass(), "year", 2015);
        setShortField(term14010, term14010.getClass(), "month", (short) 10);
        setShortField(term14010, term14010.getClass(), "day", (short) 2);
        setField(term14009, term14009.getClass(), "date", term14010);
        setByteField(term14014, term14014.getClass(), "hour", (byte) 21);
        setByteField(term14014, term14014.getClass(), "minute", (byte) 18);
        setByteField(term14014, term14014.getClass(), "second", (byte) 42);
        setIntField(term14014, term14014.getClass(), "nano", 185569616);
        setField(term14009, term14009.getClass(), "time", term14014);
        setField(term13992, term13992.getClass(), "updatedAt", term14009);
        term14019 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14019;
        callMethod(klass, "canEqual", argTypes, term13992, args);
    }

};


