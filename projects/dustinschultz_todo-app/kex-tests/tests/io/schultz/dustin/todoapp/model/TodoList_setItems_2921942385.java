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
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class TodoList_setItems_2921942385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450;
     Object term469;

    public TodoList_setItems_2921942385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term451 = new Long(-5476826692763582090L);
        ArrayList term465 = new ArrayList();
        term450 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoList"));
        setField(term450, term450.getClass(), "id", term451);
        setField(term450, term450.getClass(), "name", "ZiaGIbnzTs");
        setField(term450, term450.getClass(), "items", term465);
        Long term473 = new Long(-872011222785455006L);
        Long term489 = new Long(-316468845751588286L);
        ArrayList term492 = new ArrayList();
        Object term472 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoItem"));
        Object term488 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoList"));
        setField(term472, term472.getClass(), "id", term473);
        setField(term472, term472.getClass(), "item", "tbcdzjIfER");
        setBooleanField(term472, term472.getClass(), "complete", true);
        setField(term488, term488.getClass(), "id", term489);
        setField(term488, term488.getClass(), "name", "");
        setField(term488, term488.getClass(), "items", term492);
        setField(term472, term472.getClass(), "todoList", term488);
        Long term497 = new Long(5127676408959197577L);
        Long term502 = new Long(-6573104506744284592L);
        Object term496 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoItem"));
        Object term501 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoList"));
        setField(term496, term496.getClass(), "id", term497);
        setField(term496, term496.getClass(), "item", "");
        setBooleanField(term496, term496.getClass(), "complete", true);
        setField(term501, term501.getClass(), "id", term502);
        setField(term501, term501.getClass(), "name", null);
        setField(term501, term501.getClass(), "items", null);
        setField(term496, term496.getClass(), "todoList", term501);
        Long term506 = new Long(-4920224193275732920L);
        Object term505 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoItem"));
        setField(term505, term505.getClass(), "id", term506);
        setField(term505, term505.getClass(), "item", null);
        setBooleanField(term505, term505.getClass(), "complete", false);
        setField(term505, term505.getClass(), "todoList", null);
        term469 = new LinkedList();
        ((LinkedList) term469).add(term472);
        ((LinkedList) term469).add(term496);
        ((LinkedList) term469).add(term505);
        ((LinkedList) term469).add((Object)null);
        ((LinkedList) term469).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.model.TodoList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term469;
        callMethod(klass, "setItems", argTypes, term450, args);
    }

};


