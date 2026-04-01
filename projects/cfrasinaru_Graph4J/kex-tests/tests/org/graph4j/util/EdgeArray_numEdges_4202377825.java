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
     Object term61631;

    public EdgeArray_numEdges_4202377825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61631 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term61632 = (Object[]) newArray("[I", 5);
        int[] term61633 = (int[]) newIntArray(8);
        int[] term61642 = (int[]) newIntArray(6);
        int[] term61649 = (int[]) newIntArray(6);
        int[] term61656 = (int[]) newIntArray(1);
        int[] term61658 = (int[]) newIntArray(3);
        setField(term61631, term61631.getClass(), "graph", null);
        setIntElement(term61633, 0, 683825505);
        setIntElement(term61633, 1, -874006328);
        setIntElement(term61633, 2, 331812569);
        setIntElement(term61633, 3, -694038544);
        setIntElement(term61633, 4, -371046864);
        setIntElement(term61633, 5, 1895958176);
        setIntElement(term61633, 6, -344909600);
        setIntElement(term61633, 7, 377838898);
        setElement(term61632, 0, term61633);
        setIntElement(term61642, 0, 415407227);
        setIntElement(term61642, 1, 1612361187);
        setIntElement(term61642, 2, 1325455005);
        setIntElement(term61642, 3, -1370913089);
        setIntElement(term61642, 4, -891285090);
        setIntElement(term61642, 5, -351219934);
        setElement(term61632, 1, term61642);
        setIntElement(term61649, 0, -925647425);
        setIntElement(term61649, 1, 1341898586);
        setIntElement(term61649, 2, -1763289432);
        setIntElement(term61649, 3, 882092074);
        setIntElement(term61649, 4, -705066137);
        setIntElement(term61649, 5, -454954694);
        setElement(term61632, 2, term61649);
        setIntElement(term61656, 0, -473778335);
        setElement(term61632, 3, term61656);
        setIntElement(term61658, 0, -1516379970);
        setIntElement(term61658, 1, -2138200889);
        setIntElement(term61658, 2, -510919719);
        setElement(term61632, 4, term61658);
        setField(term61631, term61631.getClass(), "edges", term61632);
        setIntField(term61631, term61631.getClass(), "numEdges", 1116939662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "numEdges", argTypes, term61631, args);
    }

};


