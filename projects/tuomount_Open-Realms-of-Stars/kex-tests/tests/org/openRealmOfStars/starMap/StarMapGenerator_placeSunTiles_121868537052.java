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

public class StarMapGenerator_placeSunTiles_121868537052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152346;
     Object term1152349;
     Object term1152351;

    public StarMapGenerator_placeSunTiles_121868537052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152346 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152346, term1152346.getClass(), "nameGenerator", null);
        setBooleanField(term1152346, term1152346.getClass(), "solHasAdded", false);
        setBooleanField(term1152346, term1152346.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152346, term1152346.getClass(), "solarSystem", null);
        setField(term1152346, term1152346.getClass(), "starMap", null);
        term1152349 = new Integer(0);
        term1152351 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.SunType");
        Object[] args = new Object[3];
        args[0] = term1152349;
        args[1] = term1152351;
        args[2] = null;
        callMethod(klass, "placeSunTiles", argTypes, term1152346, args);
    }

};


