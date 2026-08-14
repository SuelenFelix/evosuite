package org.graph4j.realization;

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
import static org.graph4j.realization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class KleitmanWangDigraphRealization_throwUnfeasible_176147093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public KleitmanWangDigraphRealization_throwUnfeasible_176147093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term241 = new Boolean(true);
        term227 = newInstance(Class.forName("org.graph4j.realization.KleitmanWangDigraphRealization"));
        int[] term228 = (int[]) newIntArray(5);
        int[] term234 = (int[]) newIntArray(6);
        setIntElement(term228, 0, -505439934);
        setIntElement(term228, 1, -344842608);
        setIntElement(term228, 2, 941650513);
        setIntElement(term228, 3, 444029505);
        setIntElement(term228, 4, -1034506028);
        setField(term227, term227.getClass(), "indegrees", term228);
        setIntElement(term234, 0, -1263114719);
        setIntElement(term234, 1, -894662986);
        setIntElement(term234, 2, 304775596);
        setIntElement(term234, 3, -1347665717);
        setIntElement(term234, 4, -1888585309);
        setIntElement(term234, 5, 683666002);
        setField(term227, term227.getClass(), "outdegrees", term234);
        setField(term227, term227.getClass(), "digraphic", term241);
        setField(term227, term227.getClass(), "digraph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.KleitmanWangDigraphRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "throwUnfeasible", argTypes, term227, args);
    }

};


