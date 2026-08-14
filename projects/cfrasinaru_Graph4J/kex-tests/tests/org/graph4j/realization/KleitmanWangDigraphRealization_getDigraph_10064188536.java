package org.graph4j.realization;

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
import static org.graph4j.realization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KleitmanWangDigraphRealization_getDigraph_10064188536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;

    public KleitmanWangDigraphRealization_getDigraph_10064188536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255 = newInstance(Class.forName("org.graph4j.realization.KleitmanWangDigraphRealization"));
        setField(term255, term255.getClass(), "indegrees", null);
        setField(term255, term255.getClass(), "outdegrees", null);
        setField(term255, term255.getClass(), "digraphic", null);
        setField(term255, term255.getClass(), "digraph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.KleitmanWangDigraphRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDigraph", argTypes, term255, args);
    }

};


