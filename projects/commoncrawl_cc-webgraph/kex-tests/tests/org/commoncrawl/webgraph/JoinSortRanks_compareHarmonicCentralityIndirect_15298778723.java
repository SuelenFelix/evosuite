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
import java.lang.Integer;

public class JoinSortRanks_compareHarmonicCentralityIndirect_15298778723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8597;
     Object term8632;
     Object term8634;

    public JoinSortRanks_compareHarmonicCentralityIndirect_15298778723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8597 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8598 = (float[]) newFloatArray(0);
        double[] term8599 = (double[]) newDoubleArray(7);
        int[] term8607 = (int[]) newIntArray(9);
        int[] term8617 = (int[]) newIntArray(6);
        int[] term8624 = (int[]) newIntArray(7);
        setField(term8597, term8597.getClass(), "harmonicCentralityValues", term8598);
        setDoubleElement(term8599, 0, 0.23070800524236523);
        setDoubleElement(term8599, 1, 0.4337266793917268);
        setDoubleElement(term8599, 2, 0.11979392765421404);
        setDoubleElement(term8599, 3, 0.4555542221910589);
        setDoubleElement(term8599, 4, 0.9938727080758785);
        setDoubleElement(term8599, 5, 0.39416780533640805);
        setDoubleElement(term8599, 6, 0.5384156574050297);
        setField(term8597, term8597.getClass(), "pageRankValues", term8599);
        setIntElement(term8607, 0, 199287428);
        setIntElement(term8607, 1, -1195339592);
        setIntElement(term8607, 2, -376422566);
        setIntElement(term8607, 3, 306847454);
        setIntElement(term8607, 4, 1745276158);
        setIntElement(term8607, 5, 2009020256);
        setIntElement(term8607, 6, 2049577015);
        setIntElement(term8607, 7, 1236004505);
        setIntElement(term8607, 8, 1050765721);
        setField(term8597, term8597.getClass(), "harmonicCentralityRanks", term8607);
        setIntElement(term8617, 0, 474518942);
        setIntElement(term8617, 1, -1656687479);
        setIntElement(term8617, 2, -249614216);
        setIntElement(term8617, 3, 1870727665);
        setIntElement(term8617, 4, -519881101);
        setIntElement(term8617, 5, -680920524);
        setField(term8597, term8597.getClass(), "pageRankRanks", term8617);
        setIntElement(term8624, 0, -916335264);
        setIntElement(term8624, 1, -919416536);
        setIntElement(term8624, 2, -43417861);
        setIntElement(term8624, 3, -1533843432);
        setIntElement(term8624, 4, -123338791);
        setIntElement(term8624, 5, -1467089634);
        setIntElement(term8624, 6, 413548937);
        setField(term8597, term8597.getClass(), "indirectSortPerm", term8624);
        term8632 = new Integer(1901317214);
        term8634 = new Integer(1166710220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8632;
        args[1] = term8634;
        callMethod(klass, "compareHarmonicCentralityIndirect", argTypes, term8597, args);
    }

};


