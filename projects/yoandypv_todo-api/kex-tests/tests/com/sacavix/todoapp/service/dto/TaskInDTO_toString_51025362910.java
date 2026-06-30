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

public class TaskInDTO_toString_51025362910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552;

    public TaskInDTO_toString_51025362910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term582 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term552, term552.getClass(), "title", "hNxWaHcfhY");
        setField(term552, term552.getClass(), "description", "RkybSrpybU");
        setIntField(term578, term578.getClass(), "year", 2019);
        setShortField(term578, term578.getClass(), "month", (short) 2);
        setShortField(term578, term578.getClass(), "day", (short) 21);
        setField(term577, term577.getClass(), "date", term578);
        setByteField(term582, term582.getClass(), "hour", (byte) 5);
        setByteField(term582, term582.getClass(), "minute", (byte) 41);
        setByteField(term582, term582.getClass(), "second", (byte) 11);
        setIntField(term582, term582.getClass(), "nano", 859829782);
        setField(term577, term577.getClass(), "time", term582);
        setField(term552, term552.getClass(), "eta", term577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term552, args);
    }

};


