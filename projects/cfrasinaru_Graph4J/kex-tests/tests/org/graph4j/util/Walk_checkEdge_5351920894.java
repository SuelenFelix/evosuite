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
import java.lang.Double;

public class Walk_checkEdge_5351920894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7682;
     Object term7692;

    public Walk_checkEdge_5351920894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7682 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7684 = (int[]) newIntArray(0);
        Object term7687 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7688 = (long[]) newLongArray(1);
        setIntField(term7682, term7682.getClass(), "numEdges", -456566581);
        setField(term7682, term7682.getClass(), "graph", null);
        setField(term7682, term7682.getClass(), "vertices", term7684);
        setIntField(term7682, term7682.getClass(), "numVertices", 2114761003);
        setIntField(term7682, term7682.getClass(), "first", -1128091158);
        setField(term7687, term7687.getClass(), "words", term7688);
        setIntField(term7687, term7687.getClass(), "wordsInUse", 380526008);
        setBooleanField(term7687, term7687.getClass(), "sizeIsSticky", true);
        setField(term7682, term7682.getClass(), "bitset", term7687);
        Double term7697 = new Double(0.13747524521333288);
        Double term7699 = new Double(0.7149120009558162);
        Double term7701 = new Double(0.0013046823258857643);
        Double term7703 = new Double(0.5404409545293147);
        Double term7705 = new Double(0.9172358414700745);
        Double term7707 = new Double(0.3804251745476508);
        term7692 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term7696 = (Object[]) newArray("java.lang.Double", 6);
        setBooleanField(term7692, term7692.getClass(), "directed", false);
        setIntField(term7692, term7692.getClass(), "source", -285065370);
        setIntField(term7692, term7692.getClass(), "target", -1542216721);
        setElement(term7696, 0, term7697);
        setElement(term7696, 1, term7699);
        setElement(term7696, 2, term7701);
        setElement(term7696, 3, term7703);
        setElement(term7696, 4, term7705);
        setElement(term7696, 5, term7707);
        setField(term7692, term7692.getClass(), "data", term7696);
        setField(term7692, term7692.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term7692;
        callMethod(klass, "checkEdge", argTypes, term7682, args);
    }

};


