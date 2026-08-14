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

public class AdjacencyIntHashMap_position_13867851775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101029;
     Object term101035;

    public AdjacencyIntHashMap_position_13867851775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101029 = newInstance(Class.forName("org.graph4j.AdjacencyIntHashMap"));
        Object term101030 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term101031 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term101030, term101030.getClass(), "table", term101031);
        setIntField(term101030, term101030.getClass(), "count", 0);
        setIntField(term101030, term101030.getClass(), "threshold", 15);
        setFloatField(term101030, term101030.getClass(), "loadFactor", 0.75F);
        setField(term101029, term101029.getClass(), "hashMap", term101030);
        term101035 = new Integer(-843145378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.AdjacencyIntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term101035;
        callMethod(klass, "position", argTypes, term101029, args);
    }

};


