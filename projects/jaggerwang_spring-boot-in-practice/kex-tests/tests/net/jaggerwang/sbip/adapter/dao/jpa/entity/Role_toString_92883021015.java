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

public class Role_toString_92883021015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24024;

    public Role_toString_92883021015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24025 = new Long(5160033404788124731L);
        term24024 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term24039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24054 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24024, term24024.getClass(), "id", term24025);
        setField(term24024, term24024.getClass(), "name", "bxrCBbrrct");
        setIntField(term24040, term24040.getClass(), "year", 2018);
        setShortField(term24040, term24040.getClass(), "month", (short) 1);
        setShortField(term24040, term24040.getClass(), "day", (short) 7);
        setField(term24039, term24039.getClass(), "date", term24040);
        setByteField(term24044, term24044.getClass(), "hour", (byte) 5);
        setByteField(term24044, term24044.getClass(), "minute", (byte) 42);
        setByteField(term24044, term24044.getClass(), "second", (byte) 49);
        setIntField(term24044, term24044.getClass(), "nano", 291814792);
        setField(term24039, term24039.getClass(), "time", term24044);
        setField(term24024, term24024.getClass(), "createdAt", term24039);
        setIntField(term24050, term24050.getClass(), "year", 2022);
        setShortField(term24050, term24050.getClass(), "month", (short) 7);
        setShortField(term24050, term24050.getClass(), "day", (short) 9);
        setField(term24049, term24049.getClass(), "date", term24050);
        setByteField(term24054, term24054.getClass(), "hour", (byte) 21);
        setByteField(term24054, term24054.getClass(), "minute", (byte) 48);
        setByteField(term24054, term24054.getClass(), "second", (byte) 58);
        setIntField(term24054, term24054.getClass(), "nano", 579553780);
        setField(term24049, term24049.getClass(), "time", term24054);
        setField(term24024, term24024.getClass(), "updatedAt", term24049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term24024, args);
    }

};


