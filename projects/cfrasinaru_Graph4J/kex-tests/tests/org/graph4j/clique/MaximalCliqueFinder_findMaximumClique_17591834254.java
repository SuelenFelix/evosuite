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
import java.lang.Long;

public class MaximalCliqueFinder_findMaximumClique_17591834254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term59;

    public MaximalCliqueFinder_findMaximumClique_17591834254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.graph4j.clique.MaximalCliqueFinder"));
        boolean[] term57 = (boolean[]) newBooleanArray(1);
        setBooleanElement(term57, 0, true);
        setField(term56, term56.getClass(), "visited", term57);
        setField(term56, term56.getClass(), "graph", null);
        term59 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.MaximalCliqueFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term59;
        callMethod(klass, "findMaximumClique", argTypes, term56, args);
    }

};


