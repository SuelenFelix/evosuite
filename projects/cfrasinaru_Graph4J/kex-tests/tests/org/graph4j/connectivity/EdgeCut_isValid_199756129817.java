package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EdgeCut_isValid_199756129817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6642;

    public EdgeCut_isValid_199756129817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6642 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        setField(term6642, term6642.getClass(), "graph", null);
        setField(term6642, term6642.getClass(), "leftSide", null);
        setField(term6642, term6642.getClass(), "rightSide", null);
        setField(term6642, term6642.getClass(), "weight", null);
        setField(term6642, term6642.getClass(), "edges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.EdgeCut");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term6642, args);
    }

};


