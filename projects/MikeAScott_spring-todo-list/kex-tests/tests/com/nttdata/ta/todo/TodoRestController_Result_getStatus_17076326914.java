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

public class TodoRestController_Result_getStatus_17076326914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;

    public TodoRestController_Result_getStatus_17076326914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term275 = new Long(5270370404989704783L);
        term261 = newInstance(Class.forName("com.nttdata.ta.todo.TodoRestController$Result"));
        Object term274 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term261, term261.getClass(), "status", "uuaPigETmJ");
        setField(term274, term274.getClass(), "id", term275);
        setField(term274, term274.getClass(), "category", "MxlszYVzRf");
        setField(term274, term274.getClass(), "name", "LQFpaHEwXR");
        setBooleanField(term274, term274.getClass(), "complete", true);
        setField(term261, term261.getClass(), "item", term274);
        setField(term261, term261.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoRestController$Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term261, args);
    }

};


