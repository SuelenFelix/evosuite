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

public class RoleDTO_RoleDTOBuilder_id_21438411081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58516;
     Object term58551;

    public RoleDTO_RoleDTOBuilder_id_21438411081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58517 = new Long(-5167573302796126161L);
        term58516 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder"));
        Object term58531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58536 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58546 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58516, term58516.getClass(), "id", term58517);
        setField(term58516, term58516.getClass(), "name", "FzyIShiOmb");
        setIntField(term58532, term58532.getClass(), "year", 2019);
        setShortField(term58532, term58532.getClass(), "month", (short) 7);
        setShortField(term58532, term58532.getClass(), "day", (short) 7);
        setField(term58531, term58531.getClass(), "date", term58532);
        setByteField(term58536, term58536.getClass(), "hour", (byte) 22);
        setByteField(term58536, term58536.getClass(), "minute", (byte) 43);
        setByteField(term58536, term58536.getClass(), "second", (byte) 9);
        setIntField(term58536, term58536.getClass(), "nano", 17138447);
        setField(term58531, term58531.getClass(), "time", term58536);
        setField(term58516, term58516.getClass(), "createdAt", term58531);
        setIntField(term58542, term58542.getClass(), "year", 2026);
        setShortField(term58542, term58542.getClass(), "month", (short) 5);
        setShortField(term58542, term58542.getClass(), "day", (short) 13);
        setField(term58541, term58541.getClass(), "date", term58542);
        setByteField(term58546, term58546.getClass(), "hour", (byte) 21);
        setByteField(term58546, term58546.getClass(), "minute", (byte) 41);
        setByteField(term58546, term58546.getClass(), "second", (byte) 14);
        setIntField(term58546, term58546.getClass(), "nano", 302456774);
        setField(term58541, term58541.getClass(), "time", term58546);
        setField(term58516, term58516.getClass(), "updatedAt", term58541);
        term58551 = new Long(199834233798511747L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO$RoleDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term58551;
        callMethod(klass, "id", argTypes, term58516, args);
    }

};


