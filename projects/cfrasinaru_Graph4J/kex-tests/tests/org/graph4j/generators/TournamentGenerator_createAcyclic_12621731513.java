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

public class TournamentGenerator_createAcyclic_12621731513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1691;

    public TournamentGenerator_createAcyclic_12621731513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1691 = newInstance(Class.forName("org.graph4j.generators.TournamentGenerator"));
        Object term1692 = newInstance(Class.forName("java.util.Random"));
        Object term1693 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term1697 = (int[]) newIntArray(1);
        setLongField(term1693, term1693.getClass(), "value", 268220308012303L);
        setField(term1692, term1692.getClass(), "seed", term1693);
        setDoubleField(term1692, term1692.getClass(), "nextNextGaussian", 0.9374115574082594);
        setBooleanField(term1692, term1692.getClass(), "haveNextNextGaussian", false);
        setField(term1691, term1691.getClass(), "rand", term1692);
        setIntElement(term1697, 0, -2143043890);
        setField(term1691, term1691.getClass(), "vertices", term1697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.TournamentGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createAcyclic", argTypes, term1691, args);
    }

};


