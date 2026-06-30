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

public class TaskInDTO_equals_14696999947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;
     Object term420;

    public TaskInDTO_equals_14696999947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term415 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term385, term385.getClass(), "title", "oVcInYnLWB");
        setField(term385, term385.getClass(), "description", "aJlieCFVtF");
        setIntField(term411, term411.getClass(), "year", 2024);
        setShortField(term411, term411.getClass(), "month", (short) 1);
        setShortField(term411, term411.getClass(), "day", (short) 24);
        setField(term410, term410.getClass(), "date", term411);
        setByteField(term415, term415.getClass(), "hour", (byte) 20);
        setByteField(term415, term415.getClass(), "minute", (byte) 28);
        setByteField(term415, term415.getClass(), "second", (byte) 39);
        setIntField(term415, term415.getClass(), "nano", 952728177);
        setField(term410, term410.getClass(), "time", term415);
        setField(term385, term385.getClass(), "eta", term410);
        term420 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term420;
        callMethod(klass, "equals", argTypes, term385, args);
    }

};


