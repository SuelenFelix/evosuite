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

public class Task_setEta_20177886931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6624;

    public Task_setEta_20177886931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6624 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        setField(term6624, term6624.getClass(), "id", null);
        setField(term6624, term6624.getClass(), "title", null);
        setField(term6624, term6624.getClass(), "description", null);
        setField(term6624, term6624.getClass(), "createdDate", null);
        setField(term6624, term6624.getClass(), "eta", null);
        setBooleanField(term6624, term6624.getClass(), "finished", false);
        setField(term6624, term6624.getClass(), "taskStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEta", argTypes, term6624, args);
    }

};


