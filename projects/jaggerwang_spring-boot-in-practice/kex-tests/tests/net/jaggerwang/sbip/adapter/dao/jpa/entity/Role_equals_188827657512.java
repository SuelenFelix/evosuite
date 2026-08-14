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

public class Role_equals_188827657512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23887;
     Object term23922;

    public Role_equals_188827657512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23888 = new Long(-7514437039500876647L);
        term23887 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23907 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23917 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23887, term23887.getClass(), "id", term23888);
        setField(term23887, term23887.getClass(), "name", "vOuMEpOQAg");
        setIntField(term23903, term23903.getClass(), "year", 2028);
        setShortField(term23903, term23903.getClass(), "month", (short) 7);
        setShortField(term23903, term23903.getClass(), "day", (short) 4);
        setField(term23902, term23902.getClass(), "date", term23903);
        setByteField(term23907, term23907.getClass(), "hour", (byte) 13);
        setByteField(term23907, term23907.getClass(), "minute", (byte) 43);
        setByteField(term23907, term23907.getClass(), "second", (byte) 17);
        setIntField(term23907, term23907.getClass(), "nano", 949713407);
        setField(term23902, term23902.getClass(), "time", term23907);
        setField(term23887, term23887.getClass(), "createdAt", term23902);
        setIntField(term23913, term23913.getClass(), "year", 2013);
        setShortField(term23913, term23913.getClass(), "month", (short) 3);
        setShortField(term23913, term23913.getClass(), "day", (short) 25);
        setField(term23912, term23912.getClass(), "date", term23913);
        setByteField(term23917, term23917.getClass(), "hour", (byte) 16);
        setByteField(term23917, term23917.getClass(), "minute", (byte) 28);
        setByteField(term23917, term23917.getClass(), "second", (byte) 0);
        setIntField(term23917, term23917.getClass(), "nano", 265797826);
        setField(term23912, term23912.getClass(), "time", term23917);
        setField(term23887, term23887.getClass(), "updatedAt", term23912);
        term23922 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23922;
        callMethod(klass, "equals", argTypes, term23887, args);
    }

};


