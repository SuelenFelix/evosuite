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

public class TodoRestController_Result_getItem_15548694582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;

    public TodoRestController_Result_getItem_15548694582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85 = new Long(6375119433582206027L);
        term71 = newInstance(Class.forName("com.nttdata.ta.todo.TodoRestController$Result"));
        Object term84 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term71, term71.getClass(), "status", "xxtlPwDYFs");
        setField(term84, term84.getClass(), "id", term85);
        setField(term84, term84.getClass(), "category", "jJCZpVmanW");
        setField(term84, term84.getClass(), "name", "EGtDIRbSSb");
        setBooleanField(term84, term84.getClass(), "complete", false);
        setField(term71, term71.getClass(), "item", term84);
        setField(term71, term71.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoRestController$Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItem", argTypes, term71, args);
    }

};


