package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SpanningTreeIterator_UnionFindExt_setParent_2895193671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;
     Object term185;
     Object term187;

    public SpanningTreeIterator_UnionFindExt_setParent_2895193671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$UnionFindExt"));
        int[] term181 = (int[]) newIntArray(2);
        setField(term178, term178.getClass(), "this$0", null);
        setIntField(term178, term178.getClass(), "numVertices", 1632125673);
        setBooleanField(term178, term178.getClass(), "pathCompression", false);
        setIntElement(term181, 0, 454281060);
        setIntElement(term181, 1, -1786399638);
        setField(term178, term178.getClass(), "parent", term181);
        setIntField(term178, term178.getClass(), "numSets", 2055867847);
        term185 = new Integer(-1048298087);
        term187 = new Integer(292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.SpanningTreeIterator$UnionFindExt");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term185;
        args[1] = term187;
        callMethod(klass, "setParent", argTypes, term178, args);
    }

};


