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

public class EdgeArray_addAll_128212328012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1536;
     Object term1591;

    public EdgeArray_addAll_128212328012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1536 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1537 = (Object[]) newArray("[I", 9);
        int[] term1538 = (int[]) newIntArray(6);
        int[] term1545 = (int[]) newIntArray(1);
        int[] term1547 = (int[]) newIntArray(1);
        int[] term1549 = (int[]) newIntArray(6);
        int[] term1556 = (int[]) newIntArray(6);
        int[] term1563 = (int[]) newIntArray(5);
        int[] term1569 = (int[]) newIntArray(9);
        int[] term1579 = (int[]) newIntArray(2);
        int[] term1582 = (int[]) newIntArray(7);
        setField(term1536, term1536.getClass(), "graph", null);
        setIntElement(term1538, 0, -26316536);
        setIntElement(term1538, 1, 1716165145);
        setIntElement(term1538, 2, 1692937831);
        setIntElement(term1538, 3, -1539747985);
        setIntElement(term1538, 4, -1982489643);
        setIntElement(term1538, 5, 550892835);
        setElement(term1537, 0, term1538);
        setIntElement(term1545, 0, 1237549886);
        setElement(term1537, 1, term1545);
        setIntElement(term1547, 0, -1945635750);
        setElement(term1537, 2, term1547);
        setIntElement(term1549, 0, -1622760744);
        setIntElement(term1549, 1, 2068435279);
        setIntElement(term1549, 2, -1556527718);
        setIntElement(term1549, 3, 895255351);
        setIntElement(term1549, 4, -1317044799);
        setIntElement(term1549, 5, -1428063820);
        setElement(term1537, 3, term1549);
        setIntElement(term1556, 0, -1271375703);
        setIntElement(term1556, 1, 1136208236);
        setIntElement(term1556, 2, -1220630391);
        setIntElement(term1556, 3, -995822131);
        setIntElement(term1556, 4, -687282231);
        setIntElement(term1556, 5, 1200440315);
        setElement(term1537, 4, term1556);
        setIntElement(term1563, 0, 40571662);
        setIntElement(term1563, 1, 1863910269);
        setIntElement(term1563, 2, 864645689);
        setIntElement(term1563, 3, 279384872);
        setIntElement(term1563, 4, 1427305953);
        setElement(term1537, 5, term1563);
        setIntElement(term1569, 0, -781832877);
        setIntElement(term1569, 1, 797203987);
        setIntElement(term1569, 2, 1973060703);
        setIntElement(term1569, 3, -138239905);
        setIntElement(term1569, 4, 1709474063);
        setIntElement(term1569, 5, 1406617209);
        setIntElement(term1569, 6, 1706047059);
        setIntElement(term1569, 7, 590451710);
        setIntElement(term1569, 8, -1999787419);
        setElement(term1537, 6, term1569);
        setIntElement(term1579, 0, -1224443634);
        setIntElement(term1579, 1, 1048451946);
        setElement(term1537, 7, term1579);
        setIntElement(term1582, 0, 5603560);
        setIntElement(term1582, 1, -1079020032);
        setIntElement(term1582, 2, -1973791064);
        setIntElement(term1582, 3, -2072158633);
        setIntElement(term1582, 4, -355469363);
        setIntElement(term1582, 5, 1465188553);
        setIntElement(term1582, 6, 1633913667);
        setElement(term1537, 8, term1582);
        setField(term1536, term1536.getClass(), "edges", term1537);
        setIntField(term1536, term1536.getClass(), "numEdges", 1292332296);
        term1591 = (Object[]) newArray("[I", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1591;
        callMethod(klass, "addAll", argTypes, term1536, args);
    }

};


