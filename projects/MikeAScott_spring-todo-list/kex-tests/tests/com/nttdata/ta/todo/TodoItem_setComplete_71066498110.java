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
import java.lang.Boolean;

public class TodoItem_setComplete_71066498110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1636;
     Object term1664;

    public TodoItem_setComplete_71066498110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1637 = new Long(-7672528020740371001L);
        term1636 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term1636, term1636.getClass(), "id", term1637);
        setField(term1636, term1636.getClass(), "category", "tPlsykYBqO");
        setField(term1636, term1636.getClass(), "name", "bLPjGVBhlX");
        setBooleanField(term1636, term1636.getClass(), "complete", false);
        term1664 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1664;
        callMethod(klass, "setComplete", argTypes, term1636, args);
    }

};


