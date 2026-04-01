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

public class HavelHakimiBipartiteRealization_isBigraphic_11949382961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;

    public HavelHakimiBipartiteRealization_isBigraphic_11949382961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term31 = new Boolean(false);
        term21 = newInstance(Class.forName("org.graph4j.realization.HavelHakimiBipartiteRealization"));
        int[] term22 = (int[]) newIntArray(3);
        int[] term26 = (int[]) newIntArray(4);
        setIntElement(term22, 0, -1339778481);
        setIntElement(term22, 1, 1725571209);
        setIntElement(term22, 2, -522618178);
        setField(term21, term21.getClass(), "leftDegrees", term22);
        setIntElement(term26, 0, 1134449235);
        setIntElement(term26, 1, -883034806);
        setIntElement(term26, 2, 1585847225);
        setIntElement(term26, 3, 597278769);
        setField(term21, term21.getClass(), "rightDegrees", term26);
        setField(term21, term21.getClass(), "bigraphic", term31);
        setField(term21, term21.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.HavelHakimiBipartiteRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBigraphic", argTypes, term21, args);
    }

};


