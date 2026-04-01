package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DFSCliqueIterator_next_103804297810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1503;

    public DFSCliqueIterator_next_103804297810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1503 = newInstance(Class.forName("org.graph4j.clique.DFSCliqueIterator"));
        setIntField(term1503, term1503.getClass(), "minSize", 0);
        setIntField(term1503, term1503.getClass(), "maxSize", 0);
        setLongField(term1503, term1503.getClass(), "timeout", 0L);
        setField(term1503, term1503.getClass(), "stack", null);
        setField(term1503, term1503.getClass(), "currentClique", null);
        setField(term1503, term1503.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term1503, args);
    }

};


