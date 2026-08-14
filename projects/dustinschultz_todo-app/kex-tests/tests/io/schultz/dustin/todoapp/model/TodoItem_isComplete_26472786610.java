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

public class TodoItem_isComplete_26472786610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306;

    public TodoItem_isComplete_26472786610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoItem"));
        setField(term306, term306.getClass(), "id", null);
        setField(term306, term306.getClass(), "item", null);
        setBooleanField(term306, term306.getClass(), "complete", false);
        setField(term306, term306.getClass(), "todoList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.model.TodoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term306, args);
    }

};


