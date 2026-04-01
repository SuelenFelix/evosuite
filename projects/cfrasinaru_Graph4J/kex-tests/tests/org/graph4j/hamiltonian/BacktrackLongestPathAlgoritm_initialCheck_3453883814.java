package org.graph4j.hamiltonian;

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
import static org.graph4j.hamiltonian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BacktrackLongestPathAlgoritm_initialCheck_3453883814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331;

    public BacktrackLongestPathAlgoritm_initialCheck_3453883814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331 = newInstance(Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm"));
        setField(term331, term331.getClass(), "currentBest", null);
        setField(term331, term331.getClass(), "currentPath", null);
        setIntField(term331, term331.getClass(), "source", 0);
        setIntField(term331, term331.getClass(), "target", 0);
        setField(term331, term331.getClass(), "graph", null);
        setBooleanField(term331, term331.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.hamiltonian.BacktrackLongestPathAlgoritm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initialCheck", argTypes, term331, args);
    }

};


