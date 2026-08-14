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

public class StoerWagnerMinimumCut3_minCutPhase_3738118065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4004;

    public StoerWagnerMinimumCut3_minCutPhase_3738118065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4035 = new HashMap();
        Double term4048 = new Double(0.43692187681405226);
        Integer term4050 = new Integer(-1968847291);
        Double term4068 = new Double(0.7633268466829064);
        term4004 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3"));
        Object term4006 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term4007 = (int[]) newIntArray(6);
        int[] term4014 = (int[]) newIntArray(6);
        boolean[] term4022 = (boolean[]) newBooleanArray(2);
        double[] term4025 = (double[]) newDoubleArray(8);
        Object term4052 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term4053 = (int[]) newIntArray(5);
        int[] term4059 = (int[]) newIntArray(8);
        Object term4070 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term4004, term4004.getClass(), "ignoreWeights", true);
        setField(term4004, term4004.getClass(), "workGraph", null);
        setField(term4006, term4006.getClass(), "graph", null);
        setField(term4006, term4006.getClass(), "comparator", null);
        setIntElement(term4007, 0, 1120153100);
        setIntElement(term4007, 1, 158801111);
        setIntElement(term4007, 2, 464966803);
        setIntElement(term4007, 3, -246618392);
        setIntElement(term4007, 4, 1472246167);
        setIntElement(term4007, 5, 1008555478);
        setField(term4006, term4006.getClass(), "keys", term4007);
        setIntElement(term4014, 0, 1346386442);
        setIntElement(term4014, 1, 1904559758);
        setIntElement(term4014, 2, 610850630);
        setIntElement(term4014, 3, 170509161);
        setIntElement(term4014, 4, 491497994);
        setIntElement(term4014, 5, 1997288643);
        setField(term4006, term4006.getClass(), "positions", term4014);
        setIntField(term4006, term4006.getClass(), "size", -378961519);
        setField(term4004, term4004.getClass(), "maxHeap", term4006);
        setBooleanElement(term4022, 0, true);
        setBooleanElement(term4022, 1, true);
        setField(term4004, term4004.getClass(), "processed", term4022);
        setDoubleElement(term4025, 0, 0.8878841294187743);
        setDoubleElement(term4025, 1, 0.6588948704887806);
        setDoubleElement(term4025, 2, 0.6397214730945112);
        setDoubleElement(term4025, 3, 0.25937345430928016);
        setDoubleElement(term4025, 4, 0.5873228247510078);
        setDoubleElement(term4025, 5, 0.8823181080774973);
        setDoubleElement(term4025, 6, 0.2192450926212024);
        setDoubleElement(term4025, 7, 0.7591353014991907);
        setField(term4004, term4004.getClass(), "weight", term4025);
        setIntField(term4004, term4004.getClass(), "startId", -400280008);
        setField(term4004, term4004.getClass(), "map", term4035);
        setField(term4004, term4004.getClass(), "minWeight", term4048);
        setField(term4004, term4004.getClass(), "minCutVertex", term4050);
        setField(term4052, term4052.getClass(), "graph", null);
        setIntElement(term4053, 0, 1346331516);
        setIntElement(term4053, 1, 1018925421);
        setIntElement(term4053, 2, -1658031378);
        setIntElement(term4053, 3, -863483345);
        setIntElement(term4053, 4, -1722702406);
        setField(term4052, term4052.getClass(), "leftSide", term4053);
        setIntElement(term4059, 0, 549278914);
        setIntElement(term4059, 1, -1490125498);
        setIntElement(term4059, 2, -1443119347);
        setIntElement(term4059, 3, 1962181481);
        setIntElement(term4059, 4, 1798831879);
        setIntElement(term4059, 5, 1393855580);
        setIntElement(term4059, 6, -849064032);
        setIntElement(term4059, 7, -184659375);
        setField(term4052, term4052.getClass(), "rightSide", term4059);
        setField(term4052, term4052.getClass(), "weight", term4068);
        setField(term4070, term4070.getClass(), "graph", null);
        setField(term4070, term4070.getClass(), "map", null);
        setField(term4052, term4052.getClass(), "edges", term4070);
        setField(term4004, term4004.getClass(), "minCut", term4052);
        setField(term4004, term4004.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "minCutPhase", argTypes, term4004, args);
    }

};


