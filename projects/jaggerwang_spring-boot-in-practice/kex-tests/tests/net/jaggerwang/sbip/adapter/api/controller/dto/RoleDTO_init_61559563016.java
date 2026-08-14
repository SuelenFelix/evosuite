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

public class RoleDTO_init_61559563016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17584;
     Object term17598;
     Object term17608;

    public RoleDTO_init_61559563016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17584 = new Long(-6001151456088965547L);
        term17598 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17599 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17603 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17599, term17599.getClass(), "year", 2018);
        setShortField(term17599, term17599.getClass(), "month", (short) 5);
        setShortField(term17599, term17599.getClass(), "day", (short) 13);
        setField(term17598, term17598.getClass(), "date", term17599);
        setByteField(term17603, term17603.getClass(), "hour", (byte) 0);
        setByteField(term17603, term17603.getClass(), "minute", (byte) 47);
        setByteField(term17603, term17603.getClass(), "second", (byte) 45);
        setIntField(term17603, term17603.getClass(), "nano", 10058361);
        setField(term17598, term17598.getClass(), "time", term17603);
        term17608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17613 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term17609, term17609.getClass(), "year", 2014);
        setShortField(term17609, term17609.getClass(), "month", (short) 6);
        setShortField(term17609, term17609.getClass(), "day", (short) 11);
        setField(term17608, term17608.getClass(), "date", term17609);
        setByteField(term17613, term17613.getClass(), "hour", (byte) 8);
        setByteField(term17613, term17613.getClass(), "minute", (byte) 55);
        setByteField(term17613, term17613.getClass(), "second", (byte) 58);
        setIntField(term17613, term17613.getClass(), "nano", 376244535);
        setField(term17608, term17608.getClass(), "time", term17613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.RoleDTO");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[4];
        args[0] = term17584;
        args[1] = "ITRRYiuDwH";
        args[2] = term17598;
        args[3] = term17608;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


