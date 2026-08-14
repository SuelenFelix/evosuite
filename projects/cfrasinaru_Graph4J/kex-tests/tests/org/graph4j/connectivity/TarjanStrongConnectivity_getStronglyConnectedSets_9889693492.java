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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class TarjanStrongConnectivity_getStronglyConnectedSets_9889693492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6032;

    public TarjanStrongConnectivity_getStronglyConnectedSets_9889693492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6035 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6036 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6040 = (int[]) newIntArray(8);
        Object term6051 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6036, term6036.getClass(), "table", null);
        setIntField(term6036, term6036.getClass(), "count", -1245754321);
        setIntField(term6036, term6036.getClass(), "threshold", 15);
        setFloatField(term6036, term6036.getClass(), "loadFactor", 0.75F);
        setField(term6035, term6035.getClass(), "posMap", term6036);
        setField(term6035, term6035.getClass(), "graph", null);
        setIntElement(term6040, 0, 398727237);
        setIntElement(term6040, 1, -1741920202);
        setIntElement(term6040, 2, 1639977614);
        setIntElement(term6040, 3, -27270642);
        setIntElement(term6040, 4, -1419515823);
        setIntElement(term6040, 5, 1749999469);
        setIntElement(term6040, 6, -1508018812);
        setIntElement(term6040, 7, -679973960);
        setField(term6035, term6035.getClass(), "vertices", term6040);
        setIntField(term6035, term6035.getClass(), "numVertices", -85442762);
        setIntField(term6035, term6035.getClass(), "first", 295245507);
        setField(term6051, term6051.getClass(), "words", null);
        setIntField(term6051, term6051.getClass(), "wordsInUse", -1782801582);
        setBooleanField(term6051, term6051.getClass(), "sizeIsSticky", false);
        setField(term6035, term6035.getClass(), "bitset", term6051);
        ArrayList term6033 = new ArrayList();
        ((ArrayList) term6033).add(term6035);
        Boolean term6062 = new Boolean(true);
        term6032 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity"));
        int[] term6056 = (int[]) newIntArray(5);
        setField(term6032, term6032.getClass(), "compSets", term6033);
        setIntElement(term6056, 0, -112814060);
        setIntElement(term6056, 1, -1111447214);
        setIntElement(term6056, 2, 1463964937);
        setIntElement(term6056, 3, -1207878110);
        setIntElement(term6056, 4, -284421477);
        setField(term6032, term6032.getClass(), "vertexComp", term6056);
        setField(term6032, term6032.getClass(), "graph", null);
        setField(term6032, term6032.getClass(), "stronglyConnected", term6062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStronglyConnectedSets", argTypes, term6032, args);
    }

};


