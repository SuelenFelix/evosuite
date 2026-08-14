package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UllmanSubState_isGoal_113373139310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11646;

    public UllmanSubState_isGoal_113373139310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11646 = newInstance(Class.forName("org.graph4j.isomorphism.UllmanSubState"));
        setField(term11646, term11646.getClass(), "M", null);
        setIntField(term11646, term11646.getClass(), "prev_1", 0);
        setIntField(term11646, term11646.getClass(), "prev_2", 0);
        setField(term11646, term11646.getClass(), "o1", null);
        setField(term11646, term11646.getClass(), "o2", null);
        setIntField(term11646, term11646.getClass(), "n1", 0);
        setIntField(term11646, term11646.getClass(), "n2", 0);
        setIntField(term11646, term11646.getClass(), "core_len", 0);
        setField(term11646, term11646.getClass(), "core_1", null);
        setField(term11646, term11646.getClass(), "core_2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.UllmanSubState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGoal", argTypes, term11646, args);
    }

};


