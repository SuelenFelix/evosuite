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

public class TodoItem_getCategory_17338042375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1372;

    public TodoItem_getCategory_17338042375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1373 = new Long(8428634514691209827L);
        term1372 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term1372, term1372.getClass(), "id", term1373);
        setField(term1372, term1372.getClass(), "category", "MLqYREekMl");
        setField(term1372, term1372.getClass(), "name", "ytSBIKXogI");
        setBooleanField(term1372, term1372.getClass(), "complete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term1372, args);
    }

};


