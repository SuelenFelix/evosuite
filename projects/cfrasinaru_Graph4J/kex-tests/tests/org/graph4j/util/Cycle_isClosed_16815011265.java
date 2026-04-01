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

public class Cycle_isClosed_16815011265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56995;

    public Cycle_isClosed_16815011265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56995 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term56997 = (int[]) newIntArray(4);
        Object term57004 = newInstance(Class.forName("java.util.BitSet"));
        long[] term57005 = (long[]) newLongArray(1);
        setIntField(term56995, term56995.getClass(), "numEdges", -75818278);
        setField(term56995, term56995.getClass(), "graph", null);
        setIntElement(term56997, 0, -638713910);
        setIntElement(term56997, 1, 1047195730);
        setIntElement(term56997, 2, -1089490394);
        setIntElement(term56997, 3, 1288764916);
        setField(term56995, term56995.getClass(), "vertices", term56997);
        setIntField(term56995, term56995.getClass(), "numVertices", -1590776943);
        setIntField(term56995, term56995.getClass(), "first", -55708653);
        setField(term57004, term57004.getClass(), "words", term57005);
        setIntField(term57004, term57004.getClass(), "wordsInUse", -618645376);
        setBooleanField(term57004, term57004.getClass(), "sizeIsSticky", true);
        setField(term56995, term56995.getClass(), "bitset", term57004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClosed", argTypes, term56995, args);
    }

};


