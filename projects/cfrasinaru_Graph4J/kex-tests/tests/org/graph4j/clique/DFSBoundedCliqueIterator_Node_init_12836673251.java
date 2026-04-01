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
import java.lang.Double;

public class DFSBoundedCliqueIterator_Node_init_12836673251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2841;

    public DFSBoundedCliqueIterator_Node_init_12836673251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2841 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator$Node");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator");
        argTypes[1] = Class.forName("org.graph4j.util.Clique");
        argTypes[2] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term2841;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


