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

public class TaskInDTO_setTitle_195874401315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610;

    public TaskInDTO_setTitle_195874401315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term610 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        setField(term610, term610.getClass(), "title", null);
        setField(term610, term610.getClass(), "description", null);
        setField(term610, term610.getClass(), "eta", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term610, args);
    }

};


