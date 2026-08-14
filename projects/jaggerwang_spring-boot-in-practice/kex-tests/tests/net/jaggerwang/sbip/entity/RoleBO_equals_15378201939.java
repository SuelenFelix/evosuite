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

public class RoleBO_equals_15378201939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30209;
     Object term30244;

    public RoleBO_equals_15378201939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30210 = new Long(1909175111101717943L);
        term30209 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term30224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30229 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30239 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30209, term30209.getClass(), "id", term30210);
        setField(term30209, term30209.getClass(), "name", "zjZYTddemL");
        setIntField(term30225, term30225.getClass(), "year", 2018);
        setShortField(term30225, term30225.getClass(), "month", (short) 1);
        setShortField(term30225, term30225.getClass(), "day", (short) 7);
        setField(term30224, term30224.getClass(), "date", term30225);
        setByteField(term30229, term30229.getClass(), "hour", (byte) 5);
        setByteField(term30229, term30229.getClass(), "minute", (byte) 42);
        setByteField(term30229, term30229.getClass(), "second", (byte) 49);
        setIntField(term30229, term30229.getClass(), "nano", 291814792);
        setField(term30224, term30224.getClass(), "time", term30229);
        setField(term30209, term30209.getClass(), "createdAt", term30224);
        setIntField(term30235, term30235.getClass(), "year", 2022);
        setShortField(term30235, term30235.getClass(), "month", (short) 7);
        setShortField(term30235, term30235.getClass(), "day", (short) 9);
        setField(term30234, term30234.getClass(), "date", term30235);
        setByteField(term30239, term30239.getClass(), "hour", (byte) 21);
        setByteField(term30239, term30239.getClass(), "minute", (byte) 48);
        setByteField(term30239, term30239.getClass(), "second", (byte) 58);
        setIntField(term30239, term30239.getClass(), "nano", 579553780);
        setField(term30234, term30234.getClass(), "time", term30239);
        setField(term30209, term30209.getClass(), "updatedAt", term30234);
        term30244 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30244;
        callMethod(klass, "equals", argTypes, term30209, args);
    }

};


