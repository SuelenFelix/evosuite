package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TournamentGenerator_createRandom_5608487042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1670;

    public TournamentGenerator_createRandom_5608487042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1670 = newInstance(Class.forName("org.graph4j.generators.TournamentGenerator"));
        Object term1671 = newInstance(Class.forName("java.util.Random"));
        Object term1672 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term1676 = (int[]) newIntArray(7);
        setLongField(term1672, term1672.getClass(), "value", 263463041964846L);
        setField(term1671, term1671.getClass(), "seed", term1672);
        setDoubleField(term1671, term1671.getClass(), "nextNextGaussian", 0.15917839663695388);
        setBooleanField(term1671, term1671.getClass(), "haveNextNextGaussian", true);
        setField(term1670, term1670.getClass(), "rand", term1671);
        setIntElement(term1676, 0, 21031843);
        setIntElement(term1676, 1, -380787857);
        setIntElement(term1676, 2, 319853052);
        setIntElement(term1676, 3, -1097563716);
        setIntElement(term1676, 4, 1572907769);
        setIntElement(term1676, 5, 1608016787);
        setIntElement(term1676, 6, -516303035);
        setField(term1670, term1670.getClass(), "vertices", term1676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.TournamentGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createRandom", argTypes, term1670, args);
    }

};


