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

public class VF2SubState_isGoal_4868504148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6062;

    public VF2SubState_isGoal_4868504148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6062 = newInstance(Class.forName("org.graph4j.isomorphism.VF2SubState"));
        setIntField(term6062, term6062.getClass(), "t1in_len", 0);
        setIntField(term6062, term6062.getClass(), "t2in_len", 0);
        setIntField(term6062, term6062.getClass(), "t1out_len", 0);
        setIntField(term6062, term6062.getClass(), "t2out_len", 0);
        setIntField(term6062, term6062.getClass(), "t1both_len", 0);
        setIntField(term6062, term6062.getClass(), "t2both_len", 0);
        setField(term6062, term6062.getClass(), "in1", null);
        setField(term6062, term6062.getClass(), "in2", null);
        setField(term6062, term6062.getClass(), "out1", null);
        setField(term6062, term6062.getClass(), "out2", null);
        setIntField(term6062, term6062.getClass(), "prev_1", 0);
        setIntField(term6062, term6062.getClass(), "prev_2", 0);
        setIntField(term6062, term6062.getClass(), "last_added1", 0);
        setField(term6062, term6062.getClass(), "o1", null);
        setField(term6062, term6062.getClass(), "o2", null);
        setIntField(term6062, term6062.getClass(), "n1", 0);
        setIntField(term6062, term6062.getClass(), "n2", 0);
        setIntField(term6062, term6062.getClass(), "core_len", 0);
        setField(term6062, term6062.getClass(), "core_1", null);
        setField(term6062, term6062.getClass(), "core_2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.VF2SubState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGoal", argTypes, term6062, args);
    }

};


