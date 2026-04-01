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

public class HavelHakimiBipartiteRealization_throwUnfeasible_4233159773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;

    public HavelHakimiBipartiteRealization_throwUnfeasible_4233159773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term70 = new Boolean(false);
        term59 = newInstance(Class.forName("org.graph4j.realization.HavelHakimiBipartiteRealization"));
        int[] term60 = (int[]) newIntArray(2);
        int[] term63 = (int[]) newIntArray(6);
        setIntElement(term60, 0, -117576464);
        setIntElement(term60, 1, -1007160944);
        setField(term59, term59.getClass(), "leftDegrees", term60);
        setIntElement(term63, 0, 1135664017);
        setIntElement(term63, 1, 590364439);
        setIntElement(term63, 2, 865208305);
        setIntElement(term63, 3, -1275173084);
        setIntElement(term63, 4, -244121226);
        setIntElement(term63, 5, -203030934);
        setField(term59, term59.getClass(), "rightDegrees", term63);
        setField(term59, term59.getClass(), "bigraphic", term70);
        setField(term59, term59.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.HavelHakimiBipartiteRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "throwUnfeasible", argTypes, term59, args);
    }

};


