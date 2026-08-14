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

public class TodoItem_setItem_12112277473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;

    public TodoItem_setItem_12112277473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term112 = new Long(5270370404989704783L);
        Long term128 = new Long(7411271909051562686L);
        ArrayList term142 = new ArrayList();
        term111 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoItem"));
        Object term127 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoList"));
        setField(term111, term111.getClass(), "id", term112);
        setField(term111, term111.getClass(), "item", "jJCZpVmanW");
        setBooleanField(term111, term111.getClass(), "complete", false);
        setField(term127, term127.getClass(), "id", term128);
        setField(term127, term127.getClass(), "name", "EGtDIRbSSb");
        setField(term127, term127.getClass(), "items", term142);
        setField(term111, term111.getClass(), "todoList", term127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.model.TodoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "setItem", argTypes, term111, args);
    }

};


