package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WattsStrogatzGenerator_createGraph_14386096042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2457;

    public WattsStrogatzGenerator_createGraph_14386096042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2457 = newInstance(Class.forName("org.graph4j.generators.WattsStrogatzGenerator"));
        int[] term2461 = (int[]) newIntArray(0);
        setIntField(term2457, term2457.getClass(), "averageDegree", 188512644);
        setDoubleField(term2457, term2457.getClass(), "rewireProbability", 0.5306473989087822);
        setDoubleField(term2457, term2457.getClass(), "addProbability", 0.022483645678509023);
        setField(term2457, term2457.getClass(), "vertices", term2461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.WattsStrogatzGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term2457, args);
    }

};


