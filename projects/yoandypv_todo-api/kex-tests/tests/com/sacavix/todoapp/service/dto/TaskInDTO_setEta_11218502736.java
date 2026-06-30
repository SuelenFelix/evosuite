package com.sacavix.todoapp.service.dto;

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
import static com.sacavix.todoapp.service.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TaskInDTO_setEta_11218502736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;
     Object term355;

    public TaskInDTO_setEta_11218502736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term350 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term320, term320.getClass(), "title", "MxlszYVzRf");
        setField(term320, term320.getClass(), "description", "LQFpaHEwXR");
        setIntField(term346, term346.getClass(), "year", 2026);
        setShortField(term346, term346.getClass(), "month", (short) 12);
        setShortField(term346, term346.getClass(), "day", (short) 14);
        setField(term345, term345.getClass(), "date", term346);
        setByteField(term350, term350.getClass(), "hour", (byte) 16);
        setByteField(term350, term350.getClass(), "minute", (byte) 34);
        setByteField(term350, term350.getClass(), "second", (byte) 9);
        setIntField(term350, term350.getClass(), "nano", 518326996);
        setField(term345, term345.getClass(), "time", term350);
        setField(term320, term320.getClass(), "eta", term345);
        term355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term360 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term356, term356.getClass(), "year", 2025);
        setShortField(term356, term356.getClass(), "month", (short) 4);
        setShortField(term356, term356.getClass(), "day", (short) 24);
        setField(term355, term355.getClass(), "date", term356);
        setByteField(term360, term360.getClass(), "hour", (byte) 18);
        setByteField(term360, term360.getClass(), "minute", (byte) 11);
        setByteField(term360, term360.getClass(), "second", (byte) 40);
        setIntField(term360, term360.getClass(), "nano", 137454929);
        setField(term355, term355.getClass(), "time", term360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term355;
        callMethod(klass, "setEta", argTypes, term320, args);
    }

};


