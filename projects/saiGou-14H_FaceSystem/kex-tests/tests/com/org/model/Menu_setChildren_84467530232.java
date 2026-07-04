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

public class Menu_setChildren_84467530232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47312;

    public Menu_setChildren_84467530232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47312 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term47312, term47312.getClass(), "id", null);
        setField(term47312, term47312.getClass(), "name", null);
        setField(term47312, term47312.getClass(), "path", null);
        setField(term47312, term47312.getClass(), "parentId", null);
        setField(term47312, term47312.getClass(), "icon", null);
        setField(term47312, term47312.getClass(), "introduce", null);
        setField(term47312, term47312.getClass(), "children", null);
        setField(term47312, term47312.getClass(), "meta", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setChildren", argTypes, term47312, args);
    }

};


