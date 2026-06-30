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

public class Task_getEta_108161174124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6610;

    public Task_getEta_108161174124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6610 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        setField(term6610, term6610.getClass(), "id", null);
        setField(term6610, term6610.getClass(), "title", null);
        setField(term6610, term6610.getClass(), "description", null);
        setField(term6610, term6610.getClass(), "createdDate", null);
        setField(term6610, term6610.getClass(), "eta", null);
        setBooleanField(term6610, term6610.getClass(), "finished", false);
        setField(term6610, term6610.getClass(), "taskStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEta", argTypes, term6610, args);
    }

};


