package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JoinSortRanks_assignPageRankRank_17909603218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8908;

    public JoinSortRanks_assignPageRankRank_17909603218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8908 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8909 = (float[]) newFloatArray(8);
        double[] term8918 = (double[]) newDoubleArray(7);
        int[] term8926 = (int[]) newIntArray(9);
        int[] term8936 = (int[]) newIntArray(8);
        int[] term8945 = (int[]) newIntArray(6);
        setFloatElement(term8909, 0, 0.26696402F);
        setFloatElement(term8909, 1, 0.54856896F);
        setFloatElement(term8909, 2, 0.6206213F);
        setFloatElement(term8909, 3, 0.9765248F);
        setFloatElement(term8909, 4, 0.17890882F);
        setFloatElement(term8909, 5, 0.9184034F);
        setFloatElement(term8909, 6, 0.7326771F);
        setFloatElement(term8909, 7, 0.9457448F);
        setField(term8908, term8908.getClass(), "harmonicCentralityValues", term8909);
        setDoubleElement(term8918, 0, 0.41934015614685227);
        setDoubleElement(term8918, 1, 0.07298304401683597);
        setDoubleElement(term8918, 2, 0.6101411757610665);
        setDoubleElement(term8918, 3, 0.07932996853888874);
        setDoubleElement(term8918, 4, 0.4335752168808029);
        setDoubleElement(term8918, 5, 0.9196949182738653);
        setDoubleElement(term8918, 6, 0.5820770579753712);
        setField(term8908, term8908.getClass(), "pageRankValues", term8918);
        setIntElement(term8926, 0, -1516995753);
        setIntElement(term8926, 1, -390501023);
        setIntElement(term8926, 2, -1667482829);
        setIntElement(term8926, 3, 1116576792);
        setIntElement(term8926, 4, -942194446);
        setIntElement(term8926, 5, -938508470);
        setIntElement(term8926, 6, 1242676024);
        setIntElement(term8926, 7, -1865023308);
        setIntElement(term8926, 8, 1698510819);
        setField(term8908, term8908.getClass(), "harmonicCentralityRanks", term8926);
        setIntElement(term8936, 0, -1553893255);
        setIntElement(term8936, 1, 1303442927);
        setIntElement(term8936, 2, 794568325);
        setIntElement(term8936, 3, -434468428);
        setIntElement(term8936, 4, 1559605714);
        setIntElement(term8936, 5, 1146601902);
        setIntElement(term8936, 6, -1938881385);
        setIntElement(term8936, 7, -1629418973);
        setField(term8908, term8908.getClass(), "pageRankRanks", term8936);
        setIntElement(term8945, 0, -100825168);
        setIntElement(term8945, 1, 768407648);
        setIntElement(term8945, 2, -350454594);
        setIntElement(term8945, 3, -1148142995);
        setIntElement(term8945, 4, -233024044);
        setIntElement(term8945, 5, 1820784228);
        setField(term8908, term8908.getClass(), "indirectSortPerm", term8945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignPageRankRank", argTypes, term8908, args);
    }

};


