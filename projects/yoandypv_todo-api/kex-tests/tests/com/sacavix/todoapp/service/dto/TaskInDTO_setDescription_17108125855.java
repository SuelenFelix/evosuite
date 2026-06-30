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

public class TaskInDTO_setDescription_17108125855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;

    public TaskInDTO_setDescription_17108125855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        Object term268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term243, term243.getClass(), "title", "RMFIsYGgne");
        setField(term243, term243.getClass(), "description", "NRdvgJlhkX");
        setIntField(term269, term269.getClass(), "year", 2022);
        setShortField(term269, term269.getClass(), "month", (short) 2);
        setShortField(term269, term269.getClass(), "day", (short) 26);
        setField(term268, term268.getClass(), "date", term269);
        setByteField(term273, term273.getClass(), "hour", (byte) 11);
        setByteField(term273, term273.getClass(), "minute", (byte) 42);
        setByteField(term273, term273.getClass(), "second", (byte) 15);
        setIntField(term273, term273.getClass(), "nano", 377731937);
        setField(term268, term268.getClass(), "time", term273);
        setField(term243, term243.getClass(), "eta", term268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        callMethod(klass, "setDescription", argTypes, term243, args);
    }

};


