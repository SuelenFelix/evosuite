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

public class Role_setName_15169490399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23710;

    public Role_setName_15169490399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23711 = new Long(-2413135395771470086L);
        term23710 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23730 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23740 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23710, term23710.getClass(), "id", term23711);
        setField(term23710, term23710.getClass(), "name", "rYbtIDVdnd");
        setIntField(term23726, term23726.getClass(), "year", 2023);
        setShortField(term23726, term23726.getClass(), "month", (short) 12);
        setShortField(term23726, term23726.getClass(), "day", (short) 3);
        setField(term23725, term23725.getClass(), "date", term23726);
        setByteField(term23730, term23730.getClass(), "hour", (byte) 14);
        setByteField(term23730, term23730.getClass(), "minute", (byte) 6);
        setByteField(term23730, term23730.getClass(), "second", (byte) 20);
        setIntField(term23730, term23730.getClass(), "nano", 660325634);
        setField(term23725, term23725.getClass(), "time", term23730);
        setField(term23710, term23710.getClass(), "createdAt", term23725);
        setIntField(term23736, term23736.getClass(), "year", 2019);
        setShortField(term23736, term23736.getClass(), "month", (short) 2);
        setShortField(term23736, term23736.getClass(), "day", (short) 13);
        setField(term23735, term23735.getClass(), "date", term23736);
        setByteField(term23740, term23740.getClass(), "hour", (byte) 5);
        setByteField(term23740, term23740.getClass(), "minute", (byte) 59);
        setByteField(term23740, term23740.getClass(), "second", (byte) 42);
        setIntField(term23740, term23740.getClass(), "nano", 720385556);
        setField(term23735, term23735.getClass(), "time", term23740);
        setField(term23710, term23710.getClass(), "updatedAt", term23735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKAReurpHG";
        callMethod(klass, "setName", argTypes, term23710, args);
    }

};


