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
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class TodoItem_getId_12375862481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TodoItem_getId_12375862481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term18 = new Long(6375119433582206027L);
        ArrayList term32 = new ArrayList();
        term1 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoItem"));
        Object term17 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoList"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "item", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "complete", false);
        setField(term17, term17.getClass(), "id", term18);
        setField(term17, term17.getClass(), "name", "sjlJAEtRrb");
        setField(term17, term17.getClass(), "items", term32);
        setField(term1, term1.getClass(), "todoList", term17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.model.TodoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


