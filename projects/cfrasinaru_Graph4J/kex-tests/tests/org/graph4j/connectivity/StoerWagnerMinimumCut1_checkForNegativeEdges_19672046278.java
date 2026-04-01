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

public class StoerWagnerMinimumCut1_checkForNegativeEdges_19672046278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5749;

    public StoerWagnerMinimumCut1_checkForNegativeEdges_19672046278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5790 = new HashMap();
        Double term5803 = new Double(0.8566567697571895);
        Integer term5805 = new Integer(-344842608);
        Double term5820 = new Double(0.9203805380592256);
        Integer term5823 = new Integer(941650513);
        term5749 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1"));
        Object term5751 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5752 = (int[]) newIntArray(7);
        int[] term5760 = (int[]) newIntArray(6);
        boolean[] term5768 = (boolean[]) newBooleanArray(4);
        double[] term5773 = (double[]) newDoubleArray(2);
        int[] term5776 = (int[]) newIntArray(8);
        Object term5785 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5786 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term5807 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term5808 = (int[]) newIntArray(7);
        int[] term5816 = (int[]) newIntArray(3);
        Object term5822 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term5749, term5749.getClass(), "ignoreWeights", true);
        setField(term5749, term5749.getClass(), "workGraph", null);
        setField(term5751, term5751.getClass(), "graph", null);
        setField(term5751, term5751.getClass(), "comparator", null);
        setIntElement(term5752, 0, -630727180);
        setIntElement(term5752, 1, -1234361060);
        setIntElement(term5752, 2, -267520884);
        setIntElement(term5752, 3, 1431716083);
        setIntElement(term5752, 4, 1540004680);
        setIntElement(term5752, 5, -594861500);
        setIntElement(term5752, 6, 1731562923);
        setField(term5751, term5751.getClass(), "keys", term5752);
        setIntElement(term5760, 0, 33467458);
        setIntElement(term5760, 1, 1729034001);
        setIntElement(term5760, 2, 1094810824);
        setIntElement(term5760, 3, -1746471324);
        setIntElement(term5760, 4, 844485803);
        setIntElement(term5760, 5, -1373407191);
        setField(term5751, term5751.getClass(), "positions", term5760);
        setIntField(term5751, term5751.getClass(), "size", 1013516042);
        setField(term5749, term5749.getClass(), "maxHeap", term5751);
        setBooleanElement(term5768, 0, true);
        setBooleanElement(term5768, 2, true);
        setBooleanElement(term5768, 3, true);
        setField(term5749, term5749.getClass(), "processed", term5768);
        setDoubleElement(term5773, 0, 0.09037487793444521);
        setDoubleElement(term5773, 1, 0.6561919196821765);
        setField(term5749, term5749.getClass(), "weight", term5773);
        setIntElement(term5776, 0, 284652039);
        setIntElement(term5776, 1, 1163350537);
        setIntElement(term5776, 2, -855026181);
        setIntElement(term5776, 3, 1404243357);
        setIntElement(term5776, 4, -570134327);
        setIntElement(term5776, 5, 73847121);
        setIntElement(term5776, 6, 1721050745);
        setIntElement(term5776, 7, -1980981205);
        setField(term5749, term5749.getClass(), "ordering", term5776);
        setField(term5785, term5785.getClass(), "table", term5786);
        setIntField(term5785, term5785.getClass(), "count", -1530498856);
        setIntField(term5785, term5785.getClass(), "threshold", 15);
        setFloatField(term5785, term5785.getClass(), "loadFactor", 0.75F);
        setField(term5749, term5749.getClass(), "orderingIndex", term5785);
        setField(term5749, term5749.getClass(), "vertexMap", term5790);
        setField(term5749, term5749.getClass(), "minWeight", term5803);
        setField(term5749, term5749.getClass(), "minCutVertex", term5805);
        setField(term5807, term5807.getClass(), "graph", null);
        setIntElement(term5808, 0, -1336297368);
        setIntElement(term5808, 1, 1535507114);
        setIntElement(term5808, 2, -1174141307);
        setIntElement(term5808, 3, -1603957392);
        setIntElement(term5808, 4, -287005602);
        setIntElement(term5808, 5, 923353564);
        setIntElement(term5808, 6, 2013647768);
        setField(term5807, term5807.getClass(), "leftSide", term5808);
        setIntElement(term5816, 0, 1706579212);
        setIntElement(term5816, 1, -1073781147);
        setIntElement(term5816, 2, 138913824);
        setField(term5807, term5807.getClass(), "rightSide", term5816);
        setField(term5807, term5807.getClass(), "weight", term5820);
        setField(term5822, term5822.getClass(), "graph", null);
        setField(term5822, term5822.getClass(), "map", null);
        setField(term5807, term5807.getClass(), "edges", term5822);
        setField(term5749, term5749.getClass(), "minCut", term5807);
        setField(term5749, term5749.getClass(), "newVertex", term5823);
        setField(term5749, term5749.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkForNegativeEdges", argTypes, term5749, args);
    }

};


