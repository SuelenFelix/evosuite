package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StarMapGenerator_is16NeighboursEmpty_191586949861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152381;
     Object term1152384;
     Object term1152386;

    public StarMapGenerator_is16NeighboursEmpty_191586949861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152381 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152381, term1152381.getClass(), "nameGenerator", null);
        setBooleanField(term1152381, term1152381.getClass(), "solHasAdded", false);
        setBooleanField(term1152381, term1152381.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152381, term1152381.getClass(), "solarSystem", null);
        setField(term1152381, term1152381.getClass(), "starMap", null);
        term1152384 = new Integer(0);
        term1152386 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1152384;
        args[1] = term1152386;
        callMethod(klass, "is16NeighboursEmpty", argTypes, term1152381, args);
    }

};


