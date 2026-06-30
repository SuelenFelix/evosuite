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

public class TodoRestController_Result_init_13726830341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public TodoRestController_Result_init_13726830341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14 = new Long(2442117782898005296L);
        term13 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term13, term13.getClass(), "id", term14);
        setField(term13, term13.getClass(), "category", "sjlJAEtRrb");
        setField(term13, term13.getClass(), "name", "MuLcgQHgqz");
        setBooleanField(term13, term13.getClass(), "complete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoRestController$Result");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.nttdata.ta.todo.TodoRestController");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.nttdata.ta.todo.TodoItem");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        args[2] = term13;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


