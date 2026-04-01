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
import java.lang.Object;

public class RandomHamiltonianGenerator_createGraph_17498546763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;

    public RandomHamiltonianGenerator_createGraph_17498546763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366 = newInstance(Class.forName("org.graph4j.generators.RandomHamiltonianGenerator"));
        Object term368 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term370 = (int[]) newIntArray(5);
        Object term378 = newInstance(Class.forName("java.util.BitSet"));
        long[] term379 = (long[]) newLongArray(1);
        int[] term383 = (int[]) newIntArray(6);
        setDoubleField(term366, term366.getClass(), "edgeProbability", 0.7031006357544823);
        setIntField(term368, term368.getClass(), "numEdges", 683666002);
        setField(term368, term368.getClass(), "graph", null);
        setIntElement(term370, 0, 1596213415);
        setIntElement(term370, 1, -268815336);
        setIntElement(term370, 2, -1210583429);
        setIntElement(term370, 3, -663691365);
        setIntElement(term370, 4, 339854490);
        setField(term368, term368.getClass(), "vertices", term370);
        setIntField(term368, term368.getClass(), "numVertices", -615654495);
        setIntField(term368, term368.getClass(), "first", -1476117762);
        setField(term378, term378.getClass(), "words", term379);
        setIntField(term378, term378.getClass(), "wordsInUse", -341962980);
        setBooleanField(term378, term378.getClass(), "sizeIsSticky", true);
        setField(term368, term368.getClass(), "bitset", term378);
        setField(term366, term366.getClass(), "cycle", term368);
        setIntElement(term383, 0, 1532716628);
        setIntElement(term383, 1, -1801760683);
        setIntElement(term383, 2, 1141317871);
        setIntElement(term383, 3, 890669485);
        setIntElement(term383, 4, 691577392);
        setIntElement(term383, 5, -893623680);
        setField(term366, term366.getClass(), "vertices", term383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomHamiltonianGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term366, args);
    }

};


