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
import java.lang.Long;

public class JoinSortRanks_getHarmonicCentralityValue_17082454629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8990;
     Object term9020;

    public JoinSortRanks_getHarmonicCentralityValue_17082454629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8990 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term8991 = (float[]) newFloatArray(8);
        double[] term9000 = (double[]) newDoubleArray(8);
        int[] term9009 = (int[]) newIntArray(6);
        int[] term9016 = (int[]) newIntArray(1);
        int[] term9018 = (int[]) newIntArray(1);
        setFloatElement(term8991, 0, 0.42393434F);
        setFloatElement(term8991, 1, 0.32382548F);
        setFloatElement(term8991, 2, 0.8069875F);
        setFloatElement(term8991, 3, 0.28438938F);
        setFloatElement(term8991, 4, 0.2114355F);
        setFloatElement(term8991, 5, 0.23823452F);
        setFloatElement(term8991, 6, 0.25258613F);
        setFloatElement(term8991, 7, 0.6037093F);
        setField(term8990, term8990.getClass(), "harmonicCentralityValues", term8991);
        setDoubleElement(term9000, 0, 0.8935041663395363);
        setDoubleElement(term9000, 1, 0.2542403704113868);
        setDoubleElement(term9000, 2, 0.4614378239284842);
        setDoubleElement(term9000, 3, 0.10963898027157926);
        setDoubleElement(term9000, 4, 0.34234234602085223);
        setDoubleElement(term9000, 5, 0.8355624480198577);
        setDoubleElement(term9000, 6, 0.8303221706066055);
        setDoubleElement(term9000, 7, 0.7102687477135848);
        setField(term8990, term8990.getClass(), "pageRankValues", term9000);
        setIntElement(term9009, 0, 1390820006);
        setIntElement(term9009, 1, -828982065);
        setIntElement(term9009, 2, 1221443226);
        setIntElement(term9009, 3, 908108726);
        setIntElement(term9009, 4, 1023209512);
        setIntElement(term9009, 5, 1084849225);
        setField(term8990, term8990.getClass(), "harmonicCentralityRanks", term9009);
        setIntElement(term9016, 0, -1702055571);
        setField(term8990, term8990.getClass(), "pageRankRanks", term9016);
        setIntElement(term9018, 0, -944542900);
        setField(term8990, term8990.getClass(), "indirectSortPerm", term9018);
        term9020 = new Long(-2050224942342343039L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9020;
        callMethod(klass, "getHarmonicCentralityValue", argTypes, term8990, args);
    }

};


