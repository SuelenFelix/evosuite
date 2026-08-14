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

public class EdgeArray_numEdges_4202377825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1088;

    public EdgeArray_numEdges_4202377825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1088 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1089 = (Object[]) newArray("[I", 8);
        int[] term1090 = (int[]) newIntArray(1);
        int[] term1092 = (int[]) newIntArray(2);
        int[] term1095 = (int[]) newIntArray(5);
        int[] term1101 = (int[]) newIntArray(9);
        int[] term1111 = (int[]) newIntArray(0);
        int[] term1112 = (int[]) newIntArray(8);
        int[] term1121 = (int[]) newIntArray(9);
        int[] term1131 = (int[]) newIntArray(7);
        setField(term1088, term1088.getClass(), "graph", null);
        setIntElement(term1090, 0, 1741500243);
        setElement(term1089, 0, term1090);
        setIntElement(term1092, 0, -2070466617);
        setIntElement(term1092, 1, -1127721881);
        setElement(term1089, 1, term1092);
        setIntElement(term1095, 0, 1074848808);
        setIntElement(term1095, 1, -146054762);
        setIntElement(term1095, 2, 798043553);
        setIntElement(term1095, 3, 533197381);
        setIntElement(term1095, 4, 1048271679);
        setElement(term1089, 2, term1095);
        setIntElement(term1101, 0, -1529797673);
        setIntElement(term1101, 1, -868676396);
        setIntElement(term1101, 2, 1922684808);
        setIntElement(term1101, 3, -2005784375);
        setIntElement(term1101, 4, -288604325);
        setIntElement(term1101, 5, -1268314569);
        setIntElement(term1101, 6, 877649659);
        setIntElement(term1101, 7, -1332748804);
        setIntElement(term1101, 8, 1774507971);
        setElement(term1089, 3, term1101);
        setElement(term1089, 4, term1111);
        setIntElement(term1112, 0, -1420269858);
        setIntElement(term1112, 1, -2119545015);
        setIntElement(term1112, 2, 1272542218);
        setIntElement(term1112, 3, 1209799204);
        setIntElement(term1112, 4, 1094107751);
        setIntElement(term1112, 5, 844222656);
        setIntElement(term1112, 6, -18216811);
        setIntElement(term1112, 7, -1813280137);
        setElement(term1089, 5, term1112);
        setIntElement(term1121, 0, 719656595);
        setIntElement(term1121, 1, -1516995753);
        setIntElement(term1121, 2, -390501023);
        setIntElement(term1121, 3, -1667482829);
        setIntElement(term1121, 4, 1116576792);
        setIntElement(term1121, 5, -942194446);
        setIntElement(term1121, 6, -938508470);
        setIntElement(term1121, 7, 1242676024);
        setIntElement(term1121, 8, -1865023308);
        setElement(term1089, 6, term1121);
        setIntElement(term1131, 0, 1698510819);
        setIntElement(term1131, 1, -1553893255);
        setIntElement(term1131, 2, 1303442927);
        setIntElement(term1131, 3, 794568325);
        setIntElement(term1131, 4, -434468428);
        setIntElement(term1131, 5, 1559605714);
        setIntElement(term1131, 6, 1146601902);
        setElement(term1089, 7, term1131);
        setField(term1088, term1088.getClass(), "edges", term1089);
        setIntField(term1088, term1088.getClass(), "numEdges", -1938881385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numEdges", argTypes, term1088, args);
    }

};


