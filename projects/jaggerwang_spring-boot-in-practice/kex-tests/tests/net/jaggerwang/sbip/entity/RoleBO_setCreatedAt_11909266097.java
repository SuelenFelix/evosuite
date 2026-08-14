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

public class RoleBO_setCreatedAt_11909266097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30099;
     Object term30134;

    public RoleBO_setCreatedAt_11909266097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30100 = new Long(6465539339431559532L);
        term30099 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term30114 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30115 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30119 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30129 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30099, term30099.getClass(), "id", term30100);
        setField(term30099, term30099.getClass(), "name", "sOdkipUKRu");
        setIntField(term30115, term30115.getClass(), "year", 2028);
        setShortField(term30115, term30115.getClass(), "month", (short) 7);
        setShortField(term30115, term30115.getClass(), "day", (short) 4);
        setField(term30114, term30114.getClass(), "date", term30115);
        setByteField(term30119, term30119.getClass(), "hour", (byte) 13);
        setByteField(term30119, term30119.getClass(), "minute", (byte) 43);
        setByteField(term30119, term30119.getClass(), "second", (byte) 17);
        setIntField(term30119, term30119.getClass(), "nano", 949713407);
        setField(term30114, term30114.getClass(), "time", term30119);
        setField(term30099, term30099.getClass(), "createdAt", term30114);
        setIntField(term30125, term30125.getClass(), "year", 2013);
        setShortField(term30125, term30125.getClass(), "month", (short) 3);
        setShortField(term30125, term30125.getClass(), "day", (short) 25);
        setField(term30124, term30124.getClass(), "date", term30125);
        setByteField(term30129, term30129.getClass(), "hour", (byte) 16);
        setByteField(term30129, term30129.getClass(), "minute", (byte) 28);
        setByteField(term30129, term30129.getClass(), "second", (byte) 0);
        setIntField(term30129, term30129.getClass(), "nano", 265797826);
        setField(term30124, term30124.getClass(), "time", term30129);
        setField(term30099, term30099.getClass(), "updatedAt", term30124);
        term30134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30139 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30135, term30135.getClass(), "year", 2013);
        setShortField(term30135, term30135.getClass(), "month", (short) 9);
        setShortField(term30135, term30135.getClass(), "day", (short) 12);
        setField(term30134, term30134.getClass(), "date", term30135);
        setByteField(term30139, term30139.getClass(), "hour", (byte) 14);
        setByteField(term30139, term30139.getClass(), "minute", (byte) 21);
        setByteField(term30139, term30139.getClass(), "second", (byte) 35);
        setIntField(term30139, term30139.getClass(), "nano", 520302725);
        setField(term30134, term30134.getClass(), "time", term30139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term30134;
        callMethod(klass, "setCreatedAt", argTypes, term30099, args);
    }

};


