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

public class RoleBO_setUpdatedAt_11110546928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30154;
     Object term30189;

    public RoleBO_setUpdatedAt_11110546928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30155 = new Long(-5304831679802174866L);
        term30154 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term30169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30174 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30179 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30180 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30184 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30154, term30154.getClass(), "id", term30155);
        setField(term30154, term30154.getClass(), "name", "oKwCDqywym");
        setIntField(term30170, term30170.getClass(), "year", 2016);
        setShortField(term30170, term30170.getClass(), "month", (short) 2);
        setShortField(term30170, term30170.getClass(), "day", (short) 15);
        setField(term30169, term30169.getClass(), "date", term30170);
        setByteField(term30174, term30174.getClass(), "hour", (byte) 7);
        setByteField(term30174, term30174.getClass(), "minute", (byte) 36);
        setByteField(term30174, term30174.getClass(), "second", (byte) 21);
        setIntField(term30174, term30174.getClass(), "nano", 74269011);
        setField(term30169, term30169.getClass(), "time", term30174);
        setField(term30154, term30154.getClass(), "createdAt", term30169);
        setIntField(term30180, term30180.getClass(), "year", 2012);
        setShortField(term30180, term30180.getClass(), "month", (short) 11);
        setShortField(term30180, term30180.getClass(), "day", (short) 23);
        setField(term30179, term30179.getClass(), "date", term30180);
        setByteField(term30184, term30184.getClass(), "hour", (byte) 21);
        setByteField(term30184, term30184.getClass(), "minute", (byte) 45);
        setByteField(term30184, term30184.getClass(), "second", (byte) 46);
        setIntField(term30184, term30184.getClass(), "nano", 484678696);
        setField(term30179, term30179.getClass(), "time", term30184);
        setField(term30154, term30154.getClass(), "updatedAt", term30179);
        term30189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30194 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30190, term30190.getClass(), "year", 2027);
        setShortField(term30190, term30190.getClass(), "month", (short) 12);
        setShortField(term30190, term30190.getClass(), "day", (short) 25);
        setField(term30189, term30189.getClass(), "date", term30190);
        setByteField(term30194, term30194.getClass(), "hour", (byte) 8);
        setByteField(term30194, term30194.getClass(), "minute", (byte) 19);
        setByteField(term30194, term30194.getClass(), "second", (byte) 20);
        setIntField(term30194, term30194.getClass(), "nano", 127700185);
        setField(term30189, term30189.getClass(), "time", term30194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term30189;
        callMethod(klass, "setUpdatedAt", argTypes, term30154, args);
    }

};


