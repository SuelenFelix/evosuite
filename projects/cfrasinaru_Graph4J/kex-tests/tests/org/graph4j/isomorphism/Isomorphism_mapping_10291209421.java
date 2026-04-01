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

public class Isomorphism_mapping_10291209421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4008;

    public Isomorphism_mapping_10291209421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4008 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term4009 = (int[]) newIntArray(5);
        int[] term4015 = (int[]) newIntArray(7);
        setField(term4008, term4008.getClass(), "graph1", null);
        setField(term4008, term4008.getClass(), "graph2", null);
        setIntElement(term4009, 0, -1763480506);
        setIntElement(term4009, 1, -1541297110);
        setIntElement(term4009, 2, -1581464804);
        setIntElement(term4009, 3, -1954937310);
        setIntElement(term4009, 4, -460657407);
        setField(term4008, term4008.getClass(), "mapping", term4009);
        setIntElement(term4015, 0, 941003590);
        setIntElement(term4015, 1, -1825624890);
        setIntElement(term4015, 2, 413214164);
        setIntElement(term4015, 3, 355911655);
        setIntElement(term4015, 4, 1811833766);
        setIntElement(term4015, 5, 735987104);
        setIntElement(term4015, 6, -1784072578);
        setField(term4008, term4008.getClass(), "inverse", term4015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.Isomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "mapping", argTypes, term4008, args);
    }

};


