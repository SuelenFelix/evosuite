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

public class Role_init_45350713417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24069;
     Object term24083;
     Object term24093;

    public Role_init_45350713417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24069 = new Long(5071015720043054072L);
        term24083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24088 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24084, term24084.getClass(), "year", 2017);
        setShortField(term24084, term24084.getClass(), "month", (short) 5);
        setShortField(term24084, term24084.getClass(), "day", (short) 2);
        setField(term24083, term24083.getClass(), "date", term24084);
        setByteField(term24088, term24088.getClass(), "hour", (byte) 7);
        setByteField(term24088, term24088.getClass(), "minute", (byte) 24);
        setByteField(term24088, term24088.getClass(), "second", (byte) 51);
        setIntField(term24088, term24088.getClass(), "nano", 706502334);
        setField(term24083, term24083.getClass(), "time", term24088);
        term24093 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24094 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24098 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24094, term24094.getClass(), "year", 2026);
        setShortField(term24094, term24094.getClass(), "month", (short) 11);
        setShortField(term24094, term24094.getClass(), "day", (short) 1);
        setField(term24093, term24093.getClass(), "date", term24094);
        setByteField(term24098, term24098.getClass(), "hour", (byte) 9);
        setByteField(term24098, term24098.getClass(), "minute", (byte) 4);
        setByteField(term24098, term24098.getClass(), "second", (byte) 25);
        setIntField(term24098, term24098.getClass(), "nano", 272299951);
        setField(term24093, term24093.getClass(), "time", term24098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[4];
        args[0] = term24069;
        args[1] = "CKWpJaaaxX";
        args[2] = term24083;
        args[3] = term24093;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


