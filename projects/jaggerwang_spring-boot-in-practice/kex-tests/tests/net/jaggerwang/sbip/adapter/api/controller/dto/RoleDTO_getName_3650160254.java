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

public class RoleDTO_getName_3650160254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17043;

    public RoleDTO_getName_3650160254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17044 = new Long(-7013378340043571457L);
        term17043 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO"));
        Object term17058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17063 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17068 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17069 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17073 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17043, term17043.getClass(), "id", term17044);
        setField(term17043, term17043.getClass(), "name", "dAldIGYAXV");
        setIntField(term17059, term17059.getClass(), "year", 2021);
        setShortField(term17059, term17059.getClass(), "month", (short) 12);
        setShortField(term17059, term17059.getClass(), "day", (short) 23);
        setField(term17058, term17058.getClass(), "date", term17059);
        setByteField(term17063, term17063.getClass(), "hour", (byte) 18);
        setByteField(term17063, term17063.getClass(), "minute", (byte) 52);
        setByteField(term17063, term17063.getClass(), "second", (byte) 27);
        setIntField(term17063, term17063.getClass(), "nano", 512484524);
        setField(term17058, term17058.getClass(), "time", term17063);
        setField(term17043, term17043.getClass(), "createdAt", term17058);
        setIntField(term17069, term17069.getClass(), "year", 2012);
        setShortField(term17069, term17069.getClass(), "month", (short) 6);
        setShortField(term17069, term17069.getClass(), "day", (short) 25);
        setField(term17068, term17068.getClass(), "date", term17069);
        setByteField(term17073, term17073.getClass(), "hour", (byte) 2);
        setByteField(term17073, term17073.getClass(), "minute", (byte) 21);
        setByteField(term17073, term17073.getClass(), "second", (byte) 28);
        setIntField(term17073, term17073.getClass(), "nano", 605177282);
        setField(term17068, term17068.getClass(), "time", term17073);
        setField(term17043, term17043.getClass(), "updatedAt", term17068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term17043, args);
    }

};


