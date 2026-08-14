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

public class VF2ExactState_exactOrSubgraphIsomorphismCompatibilityCheck_10328171129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7907;
     Object term7920;
     Object term7922;
     Object term7924;
     Object term7926;
     Object term7928;
     Object term7930;

    public VF2ExactState_exactOrSubgraphIsomorphismCompatibilityCheck_10328171129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7907 = newInstance(Class.forName("org.graph4j.isomorphism.VF2ExactState"));
        setIntField(term7907, term7907.getClass(), "t1in_len", 0);
        setIntField(term7907, term7907.getClass(), "t2in_len", 0);
        setIntField(term7907, term7907.getClass(), "t1out_len", 0);
        setIntField(term7907, term7907.getClass(), "t2out_len", 0);
        setIntField(term7907, term7907.getClass(), "t1both_len", 0);
        setIntField(term7907, term7907.getClass(), "t2both_len", 0);
        setField(term7907, term7907.getClass(), "in1", null);
        setField(term7907, term7907.getClass(), "in2", null);
        setField(term7907, term7907.getClass(), "out1", null);
        setField(term7907, term7907.getClass(), "out2", null);
        setIntField(term7907, term7907.getClass(), "prev_1", 0);
        setIntField(term7907, term7907.getClass(), "prev_2", 0);
        setIntField(term7907, term7907.getClass(), "last_added1", 0);
        setField(term7907, term7907.getClass(), "o1", null);
        setField(term7907, term7907.getClass(), "o2", null);
        setIntField(term7907, term7907.getClass(), "n1", 0);
        setIntField(term7907, term7907.getClass(), "n2", 0);
        setIntField(term7907, term7907.getClass(), "core_len", 0);
        setField(term7907, term7907.getClass(), "core_1", null);
        setField(term7907, term7907.getClass(), "core_2", null);
        term7920 = new Integer(0);
        term7922 = new Integer(0);
        term7924 = new Integer(0);
        term7926 = new Integer(0);
        term7928 = new Integer(0);
        term7930 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.VF2ExactState");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term7920;
        args[1] = term7922;
        args[2] = term7924;
        args[3] = term7926;
        args[4] = term7928;
        args[5] = term7930;
        callMethod(klass, "exactOrSubgraphIsomorphismCompatibilityCheck", argTypes, term7907, args);
    }

};


