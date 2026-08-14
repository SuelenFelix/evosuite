package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class OrderedDigraph_successors_17929168838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1543;
     Object term1683;

    public OrderedDigraph_successors_17929168838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1670 = new HashMap();
        term1543 = newInstance(Class.forName("org.graph4j.isomorphism.OrderedDigraph"));
        Object[] term1545 = (Object[]) newArray("[I", 6);
        int[] term1546 = (int[]) newIntArray(1);
        int[] term1548 = (int[]) newIntArray(2);
        int[] term1551 = (int[]) newIntArray(4);
        int[] term1556 = (int[]) newIntArray(4);
        int[] term1561 = (int[]) newIntArray(8);
        int[] term1570 = (int[]) newIntArray(7);
        Object[] term1578 = (Object[]) newArray("[I", 5);
        int[] term1579 = (int[]) newIntArray(5);
        int[] term1585 = (int[]) newIntArray(2);
        int[] term1588 = (int[]) newIntArray(0);
        int[] term1589 = (int[]) newIntArray(7);
        int[] term1597 = (int[]) newIntArray(2);
        Object[] term1600 = (Object[]) newObjectArray(Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass(), 0);
        Object[] term1601 = (Object[]) newArray("[B", 9);
        byte[] term1602 = (byte[]) newByteArray(5);
        byte[] term1608 = (byte[]) newByteArray(1);
        byte[] term1610 = (byte[]) newByteArray(2);
        byte[] term1613 = (byte[]) newByteArray(8);
        byte[] term1622 = (byte[]) newByteArray(1);
        byte[] term1624 = (byte[]) newByteArray(9);
        byte[] term1634 = (byte[]) newByteArray(8);
        byte[] term1643 = (byte[]) newByteArray(9);
        byte[] term1653 = (byte[]) newByteArray(7);
        int[] term1661 = (int[]) newIntArray(8);
        setField(term1543, term1543.getClass(), "dg", null);
        setIntField(term1543, term1543.getClass(), "n", -233024044);
        setIntElement(term1546, 0, 1820784228);
        setElement(term1545, 0, term1546);
        setIntElement(term1548, 0, 1390820006);
        setIntElement(term1548, 1, -828982065);
        setElement(term1545, 1, term1548);
        setIntElement(term1551, 0, 1221443226);
        setIntElement(term1551, 1, 908108726);
        setIntElement(term1551, 2, 1023209512);
        setIntElement(term1551, 3, 1084849225);
        setElement(term1545, 2, term1551);
        setIntElement(term1556, 0, -1702055571);
        setIntElement(term1556, 1, -944542900);
        setIntElement(term1556, 2, 2063762142);
        setIntElement(term1556, 3, 1658391716);
        setElement(term1545, 3, term1556);
        setIntElement(term1561, 0, 2143282300);
        setIntElement(term1561, 1, 1137624258);
        setIntElement(term1561, 2, 977862393);
        setIntElement(term1561, 3, 301401782);
        setIntElement(term1561, 4, 1988605357);
        setIntElement(term1561, 5, 808203320);
        setIntElement(term1561, 6, -544382127);
        setIntElement(term1561, 7, -1830198043);
        setElement(term1545, 4, term1561);
        setIntElement(term1570, 0, -439048495);
        setIntElement(term1570, 1, -1849105286);
        setIntElement(term1570, 2, 1334483645);
        setIntElement(term1570, 3, 917513193);
        setIntElement(term1570, 4, 787278105);
        setIntElement(term1570, 5, -2063843486);
        setIntElement(term1570, 6, 833762980);
        setElement(term1545, 5, term1570);
        setField(term1543, term1543.getClass(), "predecessors", term1545);
        setIntElement(term1579, 0, 320711637);
        setIntElement(term1579, 1, 1241164745);
        setIntElement(term1579, 2, 1723148410);
        setIntElement(term1579, 3, -920797484);
        setIntElement(term1579, 4, -1631697577);
        setElement(term1578, 0, term1579);
        setIntElement(term1585, 0, 765731371);
        setIntElement(term1585, 1, -1703035419);
        setElement(term1578, 1, term1585);
        setElement(term1578, 2, term1588);
        setIntElement(term1589, 0, 765766290);
        setIntElement(term1589, 1, -1284825282);
        setIntElement(term1589, 2, -1941343035);
        setIntElement(term1589, 3, 947897214);
        setIntElement(term1589, 4, 1496340209);
        setIntElement(term1589, 5, -1748391876);
        setIntElement(term1589, 6, 43258317);
        setElement(term1578, 3, term1589);
        setIntElement(term1597, 0, 1707220033);
        setIntElement(term1597, 1, -1792504217);
        setElement(term1578, 4, term1597);
        setField(term1543, term1543.getClass(), "successors", term1578);
        setField(term1543, term1543.getClass(), "edges", term1600);
        setByteElement(term1602, 0, (byte) -84);
        setByteElement(term1602, 1, (byte) -53);
        setByteElement(term1602, 2, (byte) -93);
        setByteElement(term1602, 3, (byte) 82);
        setByteElement(term1602, 4, (byte) -89);
        setElement(term1601, 0, term1602);
        setByteElement(term1608, 0, (byte) 24);
        setElement(term1601, 1, term1608);
        setByteElement(term1610, 0, (byte) 123);
        setByteElement(term1610, 1, (byte) -101);
        setElement(term1601, 2, term1610);
        setByteElement(term1613, 0, (byte) -102);
        setByteElement(term1613, 1, (byte) -95);
        setByteElement(term1613, 2, (byte) -2);
        setByteElement(term1613, 3, (byte) 28);
        setByteElement(term1613, 4, (byte) 84);
        setByteElement(term1613, 5, (byte) 85);
        setByteElement(term1613, 6, (byte) -17);
        setByteElement(term1613, 7, (byte) -83);
        setElement(term1601, 3, term1613);
        setByteElement(term1622, 0, (byte) 48);
        setElement(term1601, 4, term1622);
        setByteElement(term1624, 0, (byte) -128);
        setByteElement(term1624, 1, (byte) 70);
        setByteElement(term1624, 2, (byte) -28);
        setByteElement(term1624, 3, (byte) 115);
        setByteElement(term1624, 4, (byte) 96);
        setByteElement(term1624, 5, (byte) 51);
        setByteElement(term1624, 6, (byte) -53);
        setByteElement(term1624, 7, (byte) -8);
        setByteElement(term1624, 8, (byte) -9);
        setElement(term1601, 5, term1624);
        setByteElement(term1634, 0, (byte) 97);
        setByteElement(term1634, 1, (byte) -46);
        setByteElement(term1634, 2, (byte) 14);
        setByteElement(term1634, 3, (byte) 34);
        setByteElement(term1634, 4, (byte) 126);
        setByteElement(term1634, 5, (byte) 7);
        setByteElement(term1634, 6, (byte) -96);
        setByteElement(term1634, 7, (byte) -22);
        setElement(term1601, 6, term1634);
        setByteElement(term1643, 0, (byte) -5);
        setByteElement(term1643, 1, (byte) -124);
        setByteElement(term1643, 2, (byte) -105);
        setByteElement(term1643, 3, (byte) 25);
        setByteElement(term1643, 4, (byte) 16);
        setByteElement(term1643, 5, (byte) 39);
        setByteElement(term1643, 6, (byte) 123);
        setByteElement(term1643, 7, (byte) 16);
        setByteElement(term1643, 8, (byte) 2);
        setElement(term1601, 7, term1643);
        setByteElement(term1653, 0, (byte) -120);
        setByteElement(term1653, 1, (byte) 96);
        setByteElement(term1653, 2, (byte) -41);
        setByteElement(term1653, 3, (byte) -88);
        setByteElement(term1653, 4, (byte) 39);
        setByteElement(term1653, 5, (byte) -1);
        setByteElement(term1653, 6, (byte) 117);
        setElement(term1601, 8, term1653);
        setField(term1543, term1543.getClass(), "adjMatrix", term1601);
        setIntElement(term1661, 0, 1824538861);
        setIntElement(term1661, 1, 499519708);
        setIntElement(term1661, 2, 1501165033);
        setIntElement(term1661, 3, 510162332);
        setIntElement(term1661, 4, 888506903);
        setIntElement(term1661, 5, 200252898);
        setIntElement(term1661, 6, -1831826725);
        setIntElement(term1661, 7, 752152965);
        setField(term1543, term1543.getClass(), "orderToVertex", term1661);
        setField(term1543, term1543.getClass(), "vertexToOrder", term1670);
        setBooleanField(term1543, term1543.getClass(), "cache", false);
        term1683 = new Integer(-1577069773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.OrderedDigraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1683;
        callMethod(klass, "successors", argTypes, term1543, args);
    }

};


