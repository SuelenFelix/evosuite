package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IntArrays_union_129069043417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155552;

    public IntArrays_union_129069043417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155552 = (Object[]) newArray("[I", 8);
        int[] term155553 = (int[]) newIntArray(5);
        int[] term155559 = (int[]) newIntArray(8);
        int[] term155568 = (int[]) newIntArray(7);
        int[] term155576 = (int[]) newIntArray(7);
        int[] term155584 = (int[]) newIntArray(6);
        int[] term155591 = (int[]) newIntArray(3);
        int[] term155595 = (int[]) newIntArray(7);
        int[] term155603 = (int[]) newIntArray(3);
        setIntElement(term155553, 0, 1280003215);
        setIntElement(term155553, 1, 1106024317);
        setIntElement(term155553, 2, 544399886);
        setIntElement(term155553, 3, -634401095);
        setIntElement(term155553, 4, -1514644877);
        setElement(term155552, 0, term155553);
        setIntElement(term155559, 0, -906266072);
        setIntElement(term155559, 1, 896703310);
        setIntElement(term155559, 2, -1790226554);
        setIntElement(term155559, 3, 623595545);
        setIntElement(term155559, 4, -1922737966);
        setIntElement(term155559, 5, 1526989427);
        setIntElement(term155559, 6, -10332302);
        setIntElement(term155559, 7, 553344731);
        setElement(term155552, 1, term155559);
        setIntElement(term155568, 0, 2108280027);
        setIntElement(term155568, 1, 1161916669);
        setIntElement(term155568, 2, 1370757320);
        setIntElement(term155568, 3, 2075900695);
        setIntElement(term155568, 4, 1749217345);
        setIntElement(term155568, 5, -770146811);
        setIntElement(term155568, 6, 729585155);
        setElement(term155552, 2, term155568);
        setIntElement(term155576, 0, 249816045);
        setIntElement(term155576, 1, -1317665779);
        setIntElement(term155576, 2, 345839013);
        setIntElement(term155576, 3, 1401515868);
        setIntElement(term155576, 4, -1538383033);
        setIntElement(term155576, 5, -1310488048);
        setIntElement(term155576, 6, 1819026070);
        setElement(term155552, 3, term155576);
        setIntElement(term155584, 0, -321555037);
        setIntElement(term155584, 1, 1439664665);
        setIntElement(term155584, 2, 2106770895);
        setIntElement(term155584, 3, 341618201);
        setIntElement(term155584, 4, 2026509906);
        setIntElement(term155584, 5, 1151134953);
        setElement(term155552, 4, term155584);
        setIntElement(term155591, 0, -159393605);
        setIntElement(term155591, 1, -834102757);
        setIntElement(term155591, 2, 606270686);
        setElement(term155552, 5, term155591);
        setIntElement(term155595, 0, 56927377);
        setIntElement(term155595, 1, -915214939);
        setIntElement(term155595, 2, -2103158381);
        setIntElement(term155595, 3, -1100921520);
        setIntElement(term155595, 4, 1849497411);
        setIntElement(term155595, 5, 1968842608);
        setIntElement(term155595, 6, 1412385582);
        setElement(term155552, 6, term155595);
        setIntElement(term155603, 0, 1417788436);
        setIntElement(term155603, 1, -284930610);
        setIntElement(term155603, 2, -624474361);
        setElement(term155552, 7, term155603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term155552;
        callMethod(klass, "union", argTypes, null, args);
    }

};


