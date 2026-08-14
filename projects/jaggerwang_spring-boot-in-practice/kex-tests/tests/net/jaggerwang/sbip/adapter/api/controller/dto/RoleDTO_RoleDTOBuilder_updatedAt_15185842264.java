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

public class RoleDTO_RoleDTOBuilder_updatedAt_15185842264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58685;
     Object term58720;

    public RoleDTO_RoleDTOBuilder_updatedAt_15185842264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58686 = new Long(-7129626484175473918L);
        term58685 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder"));
        Object term58700 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58701 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58705 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58715 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58685, term58685.getClass(), "id", term58686);
        setField(term58685, term58685.getClass(), "name", "djWEnlbOXu");
        setIntField(term58701, term58701.getClass(), "year", 2025);
        setShortField(term58701, term58701.getClass(), "month", (short) 9);
        setShortField(term58701, term58701.getClass(), "day", (short) 18);
        setField(term58700, term58700.getClass(), "date", term58701);
        setByteField(term58705, term58705.getClass(), "hour", (byte) 13);
        setByteField(term58705, term58705.getClass(), "minute", (byte) 47);
        setByteField(term58705, term58705.getClass(), "second", (byte) 29);
        setIntField(term58705, term58705.getClass(), "nano", 832215473);
        setField(term58700, term58700.getClass(), "time", term58705);
        setField(term58685, term58685.getClass(), "createdAt", term58700);
        setIntField(term58711, term58711.getClass(), "year", 2023);
        setShortField(term58711, term58711.getClass(), "month", (short) 3);
        setShortField(term58711, term58711.getClass(), "day", (short) 26);
        setField(term58710, term58710.getClass(), "date", term58711);
        setByteField(term58715, term58715.getClass(), "hour", (byte) 7);
        setByteField(term58715, term58715.getClass(), "minute", (byte) 20);
        setByteField(term58715, term58715.getClass(), "second", (byte) 59);
        setIntField(term58715, term58715.getClass(), "nano", 990229662);
        setField(term58710, term58710.getClass(), "time", term58715);
        setField(term58685, term58685.getClass(), "updatedAt", term58710);
        term58720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58725 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term58721, term58721.getClass(), "year", 2028);
        setShortField(term58721, term58721.getClass(), "month", (short) 3);
        setShortField(term58721, term58721.getClass(), "day", (short) 16);
        setField(term58720, term58720.getClass(), "date", term58721);
        setByteField(term58725, term58725.getClass(), "hour", (byte) 3);
        setByteField(term58725, term58725.getClass(), "minute", (byte) 36);
        setByteField(term58725, term58725.getClass(), "second", (byte) 15);
        setIntField(term58725, term58725.getClass(), "nano", 536214083);
        setField(term58720, term58720.getClass(), "time", term58725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term58720;
        callMethod(klass, "updatedAt", argTypes, term58685, args);
    }

};


