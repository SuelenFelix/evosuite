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

public class EdgeArray_removeFromPos_213502865016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1808;
     Object term1868;

    public EdgeArray_removeFromPos_213502865016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1808 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1809 = (Object[]) newArray("[I", 9);
        int[] term1810 = (int[]) newIntArray(6);
        int[] term1817 = (int[]) newIntArray(5);
        int[] term1823 = (int[]) newIntArray(9);
        int[] term1833 = (int[]) newIntArray(3);
        int[] term1837 = (int[]) newIntArray(9);
        int[] term1847 = (int[]) newIntArray(3);
        int[] term1851 = (int[]) newIntArray(3);
        int[] term1855 = (int[]) newIntArray(8);
        int[] term1864 = (int[]) newIntArray(2);
        setField(term1808, term1808.getClass(), "graph", null);
        setIntElement(term1810, 0, -995785731);
        setIntElement(term1810, 1, 1349815364);
        setIntElement(term1810, 2, 2128383340);
        setIntElement(term1810, 3, 1238598518);
        setIntElement(term1810, 4, -558146961);
        setIntElement(term1810, 5, 1505480070);
        setElement(term1809, 0, term1810);
        setIntElement(term1817, 0, -829088844);
        setIntElement(term1817, 1, -31751777);
        setIntElement(term1817, 2, -246967963);
        setIntElement(term1817, 3, -1777140369);
        setIntElement(term1817, 4, 993627098);
        setElement(term1809, 1, term1817);
        setIntElement(term1823, 0, 872295704);
        setIntElement(term1823, 1, 86041387);
        setIntElement(term1823, 2, 1010721666);
        setIntElement(term1823, 3, 27043781);
        setIntElement(term1823, 4, -1367122405);
        setIntElement(term1823, 5, -1703625118);
        setIntElement(term1823, 6, 1104108112);
        setIntElement(term1823, 7, 1648665618);
        setIntElement(term1823, 8, 633765954);
        setElement(term1809, 2, term1823);
        setIntElement(term1833, 0, 269110087);
        setIntElement(term1833, 1, 1545119095);
        setIntElement(term1833, 2, 1671229683);
        setElement(term1809, 3, term1833);
        setIntElement(term1837, 0, 34167717);
        setIntElement(term1837, 1, -514195141);
        setIntElement(term1837, 2, -297946422);
        setIntElement(term1837, 3, 385463636);
        setIntElement(term1837, 4, -1677599962);
        setIntElement(term1837, 5, -1790275458);
        setIntElement(term1837, 6, -497534255);
        setIntElement(term1837, 7, 1588942911);
        setIntElement(term1837, 8, -2129828854);
        setElement(term1809, 4, term1837);
        setIntElement(term1847, 0, -47438786);
        setIntElement(term1847, 1, -1955400589);
        setIntElement(term1847, 2, 626179200);
        setElement(term1809, 5, term1847);
        setIntElement(term1851, 0, -511077684);
        setIntElement(term1851, 1, -711507760);
        setIntElement(term1851, 2, 1053773809);
        setElement(term1809, 6, term1851);
        setIntElement(term1855, 0, 924127883);
        setIntElement(term1855, 1, -751079123);
        setIntElement(term1855, 2, -110837188);
        setIntElement(term1855, 3, -271094506);
        setIntElement(term1855, 4, 455632030);
        setIntElement(term1855, 5, -1632929393);
        setIntElement(term1855, 6, -431440129);
        setIntElement(term1855, 7, -763576148);
        setElement(term1809, 7, term1855);
        setIntElement(term1864, 0, 1568948514);
        setIntElement(term1864, 1, -1511130237);
        setElement(term1809, 8, term1864);
        setField(term1808, term1808.getClass(), "edges", term1809);
        setIntField(term1808, term1808.getClass(), "numEdges", 452088587);
        term1868 = new Integer(-1630069454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1868;
        callMethod(klass, "removeFromPos", argTypes, term1808, args);
    }

};


