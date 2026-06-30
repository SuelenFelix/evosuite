package com.sacavix.todoapp.mapper;

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
import static com.sacavix.todoapp.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TaskInDTOToTask_map_13125760841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public TaskInDTOToTask_map_13125760841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.sacavix.todoapp.mapper.TaskInDTOToTask"));
        term2 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term27 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2, term2.getClass(), "title", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "description", "sjlJAEtRrb");
        setIntField(term28, term28.getClass(), "year", 2012);
        setShortField(term28, term28.getClass(), "month", (short) 8);
        setShortField(term28, term28.getClass(), "day", (short) 25);
        setField(term27, term27.getClass(), "date", term28);
        setByteField(term32, term32.getClass(), "hour", (byte) 5);
        setByteField(term32, term32.getClass(), "minute", (byte) 20);
        setByteField(term32, term32.getClass(), "second", (byte) 50);
        setIntField(term32, term32.getClass(), "nano", 345595912);
        setField(term27, term27.getClass(), "time", term32);
        setField(term2, term2.getClass(), "eta", term27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.mapper.TaskInDTOToTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "map", argTypes, term1, args);
    }

};


