package io.schultz.dustin.todoapp.model;

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
import static io.schultz.dustin.todoapp.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TodoList_addTodoItem_162191298013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644;

    public TodoList_addTodoItem_162191298013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term644 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoList"));
        setField(term644, term644.getClass(), "id", null);
        setField(term644, term644.getClass(), "name", null);
        setField(term644, term644.getClass(), "items", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.model.TodoList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.schultz.dustin.todoapp.model.TodoItem");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addTodoItem", argTypes, term644, args);
    }

};


