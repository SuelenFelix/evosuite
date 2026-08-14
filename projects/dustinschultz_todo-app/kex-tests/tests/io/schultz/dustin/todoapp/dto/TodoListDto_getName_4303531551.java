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

public class TodoListDto_getName_4303531551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;

    public TodoListDto_getName_4303531551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term89, term89.getClass(), "value", "");
        setBooleanField(term89, term89.getClass(), "complete", true);
        Object term92 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term92, term92.getClass(), "value", "");
        setBooleanField(term92, term92.getClass(), "complete", true);
        Object term95 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term95, term95.getClass(), "value", "");
        setBooleanField(term95, term95.getClass(), "complete", true);
        Object term98 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term98, term98.getClass(), "value", "");
        setBooleanField(term98, term98.getClass(), "complete", false);
        Object term101 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term101, term101.getClass(), "value", "");
        setBooleanField(term101, term101.getClass(), "complete", true);
        Object term104 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term104, term104.getClass(), "value", "");
        setBooleanField(term104, term104.getClass(), "complete", false);
        Object term107 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term107, term107.getClass(), "value", "");
        setBooleanField(term107, term107.getClass(), "complete", true);
        Object term110 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term110, term110.getClass(), "value", "");
        setBooleanField(term110, term110.getClass(), "complete", false);
        Object term113 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoItemDto"));
        setField(term113, term113.getClass(), "value", "");
        setBooleanField(term113, term113.getClass(), "complete", true);
        ArrayList term87 = new ArrayList();
        ((ArrayList) term87).add(term89);
        ((ArrayList) term87).add(term92);
        ((ArrayList) term87).add(term95);
        ((ArrayList) term87).add(term98);
        ((ArrayList) term87).add(term101);
        ((ArrayList) term87).add(term104);
        ((ArrayList) term87).add(term107);
        ((ArrayList) term87).add(term110);
        ((ArrayList) term87).add(term113);
        term74 = newInstance(Class.forName("io.schultz.dustin.todoapp.dto.TodoListDto"));
        setField(term74, term74.getClass(), "name", "SzjVpOQTyS");
        setField(term74, term74.getClass(), "items", term87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.dto.TodoListDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term74, args);
    }

};


