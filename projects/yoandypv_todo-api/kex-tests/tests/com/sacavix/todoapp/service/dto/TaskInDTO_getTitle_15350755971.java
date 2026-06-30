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

public class TaskInDTO_getTitle_15350755971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TaskInDTO_getTitle_15350755971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term26 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "title", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "description", "sjlJAEtRrb");
        setIntField(term27, term27.getClass(), "year", 2012);
        setShortField(term27, term27.getClass(), "month", (short) 8);
        setShortField(term27, term27.getClass(), "day", (short) 25);
        setField(term26, term26.getClass(), "date", term27);
        setByteField(term31, term31.getClass(), "hour", (byte) 5);
        setByteField(term31, term31.getClass(), "minute", (byte) 20);
        setByteField(term31, term31.getClass(), "second", (byte) 50);
        setIntField(term31, term31.getClass(), "nano", 345595912);
        setField(term26, term26.getClass(), "time", term31);
        setField(term1, term1.getClass(), "eta", term26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term1, args);
    }

};


