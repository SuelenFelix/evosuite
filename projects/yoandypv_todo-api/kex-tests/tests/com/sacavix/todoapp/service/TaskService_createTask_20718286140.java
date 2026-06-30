package com.sacavix.todoapp.service;

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
import static com.sacavix.todoapp.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TaskService_createTask_20718286140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617;

    public TaskService_createTask_20718286140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term647 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term617, term617.getClass(), "title", "xOEqzGAmDU");
        setField(term617, term617.getClass(), "description", "eZFUvlxvGV");
        setIntField(term643, term643.getClass(), "year", 2018);
        setShortField(term643, term643.getClass(), "month", (short) 9);
        setShortField(term643, term643.getClass(), "day", (short) 28);
        setField(term642, term642.getClass(), "date", term643);
        setByteField(term647, term647.getClass(), "hour", (byte) 3);
        setByteField(term647, term647.getClass(), "minute", (byte) 37);
        setByteField(term647, term647.getClass(), "second", (byte) 46);
        setIntField(term647, term647.getClass(), "nano", 763326845);
        setField(term642, term642.getClass(), "time", term647);
        setField(term617, term617.getClass(), "eta", term642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.TaskService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Object[] args = new Object[1];
        args[0] = term617;
        callMethod(klass, "createTask", argTypes, null, args);
    }

};


