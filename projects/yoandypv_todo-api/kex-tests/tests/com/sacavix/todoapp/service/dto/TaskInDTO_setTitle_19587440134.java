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

public class TaskInDTO_setTitle_19587440134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166;

    public TaskInDTO_setTitle_19587440134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term196 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term166, term166.getClass(), "title", "SzjVpOQTyS");
        setField(term166, term166.getClass(), "description", "MjGYSRKTNF");
        setIntField(term192, term192.getClass(), "year", 2015);
        setShortField(term192, term192.getClass(), "month", (short) 4);
        setShortField(term192, term192.getClass(), "day", (short) 14);
        setField(term191, term191.getClass(), "date", term192);
        setByteField(term196, term196.getClass(), "hour", (byte) 18);
        setByteField(term196, term196.getClass(), "minute", (byte) 24);
        setByteField(term196, term196.getClass(), "second", (byte) 32);
        setIntField(term196, term196.getClass(), "nano", 369233818);
        setField(term191, term191.getClass(), "time", term196);
        setField(term166, term166.getClass(), "eta", term191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "setTitle", argTypes, term166, args);
    }

};


