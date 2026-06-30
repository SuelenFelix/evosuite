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

public class TaskInDTO_getEta_2420174013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;

    public TaskInDTO_getEta_2420174013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term111, term111.getClass(), "title", "jJCZpVmanW");
        setField(term111, term111.getClass(), "description", "EGtDIRbSSb");
        setIntField(term137, term137.getClass(), "year", 2015);
        setShortField(term137, term137.getClass(), "month", (short) 9);
        setShortField(term137, term137.getClass(), "day", (short) 19);
        setField(term136, term136.getClass(), "date", term137);
        setByteField(term141, term141.getClass(), "hour", (byte) 9);
        setByteField(term141, term141.getClass(), "minute", (byte) 4);
        setByteField(term141, term141.getClass(), "second", (byte) 10);
        setIntField(term141, term141.getClass(), "nano", 401765865);
        setField(term136, term136.getClass(), "time", term141);
        setField(term111, term111.getClass(), "eta", term136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEta", argTypes, term111, args);
    }

};


