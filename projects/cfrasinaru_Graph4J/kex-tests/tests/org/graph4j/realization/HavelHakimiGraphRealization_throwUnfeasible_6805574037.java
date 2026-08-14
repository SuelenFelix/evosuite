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

public class HavelHakimiGraphRealization_throwUnfeasible_6805574037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306;

    public HavelHakimiGraphRealization_throwUnfeasible_6805574037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306 = newInstance(Class.forName("org.graph4j.realization.HavelHakimiGraphRealization"));
        setField(term306, term306.getClass(), "degreeSequence", null);
        setField(term306, term306.getClass(), "graphic", null);
        setField(term306, term306.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.HavelHakimiGraphRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "throwUnfeasible", argTypes, term306, args);
    }

};


