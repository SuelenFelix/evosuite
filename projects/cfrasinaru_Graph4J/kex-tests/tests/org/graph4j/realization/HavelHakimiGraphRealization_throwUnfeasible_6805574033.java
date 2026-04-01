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

public class HavelHakimiGraphRealization_throwUnfeasible_6805574033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;

    public HavelHakimiGraphRealization_throwUnfeasible_6805574033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term300 = new Boolean(false);
        term296 = newInstance(Class.forName("org.graph4j.realization.HavelHakimiGraphRealization"));
        int[] term297 = (int[]) newIntArray(2);
        setIntElement(term297, 0, 906181092);
        setIntElement(term297, 1, 1045657203);
        setField(term296, term296.getClass(), "degreeSequence", term297);
        setField(term296, term296.getClass(), "graphic", term300);
        setField(term296, term296.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.HavelHakimiGraphRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "throwUnfeasible", argTypes, term296, args);
    }

};


