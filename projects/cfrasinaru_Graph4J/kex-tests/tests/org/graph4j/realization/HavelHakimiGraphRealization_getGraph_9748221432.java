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

public class HavelHakimiGraphRealization_getGraph_9748221432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;

    public HavelHakimiGraphRealization_getGraph_9748221432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term287 = new Boolean(true);
        term278 = newInstance(Class.forName("org.graph4j.realization.HavelHakimiGraphRealization"));
        int[] term279 = (int[]) newIntArray(7);
        setIntElement(term279, 0, 1532716628);
        setIntElement(term279, 1, -1801760683);
        setIntElement(term279, 2, 1141317871);
        setIntElement(term279, 3, 890669485);
        setIntElement(term279, 4, 691577392);
        setIntElement(term279, 5, -893623680);
        setIntElement(term279, 6, -1963434938);
        setField(term278, term278.getClass(), "degreeSequence", term279);
        setField(term278, term278.getClass(), "graphic", term287);
        setField(term278, term278.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.HavelHakimiGraphRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGraph", argTypes, term278, args);
    }

};


