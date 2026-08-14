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

public class StoerWagnerMinimumCut1_sumProcessedNeighbors_3284139747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5624;
     Object term5705;

    public StoerWagnerMinimumCut1_sumProcessedNeighbors_3284139747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5668 = new HashMap();
        Double term5681 = new Double(0.9374115574082594);
        Integer term5683 = new Integer(-1772434990);
        Double term5700 = new Double(0.8454723071922143);
        Integer term5703 = new Integer(-1845499264);
        term5624 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1"));
        Object term5626 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5627 = (int[]) newIntArray(8);
        int[] term5636 = (int[]) newIntArray(7);
        boolean[] term5645 = (boolean[]) newBooleanArray(8);
        double[] term5654 = (double[]) newDoubleArray(2);
        int[] term5657 = (int[]) newIntArray(5);
        Object term5663 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5664 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term5685 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term5686 = (int[]) newIntArray(3);
        int[] term5690 = (int[]) newIntArray(9);
        Object term5702 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term5624, term5624.getClass(), "ignoreWeights", false);
        setField(term5624, term5624.getClass(), "workGraph", null);
        setField(term5626, term5626.getClass(), "graph", null);
        setField(term5626, term5626.getClass(), "comparator", null);
        setIntElement(term5627, 0, 1892947629);
        setIntElement(term5627, 1, -1350968212);
        setIntElement(term5627, 2, 2027049805);
        setIntElement(term5627, 3, 1777210338);
        setIntElement(term5627, 4, 1406833110);
        setIntElement(term5627, 5, 971309393);
        setIntElement(term5627, 6, 1506905403);
        setIntElement(term5627, 7, 1022586170);
        setField(term5626, term5626.getClass(), "keys", term5627);
        setIntElement(term5636, 0, -175612916);
        setIntElement(term5636, 1, -1966814722);
        setIntElement(term5636, 2, -2040048430);
        setIntElement(term5636, 3, 795243460);
        setIntElement(term5636, 4, 1116550927);
        setIntElement(term5636, 5, -1500511650);
        setIntElement(term5636, 6, 1722619795);
        setField(term5626, term5626.getClass(), "positions", term5636);
        setIntField(term5626, term5626.getClass(), "size", 558598813);
        setField(term5624, term5624.getClass(), "maxHeap", term5626);
        setBooleanElement(term5645, 0, true);
        setBooleanElement(term5645, 2, true);
        setBooleanElement(term5645, 3, true);
        setBooleanElement(term5645, 5, true);
        setField(term5624, term5624.getClass(), "processed", term5645);
        setDoubleElement(term5654, 0, 0.9628647861255637);
        setDoubleElement(term5654, 1, 0.623231822150205);
        setField(term5624, term5624.getClass(), "weight", term5654);
        setIntElement(term5657, 0, -282356982);
        setIntElement(term5657, 1, 1060240374);
        setIntElement(term5657, 2, 2119043046);
        setIntElement(term5657, 3, 375507053);
        setIntElement(term5657, 4, 1803067672);
        setField(term5624, term5624.getClass(), "ordering", term5657);
        setField(term5663, term5663.getClass(), "table", term5664);
        setIntField(term5663, term5663.getClass(), "count", -844822506);
        setIntField(term5663, term5663.getClass(), "threshold", 15);
        setFloatField(term5663, term5663.getClass(), "loadFactor", 0.75F);
        setField(term5624, term5624.getClass(), "orderingIndex", term5663);
        setField(term5624, term5624.getClass(), "vertexMap", term5668);
        setField(term5624, term5624.getClass(), "minWeight", term5681);
        setField(term5624, term5624.getClass(), "minCutVertex", term5683);
        setField(term5685, term5685.getClass(), "graph", null);
        setIntElement(term5686, 0, -1539896141);
        setIntElement(term5686, 1, 798480099);
        setIntElement(term5686, 2, -1624038595);
        setField(term5685, term5685.getClass(), "leftSide", term5686);
        setIntElement(term5690, 0, 1593619323);
        setIntElement(term5690, 1, -232601868);
        setIntElement(term5690, 2, -1743056588);
        setIntElement(term5690, 3, 576646846);
        setIntElement(term5690, 4, 916507296);
        setIntElement(term5690, 5, 1307887729);
        setIntElement(term5690, 6, 1628336669);
        setIntElement(term5690, 7, 466807421);
        setIntElement(term5690, 8, -407675703);
        setField(term5685, term5685.getClass(), "rightSide", term5690);
        setField(term5685, term5685.getClass(), "weight", term5700);
        setField(term5702, term5702.getClass(), "graph", null);
        setField(term5702, term5702.getClass(), "map", null);
        setField(term5685, term5685.getClass(), "edges", term5702);
        setField(term5624, term5624.getClass(), "minCut", term5685);
        setField(term5624, term5624.getClass(), "newVertex", term5703);
        setField(term5624, term5624.getClass(), "graph", null);
        term5705 = new Integer(-429960516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5705;
        callMethod(klass, "sumProcessedNeighbors", argTypes, term5624, args);
    }

};


