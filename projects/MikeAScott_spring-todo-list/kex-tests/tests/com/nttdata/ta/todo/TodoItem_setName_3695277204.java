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

public class TodoItem_setName_3695277204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1302;

    public TodoItem_setName_3695277204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1303 = new Long(-4920224193275732920L);
        term1302 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term1302, term1302.getClass(), "id", term1303);
        setField(term1302, term1302.getClass(), "category", "onpbIeEKoi");
        setField(term1302, term1302.getClass(), "name", "YRHGsAkhxb");
        setBooleanField(term1302, term1302.getClass(), "complete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "setName", argTypes, term1302, args);
    }

};


