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

public class UllmanSubState_isDead_103860104211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11652;

    public UllmanSubState_isDead_103860104211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11652 = newInstance(Class.forName("org.graph4j.isomorphism.UllmanSubState"));
        setField(term11652, term11652.getClass(), "M", null);
        setIntField(term11652, term11652.getClass(), "prev_1", 0);
        setIntField(term11652, term11652.getClass(), "prev_2", 0);
        setField(term11652, term11652.getClass(), "o1", null);
        setField(term11652, term11652.getClass(), "o2", null);
        setIntField(term11652, term11652.getClass(), "n1", 0);
        setIntField(term11652, term11652.getClass(), "n2", 0);
        setIntField(term11652, term11652.getClass(), "core_len", 0);
        setField(term11652, term11652.getClass(), "core_1", null);
        setField(term11652, term11652.getClass(), "core_2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.UllmanSubState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDead", argTypes, term11652, args);
    }

};


