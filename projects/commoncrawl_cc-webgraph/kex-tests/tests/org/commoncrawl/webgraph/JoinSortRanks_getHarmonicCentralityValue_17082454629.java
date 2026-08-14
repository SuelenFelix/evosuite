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
     Object term9386;
     Object term9416;

    public JoinSortRanks_getHarmonicCentralityValue_17082454629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9386 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9387 = (float[]) newFloatArray(8);
        double[] term9396 = (double[]) newDoubleArray(8);
        int[] term9405 = (int[]) newIntArray(6);
        int[] term9412 = (int[]) newIntArray(1);
        int[] term9414 = (int[]) newIntArray(1);
        setFloatElement(term9387, 0, 0.42393434F);
        setFloatElement(term9387, 1, 0.32382548F);
        setFloatElement(term9387, 2, 0.8069875F);
        setFloatElement(term9387, 3, 0.28438938F);
        setFloatElement(term9387, 4, 0.2114355F);
        setFloatElement(term9387, 5, 0.23823452F);
        setFloatElement(term9387, 6, 0.25258613F);
        setFloatElement(term9387, 7, 0.6037093F);
        setField(term9386, term9386.getClass(), "harmonicCentralityValues", term9387);
        setDoubleElement(term9396, 0, 0.8935041663395363);
        setDoubleElement(term9396, 1, 0.2542403704113868);
        setDoubleElement(term9396, 2, 0.4614378239284842);
        setDoubleElement(term9396, 3, 0.10963898027157926);
        setDoubleElement(term9396, 4, 0.34234234602085223);
        setDoubleElement(term9396, 5, 0.8355624480198577);
        setDoubleElement(term9396, 6, 0.8303221706066055);
        setDoubleElement(term9396, 7, 0.7102687477135848);
        setField(term9386, term9386.getClass(), "pageRankValues", term9396);
        setIntElement(term9405, 0, 1390820006);
        setIntElement(term9405, 1, -828982065);
        setIntElement(term9405, 2, 1221443226);
        setIntElement(term9405, 3, 908108726);
        setIntElement(term9405, 4, 1023209512);
        setIntElement(term9405, 5, 1084849225);
        setField(term9386, term9386.getClass(), "harmonicCentralityRanks", term9405);
        setIntElement(term9412, 0, -1702055571);
        setField(term9386, term9386.getClass(), "pageRankRanks", term9412);
        setIntElement(term9414, 0, -944542900);
        setField(term9386, term9386.getClass(), "indirectSortPerm", term9414);
        term9416 = new Long(-2050224942342343039L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term9416;
        callMethod(klass, "getHarmonicCentralityValue", argTypes, term9386, args);
    }

};


