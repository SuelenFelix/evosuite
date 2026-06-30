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

public class TaskInDTO_getDescription_18138634012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;

    public TaskInDTO_getDescription_18138634012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term81 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term56, term56.getClass(), "title", "MuLcgQHgqz");
        setField(term56, term56.getClass(), "description", "xxtlPwDYFs");
        setIntField(term82, term82.getClass(), "year", 2021);
        setShortField(term82, term82.getClass(), "month", (short) 1);
        setShortField(term82, term82.getClass(), "day", (short) 18);
        setField(term81, term81.getClass(), "date", term82);
        setByteField(term86, term86.getClass(), "hour", (byte) 13);
        setByteField(term86, term86.getClass(), "minute", (byte) 38);
        setByteField(term86, term86.getClass(), "second", (byte) 26);
        setIntField(term86, term86.getClass(), "nano", 544608644);
        setField(term81, term81.getClass(), "time", term86);
        setField(term56, term56.getClass(), "eta", term81);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term56, args);
    }

};


