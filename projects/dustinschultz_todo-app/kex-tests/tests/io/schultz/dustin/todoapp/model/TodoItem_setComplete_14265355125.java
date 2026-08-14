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
import java.lang.Boolean;

public class TodoItem_setComplete_14265355125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;
     Object term278;

    public TodoItem_setComplete_14265355125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term244 = new Long(-7237588299778557629L);
        Long term260 = new Long(6967924379644551255L);
        ArrayList term274 = new ArrayList();
        term243 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoItem"));
        Object term259 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoList"));
        setField(term243, term243.getClass(), "id", term244);
        setField(term243, term243.getClass(), "item", "RMFIsYGgne");
        setBooleanField(term243, term243.getClass(), "complete", true);
        setField(term259, term259.getClass(), "id", term260);
        setField(term259, term259.getClass(), "name", "NRdvgJlhkX");
        setField(term259, term259.getClass(), "items", term274);
        setField(term243, term243.getClass(), "todoList", term259);
        term278 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.model.TodoItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term278;
        callMethod(klass, "setComplete", argTypes, term243, args);
    }

};


