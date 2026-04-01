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
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class ConnectivityAlgorithm_createConnectedSets_16018905236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3231;

    public ConnectivityAlgorithm_createConnectedSets_16018905236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3232 = new Boolean(false);
        Object term3236 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3237 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3241 = (int[]) newIntArray(0);
        Object term3244 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3237, term3237.getClass(), "table", null);
        setIntField(term3237, term3237.getClass(), "count", 1544012770);
        setIntField(term3237, term3237.getClass(), "threshold", 15);
        setFloatField(term3237, term3237.getClass(), "loadFactor", 0.75F);
        setField(term3236, term3236.getClass(), "posMap", term3237);
        setField(term3236, term3236.getClass(), "graph", null);
        setField(term3236, term3236.getClass(), "vertices", term3241);
        setIntField(term3236, term3236.getClass(), "numVertices", 1922068039);
        setIntField(term3236, term3236.getClass(), "first", -410564443);
        setField(term3244, term3244.getClass(), "words", null);
        setIntField(term3244, term3244.getClass(), "wordsInUse", 996017434);
        setBooleanField(term3244, term3244.getClass(), "sizeIsSticky", false);
        setField(term3236, term3236.getClass(), "bitset", term3244);
        Object term3247 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3248 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3252 = (int[]) newIntArray(7);
        Object term3262 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3248, term3248.getClass(), "table", null);
        setIntField(term3248, term3248.getClass(), "count", -983870300);
        setIntField(term3248, term3248.getClass(), "threshold", 15);
        setFloatField(term3248, term3248.getClass(), "loadFactor", 0.75F);
        setField(term3247, term3247.getClass(), "posMap", term3248);
        setField(term3247, term3247.getClass(), "graph", null);
        setIntElement(term3252, 0, 360715062);
        setIntElement(term3252, 1, 1047409266);
        setIntElement(term3252, 2, 1427248961);
        setIntElement(term3252, 3, 1445291866);
        setIntElement(term3252, 4, -139927812);
        setIntElement(term3252, 5, -2065157320);
        setIntElement(term3252, 6, 1782011477);
        setField(term3247, term3247.getClass(), "vertices", term3252);
        setIntField(term3247, term3247.getClass(), "numVertices", 2129957018);
        setIntField(term3247, term3247.getClass(), "first", 691663312);
        setField(term3262, term3262.getClass(), "words", null);
        setIntField(term3262, term3262.getClass(), "wordsInUse", -1236696275);
        setBooleanField(term3262, term3262.getClass(), "sizeIsSticky", true);
        setField(term3247, term3247.getClass(), "bitset", term3262);
        ArrayList term3234 = new ArrayList();
        ((ArrayList) term3234).add(term3236);
        ((ArrayList) term3234).add(term3247);
        HashMap term3267 = new HashMap();
        ArrayList term3280 = new ArrayList();
        HashMap term3284 = new HashMap();
        term3231 = newInstance(Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm"));
        setField(term3231, term3231.getClass(), "connected", term3232);
        setField(term3231, term3231.getClass(), "connectedSets", term3234);
        setField(term3231, term3231.getClass(), "vertexSetMap", term3267);
        setField(term3231, term3231.getClass(), "components", term3280);
        setField(term3231, term3231.getClass(), "componentMap", term3284);
        setField(term3231, term3231.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createConnectedSets", argTypes, term3231, args);
    }

};


