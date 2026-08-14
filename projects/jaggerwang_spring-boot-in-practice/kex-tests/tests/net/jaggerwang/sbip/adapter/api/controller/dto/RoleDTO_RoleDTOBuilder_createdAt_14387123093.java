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

public class RoleDTO_RoleDTOBuilder_createdAt_14387123093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58630;
     Object term58665;

    public RoleDTO_RoleDTOBuilder_createdAt_14387123093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58631 = new Long(8601797948269882230L);
        term58630 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder"));
        Object term58645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58650 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58660 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58630, term58630.getClass(), "id", term58631);
        setField(term58630, term58630.getClass(), "name", "iSQqMWMRlU");
        setIntField(term58646, term58646.getClass(), "year", 2026);
        setShortField(term58646, term58646.getClass(), "month", (short) 6);
        setShortField(term58646, term58646.getClass(), "day", (short) 4);
        setField(term58645, term58645.getClass(), "date", term58646);
        setByteField(term58650, term58650.getClass(), "hour", (byte) 14);
        setByteField(term58650, term58650.getClass(), "minute", (byte) 13);
        setByteField(term58650, term58650.getClass(), "second", (byte) 32);
        setIntField(term58650, term58650.getClass(), "nano", 911119428);
        setField(term58645, term58645.getClass(), "time", term58650);
        setField(term58630, term58630.getClass(), "createdAt", term58645);
        setIntField(term58656, term58656.getClass(), "year", 2010);
        setShortField(term58656, term58656.getClass(), "month", (short) 3);
        setShortField(term58656, term58656.getClass(), "day", (short) 18);
        setField(term58655, term58655.getClass(), "date", term58656);
        setByteField(term58660, term58660.getClass(), "hour", (byte) 5);
        setByteField(term58660, term58660.getClass(), "minute", (byte) 31);
        setByteField(term58660, term58660.getClass(), "second", (byte) 55);
        setIntField(term58660, term58660.getClass(), "nano", 783578310);
        setField(term58655, term58655.getClass(), "time", term58660);
        setField(term58630, term58630.getClass(), "updatedAt", term58655);
        term58665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58670 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term58666, term58666.getClass(), "year", 2028);
        setShortField(term58666, term58666.getClass(), "month", (short) 3);
        setShortField(term58666, term58666.getClass(), "day", (short) 23);
        setField(term58665, term58665.getClass(), "date", term58666);
        setByteField(term58670, term58670.getClass(), "hour", (byte) 18);
        setByteField(term58670, term58670.getClass(), "minute", (byte) 27);
        setByteField(term58670, term58670.getClass(), "second", (byte) 54);
        setIntField(term58670, term58670.getClass(), "nano", 421491474);
        setField(term58665, term58665.getClass(), "time", term58670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term58665;
        callMethod(klass, "createdAt", argTypes, term58630, args);
    }

};


