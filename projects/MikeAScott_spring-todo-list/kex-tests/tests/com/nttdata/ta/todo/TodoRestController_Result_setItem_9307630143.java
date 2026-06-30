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
import java.lang.Object;
import java.lang.Long;

public class TodoRestController_Result_setItem_9307630143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;
     Object term183;

    public TodoRestController_Result_setItem_9307630143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term156 = new Long(-8257434502486459194L);
        term142 = newInstance(Class.forName("com.nttdata.ta.todo.TodoRestController$Result"));
        Object term155 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term142, term142.getClass(), "status", "SzjVpOQTyS");
        setField(term155, term155.getClass(), "id", term156);
        setField(term155, term155.getClass(), "category", "MjGYSRKTNF");
        setField(term155, term155.getClass(), "name", "hRNSzYYIrc");
        setBooleanField(term155, term155.getClass(), "complete", false);
        setField(term142, term142.getClass(), "item", term155);
        setField(term142, term142.getClass(), "this$0", null);
        Long term184 = new Long(-8400487765614892086L);
        term183 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term183, term183.getClass(), "id", term184);
        setField(term183, term183.getClass(), "category", "RMFIsYGgne");
        setField(term183, term183.getClass(), "name", "NRdvgJlhkX");
        setBooleanField(term183, term183.getClass(), "complete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoRestController$Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.nttdata.ta.todo.TodoItem");
        Object[] args = new Object[1];
        args[0] = term183;
        callMethod(klass, "setItem", argTypes, term142, args);
    }

};


