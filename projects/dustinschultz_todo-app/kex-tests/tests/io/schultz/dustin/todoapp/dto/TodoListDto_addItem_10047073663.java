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
import java.util.ArrayList;
import java.lang.Object;

public class TodoListDto_addItem_10047073663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;
     Object term184;

    public TodoListDto_addItem_10047073663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term170 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term170, term170.getClass(), "value", "");
        setBooleanField(term170, term170.getClass(), "complete", false);
        Object term173 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term173, term173.getClass(), "value", "");
        setBooleanField(term173, term173.getClass(), "complete", false);
        Object term176 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term176, term176.getClass(), "value", "");
        setBooleanField(term176, term176.getClass(), "complete", true);
        Object term179 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term179, term179.getClass(), "value", "");
        setBooleanField(term179, term179.getClass(), "complete", true);
        ArrayList term168 = new ArrayList();
        ((ArrayList) term168).add(term170);
        ((ArrayList) term168).add(term173);
        ((ArrayList) term168).add(term176);
        ((ArrayList) term168).add(term179);
        term155 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoListDto"));
        setField(term155, term155.getClass(), "name", "tbcdzjIfER");
        setField(term155, term155.getClass(), "items", term168);
        term184 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term184, term184.getClass(), "value", "xOEqzGAmDU");
        setBooleanField(term184, term184.getClass(), "complete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.dto.TodoListDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto");
        Object[] args = new Object[1];
        args[0] = term184;
        callMethod(klass, "addItem", argTypes, term155, args);
    }

};


