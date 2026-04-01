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

public class TodoItem_setCategory_9748206196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;

    public TodoItem_setCategory_9748206196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1421 = new Long(-2585684163342970173L);
        term1420 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term1420, term1420.getClass(), "id", term1421);
        setField(term1420, term1420.getClass(), "category", "nHXjMycHlU");
        setField(term1420, term1420.getClass(), "name", "ieCtQFdkii");
        setBooleanField(term1420, term1420.getClass(), "complete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dEnhdmILtU";
        callMethod(klass, "setCategory", argTypes, term1420, args);
    }

};


