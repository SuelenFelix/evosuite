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

public class TaskInDTO_hashCode_10210133199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497;

    public TaskInDTO_hashCode_10210133199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term527 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term497, term497.getClass(), "title", "HyxfbSQYBe");
        setField(term497, term497.getClass(), "description", "pCTimMblYc");
        setIntField(term523, term523.getClass(), "year", 2022);
        setShortField(term523, term523.getClass(), "month", (short) 11);
        setShortField(term523, term523.getClass(), "day", (short) 16);
        setField(term522, term522.getClass(), "date", term523);
        setByteField(term527, term527.getClass(), "hour", (byte) 15);
        setByteField(term527, term527.getClass(), "minute", (byte) 54);
        setByteField(term527, term527.getClass(), "second", (byte) 2);
        setIntField(term527, term527.getClass(), "nano", 733274103);
        setField(term522, term522.getClass(), "time", term527);
        setField(term497, term497.getClass(), "eta", term522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term497, args);
    }

};


