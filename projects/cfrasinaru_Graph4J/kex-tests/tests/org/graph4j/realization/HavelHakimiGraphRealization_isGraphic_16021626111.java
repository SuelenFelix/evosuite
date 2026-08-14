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

public class HavelHakimiGraphRealization_isGraphic_16021626111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;

    public HavelHakimiGraphRealization_isGraphic_16021626111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term273 = new Boolean(true);
        term268 = newInstance(Class.forName("org.graph4j.realization.HavelHakimiGraphRealization"));
        int[] term269 = (int[]) newIntArray(3);
        setIntElement(term269, 0, -615654495);
        setIntElement(term269, 1, -1476117762);
        setIntElement(term269, 2, -341962980);
        setField(term268, term268.getClass(), "degreeSequence", term269);
        setField(term268, term268.getClass(), "graphic", term273);
        setField(term268, term268.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.HavelHakimiGraphRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGraphic", argTypes, term268, args);
    }

};


