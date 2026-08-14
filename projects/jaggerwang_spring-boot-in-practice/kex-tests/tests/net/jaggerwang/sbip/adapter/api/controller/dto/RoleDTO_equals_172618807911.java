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

public class RoleDTO_equals_172618807911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17402;
     Object term17437;

    public RoleDTO_equals_172618807911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17403 = new Long(-3850323135468805420L);
        term17402 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17432 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17402, term17402.getClass(), "id", term17403);
        setField(term17402, term17402.getClass(), "name", "hulYxtowxw");
        setIntField(term17418, term17418.getClass(), "year", 2028);
        setShortField(term17418, term17418.getClass(), "month", (short) 2);
        setShortField(term17418, term17418.getClass(), "day", (short) 8);
        setField(term17417, term17417.getClass(), "date", term17418);
        setByteField(term17422, term17422.getClass(), "hour", (byte) 16);
        setByteField(term17422, term17422.getClass(), "minute", (byte) 14);
        setByteField(term17422, term17422.getClass(), "second", (byte) 31);
        setIntField(term17422, term17422.getClass(), "nano", 824823232);
        setField(term17417, term17417.getClass(), "time", term17422);
        setField(term17402, term17402.getClass(), "createdAt", term17417);
        setIntField(term17428, term17428.getClass(), "year", 2018);
        setShortField(term17428, term17428.getClass(), "month", (short) 9);
        setShortField(term17428, term17428.getClass(), "day", (short) 8);
        setField(term17427, term17427.getClass(), "date", term17428);
        setByteField(term17432, term17432.getClass(), "hour", (byte) 14);
        setByteField(term17432, term17432.getClass(), "minute", (byte) 21);
        setByteField(term17432, term17432.getClass(), "second", (byte) 23);
        setIntField(term17432, term17432.getClass(), "nano", 316911941);
        setField(term17427, term17427.getClass(), "time", term17432);
        setField(term17402, term17402.getClass(), "updatedAt", term17427);
        term17437 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17437;
        callMethod(klass, "equals", argTypes, term17402, args);
    }

};


