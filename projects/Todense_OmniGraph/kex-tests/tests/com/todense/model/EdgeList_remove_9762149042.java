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
import java.lang.Integer;

public class EdgeList_remove_9762149042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1720;
     Object term1723;

    public EdgeList_remove_9762149042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1720 = newInstance(Class.forName("com.todense.model.EdgeList"));
        setField(term1720, term1720.getClass(), "edgeMap", null);
        setField(term1720, term1720.getClass(), "elementData", null);
        setIntField(term1720, term1720.getClass(), "size", 0);
        setIntField(term1720, term1720.getClass(), "modCount", 0);
        term1723 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.model.EdgeList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1723;
        callMethod(klass, "remove", argTypes, term1720, args);
    }

};


