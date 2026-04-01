package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Circuit_computeEdgesWeight_18441214616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99208;

    public Circuit_computeEdgesWeight_18441214616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99208 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term99210 = (int[]) newIntArray(9);
        Object term99222 = newInstance(Class.forName("java.util.BitSet"));
        long[] term99223 = (long[]) newLongArray(1);
        setIntField(term99208, term99208.getClass(), "numEdges", -1053932216);
        setField(term99208, term99208.getClass(), "graph", null);
        setIntElement(term99210, 0, 1920645313);
        setIntElement(term99210, 1, 1445376587);
        setIntElement(term99210, 2, 1173557411);
        setIntElement(term99210, 3, -602481720);
        setIntElement(term99210, 4, -652516365);
        setIntElement(term99210, 5, 1407579260);
        setIntElement(term99210, 6, -1211428493);
        setIntElement(term99210, 7, 1824828795);
        setIntElement(term99210, 8, 1126712238);
        setField(term99208, term99208.getClass(), "vertices", term99210);
        setIntField(term99208, term99208.getClass(), "numVertices", 1726829660);
        setIntField(term99208, term99208.getClass(), "first", -131597464);
        setField(term99222, term99222.getClass(), "words", term99223);
        setIntField(term99222, term99222.getClass(), "wordsInUse", 408558447);
        setBooleanField(term99222, term99222.getClass(), "sizeIsSticky", true);
        setField(term99208, term99208.getClass(), "bitset", term99222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeEdgesWeight", argTypes, term99208, args);
    }

};


