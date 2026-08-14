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

public class TodoItem_getItem_13638629812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;

    public TodoItem_getItem_13638629812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57 = new Long(-8257434502486459194L);
        Long term73 = new Long(-8400487765614892086L);
        ArrayList term87 = new ArrayList();
        term56 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoItem"));
        Object term72 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoList"));
        setField(term56, term56.getClass(), "id", term57);
        setField(term56, term56.getClass(), "item", "MuLcgQHgqz");
        setBooleanField(term56, term56.getClass(), "complete", false);
        setField(term72, term72.getClass(), "id", term73);
        setField(term72, term72.getClass(), "name", "xxtlPwDYFs");
        setField(term72, term72.getClass(), "items", term87);
        setField(term56, term56.getClass(), "todoList", term72);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.model.TodoItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItem", argTypes, term56, args);
    }

};


