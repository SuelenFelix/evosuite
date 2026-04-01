package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class EccentricitiesCalculator_Task_init_20818634720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11816;
     Object term11827;

    public EccentricitiesCalculator_Task_init_20818634720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11816 = newInstance(Class.forName("org.graph4j.metrics.EccentricitiesCalculator"));
        int[] term11817 = (int[]) newIntArray(8);
        setIntElement(term11817, 0, 1588058685);
        setIntElement(term11817, 1, 1677707412);
        setIntElement(term11817, 2, -297367861);
        setIntElement(term11817, 3, -1133541490);
        setIntElement(term11817, 4, 942412391);
        setIntElement(term11817, 5, 751596480);
        setIntElement(term11817, 6, 1971485144);
        setIntElement(term11817, 7, 2059603512);
        setField(term11816, term11816.getClass(), "ecc", term11817);
        setField(term11816, term11816.getClass(), "graph", null);
        setBooleanField(term11816, term11816.getClass(), "directed", true);
        term11827 = new Integer(-1308902065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.EccentricitiesCalculator$Task");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.metrics.EccentricitiesCalculator");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term11816;
        args[1] = term11827;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


