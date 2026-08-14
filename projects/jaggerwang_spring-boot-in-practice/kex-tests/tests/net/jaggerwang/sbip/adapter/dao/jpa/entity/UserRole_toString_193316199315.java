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

public class UserRole_toString_193316199315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14047;

    public UserRole_toString_193316199315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14048 = new Long(3423155413133381764L);
        Long term14050 = new Long(7711054832353934171L);
        Long term14052 = new Long(185544001230120339L);
        term14047 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term14054 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14055 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14059 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14064 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14065 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14069 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14047, term14047.getClass(), "id", term14048);
        setField(term14047, term14047.getClass(), "userId", term14050);
        setField(term14047, term14047.getClass(), "roleId", term14052);
        setIntField(term14055, term14055.getClass(), "year", 2022);
        setShortField(term14055, term14055.getClass(), "month", (short) 1);
        setShortField(term14055, term14055.getClass(), "day", (short) 4);
        setField(term14054, term14054.getClass(), "date", term14055);
        setByteField(term14059, term14059.getClass(), "hour", (byte) 21);
        setByteField(term14059, term14059.getClass(), "minute", (byte) 36);
        setByteField(term14059, term14059.getClass(), "second", (byte) 43);
        setIntField(term14059, term14059.getClass(), "nano", 941221944);
        setField(term14054, term14054.getClass(), "time", term14059);
        setField(term14047, term14047.getClass(), "createdAt", term14054);
        setIntField(term14065, term14065.getClass(), "year", 2011);
        setShortField(term14065, term14065.getClass(), "month", (short) 4);
        setShortField(term14065, term14065.getClass(), "day", (short) 18);
        setField(term14064, term14064.getClass(), "date", term14065);
        setByteField(term14069, term14069.getClass(), "hour", (byte) 15);
        setByteField(term14069, term14069.getClass(), "minute", (byte) 35);
        setByteField(term14069, term14069.getClass(), "second", (byte) 7);
        setIntField(term14069, term14069.getClass(), "nano", 925983040);
        setField(term14064, term14064.getClass(), "time", term14069);
        setField(term14047, term14047.getClass(), "updatedAt", term14064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14047, args);
    }

};


