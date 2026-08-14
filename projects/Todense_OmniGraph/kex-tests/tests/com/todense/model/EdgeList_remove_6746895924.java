package com.todense.model;

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
import static com.todense.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EdgeList_remove_6746895924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1728;

    public EdgeList_remove_6746895924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1728 = newInstance(Class.forName("com.todense.model.EdgeList"));
        setField(term1728, term1728.getClass(), "edgeMap", null);
        setField(term1728, term1728.getClass(), "elementData", null);
        setIntField(term1728, term1728.getClass(), "size", 0);
        setIntField(term1728, term1728.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.model.EdgeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "remove", argTypes, term1728, args);
    }

};


