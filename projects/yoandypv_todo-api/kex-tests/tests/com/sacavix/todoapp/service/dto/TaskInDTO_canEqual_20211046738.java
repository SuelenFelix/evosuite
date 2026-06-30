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

public class TaskInDTO_canEqual_20211046738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441;
     Object term476;

    public TaskInDTO_canEqual_20211046738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term441 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term466 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term467 = newInstance(Class.forName("java.time.LocalDate"));
        Object term471 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term441, term441.getClass(), "title", "ZiaGIbnzTs");
        setField(term441, term441.getClass(), "description", "tbcdzjIfER");
        setIntField(term467, term467.getClass(), "year", 2029);
        setShortField(term467, term467.getClass(), "month", (short) 8);
        setShortField(term467, term467.getClass(), "day", (short) 29);
        setField(term466, term466.getClass(), "date", term467);
        setByteField(term471, term471.getClass(), "hour", (byte) 15);
        setByteField(term471, term471.getClass(), "minute", (byte) 50);
        setByteField(term471, term471.getClass(), "second", (byte) 1);
        setIntField(term471, term471.getClass(), "nano", 277971904);
        setField(term466, term466.getClass(), "time", term471);
        setField(term441, term441.getClass(), "eta", term466);
        term476 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term476;
        callMethod(klass, "canEqual", argTypes, term441, args);
    }

};


