package com.nttdata.ta.todo;

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
import static com.nttdata.ta.todo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TodoItem_setId_9517574758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538;
     Object term1566;

    public TodoItem_setId_9517574758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1539 = new Long(-4365849114644724155L);
        term1538 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term1538, term1538.getClass(), "id", term1539);
        setField(term1538, term1538.getClass(), "category", "fhkbdRViHi");
        setField(term1538, term1538.getClass(), "name", "uWHnvSvaPl");
        setBooleanField(term1538, term1538.getClass(), "complete", true);
        term1566 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1566;
        callMethod(klass, "setId", argTypes, term1538, args);
    }

};


