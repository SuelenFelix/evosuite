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
import java.lang.Object;
import java.util.HashMap;
import java.lang.Double;
import java.lang.Integer;

public class StoerWagnerMinimumCut3_getMinimumCutWeight_13444143903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3840;

    public StoerWagnerMinimumCut3_getMinimumCutWeight_13444143903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3864 = new HashMap();
        Double term3877 = new Double(0.6436713023569729);
        Integer term3879 = new Integer(-157887805);
        Double term3885 = new Double(0.7332741045694002);
        term3840 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3"));
        Object term3842 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term3843 = (int[]) newIntArray(7);
        int[] term3851 = (int[]) newIntArray(1);
        boolean[] term3854 = (boolean[]) newBooleanArray(5);
        double[] term3860 = (double[]) newDoubleArray(2);
        Object term3881 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term3882 = (int[]) newIntArray(1);
        int[] term3884 = (int[]) newIntArray(0);
        Object term3887 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term3840, term3840.getClass(), "ignoreWeights", false);
        setField(term3840, term3840.getClass(), "workGraph", null);
        setField(term3842, term3842.getClass(), "graph", null);
        setField(term3842, term3842.getClass(), "comparator", null);
        setIntElement(term3843, 0, 2000275611);
        setIntElement(term3843, 1, 2060369122);
        setIntElement(term3843, 2, -1275204506);
        setIntElement(term3843, 3, 507439888);
        setIntElement(term3843, 4, 1936798149);
        setIntElement(term3843, 5, 188304401);
        setIntElement(term3843, 6, -40613160);
        setField(term3842, term3842.getClass(), "keys", term3843);
        setIntElement(term3851, 0, 1359973218);
        setField(term3842, term3842.getClass(), "positions", term3851);
        setIntField(term3842, term3842.getClass(), "size", -218759803);
        setField(term3840, term3840.getClass(), "maxHeap", term3842);
        setBooleanElement(term3854, 3, true);
        setBooleanElement(term3854, 4, true);
        setField(term3840, term3840.getClass(), "processed", term3854);
        setDoubleElement(term3860, 0, 0.2852810965221698);
        setDoubleElement(term3860, 1, 0.6300849762307866);
        setField(term3840, term3840.getClass(), "weight", term3860);
        setIntField(term3840, term3840.getClass(), "startId", 1288936083);
        setField(term3840, term3840.getClass(), "map", term3864);
        setField(term3840, term3840.getClass(), "minWeight", term3877);
        setField(term3840, term3840.getClass(), "minCutVertex", term3879);
        setField(term3881, term3881.getClass(), "graph", null);
        setIntElement(term3882, 0, 1364414277);
        setField(term3881, term3881.getClass(), "leftSide", term3882);
        setField(term3881, term3881.getClass(), "rightSide", term3884);
        setField(term3881, term3881.getClass(), "weight", term3885);
        setField(term3887, term3887.getClass(), "graph", null);
        setField(term3887, term3887.getClass(), "map", null);
        setField(term3881, term3881.getClass(), "edges", term3887);
        setField(term3840, term3840.getClass(), "minCut", term3881);
        setField(term3840, term3840.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCutWeight", argTypes, term3840, args);
    }

};


