package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class RoleDTO_fromBO_13272777160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16908;

    public RoleDTO_fromBO_13272777160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16909 = new Long(4525924047960478347L);
        term16908 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term16923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16928 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16938 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16908, term16908.getClass(), "id", term16909);
        setField(term16908, term16908.getClass(), "name", "JkgoRtImdE");
        setIntField(term16924, term16924.getClass(), "year", 2020);
        setShortField(term16924, term16924.getClass(), "month", (short) 12);
        setShortField(term16924, term16924.getClass(), "day", (short) 30);
        setField(term16923, term16923.getClass(), "date", term16924);
        setByteField(term16928, term16928.getClass(), "hour", (byte) 2);
        setByteField(term16928, term16928.getClass(), "minute", (byte) 11);
        setByteField(term16928, term16928.getClass(), "second", (byte) 8);
        setIntField(term16928, term16928.getClass(), "nano", 528799251);
        setField(term16923, term16923.getClass(), "time", term16928);
        setField(term16908, term16908.getClass(), "createdAt", term16923);
        setIntField(term16934, term16934.getClass(), "year", 2027);
        setShortField(term16934, term16934.getClass(), "month", (short) 9);
        setShortField(term16934, term16934.getClass(), "day", (short) 29);
        setField(term16933, term16933.getClass(), "date", term16934);
        setByteField(term16938, term16938.getClass(), "hour", (byte) 19);
        setByteField(term16938, term16938.getClass(), "minute", (byte) 13);
        setByteField(term16938, term16938.getClass(), "second", (byte) 31);
        setIntField(term16938, term16938.getClass(), "nano", 854066575);
        setField(term16933, term16933.getClass(), "time", term16938);
        setField(term16908, term16908.getClass(), "updatedAt", term16933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Object[] args = new Object[1];
        args[0] = term16908;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};


