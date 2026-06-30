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

public class TaskInDTO_hashCode_102101331920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615;

    public TaskInDTO_hashCode_102101331920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615 = newInstance(Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO"));
        setField(term615, term615.getClass(), "title", null);
        setField(term615, term615.getClass(), "description", null);
        setField(term615, term615.getClass(), "eta", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.service.dto.TaskInDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term615, args);
    }

};


