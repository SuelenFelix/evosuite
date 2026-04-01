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
import java.lang.Integer;

public class UllmanExactState_exactOrSubgraphIsomorphismCompatibilityCheck_11095860699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9727;
     Object term9733;
     Object term9735;

    public UllmanExactState_exactOrSubgraphIsomorphismCompatibilityCheck_11095860699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9727 = newInstance(Class.forName("org.graph4j.isomorphism.UllmanExactState"));
        setField(term9727, term9727.getClass(), "M", null);
        setIntField(term9727, term9727.getClass(), "prev_1", 0);
        setIntField(term9727, term9727.getClass(), "prev_2", 0);
        setField(term9727, term9727.getClass(), "o1", null);
        setField(term9727, term9727.getClass(), "o2", null);
        setIntField(term9727, term9727.getClass(), "n1", 0);
        setIntField(term9727, term9727.getClass(), "n2", 0);
        setIntField(term9727, term9727.getClass(), "core_len", 0);
        setField(term9727, term9727.getClass(), "core_1", null);
        setField(term9727, term9727.getClass(), "core_2", null);
        term9733 = new Integer(0);
        term9735 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.UllmanExactState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9733;
        args[1] = term9735;
        callMethod(klass, "exactOrSubgraphIsomorphismCompatibilityCheck", argTypes, term9727, args);
    }

};


