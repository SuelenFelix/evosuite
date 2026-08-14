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

public class RoleDTO_RoleDTOBuilder_toString_15113390806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58785;

    public RoleDTO_RoleDTOBuilder_toString_15113390806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58786 = new Long(-2861878171001013253L);
        term58785 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder"));
        Object term58800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58815 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58785, term58785.getClass(), "id", term58786);
        setField(term58785, term58785.getClass(), "name", "sZyAwmdGVS");
        setIntField(term58801, term58801.getClass(), "year", 2011);
        setShortField(term58801, term58801.getClass(), "month", (short) 11);
        setShortField(term58801, term58801.getClass(), "day", (short) 10);
        setField(term58800, term58800.getClass(), "date", term58801);
        setByteField(term58805, term58805.getClass(), "hour", (byte) 16);
        setByteField(term58805, term58805.getClass(), "minute", (byte) 19);
        setByteField(term58805, term58805.getClass(), "second", (byte) 18);
        setIntField(term58805, term58805.getClass(), "nano", 955766756);
        setField(term58800, term58800.getClass(), "time", term58805);
        setField(term58785, term58785.getClass(), "createdAt", term58800);
        setIntField(term58811, term58811.getClass(), "year", 2011);
        setShortField(term58811, term58811.getClass(), "month", (short) 3);
        setShortField(term58811, term58811.getClass(), "day", (short) 20);
        setField(term58810, term58810.getClass(), "date", term58811);
        setByteField(term58815, term58815.getClass(), "hour", (byte) 2);
        setByteField(term58815, term58815.getClass(), "minute", (byte) 22);
        setByteField(term58815, term58815.getClass(), "second", (byte) 29);
        setIntField(term58815, term58815.getClass(), "nano", 438239474);
        setField(term58810, term58810.getClass(), "time", term58815);
        setField(term58785, term58785.getClass(), "updatedAt", term58810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term58785, args);
    }

};


