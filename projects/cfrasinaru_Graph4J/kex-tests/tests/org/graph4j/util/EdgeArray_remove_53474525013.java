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

public class EdgeArray_remove_53474525013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1635;
     Object term1667;
     Object term1669;

    public EdgeArray_remove_53474525013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1635 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1636 = (Object[]) newArray("[I", 9);
        int[] term1637 = (int[]) newIntArray(0);
        int[] term1638 = (int[]) newIntArray(5);
        int[] term1644 = (int[]) newIntArray(3);
        int[] term1648 = (int[]) newIntArray(0);
        int[] term1649 = (int[]) newIntArray(1);
        int[] term1651 = (int[]) newIntArray(3);
        int[] term1655 = (int[]) newIntArray(4);
        int[] term1660 = (int[]) newIntArray(1);
        int[] term1662 = (int[]) newIntArray(3);
        setField(term1635, term1635.getClass(), "graph", null);
        setElement(term1636, 0, term1637);
        setIntElement(term1638, 0, -1415256843);
        setIntElement(term1638, 1, 612177768);
        setIntElement(term1638, 2, -1626451656);
        setIntElement(term1638, 3, 173952451);
        setIntElement(term1638, 4, -1972033388);
        setElement(term1636, 1, term1638);
        setIntElement(term1644, 0, -1005024758);
        setIntElement(term1644, 1, 2634669);
        setIntElement(term1644, 2, -1912429941);
        setElement(term1636, 2, term1644);
        setElement(term1636, 3, term1648);
        setIntElement(term1649, 0, 1801052257);
        setElement(term1636, 4, term1649);
        setIntElement(term1651, 0, -2110556060);
        setIntElement(term1651, 1, 313459791);
        setIntElement(term1651, 2, 752615112);
        setElement(term1636, 5, term1651);
        setIntElement(term1655, 0, -1674430871);
        setIntElement(term1655, 1, 794352120);
        setIntElement(term1655, 2, 340719678);
        setIntElement(term1655, 3, 299791142);
        setElement(term1636, 6, term1655);
        setIntElement(term1660, 0, 1862191391);
        setElement(term1636, 7, term1660);
        setIntElement(term1662, 0, 1131398807);
        setIntElement(term1662, 1, -344907703);
        setIntElement(term1662, 2, 824341437);
        setElement(term1636, 8, term1662);
        setField(term1635, term1635.getClass(), "edges", term1636);
        setIntField(term1635, term1635.getClass(), "numEdges", -1794965320);
        term1667 = new Integer(520504102);
        term1669 = new Integer(-457396133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1667;
        args[1] = term1669;
        callMethod(klass, "remove", argTypes, term1635, args);
    }

};


