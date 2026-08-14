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

public class TodoList_getItems_16604354124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421;

    public TodoList_getItems_16604354124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term422 = new Long(2535595959091595249L);
        ArrayList term436 = new ArrayList();
        term421 = newInstance(Class.forName("io.schultz.dustin.todoapp.model.TodoList"));
        setField(term421, term421.getClass(), "id", term422);
        setField(term421, term421.getClass(), "name", "aJlieCFVtF");
        setField(term421, term421.getClass(), "items", term436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.schultz.dustin.todoapp.model.TodoList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term421, args);
    }

};


