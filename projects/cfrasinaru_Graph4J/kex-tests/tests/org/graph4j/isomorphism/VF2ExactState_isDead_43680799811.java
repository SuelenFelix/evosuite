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

public class VF2ExactState_isDead_43680799811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7945;

    public VF2ExactState_isDead_43680799811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7945 = newInstance(Class.forName("org.graph4j.isomorphism.VF2ExactState"));
        setIntField(term7945, term7945.getClass(), "t1in_len", 0);
        setIntField(term7945, term7945.getClass(), "t2in_len", 0);
        setIntField(term7945, term7945.getClass(), "t1out_len", 0);
        setIntField(term7945, term7945.getClass(), "t2out_len", 0);
        setIntField(term7945, term7945.getClass(), "t1both_len", 0);
        setIntField(term7945, term7945.getClass(), "t2both_len", 0);
        setField(term7945, term7945.getClass(), "in1", null);
        setField(term7945, term7945.getClass(), "in2", null);
        setField(term7945, term7945.getClass(), "out1", null);
        setField(term7945, term7945.getClass(), "out2", null);
        setIntField(term7945, term7945.getClass(), "prev_1", 0);
        setIntField(term7945, term7945.getClass(), "prev_2", 0);
        setIntField(term7945, term7945.getClass(), "last_added1", 0);
        setField(term7945, term7945.getClass(), "o1", null);
        setField(term7945, term7945.getClass(), "o2", null);
        setIntField(term7945, term7945.getClass(), "n1", 0);
        setIntField(term7945, term7945.getClass(), "n2", 0);
        setIntField(term7945, term7945.getClass(), "core_len", 0);
        setField(term7945, term7945.getClass(), "core_1", null);
        setField(term7945, term7945.getClass(), "core_2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.VF2ExactState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDead", argTypes, term7945, args);
    }

};


