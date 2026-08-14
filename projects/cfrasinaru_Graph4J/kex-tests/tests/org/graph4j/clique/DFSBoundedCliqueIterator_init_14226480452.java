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

public class DFSBoundedCliqueIterator_init_14226480452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1515;
     Object term1517;
     Object term1519;
     Object term1521;

    public DFSBoundedCliqueIterator_init_14226480452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1515 = new Integer(-2027012650);
        term1517 = new Integer(1343432022);
        term1519 = new Double(0.13238746331190498);
        term1521 = new Long(-7237588299778557629L);
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
        args[1] = term1515;
        args[2] = term1517;
        args[3] = term1519;
        args[4] = term1521;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


