package io.schultz.dustin.todoapp.dto;

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
import static io.schultz.dustin.todoapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TodoItemDto_isComplete_9627420272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;

    public TodoItemDto_isComplete_9627420272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term269, term269.getClass(), "value", "vrQLuWIDJX");
        setBooleanField(term269, term269.getClass(), "complete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term269, args);
    }

};


