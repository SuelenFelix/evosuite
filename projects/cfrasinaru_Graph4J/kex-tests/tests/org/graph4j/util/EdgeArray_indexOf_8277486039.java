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
import java.lang.Integer;

public class EdgeArray_indexOf_8277486039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1354;
     Object term1393;
     Object term1395;
     Object term1397;

    public EdgeArray_indexOf_8277486039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1354 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1355 = (Object[]) newArray("[I", 6);
        int[] term1356 = (int[]) newIntArray(3);
        int[] term1360 = (int[]) newIntArray(6);
        int[] term1367 = (int[]) newIntArray(9);
        int[] term1377 = (int[]) newIntArray(4);
        int[] term1382 = (int[]) newIntArray(4);
        int[] term1387 = (int[]) newIntArray(4);
        setField(term1354, term1354.getClass(), "graph", null);
        setIntElement(term1356, 0, -645429025);
        setIntElement(term1356, 1, -688213483);
        setIntElement(term1356, 2, 644154104);
        setElement(term1355, 0, term1356);
        setIntElement(term1360, 0, 76650923);
        setIntElement(term1360, 1, 1003743923);
        setIntElement(term1360, 2, 1887772522);
        setIntElement(term1360, 3, 354196060);
        setIntElement(term1360, 4, -1840305774);
        setIntElement(term1360, 5, 1365087144);
        setElement(term1355, 1, term1360);
        setIntElement(term1367, 0, -1537255112);
        setIntElement(term1367, 1, 934477462);
        setIntElement(term1367, 2, 4900410);
        setIntElement(term1367, 3, -1252345779);
        setIntElement(term1367, 4, -2063365430);
        setIntElement(term1367, 5, 812570053);
        setIntElement(term1367, 6, -1488938905);
        setIntElement(term1367, 7, 1916544127);
        setIntElement(term1367, 8, -1133405894);
        setElement(term1355, 2, term1367);
        setIntElement(term1377, 0, 1289741214);
        setIntElement(term1377, 1, 243280944);
        setIntElement(term1377, 2, -726681073);
        setIntElement(term1377, 3, -1724487863);
        setElement(term1355, 3, term1377);
        setIntElement(term1382, 0, -128490829);
        setIntElement(term1382, 1, 202214133);
        setIntElement(term1382, 2, 1543091617);
        setIntElement(term1382, 3, -763166094);
        setElement(term1355, 4, term1382);
        setIntElement(term1387, 0, -222941705);
        setIntElement(term1387, 1, 291864719);
        setIntElement(term1387, 2, -1549607466);
        setIntElement(term1387, 3, 853609788);
        setElement(term1355, 5, term1387);
        setField(term1354, term1354.getClass(), "edges", term1355);
        setIntField(term1354, term1354.getClass(), "numEdges", -197820800);
        term1393 = new Integer(723812297);
        term1395 = new Integer(1639448749);
        term1397 = new Integer(873659088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1393;
        args[1] = term1395;
        args[2] = term1397;
        callMethod(klass, "indexOf", argTypes, term1354, args);
    }

};


