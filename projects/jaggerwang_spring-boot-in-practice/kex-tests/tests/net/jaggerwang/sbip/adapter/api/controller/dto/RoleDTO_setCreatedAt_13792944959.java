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

public class RoleDTO_setCreatedAt_13792944959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17292;
     Object term17327;

    public RoleDTO_setCreatedAt_13792944959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17293 = new Long(-432424084523104253L);
        term17292 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17312 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17322 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17292, term17292.getClass(), "id", term17293);
        setField(term17292, term17292.getClass(), "name", "jNxbVmoZgq");
        setIntField(term17308, term17308.getClass(), "year", 2024);
        setShortField(term17308, term17308.getClass(), "month", (short) 7);
        setShortField(term17308, term17308.getClass(), "day", (short) 29);
        setField(term17307, term17307.getClass(), "date", term17308);
        setByteField(term17312, term17312.getClass(), "hour", (byte) 19);
        setByteField(term17312, term17312.getClass(), "minute", (byte) 15);
        setByteField(term17312, term17312.getClass(), "second", (byte) 16);
        setIntField(term17312, term17312.getClass(), "nano", 554834199);
        setField(term17307, term17307.getClass(), "time", term17312);
        setField(term17292, term17292.getClass(), "createdAt", term17307);
        setIntField(term17318, term17318.getClass(), "year", 2018);
        setShortField(term17318, term17318.getClass(), "month", (short) 2);
        setShortField(term17318, term17318.getClass(), "day", (short) 13);
        setField(term17317, term17317.getClass(), "date", term17318);
        setByteField(term17322, term17322.getClass(), "hour", (byte) 15);
        setByteField(term17322, term17322.getClass(), "minute", (byte) 1);
        setByteField(term17322, term17322.getClass(), "second", (byte) 45);
        setIntField(term17322, term17322.getClass(), "nano", 380020898);
        setField(term17317, term17317.getClass(), "time", term17322);
        setField(term17292, term17292.getClass(), "updatedAt", term17317);
        term17327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17332 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17328, term17328.getClass(), "year", 2022);
        setShortField(term17328, term17328.getClass(), "month", (short) 8);
        setShortField(term17328, term17328.getClass(), "day", (short) 30);
        setField(term17327, term17327.getClass(), "date", term17328);
        setByteField(term17332, term17332.getClass(), "hour", (byte) 3);
        setByteField(term17332, term17332.getClass(), "minute", (byte) 13);
        setByteField(term17332, term17332.getClass(), "second", (byte) 34);
        setIntField(term17332, term17332.getClass(), "nano", 69286341);
        setField(term17327, term17327.getClass(), "time", term17332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term17327;
        callMethod(klass, "setCreatedAt", argTypes, term17292, args);
    }

};


