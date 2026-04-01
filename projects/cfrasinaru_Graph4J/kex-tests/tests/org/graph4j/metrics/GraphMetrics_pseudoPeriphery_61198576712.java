package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;

public class GraphMetrics_pseudoPeriphery_61198576712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5845;

    public GraphMetrics_pseudoPeriphery_61198576712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5881 = new Integer(-244121226);
        Double term5883 = new Double(0.3202192021706908);
        Double term5885 = new Double(0.22651340641904605);
        Double term5887 = new Double(0.8878841294187743);
        term5845 = newInstance(Class.forName("org.graph4j.metrics.GraphMetrics"));
        Object[] term5846 = (Object[]) newArray("[D", 5);
        double[] term5847 = (double[]) newDoubleArray(2);
        double[] term5850 = (double[]) newDoubleArray(6);
        double[] term5857 = (double[]) newDoubleArray(1);
        double[] term5859 = (double[]) newDoubleArray(6);
        double[] term5866 = (double[]) newDoubleArray(8);
        double[] term5875 = (double[]) newDoubleArray(5);
        Object term5889 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5890 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5891 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5895 = (int[]) newIntArray(2);
        Object term5900 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5901 = (long[]) newLongArray(1);
        Object term5905 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term5906 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term5907 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term5911 = (int[]) newIntArray(6);
        Object term5920 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5921 = (long[]) newLongArray(1);
        setField(term5845, term5845.getClass(), "extremaCalculator", null);
        setDoubleElement(term5847, 0, 0.07298304401683597);
        setDoubleElement(term5847, 1, 0.6101411757610665);
        setElement(term5846, 0, term5847);
        setDoubleElement(term5850, 0, 0.07932996853888874);
        setDoubleElement(term5850, 1, 0.4335752168808029);
        setDoubleElement(term5850, 2, 0.9196949182738653);
        setDoubleElement(term5850, 3, 0.5820770579753712);
        setDoubleElement(term5850, 4, 0.8935041663395363);
        setDoubleElement(term5850, 5, 0.2542403704113868);
        setElement(term5846, 1, term5850);
        setDoubleElement(term5857, 0, 0.4614378239284842);
        setElement(term5846, 2, term5857);
        setDoubleElement(term5859, 0, 0.10963898027157926);
        setDoubleElement(term5859, 1, 0.34234234602085223);
        setDoubleElement(term5859, 2, 0.8355624480198577);
        setDoubleElement(term5859, 3, 0.8303221706066055);
        setDoubleElement(term5859, 4, 0.7102687477135848);
        setDoubleElement(term5859, 5, 0.7984332537471793);
        setElement(term5846, 3, term5859);
        setDoubleElement(term5866, 0, 0.6782349539183316);
        setDoubleElement(term5866, 1, 0.6464654528667407);
        setDoubleElement(term5866, 2, 0.6416885379658445);
        setDoubleElement(term5866, 3, 0.604465128384297);
        setDoubleElement(term5866, 4, 0.5180566811475131);
        setDoubleElement(term5866, 5, 0.6773553630262286);
        setDoubleElement(term5866, 6, 0.0416412064984476);
        setDoubleElement(term5866, 7, 0.9188322321077216);
        setElement(term5846, 4, term5866);
        setField(term5845, term5845.getClass(), "dist", term5846);
        setDoubleElement(term5875, 0, 0.8046904246652031);
        setDoubleElement(term5875, 1, 0.16734523112870836);
        setDoubleElement(term5875, 2, 0.9711083796772954);
        setDoubleElement(term5875, 3, 0.329228491476264);
        setDoubleElement(term5875, 4, 0.8664463700873805);
        setField(term5845, term5845.getClass(), "ecc", term5875);
        setField(term5845, term5845.getClass(), "girth", term5881);
        setField(term5845, term5845.getClass(), "diameter", term5883);
        setField(term5845, term5845.getClass(), "pseudoDiameter", term5885);
        setField(term5845, term5845.getClass(), "radius", term5887);
        setField(term5890, term5890.getClass(), "table", term5891);
        setIntField(term5890, term5890.getClass(), "count", -509349195);
        setIntField(term5890, term5890.getClass(), "threshold", 15);
        setFloatField(term5890, term5890.getClass(), "loadFactor", 0.75F);
        setField(term5889, term5889.getClass(), "posMap", term5890);
        setField(term5889, term5889.getClass(), "graph", null);
        setIntElement(term5895, 0, -1639041228);
        setIntElement(term5895, 1, 2027686272);
        setField(term5889, term5889.getClass(), "vertices", term5895);
        setIntField(term5889, term5889.getClass(), "numVertices", -1494356104);
        setIntField(term5889, term5889.getClass(), "first", -695279311);
        setField(term5900, term5900.getClass(), "words", term5901);
        setIntField(term5900, term5900.getClass(), "wordsInUse", 114279242);
        setBooleanField(term5900, term5900.getClass(), "sizeIsSticky", true);
        setField(term5889, term5889.getClass(), "bitset", term5900);
        setField(term5845, term5845.getClass(), "center", term5889);
        setField(term5906, term5906.getClass(), "table", term5907);
        setIntField(term5906, term5906.getClass(), "count", 990883365);
        setIntField(term5906, term5906.getClass(), "threshold", 15);
        setFloatField(term5906, term5906.getClass(), "loadFactor", 0.75F);
        setField(term5905, term5905.getClass(), "posMap", term5906);
        setField(term5905, term5905.getClass(), "graph", null);
        setIntElement(term5911, 0, 633598642);
        setIntElement(term5911, 1, 1862841859);
        setIntElement(term5911, 2, -1114668574);
        setIntElement(term5911, 3, 514511037);
        setIntElement(term5911, 4, 1713573821);
        setIntElement(term5911, 5, 1956590498);
        setField(term5905, term5905.getClass(), "vertices", term5911);
        setIntField(term5905, term5905.getClass(), "numVertices", 1467356494);
        setIntField(term5905, term5905.getClass(), "first", -26316536);
        setField(term5920, term5920.getClass(), "words", term5921);
        setIntField(term5920, term5920.getClass(), "wordsInUse", 1716165145);
        setBooleanField(term5920, term5920.getClass(), "sizeIsSticky", true);
        setField(term5905, term5905.getClass(), "bitset", term5920);
        setField(term5845, term5845.getClass(), "periphery", term5905);
        setField(term5845, term5845.getClass(), "graph", null);
        setBooleanField(term5845, term5845.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphMetrics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pseudoPeriphery", argTypes, term5845, args);
    }

};


