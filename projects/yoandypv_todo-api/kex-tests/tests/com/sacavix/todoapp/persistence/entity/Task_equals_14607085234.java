package com.sacavix.todoapp.persistence.entity;

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
import static com.sacavix.todoapp.persistence.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Task_equals_14607085234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6632;

    public Task_equals_14607085234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6632 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        setField(term6632, term6632.getClass(), "id", null);
        setField(term6632, term6632.getClass(), "title", null);
        setField(term6632, term6632.getClass(), "description", null);
        setField(term6632, term6632.getClass(), "createdDate", null);
        setField(term6632, term6632.getClass(), "eta", null);
        setBooleanField(term6632, term6632.getClass(), "finished", false);
        setField(term6632, term6632.getClass(), "taskStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term6632, args);
    }

};


