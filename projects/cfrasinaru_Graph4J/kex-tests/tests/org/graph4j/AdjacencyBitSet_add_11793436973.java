package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class AdjacencyBitSet_add_11793436973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59878;
     Object term59884;

    public AdjacencyBitSet_add_11793436973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59878 = newInstance(Class.forName("org.graph4j.AdjacencyBitSet"));
        Object term59879 = newInstance(Class.forName("java.util.BitSet"));
        long[] term59880 = (long[]) newLongArray(1);
        setField(term59879, term59879.getClass(), "words", term59880);
        setIntField(term59879, term59879.getClass(), "wordsInUse", 0);
        setBooleanField(term59879, term59879.getClass(), "sizeIsSticky", false);
        setField(term59878, term59878.getClass(), "bitSet", term59879);
        term59884 = new Integer(1865838980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyBitSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term59884;
        callMethod(klass, "add", argTypes, term59878, args);
    }

};


