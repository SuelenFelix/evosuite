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

public class RoleBO_setId_5842629025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29985;
     Object term30020;

    public RoleBO_setId_5842629025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29986 = new Long(4006388896509492239L);
        term29985 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term30000 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30001 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30005 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30015 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29985, term29985.getClass(), "id", term29986);
        setField(term29985, term29985.getClass(), "name", "OUeBWNTQDh");
        setIntField(term30001, term30001.getClass(), "year", 2021);
        setShortField(term30001, term30001.getClass(), "month", (short) 7);
        setShortField(term30001, term30001.getClass(), "day", (short) 2);
        setField(term30000, term30000.getClass(), "date", term30001);
        setByteField(term30005, term30005.getClass(), "hour", (byte) 21);
        setByteField(term30005, term30005.getClass(), "minute", (byte) 55);
        setByteField(term30005, term30005.getClass(), "second", (byte) 54);
        setIntField(term30005, term30005.getClass(), "nano", 731983440);
        setField(term30000, term30000.getClass(), "time", term30005);
        setField(term29985, term29985.getClass(), "createdAt", term30000);
        setIntField(term30011, term30011.getClass(), "year", 2022);
        setShortField(term30011, term30011.getClass(), "month", (short) 10);
        setShortField(term30011, term30011.getClass(), "day", (short) 14);
        setField(term30010, term30010.getClass(), "date", term30011);
        setByteField(term30015, term30015.getClass(), "hour", (byte) 7);
        setByteField(term30015, term30015.getClass(), "minute", (byte) 29);
        setByteField(term30015, term30015.getClass(), "second", (byte) 42);
        setIntField(term30015, term30015.getClass(), "nano", 962865996);
        setField(term30010, term30010.getClass(), "time", term30015);
        setField(term29985, term29985.getClass(), "updatedAt", term30010);
        term30020 = new Long(-6314099457945626605L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term30020;
        callMethod(klass, "setId", argTypes, term29985, args);
    }

};


