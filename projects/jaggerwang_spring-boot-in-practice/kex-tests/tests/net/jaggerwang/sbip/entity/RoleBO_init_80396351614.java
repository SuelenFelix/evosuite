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

public class RoleBO_init_80396351614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30391;
     Object term30405;
     Object term30415;

    public RoleBO_init_80396351614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30391 = new Long(2712394591642260550L);
        term30405 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30406 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30410 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30406, term30406.getClass(), "year", 2021);
        setShortField(term30406, term30406.getClass(), "month", (short) 11);
        setShortField(term30406, term30406.getClass(), "day", (short) 19);
        setField(term30405, term30405.getClass(), "date", term30406);
        setByteField(term30410, term30410.getClass(), "hour", (byte) 4);
        setByteField(term30410, term30410.getClass(), "minute", (byte) 39);
        setByteField(term30410, term30410.getClass(), "second", (byte) 43);
        setIntField(term30410, term30410.getClass(), "nano", 638695514);
        setField(term30405, term30405.getClass(), "time", term30410);
        term30415 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30416 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30420 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30416, term30416.getClass(), "year", 2015);
        setShortField(term30416, term30416.getClass(), "month", (short) 10);
        setShortField(term30416, term30416.getClass(), "day", (short) 4);
        setField(term30415, term30415.getClass(), "date", term30416);
        setByteField(term30420, term30420.getClass(), "hour", (byte) 1);
        setByteField(term30420, term30420.getClass(), "minute", (byte) 29);
        setByteField(term30420, term30420.getClass(), "second", (byte) 20);
        setIntField(term30420, term30420.getClass(), "nano", 558273892);
        setField(term30415, term30415.getClass(), "time", term30420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[4];
        args[0] = term30391;
        args[1] = "CVRGEomOth";
        args[2] = term30405;
        args[3] = term30415;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


