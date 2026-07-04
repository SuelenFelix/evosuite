package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Menu_setParentId_8895418829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47309;

    public Menu_setParentId_8895418829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47309 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term47309, term47309.getClass(), "id", null);
        setField(term47309, term47309.getClass(), "name", null);
        setField(term47309, term47309.getClass(), "path", null);
        setField(term47309, term47309.getClass(), "parentId", null);
        setField(term47309, term47309.getClass(), "icon", null);
        setField(term47309, term47309.getClass(), "introduce", null);
        setField(term47309, term47309.getClass(), "children", null);
        setField(term47309, term47309.getClass(), "meta", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setParentId", argTypes, term47309, args);
    }

};


