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
import java.lang.Integer;

public class Isomorphism_mapping_10291190202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4035;
     Object term4050;

    public Isomorphism_mapping_10291190202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4035 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        int[] term4036 = (int[]) newIntArray(3);
        int[] term4040 = (int[]) newIntArray(9);
        setField(term4035, term4035.getClass(), "graph1", null);
        setField(term4035, term4035.getClass(), "graph2", null);
        setIntElement(term4036, 0, 2011764585);
        setIntElement(term4036, 1, -860680764);
        setIntElement(term4036, 2, -963198667);
        setField(term4035, term4035.getClass(), "mapping", term4036);
        setIntElement(term4040, 0, -1007935918);
        setIntElement(term4040, 1, 1485731037);
        setIntElement(term4040, 2, 1304396087);
        setIntElement(term4040, 3, 1782600602);
        setIntElement(term4040, 4, -185892708);
        setIntElement(term4040, 5, -203163250);
        setIntElement(term4040, 6, 498473526);
        setIntElement(term4040, 7, 1186917020);
        setIntElement(term4040, 8, 1670041824);
        setField(term4035, term4035.getClass(), "inverse", term4040);
        term4050 = new Integer(2140388634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.Isomorphism");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4050;
        callMethod(klass, "mapping", argTypes, term4035, args);
    }

};


