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
     Object term8993;
     Object term9028;
     Object term9030;

    public JoinSortRanks_compareHarmonicCentralityIndirect_15298778723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8993 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8994 = (float[]) newFloatArray(0);
        double[] term8995 = (double[]) newDoubleArray(7);
        int[] term9003 = (int[]) newIntArray(9);
        int[] term9013 = (int[]) newIntArray(6);
        int[] term9020 = (int[]) newIntArray(7);
        setField(term8993, term8993.getClass(), "harmonicCentralityValues", term8994);
        setDoubleElement(term8995, 0, 0.23070800524236523);
        setDoubleElement(term8995, 1, 0.4337266793917268);
        setDoubleElement(term8995, 2, 0.11979392765421404);
        setDoubleElement(term8995, 3, 0.4555542221910589);
        setDoubleElement(term8995, 4, 0.9938727080758785);
        setDoubleElement(term8995, 5, 0.39416780533640805);
        setDoubleElement(term8995, 6, 0.5384156574050297);
        setField(term8993, term8993.getClass(), "pageRankValues", term8995);
        setIntElement(term9003, 0, 199287428);
        setIntElement(term9003, 1, -1195339592);
        setIntElement(term9003, 2, -376422566);
        setIntElement(term9003, 3, 306847454);
        setIntElement(term9003, 4, 1745276158);
        setIntElement(term9003, 5, 2009020256);
        setIntElement(term9003, 6, 2049577015);
        setIntElement(term9003, 7, 1236004505);
        setIntElement(term9003, 8, 1050765721);
        setField(term8993, term8993.getClass(), "harmonicCentralityRanks", term9003);
        setIntElement(term9013, 0, 474518942);
        setIntElement(term9013, 1, -1656687479);
        setIntElement(term9013, 2, -249614216);
        setIntElement(term9013, 3, 1870727665);
        setIntElement(term9013, 4, -519881101);
        setIntElement(term9013, 5, -680920524);
        setField(term8993, term8993.getClass(), "pageRankRanks", term9013);
        setIntElement(term9020, 0, -916335264);
        setIntElement(term9020, 1, -919416536);
        setIntElement(term9020, 2, -43417861);
        setIntElement(term9020, 3, -1533843432);
        setIntElement(term9020, 4, -123338791);
        setIntElement(term9020, 5, -1467089634);
        setIntElement(term9020, 6, 413548937);
        setField(term8993, term8993.getClass(), "indirectSortPerm", term9020);
        term9028 = new Integer(1901317214);
        term9030 = new Integer(1166710220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9028;
        args[1] = term9030;
        callMethod(klass, "compareHarmonicCentralityIndirect", argTypes, term8993, args);
    }

};


