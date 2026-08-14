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
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;

public class DFSBoundedCliqueIterator_init_14226480459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1731;
     Object term1733;
     Object term1735;
     Object term1737;

    public DFSBoundedCliqueIterator_init_14226480459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1731 = new Integer(0);
        term1733 = new Integer(0);
        term1735 = new Double(0.0);
        term1737 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.DFSBoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        argTypes[4] = long.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term1731;
        args[2] = term1733;
        args[3] = term1735;
        args[4] = term1737;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


