package org.graph4j.converters;

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
import static org.graph4j.converters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PruferTreeEncoder_findMinLeaf_18852298883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116;
     Object term133;

    public PruferTreeEncoder_findMinLeaf_18852298883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116 = newInstance(Class.forName("org.graph4j.converters.PruferTreeEncoder"));
        int[] term117 = (int[]) newIntArray(5);
        int[] term123 = (int[]) newIntArray(5);
        boolean[] term129 = (boolean[]) newBooleanArray(2);
        setIntElement(term117, 0, -1087774327);
        setIntElement(term117, 1, -1530420153);
        setIntElement(term117, 2, -469968304);
        setIntElement(term117, 3, -1145578966);
        setIntElement(term117, 4, 679763016);
        setField(term116, term116.getClass(), "vertices", term117);
        setIntElement(term123, 0, 1962444399);
        setIntElement(term123, 1, 767834723);
        setIntElement(term123, 2, -602026508);
        setIntElement(term123, 3, -157887805);
        setIntElement(term123, 4, 1876565163);
        setField(term116, term116.getClass(), "degrees", term123);
        setField(term116, term116.getClass(), "visited", term129);
        setBooleanField(term116, term116.getClass(), "orderedVertices", true);
        setField(term116, term116.getClass(), "graph", null);
        term133 = new Integer(-817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.converters.PruferTreeEncoder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term133;
        callMethod(klass, "findMinLeaf", argTypes, term116, args);
    }

};


