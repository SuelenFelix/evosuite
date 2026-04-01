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

public class SpanningTreeIterator_UnionFindExt_setParent_2895193672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55172;
     Object term55178;
     Object term55180;

    public SpanningTreeIterator_UnionFindExt_setParent_2895193672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55172 = newInstance(Class.forName("org.graph4j.spanning.SpanningTreeIterator$UnionFindExt"));
        int[] term55175 = (int[]) newIntArray(1);
        setField(term55172, term55172.getClass(), "this$0", null);
        setIntField(term55172, term55172.getClass(), "numVertices", -719405836);
        setBooleanField(term55172, term55172.getClass(), "pathCompression", false);
        setIntElement(term55175, 0, 1593612603);
        setField(term55172, term55172.getClass(), "parent", term55175);
        setIntField(term55172, term55172.getClass(), "numSets", 846762982);
        term55178 = new Integer(1526808674);
        term55180 = new Integer(1554584842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.SpanningTreeIterator$UnionFindExt");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term55178;
        args[1] = term55180;
        callMethod(klass, "setParent", argTypes, term55172, args);
    }

};


