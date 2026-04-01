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

public class EdgeArray_contains_12333522517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62450;
     Object term62506;
     Object term62508;

    public EdgeArray_contains_12333522517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62450 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62451 = (Object[]) newArray("[I", 9);
        int[] term62452 = (int[]) newIntArray(5);
        int[] term62458 = (int[]) newIntArray(6);
        int[] term62465 = (int[]) newIntArray(6);
        int[] term62472 = (int[]) newIntArray(4);
        int[] term62477 = (int[]) newIntArray(3);
        int[] term62481 = (int[]) newIntArray(9);
        int[] term62491 = (int[]) newIntArray(7);
        int[] term62499 = (int[]) newIntArray(1);
        int[] term62501 = (int[]) newIntArray(3);
        setField(term62450, term62450.getClass(), "graph", null);
        setIntElement(term62452, 0, -1561330173);
        setIntElement(term62452, 1, -829139246);
        setIntElement(term62452, 2, -1898349638);
        setIntElement(term62452, 3, -1841869267);
        setIntElement(term62452, 4, 300502643);
        setElement(term62451, 0, term62452);
        setIntElement(term62458, 0, 189992900);
        setIntElement(term62458, 1, 1073692841);
        setIntElement(term62458, 2, -450450534);
        setIntElement(term62458, 3, 1403312822);
        setIntElement(term62458, 4, -2118595564);
        setIntElement(term62458, 5, 1183106727);
        setElement(term62451, 1, term62458);
        setIntElement(term62465, 0, 1207415380);
        setIntElement(term62465, 1, -925572654);
        setIntElement(term62465, 2, 1716478180);
        setIntElement(term62465, 3, -168584816);
        setIntElement(term62465, 4, -1494770619);
        setIntElement(term62465, 5, -1881283192);
        setElement(term62451, 2, term62465);
        setIntElement(term62472, 0, -1099688599);
        setIntElement(term62472, 1, 2122713442);
        setIntElement(term62472, 2, -604358624);
        setIntElement(term62472, 3, -1207562004);
        setElement(term62451, 3, term62472);
        setIntElement(term62477, 0, -1440790542);
        setIntElement(term62477, 1, 1293550828);
        setIntElement(term62477, 2, 1875820558);
        setElement(term62451, 4, term62477);
        setIntElement(term62481, 0, -1407454153);
        setIntElement(term62481, 1, -1726816471);
        setIntElement(term62481, 2, -865440827);
        setIntElement(term62481, 3, -2087127412);
        setIntElement(term62481, 4, -72570405);
        setIntElement(term62481, 5, 581438361);
        setIntElement(term62481, 6, 20384639);
        setIntElement(term62481, 7, -1080775278);
        setIntElement(term62481, 8, 2060368087);
        setElement(term62451, 5, term62481);
        setIntElement(term62491, 0, 1408834928);
        setIntElement(term62491, 1, 1892858909);
        setIntElement(term62491, 2, -33022984);
        setIntElement(term62491, 3, -1693956020);
        setIntElement(term62491, 4, 1085043333);
        setIntElement(term62491, 5, -49131583);
        setIntElement(term62491, 6, -1387551467);
        setElement(term62451, 6, term62491);
        setIntElement(term62499, 0, 1764522064);
        setElement(term62451, 7, term62499);
        setIntElement(term62501, 0, -1284390757);
        setIntElement(term62501, 1, 151931305);
        setIntElement(term62501, 2, -1047267671);
        setElement(term62451, 8, term62501);
        setField(term62450, term62450.getClass(), "edges", term62451);
        setIntField(term62450, term62450.getClass(), "numEdges", 1567945730);
        term62506 = new Integer(-996982809);
        term62508 = new Integer(-1428909988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term62506;
        args[1] = term62508;
        callMethod(klass, "contains", argTypes, term62450, args);
    }

};


