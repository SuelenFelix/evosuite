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

public class UllmanExactState_isDead_68082910311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9743;

    public UllmanExactState_isDead_68082910311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9743 = newInstance(Class.forName("org.graph4j.isomorphism.UllmanExactState"));
        setField(term9743, term9743.getClass(), "M", null);
        setIntField(term9743, term9743.getClass(), "prev_1", 0);
        setIntField(term9743, term9743.getClass(), "prev_2", 0);
        setField(term9743, term9743.getClass(), "o1", null);
        setField(term9743, term9743.getClass(), "o2", null);
        setIntField(term9743, term9743.getClass(), "n1", 0);
        setIntField(term9743, term9743.getClass(), "n2", 0);
        setIntField(term9743, term9743.getClass(), "core_len", 0);
        setField(term9743, term9743.getClass(), "core_1", null);
        setField(term9743, term9743.getClass(), "core_2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.UllmanExactState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDead", argTypes, term9743, args);
    }

};


