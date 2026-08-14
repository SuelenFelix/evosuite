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
import java.util.LinkedList;
import java.lang.Object;

public class TodoListDto_init_8639138660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public TodoListDto_init_8639138660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term16, term16.getClass(), "value", "sjlJAEtRrb");
        setBooleanField(term16, term16.getClass(), "complete", false);
        Object term31 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term31, term31.getClass(), "value", "");
        setBooleanField(term31, term31.getClass(), "complete", false);
        Object term35 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term35, term35.getClass(), "value", null);
        setBooleanField(term35, term35.getClass(), "complete", false);
        term13 = new LinkedList();
        ((LinkedList) term13).add(term16);
        ((LinkedList) term13).add(term31);
        ((LinkedList) term13).add(term35);
        ((LinkedList) term13).add((Object)null);
        ((LinkedList) term13).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.dto.TodoListDto");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


