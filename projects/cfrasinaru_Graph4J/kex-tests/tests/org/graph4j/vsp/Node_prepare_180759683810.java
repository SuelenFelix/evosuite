package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Node_prepare_180759683810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86701;

    public Node_prepare_180759683810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86701 = newInstance(Class.forName("org.graph4j.vsp.Node"));
        setField(term86701, term86701.getClass(), "alg", null);
        setIntField(term86701, term86701.getClass(), "vertex", 0);
        setIntField(term86701, term86701.getClass(), "value", 0);
        setField(term86701, term86701.getClass(), "parent", null);
        setField(term86701, term86701.getClass(), "separator", null);
        setField(term86701, term86701.getClass(), "domains", null);
        setField(term86701, term86701.getClass(), "minDomain", null);
        setBooleanField(term86701, term86701.getClass(), "propagator", false);
        setBooleanField(term86701, term86701.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prepare", argTypes, term86701, args);
    }

};


