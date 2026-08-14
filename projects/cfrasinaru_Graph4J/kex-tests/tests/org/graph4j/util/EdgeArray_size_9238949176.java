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

public class EdgeArray_size_9238949176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1181;

    public EdgeArray_size_9238949176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1181 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1182 = (Object[]) newArray("[I", 9);
        int[] term1183 = (int[]) newIntArray(6);
        int[] term1190 = (int[]) newIntArray(7);
        int[] term1198 = (int[]) newIntArray(7);
        int[] term1206 = (int[]) newIntArray(3);
        int[] term1210 = (int[]) newIntArray(7);
        int[] term1218 = (int[]) newIntArray(8);
        int[] term1227 = (int[]) newIntArray(5);
        int[] term1233 = (int[]) newIntArray(9);
        int[] term1243 = (int[]) newIntArray(7);
        setField(term1181, term1181.getClass(), "graph", null);
        setIntElement(term1183, 0, -1629418973);
        setIntElement(term1183, 1, -100825168);
        setIntElement(term1183, 2, 768407648);
        setIntElement(term1183, 3, -350454594);
        setIntElement(term1183, 4, -1148142995);
        setIntElement(term1183, 5, -233024044);
        setElement(term1182, 0, term1183);
        setIntElement(term1190, 0, 1820784228);
        setIntElement(term1190, 1, 1390820006);
        setIntElement(term1190, 2, -828982065);
        setIntElement(term1190, 3, 1221443226);
        setIntElement(term1190, 4, 908108726);
        setIntElement(term1190, 5, 1023209512);
        setIntElement(term1190, 6, 1084849225);
        setElement(term1182, 1, term1190);
        setIntElement(term1198, 0, -1702055571);
        setIntElement(term1198, 1, -944542900);
        setIntElement(term1198, 2, 2063762142);
        setIntElement(term1198, 3, 1658391716);
        setIntElement(term1198, 4, 2143282300);
        setIntElement(term1198, 5, 1137624258);
        setIntElement(term1198, 6, 977862393);
        setElement(term1182, 2, term1198);
        setIntElement(term1206, 0, 301401782);
        setIntElement(term1206, 1, 1988605357);
        setIntElement(term1206, 2, 808203320);
        setElement(term1182, 3, term1206);
        setIntElement(term1210, 0, -544382127);
        setIntElement(term1210, 1, -1830198043);
        setIntElement(term1210, 2, -439048495);
        setIntElement(term1210, 3, -1849105286);
        setIntElement(term1210, 4, 1334483645);
        setIntElement(term1210, 5, 917513193);
        setIntElement(term1210, 6, 787278105);
        setElement(term1182, 4, term1210);
        setIntElement(term1218, 0, -2063843486);
        setIntElement(term1218, 1, 833762980);
        setIntElement(term1218, 2, 320711637);
        setIntElement(term1218, 3, 1241164745);
        setIntElement(term1218, 4, 1723148410);
        setIntElement(term1218, 5, -920797484);
        setIntElement(term1218, 6, -1631697577);
        setIntElement(term1218, 7, 765731371);
        setElement(term1182, 5, term1218);
        setIntElement(term1227, 0, -1703035419);
        setIntElement(term1227, 1, 765766290);
        setIntElement(term1227, 2, -1284825282);
        setIntElement(term1227, 3, -1941343035);
        setIntElement(term1227, 4, 947897214);
        setElement(term1182, 6, term1227);
        setIntElement(term1233, 0, 1496340209);
        setIntElement(term1233, 1, -1748391876);
        setIntElement(term1233, 2, 43258317);
        setIntElement(term1233, 3, 1707220033);
        setIntElement(term1233, 4, -1792504217);
        setIntElement(term1233, 5, 1824538861);
        setIntElement(term1233, 6, 499519708);
        setIntElement(term1233, 7, 1501165033);
        setIntElement(term1233, 8, 510162332);
        setElement(term1182, 7, term1233);
        setIntElement(term1243, 0, 888506903);
        setIntElement(term1243, 1, 200252898);
        setIntElement(term1243, 2, -1831826725);
        setIntElement(term1243, 3, 752152965);
        setIntElement(term1243, 4, -1577069773);
        setIntElement(term1243, 5, -266625190);
        setIntElement(term1243, 6, 489201218);
        setElement(term1182, 8, term1243);
        setField(term1181, term1181.getClass(), "edges", term1182);
        setIntField(term1181, term1181.getClass(), "numEdges", 464181937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term1181, args);
    }

};


