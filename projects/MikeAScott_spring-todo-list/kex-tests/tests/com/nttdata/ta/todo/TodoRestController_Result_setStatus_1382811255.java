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

public class TodoRestController_Result_setStatus_1382811255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332;

    public TodoRestController_Result_setStatus_1382811255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term346 = new Long(7411271909051562686L);
        term332 = newInstance(Class.forName("com.nttdata.ta.todo.TodoRestController$Result"));
        Object term345 = newInstance(Class.forName("com.nttdata.ta.todo.TodoItem"));
        setField(term332, term332.getClass(), "status", "oVcInYnLWB");
        setField(term345, term345.getClass(), "id", term346);
        setField(term345, term345.getClass(), "category", "aJlieCFVtF");
        setField(term345, term345.getClass(), "name", "ZiaGIbnzTs");
        setBooleanField(term345, term345.getClass(), "complete", true);
        setField(term332, term332.getClass(), "item", term345);
        setField(term332, term332.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.nttdata.ta.todo.TodoRestController$Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        callMethod(klass, "setStatus", argTypes, term332, args);
    }

};


