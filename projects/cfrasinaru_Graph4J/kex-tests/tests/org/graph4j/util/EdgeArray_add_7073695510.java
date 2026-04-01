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

public class EdgeArray_add_7073695510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61919;
     Object term61972;
     Object term61974;

    public EdgeArray_add_7073695510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61919 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term61920 = (Object[]) newArray("[I", 9);
        int[] term61921 = (int[]) newIntArray(9);
        int[] term61931 = (int[]) newIntArray(2);
        int[] term61934 = (int[]) newIntArray(6);
        int[] term61941 = (int[]) newIntArray(5);
        int[] term61947 = (int[]) newIntArray(6);
        int[] term61954 = (int[]) newIntArray(3);
        int[] term61958 = (int[]) newIntArray(0);
        int[] term61959 = (int[]) newIntArray(5);
        int[] term61965 = (int[]) newIntArray(5);
        setField(term61919, term61919.getClass(), "graph", null);
        setIntElement(term61921, 0, 344822691);
        setIntElement(term61921, 1, 1748471450);
        setIntElement(term61921, 2, 6001794);
        setIntElement(term61921, 3, -219230289);
        setIntElement(term61921, 4, -1289281350);
        setIntElement(term61921, 5, -371133839);
        setIntElement(term61921, 6, -1810597085);
        setIntElement(term61921, 7, -486804348);
        setIntElement(term61921, 8, 432945474);
        setElement(term61920, 0, term61921);
        setIntElement(term61931, 0, -725203984);
        setIntElement(term61931, 1, 1848180003);
        setElement(term61920, 1, term61931);
        setIntElement(term61934, 0, 846315597);
        setIntElement(term61934, 1, 1008300939);
        setIntElement(term61934, 2, -1286668613);
        setIntElement(term61934, 3, -789358664);
        setIntElement(term61934, 4, -2034774971);
        setIntElement(term61934, 5, 481530689);
        setElement(term61920, 2, term61934);
        setIntElement(term61941, 0, -1951222103);
        setIntElement(term61941, 1, -1949169702);
        setIntElement(term61941, 2, 1058646419);
        setIntElement(term61941, 3, 540736002);
        setIntElement(term61941, 4, 145817292);
        setElement(term61920, 3, term61941);
        setIntElement(term61947, 0, -88949007);
        setIntElement(term61947, 1, -927282703);
        setIntElement(term61947, 2, -1638986447);
        setIntElement(term61947, 3, -47039314);
        setIntElement(term61947, 4, 1242263247);
        setIntElement(term61947, 5, -313667953);
        setElement(term61920, 4, term61947);
        setIntElement(term61954, 0, -2001885943);
        setIntElement(term61954, 1, -1140069411);
        setIntElement(term61954, 2, -540827425);
        setElement(term61920, 5, term61954);
        setElement(term61920, 6, term61958);
        setIntElement(term61959, 0, -1632149194);
        setIntElement(term61959, 1, -741353227);
        setIntElement(term61959, 2, -1211689558);
        setIntElement(term61959, 3, 318737566);
        setIntElement(term61959, 4, -106759249);
        setElement(term61920, 7, term61959);
        setIntElement(term61965, 0, -1013531363);
        setIntElement(term61965, 1, 1995440429);
        setIntElement(term61965, 2, -2048810677);
        setIntElement(term61965, 3, 1754415460);
        setIntElement(term61965, 4, 2123228484);
        setElement(term61920, 8, term61965);
        setField(term61919, term61919.getClass(), "edges", term61920);
        setIntField(term61919, term61919.getClass(), "numEdges", 2086821771);
        term61972 = new Integer(1148090074);
        term61974 = new Integer(1314246472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term61972;
        args[1] = term61974;
        callMethod(klass, "add", argTypes, term61919, args);
    }

};


