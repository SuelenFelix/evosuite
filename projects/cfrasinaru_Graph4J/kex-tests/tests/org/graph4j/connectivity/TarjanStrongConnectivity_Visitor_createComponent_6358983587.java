package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class TarjanStrongConnectivity_Visitor_createComponent_6358983587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;
     Object term1448;

    public TarjanStrongConnectivity_Visitor_createComponent_6358983587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1420 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor"));
        int[] term1422 = (int[]) newIntArray(0);
        Object term1423 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term1424 = (int[]) newIntArray(9);
        Object term1436 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1437 = (long[]) newLongArray(1);
        boolean[] term1441 = (boolean[]) newBooleanArray(6);
        setBooleanField(term1420, term1420.getClass(), "checkOnly", false);
        setField(term1420, term1420.getClass(), "low", term1422);
        setField(term1423, term1423.getClass(), "graph", null);
        setIntElement(term1424, 0, 1851127634);
        setIntElement(term1424, 1, 783730213);
        setIntElement(term1424, 2, 1815951606);
        setIntElement(term1424, 3, 1105016932);
        setIntElement(term1424, 4, -365784998);
        setIntElement(term1424, 5, -1893236300);
        setIntElement(term1424, 6, -1858909368);
        setIntElement(term1424, 7, -280113263);
        setIntElement(term1424, 8, 529625347);
        setField(term1423, term1423.getClass(), "vertices", term1424);
        setIntField(term1423, term1423.getClass(), "numVertices", 1409095253);
        setIntField(term1423, term1423.getClass(), "first", 315179039);
        setField(term1436, term1436.getClass(), "words", term1437);
        setIntField(term1436, term1436.getClass(), "wordsInUse", -1835923897);
        setBooleanField(term1436, term1436.getClass(), "sizeIsSticky", false);
        setField(term1423, term1423.getClass(), "bitset", term1436);
        setField(term1420, term1420.getClass(), "stack", term1423);
        setBooleanElement(term1441, 0, true);
        setBooleanElement(term1441, 1, true);
        setBooleanElement(term1441, 2, true);
        setBooleanElement(term1441, 4, true);
        setBooleanElement(term1441, 5, true);
        setField(term1420, term1420.getClass(), "instack", term1441);
        setField(term1420, term1420.getClass(), "this$0", null);
        term1448 = new Integer(-341287775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1448;
        callMethod(klass, "createComponent", argTypes, term1420, args);
    }

};


