package com.blog.coffee_shop.model;

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
import static com.blog.coffee_shop.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class MenuItem_equals_13538117288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360;
     Object term378;

    public MenuItem_equals_13538117288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term374 = new ArrayList();
        term360 = newInstance(Class.forName("com.blog.coffee_shop.model.MenuItem"));
        setIntField(term360, term360.getClass(), "id", 1227103734);
        setField(term360, term360.getClass(), "name", "pCTimMblYc");
        setField(term360, term360.getClass(), "ingredients", term374);
        term378 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.blog.coffee_shop.model.MenuItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term378;
        callMethod(klass, "equals", argTypes, term360, args);
    }

};


