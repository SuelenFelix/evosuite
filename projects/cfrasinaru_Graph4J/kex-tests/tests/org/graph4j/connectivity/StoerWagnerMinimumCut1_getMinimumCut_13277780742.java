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

public class StoerWagnerMinimumCut1_getMinimumCut_13277780742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5099;

    public StoerWagnerMinimumCut1_getMinimumCut_13277780742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5134 = new HashMap();
        Double term5147 = new Double(0.6588948704887806);
        Integer term5149 = new Integer(1551099402);
        Double term5158 = new Double(0.6397214730945112);
        Integer term5161 = new Integer(-2027534003);
        term5099 = newInstance(Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1"));
        Object term5101 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5102 = (int[]) newIntArray(5);
        int[] term5108 = (int[]) newIntArray(8);
        boolean[] term5118 = (boolean[]) newBooleanArray(2);
        double[] term5121 = (double[]) newDoubleArray(4);
        int[] term5126 = (int[]) newIntArray(2);
        Object term5129 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5130 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term5151 = newInstance(Class.forName("org.graph4j.connectivity.EdgeCut"));
        int[] term5152 = (int[]) newIntArray(4);
        int[] term5157 = (int[]) newIntArray(0);
        Object term5160 = newInstance(Class.forName("org.graph4j.util.EdgeSet"));
        setBooleanField(term5099, term5099.getClass(), "ignoreWeights", false);
        setField(term5099, term5099.getClass(), "workGraph", null);
        setField(term5101, term5101.getClass(), "graph", null);
        setField(term5101, term5101.getClass(), "comparator", null);
        setIntElement(term5102, 0, -524708742);
        setIntElement(term5102, 1, -349448118);
        setIntElement(term5102, 2, 1938137872);
        setIntElement(term5102, 3, 1767604467);
        setIntElement(term5102, 4, 1997859160);
        setField(term5101, term5101.getClass(), "keys", term5102);
        setIntElement(term5108, 0, 1565529799);
        setIntElement(term5108, 1, -1144608643);
        setIntElement(term5108, 2, -2020428308);
        setIntElement(term5108, 3, -226298436);
        setIntElement(term5108, 4, -1570350431);
        setIntElement(term5108, 5, -1378803474);
        setIntElement(term5108, 6, 699225584);
        setIntElement(term5108, 7, -577432675);
        setField(term5101, term5101.getClass(), "positions", term5108);
        setIntField(term5101, term5101.getClass(), "size", -953072528);
        setField(term5099, term5099.getClass(), "maxHeap", term5101);
        setBooleanElement(term5118, 0, true);
        setField(term5099, term5099.getClass(), "processed", term5118);
        setDoubleElement(term5121, 0, 0.53094494792755);
        setDoubleElement(term5121, 1, 0.146431486357265);
        setDoubleElement(term5121, 2, 0.24259014218848696);
        setDoubleElement(term5121, 3, 0.1544348383112728);
        setField(term5099, term5099.getClass(), "weight", term5121);
        setIntElement(term5126, 0, 2011046892);
        setIntElement(term5126, 1, 466007219);
        setField(term5099, term5099.getClass(), "ordering", term5126);
        setField(term5129, term5129.getClass(), "table", term5130);
        setIntField(term5129, term5129.getClass(), "count", -2142979104);
        setIntField(term5129, term5129.getClass(), "threshold", 15);
        setFloatField(term5129, term5129.getClass(), "loadFactor", 0.75F);
        setField(term5099, term5099.getClass(), "orderingIndex", term5129);
        setField(term5099, term5099.getClass(), "vertexMap", term5134);
        setField(term5099, term5099.getClass(), "minWeight", term5147);
        setField(term5099, term5099.getClass(), "minCutVertex", term5149);
        setField(term5151, term5151.getClass(), "graph", null);
        setIntElement(term5152, 0, -137516512);
        setIntElement(term5152, 1, -585134115);
        setIntElement(term5152, 2, 1435872700);
        setIntElement(term5152, 3, 1421496660);
        setField(term5151, term5151.getClass(), "leftSide", term5152);
        setField(term5151, term5151.getClass(), "rightSide", term5157);
        setField(term5151, term5151.getClass(), "weight", term5158);
        setField(term5160, term5160.getClass(), "graph", null);
        setField(term5160, term5160.getClass(), "map", null);
        setField(term5151, term5151.getClass(), "edges", term5160);
        setField(term5099, term5099.getClass(), "minCut", term5151);
        setField(term5099, term5099.getClass(), "newVertex", term5161);
        setField(term5099, term5099.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.StoerWagnerMinimumCut1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumCut", argTypes, term5099, args);
    }

};


