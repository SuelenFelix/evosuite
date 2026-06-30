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

public class Task_hashCode_30261582336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6636;

    public Task_hashCode_30261582336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6636 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        setField(term6636, term6636.getClass(), "id", null);
        setField(term6636, term6636.getClass(), "title", null);
        setField(term6636, term6636.getClass(), "description", null);
        setField(term6636, term6636.getClass(), "createdDate", null);
        setField(term6636, term6636.getClass(), "eta", null);
        setBooleanField(term6636, term6636.getClass(), "finished", false);
        setField(term6636, term6636.getClass(), "taskStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6636, args);
    }

};


