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
import java.lang.Boolean;

public class Task_setFinished_112683638432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6626;
     Object term6628;

    public Task_setFinished_112683638432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6626 = newInstance(Class.forName("com.sacavix.todoapp.persistence.entity.Task"));
        setField(term6626, term6626.getClass(), "id", null);
        setField(term6626, term6626.getClass(), "title", null);
        setField(term6626, term6626.getClass(), "description", null);
        setField(term6626, term6626.getClass(), "createdDate", null);
        setField(term6626, term6626.getClass(), "eta", null);
        setBooleanField(term6626, term6626.getClass(), "finished", false);
        setField(term6626, term6626.getClass(), "taskStatus", null);
        term6628 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sacavix.todoapp.persistence.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6628;
        callMethod(klass, "setFinished", argTypes, term6626, args);
    }

};


