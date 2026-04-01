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

public class VF2SubState_exactOrSubgraphIsomorphismCompatibilityCheck_9877291777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6037;
     Object term6050;
     Object term6052;
     Object term6054;
     Object term6056;
     Object term6058;
     Object term6060;

    public VF2SubState_exactOrSubgraphIsomorphismCompatibilityCheck_9877291777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6037 = newInstance(Class.forName("org.graph4j.isomorphism.VF2SubState"));
        setIntField(term6037, term6037.getClass(), "t1in_len", 0);
        setIntField(term6037, term6037.getClass(), "t2in_len", 0);
        setIntField(term6037, term6037.getClass(), "t1out_len", 0);
        setIntField(term6037, term6037.getClass(), "t2out_len", 0);
        setIntField(term6037, term6037.getClass(), "t1both_len", 0);
        setIntField(term6037, term6037.getClass(), "t2both_len", 0);
        setField(term6037, term6037.getClass(), "in1", null);
        setField(term6037, term6037.getClass(), "in2", null);
        setField(term6037, term6037.getClass(), "out1", null);
        setField(term6037, term6037.getClass(), "out2", null);
        setIntField(term6037, term6037.getClass(), "prev_1", 0);
        setIntField(term6037, term6037.getClass(), "prev_2", 0);
        setIntField(term6037, term6037.getClass(), "last_added1", 0);
        setField(term6037, term6037.getClass(), "o1", null);
        setField(term6037, term6037.getClass(), "o2", null);
        setIntField(term6037, term6037.getClass(), "n1", 0);
        setIntField(term6037, term6037.getClass(), "n2", 0);
        setIntField(term6037, term6037.getClass(), "core_len", 0);
        setField(term6037, term6037.getClass(), "core_1", null);
        setField(term6037, term6037.getClass(), "core_2", null);
        term6050 = new Integer(0);
        term6052 = new Integer(0);
        term6054 = new Integer(0);
        term6056 = new Integer(0);
        term6058 = new Integer(0);
        term6060 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.VF2SubState");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term6050;
        args[1] = term6052;
        args[2] = term6054;
        args[3] = term6056;
        args[4] = term6058;
        args[5] = term6060;
        callMethod(klass, "exactOrSubgraphIsomorphismCompatibilityCheck", argTypes, term6037, args);
    }

};


